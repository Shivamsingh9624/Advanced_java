package com.shivam;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/Registration")
public class PasswordFilter extends HttpFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		String pass = req.getParameter("password");
		

		if (pass.length() == 0) {
			out.print("Please Enter Valid Password \n");
		} else {
			out.print("Success \n");
			chain.doFilter(request, response);
			
		}
	}

}
