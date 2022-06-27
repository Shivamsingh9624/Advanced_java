<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes</title>
<%@include file="all_js_css.jsp"%>
<link href="css/style.css" rel="stylesheet">
</head>
<body>

	<div class="Container">
		<%@include file="NavBar.jsp"%>
		<br>
		<h1 style="margin: 5px">All Notes:</h1>

		<div class="row">
			<div class="col-12">

				<%
				Session s = FactoryProvider.getFactory().openSession();
				Query q = s.createQuery("from Note");
				List<Note> list = q.list();
				for (Note note : list) {
				%>

				<div class="card mt-3" style="width: 18rem;">
					<img class="card-img-top pl-4 pt-4" style="max-width:100px"  src="images/writing.png" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title"><%= note.getTitle() %></h5>
						<p class="card-text"><%=note.getContent() %></p>
						<a href="#" class="btn btn-danger">Delete</a>
					</div>
				</div>


				<%
				}
				%>



			</div>

		</div>
	</div>

</body>
</html>