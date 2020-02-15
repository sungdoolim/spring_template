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
<table class="table">
<tr><td>아이디</td><td>제목</td><td>비유아이디</td><td>삭제?</td></tr>
<c:forEach var="al" items="${all}">
<c:set var="a" value="${al.bid}"/>
<c:set var="b" value="${al.bname}"/>
<tr>
<td>	${al.bid}</td>
<td><a href=../board/bdetail.do?bid=${a}&bname=${b} >  		${al.bname}</a></td>
<td>						${al.buid}</td>

<td><a href="../board/bdel.do?bid=${a}&bname=${b}">삭제</a></td>

</tr>
</c:forEach>
</table>	
		</div></div>
	</div>
</div>

</body>
</html>