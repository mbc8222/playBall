/**
 * 로그인페이지
 */
 
 $("#btn_create").click(function(){
	$("#container").load("../create.do");
})

$("#btn_login").click(function(){
	var frm=$("#frm_login")[0];
	var param=$(frm).serialize();
	$("#container").load("../login.do", param);
})
