<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Search Album</title>
</head>
<body>
<h2>You wanna search by album name or artist?</h2><br><br>

<p><a href="<s:url action="searchAlbumByNameInput" />">Search By Name</a></p>
<p><a href="<s:url action="searchAlbumByArtistInput" />">Search By Artist</a></p>

<p><a href="<s:url action="searchMenu"/>">Back</a></p>
</body>
</html>
