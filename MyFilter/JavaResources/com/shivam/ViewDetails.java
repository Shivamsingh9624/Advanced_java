package com.shivam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewDetails
 */
@WebServlet("/Registration")
public class ViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("password");
		String name = request.getParameter("name");
		
		out.println("Welcome, "+ name + "\n");
		out.println("Your Password is:  "+ pass + "\n");
	
	}

}
