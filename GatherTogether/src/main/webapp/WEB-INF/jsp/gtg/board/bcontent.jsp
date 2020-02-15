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

<h6>글쓰기</h6>

<form action="boardinsert.do">
제목 : <input type="text" name="bname">
비밀 번호 : <input type="password" name="bpw">
<textarea name="bcontent" rows="10" cols="100"></textarea>
<input type="submit">
</form>


</div>

</body>
</html>