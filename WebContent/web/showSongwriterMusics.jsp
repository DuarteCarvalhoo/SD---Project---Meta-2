<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Search Music</title>
</head>
<body>
<h2>Musics written by ${songwriter}</h2>
<a>Musics: ${musics}</a><br><br>
<s:form action="searchMusicByName" method="post">
    <s:text name="Choose one of the above:" />
    <s:textfield name="musicName"/><br><br>
    <s:submit value="Search"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
