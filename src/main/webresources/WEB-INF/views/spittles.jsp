<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head><title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../css/style.css" />">
</head>
<body><h1>Recent Spittr</h1>
<c:forEach items="${spittleList}" var="spittle">
    <li id="spittle_<c:out value="spittle.id"/>">
        <div class="spittleMessage">
            <c:out value="${spittle.message}"/>
        </div>
        <div>
            <span class="spittleTime"><c:out value="${spittle.time}"/></span>
            <span class="spittleLocation">
                (<c:out value="${spittle.latitude}"/>,<c:out value="${spittle.longitude}"/>)
            </span>
        </div>
    </li>
</c:forEach>
</body>
</html>