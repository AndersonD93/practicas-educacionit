package aduran.com.servlets.sem15;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FinalServlet1")
public class FinalServlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String target2;
		
		target2 ="/index.jsp";
		getServletContext().getRequestDispatcher(target2).forward(req, resp);
		
	}

}
