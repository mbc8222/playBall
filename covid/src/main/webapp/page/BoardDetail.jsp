<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<script src="../lib/jq.js"></script>
<link rel="stylesheet" href="../css/BoardDetail.css">
<link rel="stylesheet" href="../summernote/summernote-lite.css">
<title>게시판 작성</title>
</head>
<body>
	<div class='cr'>
		<form id='frm_modify' method='post'>
			<div>
				<input type='hidden' name='id' value='${user.id }'>
				<input type='hidden' name='serial' value='${list[0].serial }'>
				<span>제목</span>
				<input type='text' id='title' name='title' class='title' value='${list[0].title }'>
			</div>
			<div class='summernote'>
				<textarea id='summernote' name='content' cols="300" >${list[0].content }</textarea>
			</div>
			<input type='button' id='btn_modify' value='수정'>
			<input type='button' id='btn_delete' value='삭제'>
			<input type='button' id='btn_cancle' value='취소'>
		</form>
	</div>
<script type="text/javascript" src="../summernote/summernote-lite.js"></script>
<script type="text/javascript" src="../summernote/lang/summernote-ko-KR.js"></script>
<script type="text/javascript" src="../js/BoardDetail.js"></script>
<script>
$(document).ready(function() {
	//여기 아래 부분
	$('#summernote').summernote({
		  height: 500,                 // 에디터 높이
		  minHeight: null,             // 최소 높이
		  maxHeight: null,             // 최대 높이
		  focus: true,                  // 에디터 로딩후 포커스를 맞출지 여부
		  lang: "ko-KR",					// 한글 설정
		  placeholder: '최대 2048자까지 쓸 수 있습니다'	//placeholder 설정
		  
          
	});
});
</script>
</body>
</html>