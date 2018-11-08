<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<tiles:insertAttribute name="basicLib"/>
<tiles:insertAttribute name="header"/>
<tiles:insertAttribute name="left"/>
 <h2>HI , LayouT</h2>
<tiles:insertAttribute name="content"/>
</body>
</html>