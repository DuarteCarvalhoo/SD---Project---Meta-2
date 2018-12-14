<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Artist View</title>
</head>
<body>
    <a>Name: ${name}</a><br>
    <a>Description: ${description}</a><br>
    <a>Functions: ${functions}</a><br>
    <a>Albums: ${albums}</a><br>

    <p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
