
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>

        <form action="LoginServlet" method="post">
            Name : <input type="text" name="username"> <br> <br>
            Password : <input type="password" name="password"> <br> <br>           
            <input type="submit" value="Login">
        </form>
    </body>
</html>
