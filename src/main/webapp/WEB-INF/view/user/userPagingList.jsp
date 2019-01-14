<%@page import="kr.or.ddit.user.model.JSPUserVO"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Jsp</title>
<style type="text/css">
	.userClick{
		cursor: pointer;
	}
</style>
<script type="text/javascript">
	$(document).ready(function(){
		
		console.log("document.ready");
		//tr에 select( class = "userClick")
		/* $(".userClick").click(function(){
			console.log("userClick")
			var userId = $(this).children()[1].innerText;
			
			$("#userId").val(userId);
			//.submit();
			$("#frm").submit();
			
		}); */
		
		 getUserList(1);
		 getPageList(1);
		
		
		$(".userList").on("click", ".userClick", function(){
			console.log("userClick")
			var userId = $(this).children()[1].innerText;
			
			$("#userId").val(userId);
			//.submit();
			$("#frm").submit();
			
		});
		/* var ev = "click";
		$(".userClick").on("click", function(){
			
		});
		 */
	});
	
	//page/pageSize 인자를 받아서 
	//해당 페이지에 속하는 사용자 리스트 정보를 가져온다 
	function getUserList(page){
		var pageSize = 10;
		
		console.log("page : "+page);	
		
		
		
		//ajax call
		//사용자 리스트 데이터만 가져오기 
		//html(as-is) --> json(to-be) 데이터를 받는 형태로 변경 
		$.ajax({
			
			type: "GET",
			url:"/postPageListAjax",
			data : "page="+page+"&pageSize="+pageSize,
			success : function(data){
				//data(사용자 json 데이터)를 바탕으로 
				//사용자 리스트를 갱신
				//1. 기존 리스트를 삭제 
				//2. data를 이용하여 table 태그(tr) 작성
				//3. 기존 리스트 위치에다가 붙여 넣기
				console.log(data);
				var html = "";
			
				
				$.each(data.userList, function(idx, user){
					console.log(user);
					html+="<tr class= 'userClick'>";
					html+="<td>"+user.rnum+"</td>";
					html+="<td>"+user.userId+"</td>";
					html+="<td>"+user.name+"</td>";
					html+="<td>"+user.fommatbirth+"</td>";
					html+="</tr>";
				})
				
				$(".userList").html("");
				$(".userList").html(html);
			 
				
			}
		});
		
		
		
	}
	
function getPageList(page){
	var pageSize = 10; 
	
	$.ajax({
		type : "GET",
		url : "/user/userPageListAjaxHtml",
		data: "page="+page+"&pageSize="+pageSize,
		success : function(dt){
			$(".pagination").html(dt);
		}
	});
}
	
</script>

</head>
<form id="frm" action="/user/userDetail" method="get">
	<input type="hidden" id="userId" name="userId"/>
</form>
<body>
<%--header --%>

<div class="container-fluid">
		<div class="row">
		
<%--left --%>
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				

<div class="blog-header">
	<h1 class="blog-title">INTRODUCE</h1>
	<p class="lead blog-description">about Member</p>
</div>


<div class="row">
	<div class="col-sm-8 blog-main">
		<h2 class="sub-header">사용자</h2>
		<div class="table-responsive">
			<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>사용자 아이디</th>
					<th>사용자 이름</th>
					<th>사용자 생일</th>
				</tr>
			<thead>
			<tbody class="userList">
		<%
			
		/* 	List<JSPUserVO> selectList = (List<JSPUserVO>)request.getAttribute("selectList");
			String page_number = (String)request.getAttribute("page");
			Integer totalPage = (Integer)request.getAttribute("totalPage"); 
			System.out.println(selectList);
			
			if(page_number != null){
				Integer paging_number = Integer.parseInt(page_number);
			}
			*/
			
			//--교수님 방식 
		/* 	List<JSPUserVO> selectList = (List<JSPUserVO>)request.getAttribute("userList");
			Integer pageCnt = (Integer)request.getAttribute("pageCnt");
			
			
			for(int i = 0; i < selectList.size(); i++){ */
		%>		
		
					
				<!-- 임시 방편 -->
				<!-- html.. onclick을 이용하는건 좋은 방법이 아니다. html 은 문서형식으로서의 역할만..-->
			<%-- 	<tr class="test" onclick="javascript:alert('<%=selectList.get(i).getUserId()%>')"> --%>

		<%-- 	<tr class="userClick">
				<td><%=selectList.get(i).getRnum()%></td>
				<td><a href="/tableUserDetail?userId=<%=selectList.get(i).getUserId()%>"><%=selectList.get(i).getUserId()%></a></td>
				<td><%=selectList.get(i).getName()%></td>
				<td><%=new SimpleDateFormat("yyyy-MM-dd").format(selectList.get(i).getBirth())%></td>
			</tr>  --%>
		<% 
			/* } */
		%>
		</tbody>
			</table>
		</div>

		<a class="btn btn-default pull-right" href="/userForm">사용자 등록</a>
		
		
		<div class="text-center">
			<ul class="pagination">
			<!-- <li>
		      <a href="/userPageList?page=1" aria-label="Previous">
		      <a href="javascript:getUserList(1);" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li> -->
		   <%--  
		    <c:forEach begin="1" end="${pageCnt}" var="i">
		    	<li><a href="/user/userPageList?page=${i}&pageSize=10">${i}</a></li>
		    </c:forEach>
		     --%>
		<%-- <%
			for(int i = 1; i <= pageCnt; i++){
		%>
				<li><a href="/userPageList?page=<%=i%>"><%=i%></a></li>
		<% 
			}
		%> --%>
			<!-- 	<li><a href="/userPageList?page=1">1</a></li>
				<li><a href="/userPageList?page=2">2</a></li>
				<li><a href="/userPageList?page=3">3</a></li>
				<li><a href="/userPageList?page=4">4</a></li>
				<li><a href="/userPageList?page=5">5</a></li> -->
				
				<%-- <li>
			      <a href="javascript:getUserList(${pageCnt});" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span>
			      </a>
			    </li> --%>
			</ul>
		</div>
	</div>
</div>

</body>
</html>
