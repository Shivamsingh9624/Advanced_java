<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
<%@include file="NavBar.jsp" %>
	<h1>This is Notes Page</h1>
	<center>
<form action="SaveNoteServlet" method="post">
  Name: <input type="text" placeholder="Enter Your Name"><br/><br/>
  Enrollment: <input type="number" placeholder="Enter Your Enrollment"><br/><br/>
  Mobile No: <input type="number" placeholder="Enter Your Mobile No"><br/><br/>
  CPI: <input type="number" placeholder="Enter Your CPI"><br/><br/>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</center>

</body>
</html>