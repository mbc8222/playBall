<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<script src="../lib/jq.js"></script>
<link rel="stylesheet" href="../css/Create.css">
<title>회원가입</title>
</head>
<body>
	<div id='container'>
		<form id='frm_create' method='post'>
			<div>
				<span>아이디</span>
				<input type='text' id='id' name='id' value='${vo.id }' oninput='checkid()'>
				<span>영어,숫자 조합의 4~12자리를 입력해주세요</span>
				<br>
				<div id='idcheckzone'></div>
				<span>비밀번호</span>
				<input type='password' id='password' name='password'><br>
				<div id='pwdcheckzone'></div>
				<span>비밀번호확인</span>
				<input type='text' id='password2' name='password2' oninput='checkpwd()'><br>
				<div id='pwd2checkzone'></div>
				<span>이름</span>
				<input type='text' id='name' name='name'  required><br>
				<div id='namecheckzone'></div>
				<span>연락처</span>
				<input type='text' id='phone' name='phone'  required><br>
				<div id='phonecheckzone'></div>
				<input type='button' id='btn_create' value="확인">
				<input type='button' id='btn_cancle' value="취소">
			</div>
		</form>
	</div>
<script src="../js/Create.js"></script>
</body>
</html>