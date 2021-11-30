<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix='c' uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<script src="../lib/jq.js"></script>
<link rel="stylesheet" href="../css/Board.css">
<title>자유게시판</title>
</head>
<body>
	<div id='container'>
		<div id='board' class='board'>
			<form id="frm_notice" class='frm_notice' method='post'>
				<input type='button' id='btn_create' value='글쓰기'>
				<input type='hidden' id='serial' name='serial' value='${param.serial }'>
				<table>
					<tr>
						<td class='num'>번호</td>
						<td class='id'>작성자</td>
						<td class='title'>제목</td>
						<td class='time'>시간</td>
					</tr>
					<c:forEach var='vo' items='${list }'>
						
						<tr>
							<td id='num' class='num'>${vo.rno }</td>
							<td class='id'>${vo.id }</td>
							<td class='title'>
								<a href='#' onclick='detail(${vo.serial})'>
									${vo.title }
								</a>
							</td>
							<td class='time'>${vo.time }</td>
						</tr>
					</c:forEach>
				</table>
				<input type='hidden' id='nowPage' name='nowPage' value='${(empty param.nowPage)? 1 : param.nowPage }'>
			<c:if test="${page.startPage>1 }">
				<input type='button' value='맨처음' onclick='move(1)'>
				<input type='button' value='이전' onclick='move(${page.startPage-1})'>
			</c:if>
				
			<c:forEach var='p' begin="${page.startPage }" end="${page.endPage }">
				<input type='button' value='${p}' onclick='move(${p})'>
			</c:forEach>
				
			<c:if test="${page.endPage<page.totPage }">
				<input type='button' value='다음' onclick='move(${page.endPage+1})'>
				<input type='button' value='맨끝' onclick='move(${page.totPage})'>
			</c:if>
			</form>
		</div>
	</div>
<script src="../js/Board.js"></script>
</body>
</html>