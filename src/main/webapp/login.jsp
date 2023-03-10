<%--
  Created by IntelliJ IDEA.
  User: kevinfowler
  Date: 3/8/23
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%--%>
<%--    if (request.getMethod().equalsIgnoreCase("post")) {--%>
<%--        String username = request.getParameter("username");--%>
<%--        String password = request.getParameter("password");--%>
<%--        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {--%>
<%--            response.sendRedirect("profile.jsp");--%>
<%--        } else {--%>
<%--            response.sendRedirect("login.jsp");--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>

<html>
<head>

    <jsp:include page="partials/head.jsp" >
        <jsp:param name="title" value="Login" />
    </jsp:include>

</head>
<body>

    <%@ include file="partials/navbar.jsp" %>

    <hr>

    <h1>Login Page</h1>

    <form method="POST">
        <p>
            <label for="username">Username:</label>
            <input type="username" id="username" name="username" placeholder="Enter username">
            <br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter password">
        </p>

        <p>
            <button type="submit">Submit</button>
        </p>
    </form>


    <%@ include file="partials/body.jsp" %>

    <hr>

    <%@ include file="partials/footer.jsp" %>
</body>
</html>
