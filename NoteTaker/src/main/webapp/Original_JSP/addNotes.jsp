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
	
<form action="SaveNoteServlet" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Note Title</label>
    <input type="text" name="title" class="form-control" id="exampleInputEmail1"placeholder="Enter The title of notes">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Note content</label>
    <textarea id="content" name="content" placeholder="Enter Your Content Here." class="form-control" style="height:300px"></textarea>  
    </div class="container text-center">
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>