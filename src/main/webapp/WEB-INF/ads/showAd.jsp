<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here is your ad ... ${adid} </h1>
    <p>${aduid}</p>
<%--    <c:forEach var="ad" items="${ads}">--%>
        <div class="col-md-6">
            <h2><c:out value="${ads[6].title}" /></h2>
            <p><c:out value="${ads[6].description}" /></p>
            <p>Seller: <c:out value="${users[4].username}" /></p>
            <p>Email: <c:out value="${users[4].email}" /></p>
        </div>
<%--    </c:forEach>--%>
</div>

</body>
</html>

