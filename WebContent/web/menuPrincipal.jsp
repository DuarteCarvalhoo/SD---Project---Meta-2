<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Main Menu</title>
</head>
<body>
        <h1>Main Menu</h1><br><br>

        <p><a href="<s:url action="searchMenu" />">Search</a></p>
        <p><a href="<s:url action="editorMenu" />">Edit</a></p>
        <p><a href="<s:url action="linkCritic" />">Make a Critic</a></p>
        <p><a href="<s:url action="makeEditorMenu" />">Make editor</a></p>
        <p><a href="<s:url action="shareMusic" />">Share music</a></p>
        <p><a href="<s:url action="connectMenu" />">Connect a music</a></p>
        <p><a href="<s:url action="Logout" />">Sair da conta</a></p><br><br>
        <p><a href="<s:url action="dropboxauth" />">Connect to Dropbox!</a></p>


</body>
</html>
