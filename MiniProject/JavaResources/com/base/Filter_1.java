//package com.base;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.apache.catalina.User;
//
//public class Filter_1 implements Filter{
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
////		HttpServletRequest req = (HttpServletRequest)request;
////		HttpSession s = req.getSession();
//		
//		
//		PrintWriter out = response.getWriter();
//		String user = request.getParameter("user");
//		String email = request.getParameter("email");
//		String password = request.getParameter("pswd");
////		out.print("<h1>UserName is: </h1>"+ user);
//		
//		
//		if(email.equals("student@gmail.com") &&  password.equals("123")) {
//			chain.doFilter(request, response);
//		}
//		else {
//			out.print("<h1> Sorry, Entered Details are incorrect </h1>");			
//		}
////
////		String user = (String)s.getAttribute("user");
////		out.print(user);
//
//		
////		if(user == null) {
////			chain.doFilter(request, response);
////		}
//	}
//
//}
