<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head><title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../css/style.css" />">
</head>
<body><h1>User Info</h1>
userName:<c:out value="${spitter.userName}" /><br/>
firstName:<c:out value="${spitter.firstName}" /><br/>
lastName:<c:out value="${spitter.lastName}"/>
</body>
</html>