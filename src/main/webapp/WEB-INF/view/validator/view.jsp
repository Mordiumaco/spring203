<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>view.jsp-validator</h2>
	<form action="/validator/validate" method="post">
		userId : <input type="text" name="userId" value="${param.userId}"/><form:errors path="userVo.userId"></form:errors><br/>
		userName : <input type="text" name="name" value="${param.name}"/><form:errors path="userVo.name"></form:errors><br/>
		password : <input type="password" name="password" value="${param.password}"/><form:errors path="userVo.password"></form:errors><br/>
		<input type="submit" value="전송">
	</form>
	<br/>
	<h2>view.jsp-jsr303</h2>
	<form action="/validator/validateJsr" method="post">
		userId : <input type="text" name="userId" value="${param.userId}"/><form:errors path="userVoJsr303.userId"></form:errors><br/>
		userName : <input type="text" name="name" value="${param.name}"/><form:errors path="userVoJsr303.name"></form:errors><br/>
		password : <input type="password" name="password" value="${param.password}"/><form:errors path="userVoJsr303.password"></form:errors><br/>
		<input type="submit" value="전송">
	</form>
</body>
</html>