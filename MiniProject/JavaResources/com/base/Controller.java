package com.base;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class Controller extends HttpServlet {
	private Repo repo;

	private static String STUDENT_SIGNUP = "login.html";
	private static String STUDENT_LOGIN = "login.html";
	private static String LOGIN_SUCCESS = "login_success.jsp";
	private static String SIGNUP_SUCCESS = "signup_success.jsp";
	private static String LOGIN_FAILURE = "login_failed.jsp";

	public Controller() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		super();
		repo = new Repo();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = STUDENT_SIGNUP;
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageName = request.getParameter("pageName");
		String forward = "";

		if (repo != null) {
			if (pageName.equals("signup")) {
				if (repo.findByUserName(request.getParameter("user"))) {
					request.setAttribute("message", "User Name exists. Try another user name");
					forward = STUDENT_SIGNUP;
					RequestDispatcher view = request.getRequestDispatcher(forward);
					view.forward(request, response);
					return;
				}

				repo.save(
						request.getParameter("user"), 
						request.getParameter("email"), 
						request.getParameter("pswd"));
				forward = SIGNUP_SUCCESS;
			} else if (pageName.equals("login")) {
				boolean result = repo.findByLogin(
						request.getParameter("email"),
						request.getParameter("pswd"));
				if (result == true) {
					forward = LOGIN_SUCCESS;
				} else {
					forward = LOGIN_FAILURE;
				}
			}
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}
}
