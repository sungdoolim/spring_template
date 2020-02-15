<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <script language="javascript">
if(${temp} == 1) {
	alert("회원가입에 성공하셨습니다.");
	document.location.href="loginHome.do";
}
else {
	alert("이미 있는 계정입니다. 다시 시도해주세요.");
	document.location.href="joinHome.do";
}
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>