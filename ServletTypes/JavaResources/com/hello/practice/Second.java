package com.hello.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>This is Generic Servlet</h1>");
	}

}
