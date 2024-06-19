<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>Login</h1>
        ${SPRING_SECURITY_LAST_EXCEPTION.message}
        <form action='Login' method='POST'>
            <div>
                <label for="username">Username</label>
                <input type="text" name="username">
            </div>
            <div>
                <label for="password">Password</label>
                <input type="password" name="password">
            </div>
            <div> 
                <button type="submit">Submit</button>
            </div>
        </form>
    </body>
</html>
