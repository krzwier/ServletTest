package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class GetBalanceServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("Password");
		
		boolean validated = false;		
		double balance = 0.0;
		
		/* 
			ExampleBusinessLayer utilities = new ExampleBusinessLayer();
		 	
		 	validated = utilities.authenticateUser(username, password);
		 
		 	if (validated)
		 		balance = utilities.getBalance(username);
		*/		
		String outputHTML = 
			"<!DOCTYPE html>" +
			"<html>" +
			"<head>" +
			"<meta charset=\"ISO-8859-1\">" +
			"<title>Servlet Test</title>" +
			"</head>" +
			"<body>"+
			"Welcome " + username +"<br/><br/>" +
			"Your balance is: $" + balance +
			"</body>" +
			"</html>";
		
		PrintWriter out = response.getWriter();
		out.println(outputHTML);
		
	}

}
