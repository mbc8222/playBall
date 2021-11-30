/**
 * 자유게시판
 */
 
	function move(nowPage){
		console.log(nowPage);
		var frm = $('#frm_notice')[0];
		frm.nowPage.value = nowPage;
		console.log(frm.nowPage.value);
		var param = $(frm).serialize();
		$('#content').load("../board.no", param);
	}
	
	$('#btn_create').click(function(){
		$('#content').load("../createzone.no");
	})
	
	/*$('#detail').on('click', function(){
		var serial=$('#serial').val();
		console.log(serial);
		var frm=$('#frm_notice')[0];
		frm.serial.value=serial;
		var param=$(frm).serialize();
		$('#content').load('../detail.no', param);
	})*/
	
	 detail=function(serial){
		var frm=$('#frm_notice')[0];
		frm.serial.value=serial;
		var param=$(frm).serialize();
		$('#content').load('../detail.no', param);
	}