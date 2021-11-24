<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<script src="../lib/jq.js"></script>
<title>로그인</title>
</head>
<body>
	<div id='container'>
		<form id='frm_login' method="post">
			<div>
				<span>아이디</span>
				<input type='text' id='id' name='id'>
				<br/>
				<span>비밀번호</span>
				<input type='text' id='password' name='password'>
				<input type='button' id='btn_login' value='로그인'>
				<input type='button' id='btn_create' value='회원가입'>
			</div>
		</form>
	</div>
<script src="../js/Login.js"></script>
</body>
</html>