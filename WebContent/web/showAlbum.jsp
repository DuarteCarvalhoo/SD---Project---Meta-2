<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Dropmusic - Music View</title>
</head>

<h2>${name}'s information</h2>
<body>
<a>Title: ${name}</a><br>
<a>Artist: ${artist}</a><br>
<a>Publisher: ${publisher}</a><br>
<a>Score: ${score}</a><br>
<a>Genre: ${genre}</a><br>
<a>Description: ${description}</a><br>
<a>Length: ${length}</a><br>
<a>Critics:</a><br>
<c:forEach items="${critics}" varStatus="i">
    <a>      ● </a><a>${critics[i.index]}</a><br>
</c:forEach>
<a>Musics:</a><br>
<c:forEach items="${musics}" varStatus="i">
    <a>      ● </a><a>${musics[i.index]}</a><br>
</c:forEach>

<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
