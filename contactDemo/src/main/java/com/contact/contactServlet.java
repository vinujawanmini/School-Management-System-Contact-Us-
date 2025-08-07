package com.contact;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contactServlet")
public class contactServlet extends HttpServlet { // Class name corrected
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Get the form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Use the DB utility class to insert the message
        boolean isSuccess = contactDBUtil.insertMessage(name, email, message); // Updated class name

        if (isSuccess) {
            // If message is inserted successfully, redirect to a success page
            response.sendRedirect("listContacts");
        } else {
            // If failed, redirect to an error page
            response.sendRedirect("error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        List<contact> contactList = contactDBUtil.getAllContacts(); // Updated class name
        
        // Set the contact list as an attribute in the request
        request.setAttribute("contactList", contactList);
        
        // Forward to the JSP page to display the contacts
        RequestDispatcher dispatcher = request.getRequestDispatcher("read.jsp");
        dispatcher.forward(request, response);
    }
  

}
