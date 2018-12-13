<%--
  Created by IntelliJ IDEA.
  User: Duarte
  Date: 13/12/2018
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Menu Principal</title>
</head>
<body>
    <:form action="menuPrincipal" method="post">
    </:form>
    <h1>Menu Principal</h1><br><br>

        <p><a href="<s:url action="Search" />">Search</a></p>
        <p><a href="<s:url action="Critic" />">Make a Critic</a></p>
        <p><a href="<s:url action="Share" />">Share music</a></p>
        <p><a href="<s:url action="Upload" />">Upload a music</a></p>
        <p><a href="<s:url action="Download" />">Download a music</a></p><br><br>


        <p><a href="<s:url action="Logout" />">Sair da conta</a></p>


</body>
</html>
