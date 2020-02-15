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

		 ddd
 <form action="update.do" method="post" name="update">
   	 		<ul>
   	 		<li>id : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   	 			${loginvo.userId}</li>
   	 		<li>pw : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		
   	 		<input type="text" placeholder=${loginvo.password} name="password"></li>
   	 		<li>name : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;						
   	 		${loginvo.userName}</li>
   	 		<li>eMail :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 						
   	 		<input type="text" placeholder=${loginvo.eMail} name="eMail"></li>
   	 		<li>phoneNum : 																
   	 		<input type="text" placeholder=${loginvo.phoneNum} name="phoneNum"></li>
   	 		<li>introduce : &nbsp;														
   	 		<input type="text" placeholder=${loginvo.introduce} name="introduce"></li>
   	 		<input type="hidden" name="isAdmin" value=0>
   	 		<li><input type="submit" value="수정"></li>
   	 		</ul><br>
   	 		</form>
</div>

</body>
</html>