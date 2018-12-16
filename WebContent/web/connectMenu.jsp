<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Upload Music</title>
</head>
<body>

<h1>Connect Music to Dropbox file</h1>
<h2>Files:</h2>
<p>${files}</p><br>

<s:form action="upload" method="post">
    <s:text name="Dropbox filepath(association):" />
    <s:textfield name="dbfilePath"/><br><br>
    <s:text name="Music name:" />
    <s:textfield name="musicName"/><br><br>
    <s:submit value="Connect"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
