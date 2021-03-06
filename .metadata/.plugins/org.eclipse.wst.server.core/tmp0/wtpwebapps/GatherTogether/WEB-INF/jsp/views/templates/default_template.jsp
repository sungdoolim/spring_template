<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8">  
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="/gtg/resources/js/bootstrap.js"></script>
<link rel="stylesheet" href="/gtg/resources/css/bootstrap.css">
<link rel="stylesheet" href="/gtg/resources/css/customize.css">
<title>Title</title>

</head>
<body>
	<!--/Contents 상단/-->
	<div>	
		<tiles:insertAttribute name="title"/>
		<tiles:insertAttribute name="top" />	
		<tiles:insertAttribute name="left" />
	<!--/Core 부분/-->
		<div>
			<tiles:insertAttribute name="body" />   
		</div>
	</div>
	<!-- Contents 하단 -->
	<tiles:insertAttribute name="footer" />
</body>
</html>
