/**
 * 메인페이지
 */
 
 $("#login").click(function(){
	$("#container").load("../loginpage.do");
})

$("#btn_logout").click(function(){
	$("#container").load("../logout.do");
})

$('#container').load("../covid.covid");
