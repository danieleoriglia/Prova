<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
  <%@page import="modal.Login_Modal"%>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Insert title here</title>
  </head>
  <body>
   <jsp:useBean id="obj_Login_bean" class="bean.Login_bean"></jsp:useBean>
   <jsp:setProperty property="*" name="obj_Login_bean"/>
   <%
     System.out.println(obj_Login_bean.getUsername());
     System.out.println(obj_Login_bean.getPassword());
     Login_Modal obj_Login_Modal=new Login_Modal();
     boolean flag=obj_Login_Modal.check_user_name(obj_Login_bean);
    if(flag){
     session.setAttribute("user_session", obj_Login_bean);
    %>
    <script type="text/javascript">
    window.location.href="http://localhost:8080/SPM/profile/view/Home.jsp";
    
    </script>
  <%
}else{
 session.setAttribute("login_message", "");
 
  %>
  <script type="text/javascript">
  window.location.href="http://localhost:8080/SPM/index.jsp";
  
   </script>
  <%
 }
 %>
 </body>
 </html>