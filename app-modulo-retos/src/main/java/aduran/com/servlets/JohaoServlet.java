package aduran.com.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aduran.com.dao.MapSocios;
import aduran.com.dao.impl.EnviarQuery;
import aduran.com.dao.impl.SociosDaoImp;
import aduran.com.exceptions.GenericException;
import aduran.com.vo.Socios;

@WebServlet("/JohaoServlet")
public class JohaoServlet extends HttpServlet {

	@Override	
	protected void doPost(HttpServletRequest entrada, HttpServletResponse salida) throws ServletException, IOException  {
		
		String target;
		Integer NumDocJsp = Integer.parseInt(entrada.getParameter("documento")) ;
		String nombreJsp = entrada.getParameter("nombre");
		String apellidoJsp = entrada.getParameter("apellido");
		String edadJsp = entrada.getParameter("edad");
		Integer edadJsp1= Integer.parseInt(edadJsp);
		String ocupacionJsp = entrada.getParameter("ocupacion");
		String fechaNacimiento= entrada.getParameter("fecha");
		
		Socios socio = new Socios(NumDocJsp,nombreJsp,apellidoJsp,edadJsp1,ocupacionJsp,fechaNacimiento);
		
		// creo y envio a DB nuevo socio
		EnviarQuery create = new EnviarQuery();
		try {
			create.enviarQueryCreate(socio);
		} catch (GenericException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		// presento la lista de socios actuales
		List<Socios> socios = null;
		try {
			socios = (List<Socios>) SociosDaoImp.findAll();
		} catch (GenericException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Map<Integer,Socios> mapaSocios = new HashMap<>();
			for (Socios soc: socios) {
				mapaSocios.put(soc.getDocumento(), soc);
			}
			
			entrada.setAttribute("MAPA", mapaSocios);

			target ="/formularioExitoso.jsp";
			getServletContext().getRequestDispatcher(target).forward(entrada, salida);
			
		
			}

	
}
