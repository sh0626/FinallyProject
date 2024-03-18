// add schedule popup open
function click_add() {
	var url = "schedulePopup";
	var name = "schedulePopup";
	var option = "width = 600, height = 600 left = 100, top=50,location=no";
	window.open(url,name,option);
};

//datepicker
$(function() {
	$.datepicker.setDefaults({
		dateFormat : 'yy-mm-dd',
		showOtherMonths : true,
		showMonthAfterYear : true,
		changeYear : true,
		changeMonth : true,          
       yearSuffix: "년",
      	monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
      	monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
       dayNamesMin: ['일','월','화','수','목','금','토'],
       dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일']
	});
	$("#startDate").datepicker();
	$("#endDate").datepicker();
	
	$("#startDate").datepicker('setDate', 'today');
	$("#endDate").datepicker('setDate', 'today');
});

//add schedule
$.fn.serializeObject = function(){
    var o = {}; // 반환될 객체를 초기화
    var a = this.serializeArray(); // serializeArray() 함수를 사용하여 폼 요소를 배열로 직렬화
    // 배열을 반복하면서 각 요소의 이름과 값을 처리합니다.
    $.each(a, function() {
    	//name, value
    	var name = $.trim(this.name),
    		value = $.trim(this.value);
    	// 객체에 이미 같은 이름의 속성이 있는 경우
        if (o[name]) {
        	// 해당 속성이 배열이 아닌 경우, 배열로 변환
            if (!o[name].push) {
                o[name] = [o[name]];
            }
            // 값을 배열에 추가
            o[name].push(value || '');
        } else {
        	// 객체에 새로운 속성을 추가하거나 값을 설정
            o[name] = value || '';
        }
    });
    // 직렬화된 객체를 반환
    return o;
};

function click_ok(){
	var scheduleData = JSON.stringify($('form#scheduleData').serializeObject());
	$.ajax({
		data : scheduleData,
		url : "addSchedule",
		type : "POST",
		dataType : "json",
		contentType : "application/json; charset=UTF-8",
		success : function(data) {
			opener.parent.location.reload();
			window.close();
		},
		error: function(xhr, status, error) { // 요청 실패 시
            console.error(xhr.responseText); // 콘솔에 오류 메시지 출력
        }
	});
};