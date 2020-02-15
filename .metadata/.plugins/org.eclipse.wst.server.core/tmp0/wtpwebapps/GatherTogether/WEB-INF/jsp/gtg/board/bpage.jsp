<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>



<div class="container">
	<div class="row">
		<div class="col-xs-12">
		<div class="panel panel-primary">
		<div class="panel-heading">
		</div>

<h3>자유게시판</h3>
<h6><a href=bcontent.do>글쓰기</a></h6>
<c:set var="num" value="0"/>
<c:set var="cnt" value="${count }"/>
<!-- 몇 페이지인지... -->
<c:set var="pcnt" value="${pcount }"/><!-- 몇 페이지인지... -->

<table class="table" border="1">
<tr><td>아이디</td><td>제목</td><td>페이지아이디?</td><td>삭제할꺼?</td></tr>
<c:forEach var="al" items="${all}">
<c:set var="num" value="${num+1 }"/>

<c:set var="a" value="${al.bid}"/>
<c:set var="b" value="${al.bname}"/>
<c:if test="${num<=cnt*10 && num>cnt*10-10 }">
<tr>
<td>	${al.bid}</td>
<td><a href=bdetail.do?bid=${a}&bname=${b} >		${al.bname}</a></td>
<td>					${al.buid}</td>
	<c:if test="${(loginvo.userId==al.bid)||(loginvo.isAdmin==1) }"><!-- 자기 자신의 글삭제 가능/ 관리자는 그냥 가능 -->
<td><a href="bdel.do?bid=${a}&bname=${b}">삭제</a></td>
	</c:if>
</tr></c:if>
</c:forEach>
</table><center>
<c:forEach var="a"  begin="1" end="${pcnt }">
<a href="bpage.do?cnt=${a }&pcnt=${pcnt}">${a }</a>
</c:forEach></center>
	
		</div></div>
	</div>
</div>




</body>
</html>