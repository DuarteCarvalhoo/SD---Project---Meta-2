<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Search Music</title>
</head>
<body>
<s:form action="showSongwriterMusic" method="post">
    <s:text name="Music's songwriter:" />
    <s:textfield name="composerName"/><br><br>
    <s:submit value="Search"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>