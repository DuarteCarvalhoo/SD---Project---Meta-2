<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Menu Principal</title>
</head>
<body>
        <h1>Menu Principal</h1><br><br>

        <p><a href="<s:url action="searchMenu" />">Search</a></p>
        <p><a href="<s:url action="editorMenu" />">Edit</a></p>
        <p><a href="<s:url action="linkCritic" />">Make a Critic</a></p>
        <p><a href="<s:url action="makeEditorMenu" />">Make editor</a></p>
        <p><a href="<s:url action="linkShare" />">Share music</a></p>
        <p><a href="<s:url action="linkUpload" />">Upload a music</a></p>
        <p><a href="<s:url action="linkDownload" />">Download a music</a></p><br><br>
        <p><a href="<s:url action="Logout" />">Sair da conta</a></p>



</body>
</html>
