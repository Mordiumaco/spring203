<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		$("#lang").change(function(){
			
			var lang = $("#lang option:selected").val();
			
			location.href='messageView?lang='+lang;
		});
	})
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
아이디: <input type = "text" value="brown"><br/>
내용: <input type= "text" value="content"/><br/>
<input type="submit" value="전송">
</form>

hello: <spring:message code="hello"/> <br>
visitor: <spring:message code="visitor" arguments="choi"/><br/>
<form action="/messageView" methoid=post>
<select name="lang" id="lang">
	<option value="ko" ${param.lang == "ko" ? "selected": ""}>한국어</option>
	<option value="ja" ${param.lang == "ja" ? "selected": ""}>니홍고</option>
	<option value="en" ${param.lang == "en" ? "selected": ""}>잉글리쉬</option>
</select>
<input type="submit" value="전송">
</form>
</body>
</html>