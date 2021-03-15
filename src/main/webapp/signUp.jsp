<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 12.01.2021
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="sign.css">
</head>
<body>
<div class="userform">
    <div class="logodiv">
        <img
                src="https://image.freepik.com/free-vector/volleyball-logo_20448-58.jpg"
                alt="Logo"
                class="logo"
        />
    </div>
    <h3>Sign Up</h3>
    <div id="error"></div>
        <form id="form" method="POST" action="SignUpServlet">
            <div class="centralize">
                <label for="name">Name</label>
                <input type="text" name="name" id="name" required/>
                <label for="surname">Surname</label>
                <input type="text" name="surname" id="surname"/>
                <label for="email">Email</label>
                <input type="email" name="email" id="email"/>
                <label for="username">Username</label>
                <input type="text" name="username" id="username"/>
                <label for="password">Password</label>
                <input type="password" name="password" id="password"/>
                <input type="submit" value="Sign up" id="submit"/><br/>
            </div>
            <br/>
        </form>
    <div class="footer">
    </div>
</div>
</body>
</html>
