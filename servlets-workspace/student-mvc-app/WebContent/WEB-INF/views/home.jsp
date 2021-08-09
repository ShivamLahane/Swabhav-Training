<%@ page import="java.util.*" import="com.techlab.model.Student" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student MVC App</title>
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
	<a style = "float : right" class = 'btn btn-primary' href = 'http://localhost:8080/student-mvc-app/add'>Add Student</a>
	<% 
		int count = (int) request.getAttribute("count");
		List<Student> students = (List<Student>) request.getAttribute("studentList");
		out.print("<h3> Student Count : " + count + "</h3>");
		out.print("<table class = 'table'>" +
						"<thead>" +
								"<tr>" +
									"<th>GUID</th>" + 
									"<th>Name<th>" +
									"<th>Roll No<th>" +
									"<th>CGPA<th>" +
									"<th>Location</th>" +
								"</tr>" + 
						"</thead>");
		out.print("<tbody>");
		for (Student student : students)
		{
			out.print("<tr>");
				out.print("<td>" + student.getId() + "</td>");
				out.print("<td>" + student.getName() + "</td>");
				out.print("<td>" + student.getRollNo() + "</td>");
				out.print("<td>" + student.getCgpa() + "</td>");
				out.print("<td>" + student.getLocation() + "</td>");
			out.print("</tr>");
		}
		out.print("</tbody>");
		out.print("</table>");
	%>
</body>
</html>