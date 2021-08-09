<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class= "jumbotron text-center">
		<h1>Student App</h1>
	</div>
	<div class = "container">
		<% out.print("<h3 class = ''> User : " + request.getAttribute("User") + "</h3>"); %>
		<form method = 'POST'>
		
			  <div class="form-group">
			    <label for="Name">Name</label>
			    <input type="text" class="form-control"  name = "name" required>
			  </div>
			  
			  <div class="form-group">
			    <label for="RollNo">Roll No</label>
			    <input type="number" class="form-control"  name = "rollNo" required>
			  </div>
			  
			  <div class="form-group">
			    <label for="CGPA">CGPA</label>
			    <input type="text" class="form-control" name = "cgpa" required>
			  </div>
			  
			  <div class="form-group">
			    <label for="Location">Location</label>
			    <input type="text" class="form-control" name = "location" required>
			  </div>
			  
			  <input type="submit" class="btn btn-primary">
		</form>
	</div>
</body>
</html>