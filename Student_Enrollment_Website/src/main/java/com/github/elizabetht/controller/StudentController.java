package com.github.elizabetht.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

import com.github.elizabetht.repository.StudentRepository;

@SuppressWarnings("serial")
public class StudentController extends HttpServlet {
	private StudentRepository studentRepository;

	private static String STUDENT_SIGNUP = "/signup.jsp";
	private static String STUDENT_LOGIN = "/login.jsp";
	private static String LOGIN_SUCCESS = "/success.jsp";
	private static String SIGNUP_SUCCESS = "/signup_success.jsp";
	private static String LOGIN_FAILURE = "/failure.jsp";


	public StudentController() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		super();
		studentRepository = new StudentRepository();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = STUDENT_SIGNUP;
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageName = request.getParameter("pageName");
		String forward = "";

		if (studentRepository != null) {
			if (pageName.equals("signup")) {
				if (studentRepository.findByUserName(request.getParameter("userName"))) {
					request.setAttribute("message", "User Name exists. Try another user name");
					forward = STUDENT_SIGNUP;
					RequestDispatcher view = request.getRequestDispatcher(forward);
					view.forward(request, response);
					return;
				}

				studentRepository.save(request.getParameter("userName"), 
						request.getParameter("password"),
						request.getParameter("firstName"), 
						request.getParameter("lastName"),
						request.getParameter("dateOfBirth"), 
						request.getParameter("emailAddress"));
				forward = SIGNUP_SUCCESS;
			} else if (pageName.equals("login")) {
				boolean result = studentRepository.findByLogin(
						request.getParameter("userName"),
						request.getParameter("password"));
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