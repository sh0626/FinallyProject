$(function(){
//---------------------------------------------------------------		
	//운동일지[등록]
	$(document).on('click', '#btnInsert', function() {
	    // 입력 필드 값 가져오기
	  let cate = $(".exerciseCate");
	    let name = $(".exerciseName");
	    let weight = $(".exerciseWeight");
	    let set = $(".exerciseSet");
	    let rep = $(".exerciseRep");
	   
	   for(var i=0; i<name.length; i++){
	 	console.log(session);

	    // 값이 비어 있는지 확인
	    if (name[i].value.length == 0) {
	        alert("운동명을 입력해 주세요");
	        return false;
	    }
	    if (weight[i].value.length == 0) {
	        alert("중량을 입력해 주세요");
	        return false;
	    }
	    if (set[i].value.length == 0) {
	        alert("세트를 입력해 주세요");
	        return false;
	    }
	    if (rep[i].value.length == 0) {
	        alert("횟수를 입력해 주세요");
	        return false;
	    }
	}
	});

//---------------------------------------------------------------		
	//운동일지[추가]
	$(document).on('click', '#addFormBtn', function() {
	    // clone 
		var clonedForm = $('#jWriteForm .row').first().clone();
		
		//clone시 버튼 해당 div 제거
    	clonedForm.find('.col-1').remove();
    	var test = $(".exercises").length;
    	if(test > 4){
    	alert("1회 등록시 최대 5개까지만 등록 가능합니다.")
    	return false;
    	}
    	
    	var plus = test +1;
    	
	    //input value 초기화
	    clonedForm.find('input[type="text"]').val('');
	    clonedForm.find('input[type="number"]').val('');
	    clonedForm.find('select').prop('selectedIndex', 0);
       	clonedForm.find('.exercises').attr('class', 'exercises' + plus);
	   
	   
	    // 버튼 생성
	    var newAddButton = $('<input>', {
	        'class': 'btn btn-danger btnCommend',
	        'type': 'button',
	        'value': '추가',
	        'id': 'addFormBtn'
	    });
 	    	  
	  	//폼 밑에 새로운 폼 추가 
	    $(this).closest('.row').after(clonedForm);
	    
	    //눌린 버튼 제거
	    $(this).closest('.col-1').remove();
	    
	    //위에 생성한 버튼 추가
	   clonedForm.append($('<div>', {'class': 'col-1'}).append(newAddButton));
	   
	});
//---------------------------------------------------------------		
	
	//운동목록[전체 선택]
    $("#checkAll").click(function() {
        $(".checkbox").prop("checked", $(this).prop("checked"));
    });
	
	
//---------------------------------------------------------------	
	//운동목록[삭제]
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
	
//---------------------------------------------------------------		
	
	//일지[삭제]
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

//---------------------------------------------------------------
		
});