<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="stylesheet" href="css/customize.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>

<style type="text/css">
blockquote{
background:#f9f9f9;
border-left:10px solid #cccccc;
margin: 1.5em 10px;
padding: 0.5em 10px;
quotes: "\201C""\201D""\2018""\2019"
}
blockquote:before{
color:#cccccc;
content:open-quote;
font-size:3em;
line-height:0.1em;
margin-left:0.25em;
vertical-align:-0.4em;
}
blockquote:after{
color:#cccccc;
content:close-quote;
font-size:3em;
line-height:0.1em;
margin-left:0.25em;
vertical-align:-0.4em;
}


</style>
</head>
<body>

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
<div class="container">
	<div class="row">
		<div class="col-xs-12">
		<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">
				<span class="glyphicon glyphicon-tags"></span>
				&nbsp;&nbsp;staris
			</h3>
		</div>
		<div class="panel-body">
			<div class="media">
				<div class="media-left">
					<a href="#">
						<img class="media-object" src="images/apple.png" alt="개발자 이미지">
						
					</a>
				</div>
				
				<div class="media-body">
					<h4 class="media-heading">staris</h4><br>
					staris 대표
				</div>
			</div>
		</div>
		<table class="table">
			<thead>
			<tr>
				<th>강사명</th>
				<th>강의번호</th>
				<th>강의제목</th>
				<th>강의날짜</th>
			</tr>
			</thead>
			<tbody>
				<tr>
				<td>staris</td>
				<td>1</td>
				<td><a href="lecture.jsp?lectureName=C">C기초 프로그래밍</a></td>
				<td>20202020</td>
				</tr>
				<tr>
				<td>hama</td>
				<td>1</td>
				<td><a href="lecture.jsp?lectureName=Java">객체 지향 언어와 실습</a></td>
				<td>20202020</td>
				</tr>
				<tr>
				<td>stahama</td>
				<td>1</td>
				<td><a href="lecture.jsp?lectureName=Android">안드로이드</a></td>
				<td>20202020</td>
				</tr>

			</tbody>
		</table>
			<div class="panel-footer">
					<blockquote>do and forget!</blockquote>
			</div>
		
		</div></div>
	</div>
</div>

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