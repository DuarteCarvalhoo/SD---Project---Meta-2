<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Login</title>
</head>
<body>
    <s:form action="checkLogin" method="post">
        <s:textfield name="username" label="Username:"/><br><br>
        <s:password name="password" label="Password:"/><br>
        <s:submit/>
    </s:form>
    <p><a href="<s:url action="index" />">Back</a></p>
</body>
</html>
