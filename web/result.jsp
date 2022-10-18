<%-- 
    Document   : user-login
    Created on : Apr 13, 2021, 9:17:49 PM
    Author     : BEKI
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>This is result is displayed by param object</h1>
${param["channel"]} ---- ${param["author"]}
<h1>This is result displayed in request get parameter</h1>
<p>
    <%=request.getParameter("channel")%> =====
    <%=request.getParameter("author")%>
</p>
<h1>This is result display in website</h1>
<p>
    <%
        out.print(request.getParameter("channel"));
        out.print("<br/>");
        out.print(request.getParameter("author"));
    %>
</p>
</body>
</html>
