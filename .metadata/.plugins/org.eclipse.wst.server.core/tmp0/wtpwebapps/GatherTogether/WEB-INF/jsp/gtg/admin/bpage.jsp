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
  <div>
<hr>
<br>
<br>
<h3>자유게시판</h3>
<h6><a href=bcontent.do>글쓰기</a></h6>
<c:set var="num" value="0"/>
<c:set var="cnt" value="${count }"/><!-- 몇 페이지인지... -->
<c:set var="pcnt" value="${pcount }"/><!-- 몇 페이지인지... -->

<table border="1">
<c:forEach var="al" items="${all}">
<c:set var="num" value="${num+1 }"/>

<c:set var="a" value="${al.bid}"/>
<c:set var="b" value="${al.bname}"/>
<c:if test="${num<=cnt*10 && num>cnt*10-10 }">
<tr>
<td>bid : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	${al.bid}</td>
<td><a href=bdetail.do?bid=${a}&bname=${b} > : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		${al.bname}</a></td>
<td>bpid :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 						${al.buid}</td>
	<c:if test="${loginvo.userId==al.bid }">
<td><a href="bdel.do?bid=${a}&bname=${b}">삭제</a></td>
	</c:if>
</tr></c:if>
</c:forEach>
</table>
<c:forEach var="a"  begin="1" end="${pcnt }">
<a href="bpage.do?cnt=${a }&pcnt=${pcnt}">${a }</a> 
</c:forEach>


</div>


</body>
</html>