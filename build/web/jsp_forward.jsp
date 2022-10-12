<%-- 
    Document   : user-login
    Created on : Apr 13, 2021, 9:17:49 PM
    Author     : BEKI
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forward to Another Page</title>
</head>
<body>
<h1> JSP FORWARD PAGE</h1>
<jsp:forward page="result.jsp">
    <jsp:param name="channel" value="XYZ"/>
    <jsp:param name="author" value="Bereket"/>
</jsp:forward>
</body>
</html>
