<%-- 
    Document   : user-login
    Created on : Apr 13, 2021, 9:17:49 PM
    Author     : BEKI
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Example demo</title>
    <style type="text/css">
	* {
            box-sizing: border-box;
            
             }
             .col-3 {
        width: 80%;
        margin: 0 auto;
        padding: 20px;
        background: #f0e68c;
    }
             .col-3 {width: 25%;}
         .menu ul {
                       list-style-type: none;
                       margin: 0;
                       padding: 0;
                      }
        .menu li {
                       padding: 8px;
                       margin-bottom: 7px;
                       background-color :#33b5e5;
                       color: #ffffff;
                       box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
                     }
            .menu li:hover {
                       background-color: #0099cc;
                     }
	</style>
</head>
<body>
    <h1 style="text-align: center;color:#FF0000;"> USE BEAN JSP </h1>
    
    <div class="col-3 menu">
<ul>
    <li><a  href="jsp_forward.jsp"> Forward action</a> </li>
    <li><a  href="jsp_include.jsp"> Include Action</a> </li>
    <li><a  href="jsp_usebean.jsp">usebean Action</a> </li>
    <li><a  href="person_form.jsp">Person Form Page</a> </li>
</ul>
</div>
</body>
</html>
