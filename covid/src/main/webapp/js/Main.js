/**
 * 메인페이지
 */
 
 $("#login").click(function(){
	$("#container").load("../loginpage.do");
})

$("#btn_logout").click(function(){
	$("#container").load("../logout.do");
})

$("#covid_update").click(function(){
	$('#container').load("../covid.co");
})

$("#btn_search").on("click", function(){
	var frm=$("#frm_header")[0];
	var param=$(frm).serialize();
	$("#content").load("../board.no", param);
})

//자유게시판 이동
function movenotice(){
	$('#content').load("../board.no");
}