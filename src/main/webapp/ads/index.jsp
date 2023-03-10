<%--
  Created by IntelliJ IDEA.
  User: kevinfowler
  Date: 3/10/23
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp" >
        <jsp:param name="title" value="Index" />
    </jsp:include>
</head>
<body>

<jsp:include page="../partials/navbar.jsp" />

<hr>

<h1>Ads ... </h1>

<c:forEach var="ad" items="${ads}">
<h2>${ad.title}</h2>
<p>${ad.description}</p>
</c:forEach>

<%@ include file="../partials/body.jsp" %>

<hr>

<%@ include file="../partials/footer.jsp" %>

</body>
</html>
