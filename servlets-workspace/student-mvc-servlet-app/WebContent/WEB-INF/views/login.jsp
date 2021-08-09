<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class= "jumbotron text-center">
		<h1>Student App</h1>
		<h2>Log In</h2>
	</div>
	<div class = "container">
		<form method = 'POST'>
			  
			  <div class="form-group">
			    <label for="Username">User Name : </label>
			    <input type="text" class="form-control" name = "userName" required>
			  </div>
			  
			  <div class="form-group">
			    <label for="Password">Password</label>
			    <input type="password" class="form-control" name = "password" required>
			  </div>
			  
			  <input type="submit" class="btn btn-primary">
		</form>
		<% 
			Object fail = request.getAttribute("fail");
			if (fail != null  && (boolean) fail)
			{
				out.print("Invalid Credentials.");
			}
		 %>
	</div>
</body>
</html>