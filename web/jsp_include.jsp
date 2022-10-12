<%-- 
    Document   : user-login
    Created on : Apr 13, 2021, 9:17:49 PM
    Author     : BEKI
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Include Action Demo</title>
</head>
<body>
<h1>JSP Include Action Demo</h1>
<!--<p>The included page cannot change response status code or set headers. The servlet container will ignore those attempts.
</p>-->
<jsp:include page="being_included.jsp" flush="true">
    <jsp:param name="channel" value="XYZ"/>
    <jsp:param name="author" value="Bereket"/>
</jsp:include>

<jsp:forward page="result.jsp">
    <jsp:param name="channel" value="XYZ"/>
    <jsp:param name="author" value="Bereket"/>
</jsp:forward>

<p>The servlet container includes response (not source code) of the included page.
</p>

</body>
</html>
