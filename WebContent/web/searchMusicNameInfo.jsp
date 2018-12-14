<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Search Music</title>
</head>
<body>
<s:form action="searchMusicByName" method="post">
    <s:text name="Music name:" />
    <s:textfield name="musicName"/><br><br>
    <s:submit value="Search"/>
</s:form>
</body>
</html>
