$(function(){

    
	/*$(document).on('click', '#addFormBtn', function() {
	    var clonedForm = $('#jWriteForm .row').first().clone();
	    
	    // Reset input values
	    clonedForm.find('input[type="text"]').val('');
	    clonedForm.find('input[type="number"]').val('');
	    clonedForm.find('select').prop('selectedIndex', 0);
	
	    // Insert cloned form after the row containing the add button
	    $(this).closest('.row').before(clonedForm);
	});*/
	
	
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
});