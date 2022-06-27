package com.register;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SuccessServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>Registration Succesful</h1>");
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String condition = req.getParameter("terms");
		
		if (condition != null) {
		out.print("<h1>Registration Details are as given</h1>");
		out.println("<h3>Name is: " + name + "</h3>");
		out.println("<h3>Password is: " + password + "</h3>");
		out.println("<h3>Email is: " + email + "</h3>");
		out.println("<h3>Gender is: " + gender + "</h3>");
		out.println("<h3>Selected Course is: " + course + "</h3>");
		}
		
	}

}
