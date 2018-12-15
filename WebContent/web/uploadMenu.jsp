<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Upload Music</title>
</head>
<body>

<h1>Upload Music</h1>

<s:form action="upload" method="post">
    <s:text name="Music path:" />
    <s:textfield name="musicPath"/><br><br>
    <s:text name="Music composer:" />
    <s:textfield name="musiccomposer"/><br><br>
    <s:text name="Music songwriter:" />
    <s:textfield name="musicSongwriter"/><br><br>
    <s:text name="Music artist:" />
    <s:textfield name="musicArtist"/><br><br>
    <s:text name="Music album:" />
    <s:textfield name="musicAlbum"/><br><br>
    <s:text name="Music length:" />
    <s:textfield name="musicLength"/><br><br>
    <s:submit value="Upload"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
