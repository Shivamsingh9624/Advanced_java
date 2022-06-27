package com.hello.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class First implements Servlet{
	
	public void init(ServletConfig config) {
		
	}
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>This is Servlet</h1>");
		
	}
	public void destroy() {
		
	}
	public ServletConfig getServletConfig() {
		return null;
	}
	public String getServletInfo() {
		return"";
	}

}
