<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Listing musics</title>
</head>
<body>
<h2>Who is the user you want to become an editor?</h2>
<s:form action="makeEditor" method="post">
    <s:text name="Username:" />
    <s:textfield name="targetName"/><br><br>
    <s:submit value="Search"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>