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
 * Servlet implementation class SecondPage
 */
@WebServlet("/SecondPage")
public class SecondPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting all the cookies
		Cookie[] c = request.getCookies();
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Welcome to the Cokkies Management Session</h1>");
		out.print("<h2>Hello, " + c[0].getValue() + " I Remembered Your Name :)</h2>");
	}

}
