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
<%
    if (request.getSession().getAttribute("count") != null) {
        int count = (int) request.getSession().getAttribute("count") + 1;
        request.getSession().setAttribute("count", count);
    }
    Cookie[] ck = request.getCookies();
    Boolean here = false;
    for (Cookie c:ck) {
        if (c.getName().equals("loggedIn") && c.getValue().equals("true")){
            here = true;
        }
    }
    if (here){
        response.sendRedirect("MenShop.jsp");
    }
%>
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
    <form id="form" method="POST" action="SignInServlet">
        <div class="centralize">
            <label for="username">Username</label>
            <input type="text" name="username" id="username"/>
            <label for="password">Password</label>
            <input type="password" name="password" id="password"/>
            <input type="submit" value="Sign in" id="submit"/><br/>
        </div>
        <br/>
    </form>
    <div class="footer">
    </div>
</div>
</body>
</html>
