<%@ page import="java.util.*" import="com.techlab.models.Transaction" import="com.techlab.models.Customer"
language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passbook</title>
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
</head>
<body>
	<div class = 'jumbotron'>
		<h1>Bank-App</h1>
	</div>
		<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="home">Bank-App</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li>
	      <a>
	      <form action = 'passbook' method = 'GET'>
	      	<input type = 'hidden' name = 'operation' value = 'passbook'>
	      	<button type = 'submit' class = 'button'> Passbook </button>
	      </form>
	      </a>
	      </li>
	      <li>
	      <a>
	      <form action = 'transaction' method = 'GET'>
	      	<input type = 'hidden' name = 'operation' value = 'transaction'>
	      	<button type = 'submit' class = 'button'> Transaction </button>
	      </form>
	      </a>
	      </li>
	      <%
	      	Customer customer = (Customer) request.getAttribute("customer");
	      	if (customer != null)
	      	{
	      		out.print("<li>");
	      		out.print("<a> Welcome " + customer.getName() + "</a>");
	      		out.print("</li>");
	      		
	      		out.print("<li>");
	      		out.print("<a> Balance : " + customer.getBalance() + "</a>");
	      		out.print("</li>");
	      		
	      		out.print("<li>");
				out.print("<a>");
				out.print("<form action = 'home' method = 'POST'>");
				out.print("<input type = 'hidden' name = 'operation' value = 'logOut'>");
				out.print("<button type = 'submit' class = 'btn'> Log Out </button>");
				out.print("</form>");
				out.print("</a>");
	      		out.print("</li>");
	      	}
	      	else
	      	{
	      		out.print("<li>");
	      		out.print("<a href = 'register'>Register</a>");
	      		out.print("</li>");
	      		out.print("<li>");
	      		out.print("<a href = 'login'>Log In</a>");
	      		out.print("</li>");
	      	}
	      %>
	      </ul>
	  </div>
	</nav>
	<div class = 'container'>
		<% 
		Customer customer1 = (Customer) request.getAttribute("customer");
		out.print("<h2 class = 'text-center'> User : " + customer1.getName() + "</h2>");
		List<Transaction> transactions = (List<Transaction>) request.getAttribute("transactions");
		session.setAttribute("transactions", transactions);
		out.print("<a href = 'export' class = 'btn btn-primary' >Export</a>");
		int count = transactions.size();
		out.print("<h3> Count : " + count + "</h3>");
		out.print("<table class = 'table table-striped table-bordered'>" +
						"<thead>" +
								"<tr>" +
									"<th>Amount</th>" +
									"<th>Type</th>" +
									"<th>Date</th>" +
								"</tr>" + 
						"</thead>");
		out.print("<tbody>");
		for (Transaction transaction : transactions)
		{
			out.print("<tr>");
				out.print("<td>" + transaction.getAmount() + "</td>");
				out.print("<td>" + transaction.getType() + "</td>");
				out.print("<td>" + transaction.getDate() + "</td>");
			out.print("</tr>");
		}
		out.print("</tbody>");
		out.print("</table>");
	%>
	</div>
</body>
</html>