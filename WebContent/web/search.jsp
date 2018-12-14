<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Search Menu</title>
</head>
<body>

    <h1>Search Menu</h1><br>
    <p><a href="<s:url action="searchArtistInput" />">Search Artist</a></p>
    <p><a href="<s:url action="searchMusicOptions" />">Search Music</a></p>
    <p><a href="<s:url action="searchAlbum" />">Search Album</a></p>

    <p><a href="<s:url action="menuPrincipal" />">Back</a></p>
</body>
</html>
