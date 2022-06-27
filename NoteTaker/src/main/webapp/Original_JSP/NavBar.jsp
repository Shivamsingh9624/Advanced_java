<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NavBar</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="index.jsp">Navbar</a>
		<button class="navbar-toggler" type="button" data-toggle = "collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav">
				<li class="nav-item active">
				<a class="nav-link" href="index.jsp">Home<span class="sr-only">(current)</span></a></li>
				<li class="nav-item">
				<a class="nav-link" href="addNotes.jsp">Add Note</a></li>
				<li class="nav-item">
				<a class="nav-link" href="view_notes.jsp">Show Notes</a></li>
			</ul>
		</div>
	</nav>

</body>
</html>