<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/Js.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body><div class="login" style="margin-top:70px;">
<style>
#btn{
padding-bottom:50px;
}
</style>

<table align="center" style="background-color:#f5f5f5; border:1px solid #ccc;">

<tr>
<td>

<center><h1>User Login</h1></center>
<form action="profile/controller/Sign_in_controller.jsp" method="post" style="padding:50px">
<div class="form-group">
<label for="username">User Name:</label>
<input type="text" class="form-control" size="60" name="username" id="username"> <br>
</div>
<div class="form-group">
<label for="password">Password:</label>
<input type="password" class="form-control" size="60" name="password" id="password"><br/><br/>
<div id="btn" style="float:right; padding-right:100px;"><input  type="submit" value="Log In" class="btn btn-success btn-lg" onclick = "return login();"></div>

 <div id="btn" style ="float:left; padding-left:100px;">
 <a  class="btn btn-info btn-lg" href="Registrazione.jsp">Sign up</a>
 </div>

</div>

</form>
<%
String message=(String)session.getAttribute("login_message");
if(message!=null){
out.println(message);
session.removeAttribute("login_message");
}
%>


</tr>

</table>
</div>
</body>
</html>