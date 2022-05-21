package aduran.com.servlets.sem15;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aduran.com.bo.Imagen;
import aduran.com.dao.SentenciaSQL;
import aduran.com.exceptionsS15.GenericException;

@WebServlet("/NuevaImagenServlet")
public class NuevaImagenServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String descripcion= req.getParameter("descripcion");
		String url= req.getParameter("url");
		int activo=Integer.parseInt(req.getParameter("activo"));
		
		SentenciaSQL sentencia1 = new SentenciaSQL();
		
		try {
			sentencia1.crearImagenBD(new Imagen(id, descripcion, url, activo));
		} catch (GenericException | SQLException e) {
			e.printStackTrace();
		}
		
		String target ="/formularioexitoso.jsp";
		getServletContext().getRequestDispatcher(target).forward(req, resp);
	
	}

}
