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

<h6>�۾���</h6>

<form action="boardinsert.do">
���� : <input type="text" name="bname">
��� ��ȣ : <input type="password" name="bpw">
<textarea name="bcontent" rows="10" cols="100"></textarea>
<input type="submit">
</form>


</div>

</body>
</html>