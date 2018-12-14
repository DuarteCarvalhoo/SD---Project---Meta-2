<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Search Artist</title>
</head>
<body>
    <s:form action="searchArtist" method="post">
    <s:text name="Artist name:" />
    <s:textfield name="artistName"/><br><br>
    <s:submit/>
</s:form>
</body>
</html>
