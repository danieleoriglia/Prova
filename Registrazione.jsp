<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<script src="js/Js.js"></script>
<title>New User Registration </title>
</head>
<body>
<div class="Registration" >

<table align="center" style=" margin-bottom:1px; background-color:#f5f5f5; border:1px solid #ccc; margin-top:50px">


<tr>
<td>
<form action="/SPM/Registrazione" method="post" style="padding-bottom:20px; padding-left:50px; padding-right:50px;">
<div class="form-group">
<div style="padding-bottom:40px"><center><h1>New User Registration</h1></center></div>
<label for="username">	Username      : </label><input type="text" class="form-control" size="60" name="username" id="username">
	</div>
<div class="form-group">	
<label for="password">	Password      : </label><input type="password" class="form-control" size="60" name="password" id="password">
	</div>
<div class="form-group">	
<label for="affilation">	Affilation    : </label><input type="text" class="form-control" size="60" name="affilation" id="affilation">
	</div>
<div class="form-group">	
<label for="name">	Name          : </label><input type="text" class="form-control" size="60" name="name" id="name">
	</div>
<div class="form-group">	
<label for="surname">	Surname       : </label><input type="text" class="form-control" size="60" name="surname" id="surname">
	</div>
<div class="form-group">	
<label for="email">	Email         : </label><input type="text" class="form-control" size="60" name="email" id="email">
	</div>
<div class="form-group">	
<label for="date">	Date of Birth : </label><input type="text" class="form-control" size="60" name="date" id="date">
	</div>
			<center>	<input type="submit" value="Submit" class="btn btn-info btn-lg" onclick = "return registration();"></center>
</form>
</td>
</tr>



</table>
</div>
</body>
</html>