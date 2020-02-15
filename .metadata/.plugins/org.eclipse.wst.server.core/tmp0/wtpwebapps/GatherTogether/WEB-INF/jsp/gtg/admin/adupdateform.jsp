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
 <form action="adupdate.do" method="post" name="update">
 <input type="hidden" name="userId" value="${id }"/>
   	 		<ul>
   	 		<li>id : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   	 			${id}</li>
   	 		<li>pw : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		
   	 		<input type="text" name="password"></li>
   	 		<li>name : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;						
   	 		${name}</li>
   	 		<li>eMail :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 						
   	 		<input type="text"  name="eMail"></li>
   	 		<li>phoneNum : 																
   	 		<input type="text"  name="phoneNum"></li>
   	 		<li>introduce : &nbsp;														
   	 		<input type="text"  name="introduce"></li>
   	 		<li>isAdmin : &nbsp;														
   	 		<input type="text"  name="isAdmin"></li>
   	 		<li><input type="submit" value="수정"></li>
   	 		</ul><br>
   	 		</form>
</div>

</body>
</html>