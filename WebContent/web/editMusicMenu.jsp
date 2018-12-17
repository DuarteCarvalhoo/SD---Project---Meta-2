<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Edit Music</title>
</head>
<h2>Requested music editable attributes</h2>
<body>
<s:form action="editMusic" method="post">
    <s:text name="Title:"/>
    <s:textfield name="musicTitle" value="%{#session.musicChange}"/><br><br>
    <s:submit/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
