package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoCookies
 */
@WebServlet("/DemoCookies")
public class FirstPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Welcome to the Cokkies Management Session</h1>");
		String name = request.getParameter("name");
		out.print("<h2>Your name is: " +name+ "</h2>");
		out.print("<h3><a href = two >Click Here</a> for Second Page</h3>");
		
		//creating a cookie
		Cookie c = new Cookie("username",name);
		response.addCookie(c);
	}

}
