<%
session.removeAttribute("user_session");
session.setAttribute("login_message", "");
%>
<script type="text/javascript">
window.location.href="http://localhost:8080/SPM/index.jsp";
</script>