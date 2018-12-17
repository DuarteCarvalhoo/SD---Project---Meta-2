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
    <title>Dropmusic - Create Music</title>

    <s:form action="createMusic" method="post">
        <s:text name="Title:" />
        <s:textfield name="musicName"/><br><br>
        <s:text name="Artist:" />
        <s:textfield name="artistName"/><br><br>
        <s:text name="Album:" />
        <s:textfield name="albumName"/><br><br>
        <s:text name="Composer:" />
        <s:textfield name="composerName"/><br><br>
        <s:text name="Songwriter:" />
        <s:textfield name="songwriterName"/><br><br>
        <s:text name="Length:" />
        <s:textfield name="musicLength"/><br><br>
        <s:submit/>
    </s:form>
    <p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</head>
<body>

</body>
</html>
