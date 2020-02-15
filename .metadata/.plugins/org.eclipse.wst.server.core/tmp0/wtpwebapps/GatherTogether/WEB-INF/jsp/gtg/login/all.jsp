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
<h3>모든 회원 조회</h3>
<c:forEach var="al" items="${all}">
		 

   	 		<ul>
   	 		<li>id : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	${al.userId}</li>
   	 		<li>pw : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		${al.password}</li>
   	 		<li>name : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;						${al.userName}</li>
   	 		<li>eMail :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 						${al.eMail}</li>
   	 		<li>phoneNum : 																${al.phoneNum}</li>
   	 		<li>introduce : &nbsp;														${al.introduce}</li>
   	 		</ul><br>
   	 		

</c:forEach>
</div>

</body>
</html>