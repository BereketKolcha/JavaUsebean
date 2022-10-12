<%-- 
    Document   : user-login
    Created on : Apr 13, 2021, 9:17:49 PM
    Author     : BEKI
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
    <style type="text/css">
		div{width: 450px;box-shadow: 0px 1px 10px #a8a8a8;position: absolute;top: 50%;left: 50%;
                    transform: translate(-50%,-50%);background-color: #fff;padding-bottom: 10px;

		}
		input{
			display: block;margin: auto;font-size: 20px;
		}
		#username{
			text-align:center;font-size: 15px;
		}
		input{
			width: 70%;border :1px solid #60bc54;background-color: #fff;outline: none;border-radius: 5px;height: 40px;padding: 10px;
		}
		input[type="submit"]{background-color: red;color: #fff; cursor: pointer;

		}
	</style>
</head>
<body>
    <div>
<form action="jsp_usebean.jsp" method="post">
    <p>                                </p>
    .   First Name: <input name="firstName"> <br/>
    .   Last Name: <input name="lastName"> <br/>
    <input type="submit" value="Submit">
</form>
  </div>

</body>
</html>
