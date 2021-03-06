<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view.jsp</title>
<%@ include file="/WEB-INF/view/common/basicLib.jsp" %>
<script type="text/javascript">
	$(function(){
		var userVo = {userId: "brown", name: "브라운"};
		
		//자바스크립트 객체를 문자열로 변환 메소드 : stringify
		$("#sendData").html(JSON.stringify(userVo));
		
		$("#send").on("click", function(){
			$.ajax({
				contentType: "application/json; charset=utf-8",
				url : "/ajax/getRangers",
				type : "post",
				data : JSON.stringify(userVo), //json
				success : function(dt){
					console.log(dt);
					$("#result").html(JSON.stringify(dt));
				}
			});
		});
		
		
		
	});
</script>
</head>
<body>
	<h2>view.jsp</h2>
	<button id="send">전송</button>
	전송데이터 : <span id="sendData"></span>
	응답결과 : <span id="result"></span>
</body>
</html>