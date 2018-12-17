<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17/12/2018
  Time: 02:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Create Artist</title>

    <s:form action="createArtist" method="post">
        <s:text name="Artist:" />
        <s:textfield name="nameArtist"/><br><br>
        <s:text name="Description:" />
        <s:textfield name="descriptionArtist"/><br><br>
        Songwriter:
        <select name="songwriterArtist">
            <option value="0">Yes</option>
            <option value="1">No</option>
        </select><br><br>
        Composer:
        <select name="composerArtist">
            <option value="0">Yes</option>
            <option value="1">No</option>
        </select><br><br>
        Band:
        <select name="bandArtist">
            <option value="0">Yes</option>
            <option value="1">No</option>
        </select><br><br>
        <s:submit/>
    </s:form>
</head>
<body>

</body>
</html>
