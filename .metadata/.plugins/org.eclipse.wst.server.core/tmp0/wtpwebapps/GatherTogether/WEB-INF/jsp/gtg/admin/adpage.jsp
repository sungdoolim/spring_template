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
<hr>
<br>
<br>
<c:set var="num" value="0"/>
<c:set var="cnt" value="${count }"/><!-- �� ����������... -->
<c:set var="pcnt" value="${pcount }"/><!-- �� ����������... -->

<table border="1" class="table">
<tr><td>userId</td><td>password</td><td>userName</td><td>eMail</td><td>phoneNum</td><td>introduce</td>isAdmin<td></tr>
<c:forEach var="al" items="${all}">
<c:set var="num" value="${num+1 }"/>

<c:set var="a" value="${al.userId}"/>
<c:set var="b" value="${al.userName}"/>
<c:if test="${num<=cnt*10 && num>cnt*10-10 }">
<tr>
<td>${al.userId}</td>
<td>		${al.password}</td>
<td>					${al.userName}</td>
<td>	${al.eMail}</td>
<td> 		${al.phoneNum}</td>
<td>					${al.introduce}</td>
<td>	${al.isAdmin}</td>

<td><a href="addel.do?userId=${a}">���� Ż�� ��Ű��</a></td>
<td><a href="adupdateform.do?userId=${a}&name=${b}">ȸ�� ���� ����</a></td>
</tr></c:if>
</c:forEach>
</table>
<c:forEach var="a"  begin="1" end="${pcnt }">
<a href="adpage.do?cnt=${a }&pcnt=${pcnt}">${a }</a> 
</c:forEach>




		
		</div></div>
	</div>
</div>


</body>
</html>