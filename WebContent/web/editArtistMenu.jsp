<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17/12/2018
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Edit Artist</title>
</head>

<body>

<h2>Requested artist editable attributes</h2>

<s:form action="editArtist" method="post">
    <s:text name="Name:"/>
    <s:textfield name="artistName" value="%{#session.artistChange}"/><br><br>
    <s:submit/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>

</body>
</html>
