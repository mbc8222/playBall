<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="./css/match/match_view.css" type='text/css' rel="stylesheet"/>
</head>
<body>

<div class='match_view'>
        
	<label id='mat'>Match</label>
	
	<div id='line'></div>
	
	<br/>
	
	<div id="find_box">
		<form name="matchingViewForm" id="matchingViewForm">
			<input type="hidden" name="nowPage" value="${param.nowPage == null ? 1 : param.nowPage}">
			<input type="hidden" name="serial">
			
			<div id='findZone'> <!-- �˻�â �˻� ��ư -->
				<input type="text" name="findStr" id='find' value="${param.findStr }" placeholder="�˻�"/>
				<input type='button' id='search' value='�˻�'/>
			</div>
			
			<div id="find_loc">
				<select name="tag" id="tag">
					<option value="all">��ü</option>
					<option value="2:2">2:2</option>
					<option value="3:3">3:3</option>
				</select>
				
				<select name="loca" id="loca">
					<option value="all">��ü</option>
					<option value="����">����</option>
					<option value="���">���</option>
				</select>
				    
				<select name="tier" id="tier">
					<option value="all">��ü</option>
					<option value="��">��</option>
					<option value="��">��</option>
					<option value="��">��</option>
				</select>
			</div>
		</form>
	</div>
	
	<div class="clear"></div>
	
	<div id='page'>
		<div class='main'>
			<span class='no'>��ȣ</span>
			<span class='date'>��¥</span>
			<span class='team'>�±�</span>
			<span class='local'>����</span>
			<span class='tier'>���</span>
			<span class='title'>����</span>
			<span class='mid'>���̵�</span>
			<span class='hit'>��ȸ��</span>
			<span class='vs'>����</span>
		</div>
			
			
		<div id='view'>
			
			<c:forEach var="vo" items="${list }">
			<div class='item' onclick="moveDetail(${vo.serial})">
				<span class='no'>${vo.rno }</span>
				<span class='date'>${vo.dDate }</span>
				<span class='team'>${vo.tag }</span>
				<span class='local'>${vo.loca }</span>
				<span class='tier'>${vo.tier }</span>
				<span class='title'>${vo.title }</span>
				<span class='mid'>${vo.mid }</span>
				<span class='hit'>${vo.hit }</span>
			</div>
			<input type='button' value="${vo.vs }" class = 'btnMatch' onclick="matchCancle('${sessionScope.mid }','${vo.mid }',${vo.serial},'${vo.vs }')"/>
			</c:forEach>
		     
		</div>
		
		<br>
		<c:if test="${sessionScope.mid ne null }">
			<input type='button' value='�۾���' id="btn_write"/>
		</c:if>
		<div id='btn_zone'>
			<c:if test="${page.startPage>1 }">
				<input type='button' value='��' class='btn_find1' onclick="pageMove(1)">
				<input type='button' value='����' class='btn_find1' onclick="pageMove(${page.startPage-1})">
			</c:if>
			
			<c:forEach var ="p" begin="${page.startPage }" end="${page.endPage }">
				<input type='button' value="${p }" class='btn_find' onclick="pageMove(${p})">
			</c:forEach>
			
			<c:if test="${page.endPage<page.totPage }">
				<input type='button' value='����' class='btn_find1' onclick="pageMove(${page.endPage+1})">
				<input type='button' value='��' class='btn_find1' onclick="pageMove(${page.totPage})">
			</c:if>
		</div>
	</div>
</div>
<script src="./lib/jq.js"></script>
<script src="./js/match/match_view2.js"></script>
<script>
checkLoca("${param.loca}");
checkTag("${param.tag}");
checkTier("${param.tier}");

</script>
</body>


</html>