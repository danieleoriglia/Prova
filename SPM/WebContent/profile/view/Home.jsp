<%@page import="bean.Login_bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 Login_bean obj_Login_bean=(Login_bean)session.getAttribute("user_session");
 if(obj_Login_bean==null){
 session.setAttribute("login_message", "");
 %>
 <script type="text/javascript">
 window.location.href="http://localhost:8080/SPM/index.jsp";
 </script>
 <% 
 }else{
 %>
<center>
<h1>Home Page</h1>
<table border="1">
<tr>
<td><a href="http://localhost:8080/SPM/profile/view/Home.jsp">Home</a> </td>
<td><a href="http://localhost:8080/SPM/profile/view/My_Profile.jsp">Profile</a> </td>
<td> Welcome <%=obj_Login_bean.getUsername() %></td>
<td> 
<a href="http://localhost:8080/SPM/profile/controller/Signoutcontroller.jsp">Logout</a>
</td>
</tr>
</table>
<%
 }
%>
</center>
</body>
</html>