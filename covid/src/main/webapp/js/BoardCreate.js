/**
 * 
 */
 
 $('#btn_create').click(function(){
	var frm=$('#frm_summernote')[0];
	var param=$(frm).serialize();
	
	$.ajax({
		url:'../create.no',
		type:'post',
		data:param,
		success:function(){
			$('#content').load('../board.no');
		}
	})
})