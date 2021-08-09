<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
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
		<h3>Register</h3>
		<form action = 'register' method="POST" onsubmit = 'return validate()'>
		  <div class="form-group">
		    <label for="name">Name : </label>
		    <input id = 'name' type="text" class="form-control" name="name" required>
		  </div>
	
		  <div class="form-group">
		    <label for="balance">Balance : </label>
		    <input id = 'balance' type="text" class="form-control" name="balance" required>
		  </div>
		  
		  <div class="form-group">
		    <label for="pwd">Password:</label>
		    <input id = 'pswrd' type="password" class="form-control" name="pwd" required>
		  </div>

		  <div class="form-group">
		    <label for="pwd">Re-enter Password:</label>
		    <input id = 'rpswrd' type="password" class="form-control" name="pwd2" required>
		  </div>

		  <button type="submit" class="btn btn-default">Submit</button>
		</form>
			<p id = 'message' style = 'display : none; color : red';>Password doesn't match</p>
				<%
			Object status = request.getAttribute("status");
			if(status != null)
			{
				out.print(status.toString());
			}
		%>
	</div>
	<script>
		function validate()
		{
			var psw1 = document.getElementById('pswrd').value;
			var psw2 = document.getElementById('rpswrd').value;
			if (psw1 == psw2)
			{
				return true;
			}
			document.getElementById('message').style.display = 'block';
			return false;
		}
	</script>
</body>
</html>