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
	<div>
		<%
			if(request.getAttribute("User").equals("Guest"))
			{
				out.print("<a class = 'btn btn-primary' href = 'http://localhost:8080/student-mvc-servlet-app/login'>Log In</a><br>");
			}
			else
			{
				out.print("<form method = 'POST'>");
				out.print("<input type = 'hidden' name = 'operation' value = 'logOut'>");
				out.print("<button type = 'submit' class = 'btn btn-danger'> Log Out </button>");
				out.print("</form>");
			}
		%>
		
		<%
		out.print("<form action = 'add' method = 'GET'>");
		out.print("<input type = 'hidden' name = 'operation' value = 'add'>");
		out.print("<button style = 'float : right' type = 'submit' class = 'btn btn-danger'> Add Student </button>");
		out.print("</form>");
		%>

	</div>
	<% 
		out.print("<h3 class = ''> User : " + request.getAttribute("User") + "</h3>");
		List<Student> students = (List<Student>) request.getAttribute("studentList");
		int count = students.size();
		out.print("<h3> Student Count : " + count + "</h3>");
		out.print("<table class = 'table table-striped table-bordered'>" +
						"<thead>" +
								"<tr>" +
									"<th>GUID</th>" + 
									"<th>Name</th>" +
									"<th>Roll No</th>" +
									"<th>CGPA</th>" +
									"<th>Location</th>" +
									"<th>Edit</th>" +
									"<th>Delete</th>" +
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
				out.print("<td>");
				out.print("<form action = 'edit' method = 'GET'>");
				out.print("<input type = 'hidden' name = 'operation' value = 'edit'>");
				out.print("<input type = 'hidden' name = 'guid' value = '" + student.getId() + "'>");
				out.print("<input type = 'hidden' name = 'name' value = '" + student.getName() + "'>");
				out.print("<input type = 'hidden' name = 'rollNo' value = '" + student.getRollNo() + "'>");
				out.print("<input type = 'hidden' name = 'cgpa' value = '" + student.getCgpa() + "'>");
				out.print("<input type = 'hidden' name = 'location' value = '" + student.getLocation() + "'>");
				out.print("<button type = 'submit' class = 'btn btn-warning'> Edit </button>");
				out.print("</form>");
				out.print("</td>");
				out.print("<td>");
				out.print("<form onclick= 'return confirmDelete()' method = 'POST'>");
				out.print("<input type = 'hidden' name = 'operation' value = 'delete'>");
				out.print("<input type = 'hidden' name = 'guid' value = '" + student.getId() + "'>");
				out.print("<button type = 'submit' class = 'btn btn-danger'> Delete </button>");
				out.print("</form>");
				out.print("</td>");
			out.print("</tr>");
		}
		out.print("</tbody>");
		out.print("</table>");
	%>
	<script>
		function confirmDelete()
		{
			return confirm('Do you really want to delete?');
		}
	</script>
</body>
</html>