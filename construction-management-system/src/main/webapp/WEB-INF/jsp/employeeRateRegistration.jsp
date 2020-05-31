<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Construction Management System</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="#">Add Employee</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Add Project</a>
    </li>
  </ul>
</nav>
</body>
<form action="/registerRate" method = "POST">
		<div class="form-group">
  			<label for="projectTypeId">Employee Type :</label>
 				<input type="text" class="form-control" value="" id="projectTypeId" name="projectTypeId">
		</div>
		<div class="form-group">
  			<label for="employeeSubType">Employee Sub Type :</label>
 				<input type="text" class="form-control" value="" id="employeeSubType" name="employeeSubType">
		</div>
		<div class="form-group">
  			<label for="halfDayTimeRate">Half Day Rate :</label>
 				<input type="number" class="form-control" value="" id="halfDayTimeRate" name="halfDayTimeRate">
		</div>
				<div class="form-group">
  			<label for="fullDayTimeRate">Full Day Rate :</label>
 				<input type="number" class="form-control" value="" id="fullDayTimeRate" name="fullDayTimeRate">
		</div>
				<div class="form-group">
  			<label for="overTimeRate">Over Time Rate :</label>
 				<input type="number" class="form-control" value="" id="overTimeRate" name="overTimeRate">
		</div>
</html>