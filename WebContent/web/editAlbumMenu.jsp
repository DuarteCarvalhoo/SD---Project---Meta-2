<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Edit Menu</title>
</head>
<h2>Requested album editable attributes</h2>
<body>
<s:form action="editAlbum" method="post">
    <s:text name="Genre:"/>
    <s:textfield name="albumGenre" value="%{#session.genreChange}"/><br><br>
    <s:text name="Description:"/>
    <s:textfield name="albumDescription" value="%{#session.descriptionChange}"/><br><br>
    <s:submit/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
