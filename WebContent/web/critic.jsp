<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Duarte
  Date: 13/12/2018
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - critic</title>
</head>
<body>
    <s:form action="critic" method="post">
        <s:text name="Which album do you want to make a critic:" />
        <s:textfield name="album" /><br>
        <s:text name="Critic's text:"/>
        <s:textfield name="critic"/>
        <s:text name="Score(0-5):"/>
        <s:textfield name="score"/>
        <s:submit />
    </s:form>
</body>
</html>
