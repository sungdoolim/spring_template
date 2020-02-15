<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.util.List"%>
    
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
<c:set var="pcnt" value="${count/10+1 }"/>
<c:out value="${count }"/>
<script>
	document.location.href="bpage.do?cnt=1&pcnt=${pcnt}";
</script>

</div>

</body>
</html>