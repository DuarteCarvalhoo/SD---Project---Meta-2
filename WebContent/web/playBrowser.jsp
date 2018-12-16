<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Play Music</title>
</head>
<body>

<h1>Play Music</h1>
<h2>Files:</h2>
<p>${files}</p><br>

<s:form action="playBrowser" method="post" target="_blank">
    <s:text name="Dropbox filepath:" />
    <s:textfield name="dbfilePath"/><br><br>
    <s:submit value="Play"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
