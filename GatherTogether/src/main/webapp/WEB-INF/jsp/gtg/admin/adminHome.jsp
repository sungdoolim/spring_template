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
어드민

<c:set var="pcnt" value="${count/10+1 }"/>
<c:out value="${count }"/>


			<h6><a href="adpage.do?cnt=1&pcnt=${pcnt}">전 회원 조회</a></h6>

</div>

</body>
</html>