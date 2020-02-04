
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Successful Page</title>
    </head>
    <body>
        <jsp:useBean id="log" type="Model.Login" scope="session"/> 
        Welcome <jsp:getProperty name="log" property="username" />. 
        Your Login is successful.
    </body>
</html>
