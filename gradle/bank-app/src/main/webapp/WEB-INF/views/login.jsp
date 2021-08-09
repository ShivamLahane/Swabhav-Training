<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
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
		<h1>Bank-App</h1>
	</div>
	<div class = 'container'>

		<h2 class = 'text-center'>Log In</h2>
		
		<form method="POST">
		  <div class="form-group">
		    <label for="name">Name : </label>
		    <input id = 'name' type="text" class="form-control" name="name" required>
		  </div>
	
		  <div class="form-group">
		    <label for="pwd">Password:</label>
		    <input id = 'pswrd' type="password" class="form-control" name="pwd" required>
		  </div>

		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
		<%
			Object fail = request.getAttribute("fail");
			if(fail != null && (boolean) fail)
			{
				out.print("Invalid credentials.");
			}
		%>
	</div>
	
</body>
</html>