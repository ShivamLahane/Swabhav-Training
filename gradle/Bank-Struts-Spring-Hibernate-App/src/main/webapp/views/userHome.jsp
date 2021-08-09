<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
	  	button 
	  	{
		  background: none!important;
		  border: none;
		  padding: 0!important;
		}
  </style>
</head>
<body>
	<div class= "jumbotron text-center">
		<h1>Bank-App</h1>
	</div>
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="home">Bank-App</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li>
	      	<a href="passbook">Passbook</a>
	      </li>
	      <li>
	      	<a href="transaction">Transaction</a>
	      </li>
	      <li>
	      	<a>Welcome <s:property value = 'customer.name' /> </a>
	      </li>
	      <li>
	      	<a>Balance : <s:property value = 'customer.balance'/> </a>
	      </li>
	      <li>
	      	<a href="logout">Log Out</a>
	      </li>
	    </ul>
	  </div>
	</nav>
</body>
</html>