<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Artist View</title>
</head>
<h2>${name}'s information</h2>
<body>
    <a>Name: ${name}</a><br>
    <a>Description: ${description}</a><br>
    <a>Functions: </a><br>
    <c:forEach items="${functions}" varStatus="i">
        <a>      ● </a><a>${functions[i.index]}</a><br>
    </c:forEach>
    <a>Albums: </a><br>
    <c:forEach items="${albums}" varStatus="i">
        <a>      ● </a><a>${albums[i.index]}</a>
    </c:forEach>

    <p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
