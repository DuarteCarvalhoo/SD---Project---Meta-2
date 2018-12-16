<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Listing musics</title>
</head>
<body>
<h2>Did you mean one of these?</h2>
<a>Musics:</a><br>
<c:forEach items="${musics}" varStatus="i">
    <a>      ● </a><a>${musics[i.index]}</a><br>
</c:forEach>
<s:form action="searchMusicByName" method="post">
    <s:text name="Choose one of the above:" />
    <s:textfield name="musicName"/><br><br>
    <s:submit value="Search"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>