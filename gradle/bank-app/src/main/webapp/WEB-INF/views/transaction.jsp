<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
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

		<h2 class = 'text-center'>Transaction</h2>
		
		<form method="POST">
		
		  <div class="form-group">
		    <label for="amount">Amount</label>
		    <input id = 'amount' type="text" class="form-control" name="amount" required>
		  </div>
		  
		<div class="form-group">
		    <label class="radio-inline">
		      <input type="radio" name="type" value = 'D' checked>Deposit
		    </label>
		    <label class="radio-inline">
		      <input type="radio" name="type" value = 'W'>Withdraw
		    </label>
		</div>

		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
		<%
			Object status = request.getAttribute("status");
			if(status != null)
			{
				out.print(status.toString());
			}
		%>
	</div>
</body>
</html>