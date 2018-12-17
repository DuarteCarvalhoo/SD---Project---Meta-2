<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Edit Music</title>
</head>
<h2>Requested publisher editable attributes</h2>
<body>
<s:form action="editPublisher" method="post">
    <s:text name="Name:"/>
    <s:textfield name="publisherName" value="%{#session.publisherChange}"/><br><br>
    <s:submit/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>
