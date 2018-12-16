<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dropmusic - Listing albums</title>
</head>
<body>
<h2>${artist}'s albums</h2>
<a>Albums:</a><br>
<c:forEach items="${albums}" varStatus="i">
    <a>      ● </a><a>${albums[i.index]}</a><br>
</c:forEach>
<s:form action="searchAlbumByName" method="post">
    <s:text name="Choose one of the above:" />
    <s:textfield name="albumName"/><br><br>
    <s:submit value="Search"/>
</s:form>
<p><a href="<s:url action="menuPrincipal" />">Menu Principal</a></p>
</body>
</html>