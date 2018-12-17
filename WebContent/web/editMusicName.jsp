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
    <title>Dropmusic - Edit Music</title>
    <h2>Which music you wanna change?</h2>

    <s:form action="editMusicMenu" method="post">
        <s:text name="Name:" />
        <s:textfield name="musicName"/><br><br>
        <s:submit/>
    </s:form>
    <p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</head>
<body>

</body>
</html>
