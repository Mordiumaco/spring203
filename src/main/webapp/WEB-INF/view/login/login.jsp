<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>/login</h2>
	<form action="/user/loginProcess" method="post">
		userId : <input type="text" name="userId" value="brown"/><br/>
		password : <input type="password" name="password" value="brownpass"/><br/>
		<input type="submit" value="전송">
	</form>
</body>
</html>