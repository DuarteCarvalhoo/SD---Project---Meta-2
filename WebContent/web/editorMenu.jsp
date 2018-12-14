<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Editor Menu</title>
</head>
<body>
<p><h1>Editor Menu</h1></p>
<h2>You want to create or edit data?</h2><br>

<p><a href="<s:url action="createMenu" />">Create</a></p>
<p><a href="<s:url action="editMenu" />">Edit</a></p>
<p><a href="<s:url action="menuPrincipal" />">Back</a></p>


</body>
</html>
