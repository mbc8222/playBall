<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<link href="./css/match/match_update.css" type='text/css' rel="stylesheet"/>
<link href="./css/summerNote/summernote-lite.css" type="text/css" rel="stylesheet"/>
</head>
<body>

<div id='mat_register'>

	<label id='mat'>Match</label>
	<div id='line'></div>
	<br/>
	<form name="matchUpdateForm" id="matchUpdateForm" method="post" >
		<input type="hidden" name="nowPage" value="${param.nowPage }">
		<input type="hidden" name="serial" value="${param.serial }">
		<input type="hidden" id="image" name="image"/>
		
		<input type='text' name='title' id='title' value="${vo.title }"/>
		
		<div id='selectZone'>
			<select name="loca">
				<option value="����">����</option>
				<option value="���">���</option>
			</select>
				
			<select name="tag">
				<option value="2:2">2:2</option>
				<option value="3:3">3:3</option>
			</select>
				
			<select name="tier">
				<option value="��">��</option>
				<option value="��">��</option>
				<option value="��">��</option>
			</select>
				
		<input type="date" name="dDate" value="${vo.dDate }"/>
		</div>
		<div id='line1'></div>
		  	
		  	
		  	
		  	
		<textarea id='summernote' name='doc'>${vo.doc }</textarea>
	</form>
	
	<div id='btnZone'>
		<input type='button' value='����' id='btnUpdate'/>
		<input type='button' value='���' id='btnCancle'/>
	</div>
   	
   	
</div>
<script src="./lib/jq.js"></script>
<script src="./js/summerNote/summernote-lite.js"></script>
<script src="./js/summerNote/lang/summernote-ko-KR.js"></script>
<script src="./js/match/match_update.js"></script>
<script>
checkLoca("${vo.loca}");
checkTag("${vo.tag}");
checkTier("${vo.tier}");
</script>
</body>
</html>