<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17/12/2018
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Dropmusic - Create Album</title>

    <s:form action="createAlbum" method="post">
        <s:text name="Name:" />
        <s:textfield name="albumName"/><br><br>
        <s:text name="Descripton:" />
        <s:textfield name="albumDescription"/><br><br>
        <s:text name="Genre:" />
        <s:textfield name="albumGenre"/><br><br>
        <s:text name="Artist:" />
        <s:textfield name="albumArtist"/><br><br>
        <s:text name="Publisher:" />
        <s:textfield name="albumPublisher"/><br><br>
        <s:submit/>
    </s:form>

    <p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>

</head>
<body>

</body>
</html>
