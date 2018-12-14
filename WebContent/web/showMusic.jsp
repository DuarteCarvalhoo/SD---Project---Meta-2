<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Music View</title>
</head>
<body>
<a>Title: ${title}</a><br>
<a>Artist: ${artist}</a><br>
<a>Album: ${album}</a><br>
<a>Composer: ${composer}</a><br>
<a>Songwriter: ${songwriter}</a><br>
<a>Length: ${length}</a><br>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
