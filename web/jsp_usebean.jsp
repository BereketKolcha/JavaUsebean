<%@ page import="usebean.Person" %><%--
<%-- 
    Document   : user-login
    Created on : Apr 13, 2021, 9:17:49 PM
    Author     : BEKI
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>use Bean Action can separate</title>
</head> 
<body><fieldset>
    <p>1. Locate an existing Bean in page, request, session or application scope.</p><br>
<%
    
    String name = request.getParameter("firstName");
    String last = request.getParameter("lastName");
    Person p = new Person(name, last);
    request.setAttribute("person", p);
%>

<jsp:useBean id="person" class="usebean.Person" scope="request"></jsp:useBean>

<jsp:getProperty name="person" property="firstName"/>
<jsp:getProperty name="person" property="lastName"/>
</fieldset><br><br>
<fieldset>
<p>2. Create a new  Bean object </p>
<jsp:useBean id="person2" class="usebean.Employee" type="usebean.Person" >
</jsp:useBean>
<%--<jsp:useBean id="person2" type="usebean.Employee" beanName="usebean.Employee"></jsp:useBean>--%>

<jsp:getProperty name="person2" property="firstName"/>
<jsp:getProperty name="person2" property="lastName"/>
<jsp:getProperty name="person2" property="salary"/>

</fieldset><br><br><fieldset>
<p>3. demo for jsp :setProperty, property="*" to set all values from incoming request</p>
<jsp:useBean id="person3" class="usebean.Person">
<%--    <jsp:setProperty name="person3" property="*"></jsp:setProperty>--%>
</jsp:useBean>
<%--<jsp:setProperty name="person3" property="*"></jsp:setProperty>--%>
<jsp:setProperty name="person3" property="firstName" param="first"></jsp:setProperty>
<jsp:setProperty name="person3" property="lastName" param="last"></jsp:setProperty>

<jsp:getProperty name="person3" property="firstName"/>
<jsp:getProperty name="person3" property="lastName"/>
</fieldset><br><br><fieldset>
<p>4.USEBEAN IMPLEMENTATOIN FOR :setProperty, use value=""</p>
<jsp:useBean id="person4" class="usebean.Employee" type="usebean.Person">
    <jsp:setProperty name="person4" property="firstName" value="Bereket"></jsp:setProperty>
</jsp:useBean>
<jsp:setProperty name="person4" property="lastName" value="Esrael"></jsp:setProperty>
<jsp:setProperty name="person4" property="salary" value="20"></jsp:setProperty>

<jsp:getProperty name="person4" property="firstName"/>
<jsp:getProperty name="person4" property="lastName"/>
<jsp:getProperty name="person4" property="salary"/></fieldset>
</body>
</html>
