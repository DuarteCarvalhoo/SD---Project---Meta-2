<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Search Music</title>
</head>
<body>
    <h2>You wanna search by name, composer or songwriter?</h2><br><br>

    <p><a href="<s:url action="searchByNameInput" />">Search By Name</a></p>
    <p><a href="<s:url action="searchByComposerInput" />">Search By Composer</a></p>
    <p><a href="<s:url action="searchBySongwriterInput" />">Search By Songwriter</a></p>

    <p><a href="<s:url action="searchMenu"/>">Back</a></p>
</body>
</html>
