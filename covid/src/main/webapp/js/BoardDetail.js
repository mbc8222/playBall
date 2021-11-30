/**
 * 
 */
 
 $('#btn_modify').click(function(){
	var frm=$('#frm_modify')[0];
	var param=$(frm).serialize();
	
	$.ajax({
		url:'../modify.no',
		type:'post',
		data:param,
		success:function(){
			alert("수정이 완료되었습니다")
			$('#content').load('../board.no');
		}
		
	})
})

$('#btn_delete').click(function(){
	var frm=$('#frm_modify')[0];
	var param=$(frm).serialize();
	
	$.ajax({
		url:'../delete.no',
		type:'post',
		data:param,
		success:function(){
			alert("삭제가 완료되었습니다")
			$('#content').load('../board.no');
		}
		
	})
})