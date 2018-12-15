<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Share Music</title>
</head>
<body>

<h1>Share Music</h1>
<s:form action="share" method="post">
    <s:text name="Music path on dropbox:" />
    <s:textfield name="filePath"/><br><br>
    <s:text name="User to share:"/>
    <s:textfield name="targetUser"/><br><br>
    <s:submit value="Share"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
