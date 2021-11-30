/**
 * 회원가입페이지
 */
	
	//아이디 중복 확인
	function checkid(){
		//모든 공백 체크 정규식
	var empJ = /\s/g;
	//아이디 정규식
	var idJ = /^[a-z0-9]{4,12}$/;
	// 비밀번호 정규식
	var pwJ = /^[A-Za-z0-9]{4,12}$/; 
	// 이름 정규식
	var nameJ = /^[가-힣]{2,6}$/;
	// 이메일 검사 정규식
	var mailJ = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	// 휴대폰 번호 정규식
	var phoneJ = /^01([0|1|6|7|8|9]?)?([0-9]{3,4})?([0-9]{4})$/;
		
	var id=$('#id').val();
		
		$.ajax({
			url:'../idcheck.do',
			type:'post',
			data:{id:id},
			success:function(result){
				if(idJ.test(id)){
					if(result == 0){
						console.log("가능");
						$('#idcheckzone').text('사용 가능한 아이디 입니다');
						$('#idcheckzone').css('color', 'blue');
					}else if(result == 1){
						console.log("중복");
						$('#idcheckzone').text('중복된 아이디 입니다');
						$('#idcheckzone').css('color', 'red');
					}
				}else{
					$('#idcheckzone').text('정규식에 맞춰주세요');
					$('#idcheckzone').css('color', 'red');
				}
			},
			error:function(){
				
			}
		})
	
	}
	
 	//회원가입
 	$("#btn_create").click(function(){
		var id=$('#id').val();
		var password=$('#password').val();
		var password2=$('#password2').val();
		var name=$('#name').val();
		var phone=$('#phone').val();
		
		var frm=$("#frm_create")[0];
		var param=$(frm).serialize();
		if(password == null){
			$('#pwdcheckzone').text('비밀번호를 입력해주세요');
			$('#pwdcheckzone').css('color', 'red');
		}else if(password2 == null){
			$('#pwdcheckzone2').text('비밀번호확인을 입력해주세요');
			$('#pwdcheckzone2').css('color', 'red');
		}else if(password != password2){
			$('#pwdcheckzone2').text('입련된 비밀번호가 다릅니다');
			$('#pwdcheckzone2').css('color', 'red');
		}else if(name == ""){
			$('#namecheckzone').text('이름을 입력해주세요');
			$('#namecheckzone').css('color', 'red');
		}else if(phone == ""){
			$('#phonecheckzone').text('전화번호를 입력해주세요');
			$('#phonecheckzone').css('color', 'red');
		}else{
			$('#container').load("../membercreate.do",param);
		}
	})

	//비밀번호 확인
	function checkpwd(){
		var pwd=$('#password').val();
		var pwd2=$('#password2').val();
		if(pwd != pwd2){
			$('#pwdcheckzone').text('입련된 비밀번호가 다릅니다');
			$('#pwdcheckzone').css('color', 'red');
		}else{
			$('#pwdcheckzone').text('확인되었습니다');
			$('#pwdcheckzone').css('color', 'blue');
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	