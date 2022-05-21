package aduran.com.servlets.sem15;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CrearImagenServlet")
public class CrearImagenServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String CheckJsp =req.getParameter("flexRadioDefault");
		String target1;
		if(CheckJsp != null) {
			
			
			target1 ="/formularioImagen.jsp";
			getServletContext().getRequestDispatcher(target1).forward(req, resp);
		}else {
			target1 ="/formularioInvalido.jsp";
			getServletContext().getRequestDispatcher(target1).forward(req, resp);
		}
				
	}

	
	}
