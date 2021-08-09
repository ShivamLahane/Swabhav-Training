<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "s" uri = "/struts-tags" %>
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
		<h2>Register</h2>
		<s:form action = 'doRegister' onsubmit = 'return validate();'>
		    <s:textfield name = 'customer.name' label = 'name'/>
		    <s:textfield name = 'customer.balance' label = 'balance'/>
		    <s:password id = 'pswrd' name = 'customer.password' label = 'password'/>
		    <s:password id = 'rpswrd' name = 'rpassword' label = 'repeat = password'/>
		  	<s:submit />
		</s:form>
			<s:property value="error"/>
			<p id = 'message' style = 'display : none; color : red;'>Password doesn't match</p>
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