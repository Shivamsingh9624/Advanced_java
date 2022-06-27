package com.hello.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class Third extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>This is Http Servlet</h1>");
		
	}

}
