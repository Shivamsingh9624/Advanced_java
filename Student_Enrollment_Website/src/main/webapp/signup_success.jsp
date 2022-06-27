<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success</title>
<link href="bootstrap-united.css" rel="stylesheet" />

</head>
<body>
	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap.js">
		
	</script>

	<div class="navbar navbar-default">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<form class="navbar-form navbar-right">
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="signup.jsp">Signup</a></li>
				<li><a href="login.jsp">Login</a></li>
				<li><a href="#">Contact us</a></li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
	</div>

	<!-- 
	<legend>Student Registration Success</legend>
	 -->
	<div class="panel panel-success">
		<div class="panel-heading">
			<h3 class="panel-title">Student Registration success</h3>
		</div>
		<div class="panel-body">
			<div class="alert alert-dismissable alert-success">
				<button type="button" class="close" data-dismiss="alert">×</button>
				<strong>Well done!</strong> You have successfully Registered into
				the system. Now you can Login to access the complete features!
			</div>
		</div>
	</div>
	<div></div>
	<div></div>
	<a class="btn btn-primary" href="login.jsp">Want to login Now?</a>
</body>
</html>