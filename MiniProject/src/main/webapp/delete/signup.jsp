<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page
	import="javax.servlet.http.HttpServlet, java.io.IOException, java.io.PrintWriter"%>

<h1>SignUp Succesful</h1>
<h2>Details Submitted are as follow:</h2>
<%
	PrintWriter p = response.getWriter();
	String user = request.getParameter("user");
	String email = request.getParameter("email");
	String passwd = request.getParameter("pswd");
	String cnfrm = request.getParameter("confirmpassword");
	%>


<h3><%= "Username is "+user + ","+
			"Email is "+email +","+
			"Passwrod is "+passwd +","+
			"Confirm Password is "+cnfrm %></h3>
<h3>
	<a href="login.html">Click here</a> to login
</h3>
