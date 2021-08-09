<%@ page language="java" import="com.techlab.model.Student" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
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
		<% 
		
		out.print("<h3 class = ''> User : " + request.getAttribute("User") + "</h3>");
		Student student = (Student) session.getAttribute("studentToEdit");
		
		out.print("<form method = 'POST'>");
		
		
		out.print("<div class='form-group'>");
		out.print("<label for='GUID'>GUID</label>");
		out.print("<input type = 'hidden' class = 'form-control'  name = 'GUID' value = " + "'" + student.getId() + "'" + "required>");
		out.print("</div>");
		
		out.print("<div class='form-group'>");
		out.print("<label for='Name'>Name</label>");
		out.print("<input type = 'text' class = 'form-control'  name = 'name' value = " + "'" + student.getName() + "'" + "required>");
		out.print("</div>");
		
		out.print("<div class='form-group'>");
		out.print("<label for='RollNo'>RollNo</label>");
		out.print("<input type = 'text' class = 'form-control'  name = 'rollNo' value = " + "'" + student.getRollNo() + "'" + " required>");
		out.print("</div>");
		 
		out.print("<div class='form-group'>");
		out.print("<label for='CGPA'>CGPA</label>");
		out.print("<input type = 'text' class = 'form-control'  name = 'cgpa' value = " + "'" + student.getCgpa() + "'" + " required>");
		out.print("</div>");
		
		out.print("<div class='form-group'>");
		out.print("<label for='CGPA'>Location</label>");
		out.print("<input type = 'text' class = 'form-control'  name = 'location' value = " + "'" + student.getLocation() + "'" + " required>");
		out.print("</div>");
		  
		out.print("<input type='submit' class='btn btn-primary'>");
		out.print("</form>");
		
		%>
	</div>
</body>
</html>