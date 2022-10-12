<%-- 
    Document   : user-login
    Created on : Apr 13, 2021, 9:17:49 PM
    Author     : BEKI
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This Page is included inside jsp_include.jsp</title>
</head>
<body>
<%
    out.print(2+4);
    out.print("<p>The answer is 6</p>");
%>

<p>${param.channel} --- ${param.author}</p>
</body>
</html>
