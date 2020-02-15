<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="stylesheet" href="css/customize.css">
</head>
<body>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>

<style type="text/css">


</style>
<nav class="navbar navbar-default">
	<div class="container-fluid">
	
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
			data-target="#bs-example-navbar-collapse-1" aria-expanded="false"><!-- 크기를 줄였을때 나타나는 버튼 -->
				<span class="sr-only"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">코딩 부스터</a>
		</div>
		
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1"><!-- 네비 중간 대부분을 차지함 -->
			<ul class="nav navbar-nav">
				<li class="active"><a href="index.jsp">소개<span class="sr-only"></span></a></li>
				<li><a href="instructor.jsp">강사진</a></li>
				<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
				aria-haspopup="true" aria-expanded="false">강의<span class="caret"></span></a><!-- dropdown 연결이 어떤식인지는 모르겠지만 -->
					<ul class="dropdown-menu">
						<li><a href="lecture.jsp?lectureName=C">c언어</a></li>
						<li><a href="lecture.jsp?lectureName=Java">java</a></li>
						<li><a href="lecture.jsp?lectureName=Android">안드로이드</a></li>
					</ul>
				</li>		
			</ul>
			<form class="navbar-form navbar-left">
				<div class="form-group">
				<input type="text" class="form-control" placeholder="입력"></div>
				<button type="submit" class="btn btn-default">검색</button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
					aria-haspopup="true" aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="loginForm.jsp">로그인</a></li>
						<li><a href="registerForm.jsp">회원가입</a></li>	
					</ul>
			
				</li>
			</ul>
			
		</div>
	</div>
</nav>









<div class="container text-center text-center">
            <form class="form-horizontal" role="form">
              <center>  <h2>Registration Form</h2>  </center>
			    
				
                <div class="form-group">
                    <label for="firstName" class="col-sm-5 control-label">First Name</label>
                    <div class="col-sm-4">
                        <input type="text" id="firstName" placeholder="Full Name" class="form-control" autofocus>
                       
                    </div>
                </div>
				<div class="form-group">
                    <label for="lastName" class="col-sm-5 control-label">Last Name</label>
                    <div class="col-sm-4">
                        <input type="text" id="firstName" placeholder="Full Name" class="form-control" autofocus>
                       
                    </div>
                </div>
				<div class="form-group">
                    <label for="ID Number" class="col-sm-5 control-label">ID NUMBER</label>
                    <div class="col-sm-4">
                        <input type="text" id="firstName" placeholder="ID NUMBER" class="form-control" autofocus>
                       
                    </div>
                </div>
               
                <div class="form-group">
                    <label for="password" class="col-sm-5 control-label">Password</label>
                    <div class="col-sm-4">
                        <input type="password" id="password" placeholder="Password" class="form-control">
                    </div>
                </div>
				                <div class="form-group">
                    <label for="Confirm Password" class="col-sm-5 control-label">Confirm Password</label>
                    <div class="col-sm-4">
                        <input type="password" id="Confirm Password" placeholder="Confirm Password" class="form-control">
                    </div>
                </div>
               
                <div class="form-group">
                    <label for="type" class="col-sm-5 control-label">Type</label>
                    <div class="col-sm-4">
                        <select id="Select" class="form-control">
                            <option></option>
                            <option></option>
                            <option></option>
                            <option></option>
                            <option></option>
                            <option></option>
                            <option></option>
                            <option></option>
                        </select>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <label class="control-label col-sm-5">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-6">
                                <label class="radio-inline">
                                    <input type="radio" id="femaleRadio" value="Female">Female
                                </label>
								<label class="radio-inline">
                                    <input type="radio" id="maleRadio" value="Male">Male
                                </label>
								<label class="radio-inline">
                                    <input type="radio" id="uncknownRadio" value="Unknown">Others
                                </label>
                            </div>
                           
                            </div>
                            
                                
                            
                        </div>
                    </div>
             
				<div class="form-group">
                    <label for="Address" class="col-sm-5 control-label">Address</label>
                    <div class="col-sm-4">
                        <textarea class="form-control"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-5 col-sm-offset-3">
                        <button type="submit" class="btn btn-info">Submit</button>
                    </div>
                </div>
            </form> <!-- /form -->
        </div> <!-- ./container -->
		
	
	







<footer style="background-color: #000000;color:#ffffff">
	<div class="container">
		<br>
		<div class="row">
			<div class="col-sm-2" style="text-align: center;"><h5>Copyright &copy; 2020</h5><h5>staris</h5></div>
			<div class="col-sm-4"><h4>대표자 소개/<h4><p>저는 하마하마 도야지도야지 하마도야지 도야지이ㅣ이ㅣ이이하마아ㅑ아아 ㅏ ㅏㅇㅇ냐오옹옹</p></div>
			<div class="col-sm-2"><h4 style="text-align:center;">네비게이션</h4>
				<div class="list-group">
					<a href="index.jsp" class="list-group-item">소개</a>
					<a href="instructor.jsp" class="list-group-item">강사진</a>
					<a href="lecture.jsp" class="list-group-item">강의</a>
					
				</div>
			
			</div>
			<div class="col-sm-2"><h4 style="text-align:center;">SNS</h4>
				<div class="list-group">
					<a href="#" class="list-group-item">페이스북</a>
					<a href="#" class="list-group-item">유투브</a>
					<a href="#" class="list-group-item">인스타</a>
					
				</div>
			</div>
			<div class="col-sm-2"><h4 style="text-align:center;"><span class="glyphicon glyphicon-ok"></span>&nbsp;by staris</h4></div>
	</div>

	
</div>
</footer>


</body>
</html>