<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Music View</title>
</head>
<body>
<a>Title: ${name}</a><br>
<a>Artist: ${artist}</a><br>
<a>Publisher: ${publisher}</a><br>
<a>Score: ${score}</a><br>
<a>Genre: ${genre}</a><br>
<a>Description: ${description}</a><br>
<a>Length: ${length}</a><br>
<a>Critics: ${critics}</a><br>
<a>Musics: ${musics}</a><br>

<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
