<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<script language="javascript">

if(${temp} == 1) {
	alert("�α��ο� �����ϼ̽��ϴ�.");
	if(${isadmin}==1){
		document.location.href="../admin/adminHome.do";
	}else
		document.location.href="../../gtg";
	
}
else {
	alert("�����̳� ��й�ȣ�� Ȯ�����ּ���.");
	document.location.href="loginHome.do";
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