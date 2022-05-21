package aduran.com.servlets.sem15;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aduran.com.bo.Imagen;
import aduran.com.dao.SentenciaSQL;
import aduran.com.exceptionsS15.GenericException;

@WebServlet("/CarrouselServlet")
public class CarrouselServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		SentenciaSQL consulta= new SentenciaSQL();
		try {
		ArrayList<Imagen> colimagen =(ArrayList<Imagen>) consulta.obtenerListaimg();
		req.setAttribute("LISTA", colimagen);
		} catch (GenericException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		String target ="/carrousel.jsp";
		getServletContext().getRequestDispatcher(target).forward(req, resp);
		
	}
	
}
