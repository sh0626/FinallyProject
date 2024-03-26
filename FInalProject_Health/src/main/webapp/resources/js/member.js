// DOM이 준비되면 실행될 콜백 함수
$(function() {

	//로그인 
	
	// 회원 로그인 폼이 submit 될 때 폼 유효성 검사를 위한 이벤트 처리
	$("#loginForm").submit(function() {
		var id = $("#userId").val();
		var pw = $("#userPw").val();
		
		if(id.length <= 0) {
			alert("아이디가 입력되지 않았습니다.\n아이디를 입력해주세요");
			$("#userId").focus();
			return false;
		}
		if(pw.length <= 0) {
			alert("비밀번호가 입력되지 않았습니다.\n비밀번호를 입력해주세요");
			$("#userPw").focus();
			return false;
		}
	});
	
	
	//회원가입
	
	// 회원 가입 폼, 회원정보 수정 폼에서 폼 컨트롤에서 키보드 입력을
	// 체크해 유효한 값을 입력 받을 수 있도록 keyup 이벤트를 처리 했다. 

	$("#id").on("keyup", function() {		
		// 아래와 같이 정규표현식을 이용해 영문 대소문자, 숫자만 입력되었는지 체크할 수 있다. 
		var regExp = /[^A-Za-z0-9]/gi;	
		if(regExp.test($(this).val())) {
			alert("영문 대소문자, 숫자만 입력할 수 있습니다.");
			$(this).val($(this).val().replace(regExp, ""));
		}
	});
	
	$("#pw1").on("keyup", inputCharReplace);	
	$("#pw2").on("keyup", inputCharReplace);	
	
	// 회원 아이디, 비밀번호, 비밀번호 확인 폼 컨트롤에
	// 사용자가 입력한 값이 영문 대소문자, 숫자 만 입력되도록 수정하는 함수
	function inputCharReplace() {
		// 아래와 같이 정규표현식을 이용해 영문 대소문자, 숫자만 입력되었는지 체크할 수 있다. 
		var regExp = /[^A-Za-z0-9]/gi;	
		if(regExp.test($(this).val())) {
			alert("영문 대소문자, 숫자만 입력할 수 있습니다.");
			$(this).val($(this).val().replace(regExp, ""));
		}
	}
	
	// 회원 가입 폼에서 아이디 중복확인 버튼이 클릭되면
	// 아이디 중복을 확인할 수 있는 새 창을 띄워주는 함수
	$("#btnOverlapId").on("click", function() {
		var id = $("#id").val();
		url="overlapIdCheck?id=" + id;
		
	    if (!id) {
	        alert("아이디를 입력해주세요");
	        return false;
	    }
		
		else if(id.length < 5) {
			alert("아이디는 5자 이상 입력해주세요.");
			return false;
		}
		
		window.open(url, "idCheck", "toolbar=no, scrollbars=no, resizeable=no, " 
				+  "status=no, memubar=no, width=500, height=400");
	});

	// 새 창으로 띄운 아이디 찾기 폼에서
	// 아이디 중복확인 버튼이 클릭되면 유효성 검사를 하는 함수	 
	$("#idCheckForm").on("submit", function() {
		var id = $("#checkId").val();	
		
		if(id.length == 0)  {
			alert("아이디를 입력해주세요");
			return false;
		}
		
		if(id.length < 5) {
			alert("아이디는 5자 이상 입력해주세요.");
			return false;
		}
	});
	
	// 새 창으로 띄운 아이디 중복확인 창에서 "아이디 사용 버튼"이 클릭되면 
	// 새 창을 닫고 입력된 아이디를 부모창의 회원가입 폼에 입력해 주는 함수
	$("#btnIdCheckClose").on("click", function() {
		var id = $(this).attr("data-id-value");
		opener.document.joinForm.id.value = id;
		opener.document.joinForm.isIdCheck.value = true;
		window.close();
	});
		
	// 회원 가입 폼이 서브밋 될 때 이벤트 처리 - 폼 유효성 검사
	$("#joinForm").on("submit", function() {
	
		return joinFormCheck(true);
	});

	// 마이페이지
	
	// 회원정보 수정 폼에서 "비밀번호 확인" 버튼이 클릭될 때 이벤트 처리
	$("#btnPwCheck").click(function() {
		var oldId = $("#userId").val();
		var oldPw = $("#oldPw").val();
		

		if (!oldPw) {
		    alert("기존 비밀번호가 입력되지 않았습니다.\n기존 비밀번호를 입력해주세요");
		    return false;
		}
		
		var data = "id=" + oldId + "&pw="+oldPw;
		console.log("data : " + data);
		
		$.ajax({
			"url": "pwCheck.ajax",
			"type": "get",
			"data": data,
			"dataType": "json",			
			"success": function(resData) {
				if(resData.result) {
					alert("비밀번호가 확인되었습니다.\n비밀번호를 수정해주세요");
					$("#btnPwCheck").prop("disabled", true);
					$("#oldPw").prop("readonly", true);
					$("#pw1").focus();
					
				} else {
					alert("비밀번호가 다릅니다.\n비밀번호를 다시 확인해주세요");
					$("#oldPw").val("").focus();
				}
			},
			"error": function(xhr, status, error) {
			console.log("error:", xhr.responseText);
            console.log("status:", status);
            console.log("error:", error);
			}
		});
		
	});	

			
	// 회원정보 수정 폼에서 수정하기 버튼이 클릭되면 유효성 검사를 하는 함수
	$("#mypage").on("submit", function() {
		if(! $("#btnPwCheck").prop("disabled")) {
			alert("기존 비밀번호를 확인해야 비밀번호를 수정할 수 있습니다.\n"
				+ "기존 비밀번호를 입력하고 비밀번호 확인 버튼을 클릭해 주세요");
			return false;
		}
		
		var pw1 = $("#pw1").val();
		var pw2 = $("#pw2").val();
			
		if(pw1.length == 0) {		
			alert("새 비밀번호가 입력되지 않았습니다.\n새 비밀번호를 입력해주세요");
			return false;
		}	
		if(pw2.length == 0) {		
			alert("새 비밀번호를 다시 한 번 입력해주세요");
			return false;
		}
	    if (pw1 !== pw2) {
	        alert("새 비밀번호가 서로 일치하지 않습니다.");
	        return false; // 비밀번호가 일치하지 않으면 폼 제출을 막음
	    } 
		return joinFormCheck(false);
	});
});


	 // 회원 아이디, 비밀번호, 비밀번호 확인, 이메일 아이디 폼 컨트롤에
	 // 사용자가 입력한 값이 영문 대소문자, 숫자 만 입력되도록 수정하는 함수

	function inputCharReplace() {
		// 아래와 같이 정규표현식을 이용해 영문 대소문자, 숫자만 입력되었는지 체크할 수 있다. 
		var regExp = /[^A-Za-z0-9]/gi;	
		if(regExp.test($(this).val())) {
			alert("영문 대소문자, 숫자만 입력할 수 있습니다.");
			$(this).val($(this).val().replace(regExp, ""));
		}
	}

	// 회원 가입 폼과 회원정보 수정 폼의 유효성 검사를 하는 함수
	function joinFormCheck() {
		var userName = $("#userName").val();
		var id = $("#id").val();
		var pw1 = $("#pw1").val();
		var pw2 = $("#pw2").val();
		var phone1 = $("#phone1").val();
		var phone2 = $("#phone2").val();
		var phone3 = $("#phone3").val();
		var isIdCheck = $("#isIdCheck").val();
		var age = $("#age").val();
		
		if(userName.length == 0) {		
			alert("이름이 입력되지 않았습니다.\n이름을 입력해주세요");
			return false;
		}	
		if(id.length == 0) {		
			alert("아이디가 입력되지 않았습니다.\n아이디를 입력해주세요");
			return false;
		}		
		if(isIdCheck == 'false') {		
			alert("아이디 중복 체크를 하지 않았습니다.\n아이디 중복 체크를 해주세요");
			return false;
		}	
		if(pw1.length == 0) {		
			alert("비밀번호가 입력되지 않았습니다.\n비밀번호를 입력해주세요");
			return false;
		}
		
		if(pw2.length == 0) {		
			alert("비밀번호 확인이 입력되지 않았습니다.\n비밀번호 확인을 입력해주세요");
			return false;
		}
	    if (pw1 !== pw2) {
	        alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
	        return false; // 비밀번호가 일치하지 않으면 폼 제출을 막음
	    }
		if(phone2.length == 0 || phone3.length == 0) {		
			alert("휴대폰 번호가 입력되지 않았습니다.\n휴대폰 번호를 입력해주세요");
			return false;
		}
		if(age.length == 0) {		
			alert("나이가 입력되지 않았습니다.\n나이를 입력해주세요");
			return false;
		}
	}
