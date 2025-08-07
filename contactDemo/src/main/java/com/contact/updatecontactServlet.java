package com.contact;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updatecontactServlet")
public class updatecontactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int contactid = Integer.parseInt(request.getParameter("contactid"));
		String name= request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		
		boolean isTrue;
		
		isTrue = contactDBUtil.updateContact(contactid, name, email, message);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("error.jsp");
			dis.forward(request, response);
		}
	}

	
	
	
}
