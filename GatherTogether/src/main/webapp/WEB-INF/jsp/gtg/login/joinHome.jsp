<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
.form-group{
width:30%;
align:center;
}</style>
</head>
<body>
<div class="container">
                   <form action="joinCheck.do" method="post" name="Join">
                           <div class="form-group">
                              <label for="exampleInputEmail1"></label>
                              <input type="text" name="userId"  class="form-control" id="userId" aria-describedby="ȣ����" placeholder="���̵� �Է�">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1"></label>
                              <input type="password" name="password" id="password"  class="form-control" aria-describedby="ȣ����" placeholder="��й�ȣ �Է�">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1"></label>
                              <input type="text" name="userName"  class="form-control" id="userName" aria-describedby="ȣ����" placeholder="�̸�">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1"></label>
                              <input type="text" name="eMail"  class="form-control" id="eMail" aria-describedby="ȣ����" placeholder="�̸���">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1"></label>
                              <input type="text" name="phoneNum"  class="form-control" id="phoneNum" aria-describedby="ȣ����" placeholder="��ȭ��ȣ">
                           </div>
                           <div class="form-group">
                              <label for="exampleInputEmail1"></label>
                              <input type="text" name="introduce"  class="form-control" id="introduce" aria-describedby="ȣ����" placeholder="�λ�">
                           </div>
                           <div class="col-md-5 text-center ">
                           	<label for="exampleInputEmail1"></label>
                              <button type="submit" class="btn btn-primary btn-lg btn-block">Join</button>
                             <label for="exampleInputEmail1"></label>
                           </div>
                	</form>
</div>
</body>
</html>