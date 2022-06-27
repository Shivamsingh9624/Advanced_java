package com.register;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegistrationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String condition = req.getParameter("terms");
		if (condition != null) {
			
			RequestDispatcher rd = req.getRequestDispatcher("success");
			rd.forward(req, res);
				
		}
		else {
			out.println("<h1>Please agree Terms and Conditions</h1>");
		}

	}

}
