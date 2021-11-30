<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"  %>
<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<script src="../lib/jq.js"></script>
<link rel="stylesheet" href="../css/Main.css">
<title>코로나바이러스감염증-19</title>
</head>
<body>
	<div id='container' class='container'>
		<div id='menu' class='menu'>
				<ul>
					<li><a href="#none">소개</a></li>
					<li><a href="#none">정보</a></li>
					<li><a href="#none" id='notice' onclick="movenotice();">자유게시판</a></li>
					<li>
						<form id="frm_header" method="post">
							<c:if test="${user == null }">
								<input type='button' value='로그인' id='login'>
							</c:if>
							<c:if test="${user !=null }">
								<span>${user.id }</span>님
								<input type='button' id='btn_logout' value='로그아웃'>
							</c:if>
							<input type='text' id='findstr' name='findStr'>
							<input type='button' id='btn_search' value="검색">
						</form>
					</li>
				</ul>
			</div>
		<div id='content' class='content'>
			<div class='main_content'>
				<h2>발생현황</h2>
				<input type="button" id="covid_update" value="업데이트">
				<table>
					<tr>
						<th>구분</th>
						<th>누적확진률</th>
						<th>검사진행수</th>
						<th>누적3</th>
					</tr>
					<tr>
						<th>일일</th>
						<th>${covid.acc_def_rate }%</th>
						<th>${covid.exam_cnt }%</th>
					</tr>
				</table>			
			</div>
		</div>
		
		<div id='footer' class='footer'>
			푸터
		</div>
	</div>
<script src="../js/Main.js"></script>
</body>
</html>