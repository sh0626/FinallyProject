$(function(){
	
	//등록
	$(document).on('click', '#btnInsert', function() {
	    // 입력 필드 값 가져오기
	    let cate = $("#exerciseCate").val().trim();
	    let name = $("#exerciseName").val().trim();
	    let weight = $("#exerciseWeight").val().trim();
	    let set = $("#exerciseSet").val().trim();
	    let rep = $("#exerciseRep").val().trim();
	    
	    // 값이 비어 있는지 확인
	    if (name.length == 0) {
	        alert("운동명을 입력해 주세요");
	        return false;
	    }
	    if (weight.length == 0) {
	        alert("중량을 입력해 주세요");
	        return false;
	    }
	    if (set.length == 0) {
	        alert("세트를 입력해 주세요");
	        return false;
	    }
	    if (rep.length == 0) {
	        alert("회수를 입력해 주세요");
	        return false;
	    }
	
	});
	
	//전체 선택
    $("#checkAll").click(function() {
        $(".checkbox").prop("checked", $(this).prop("checked"));
    });
	
	//운동 목록 삭제
	$(document).on('click', '#btnDelete', function(){

	    // 체크된 체크박스의 값을 가져오기
	    var selectedItems = [];
	    $(".checkbox:checked").each(function(){
         	var value = $(this).val();
        	if(selectedItems.indexOf(value) === -1) { // 중복된 값이 아닌 경우에만 추가
            selectedItems.push(value);
        }
	    });
	    if(selectedItems.length > 0) {
	        // 폼 액션과 메서드 설정 후 제출
	        $("#checkForm").attr("action", "delete");
	        $("#checkForm").attr("method", "post");
	        $("#checkForm").submit();
	    } else {
	        alert("삭제할 항목을 선택하세요.");
	    }
	});
	
	
		$(document).on('click', '#btnDeleteJ', function(){

	    // 체크된 체크박스의 값을 가져오기
		let exerciseForm = $(".exerciseForm")

	    if(exerciseForm.length == 0) {
	    	
	   		if(confirm("정말 삭제하시겠습니까??")){	       	   		
	   		 // 폼 액션과 메서드 설정 후 제출
		        $("#checkForm").attr("action", "deleteJ");
		        $("#checkForm").attr("method", "post");
		        $("#checkForm").submit();
	   		}else{
	   			return false;
	   		}
	    } else {
	        alert("운동 리스트를 먼저 삭제해 주세요");

	    }
	});


	
});