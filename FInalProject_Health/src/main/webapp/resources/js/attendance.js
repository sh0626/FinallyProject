// 출석 버튼 클릭 시 모달 표시
$(function() {
	$(document).on("click", '#attendanceButton', function(){
		var url = "insertAttendance";
		window.open(url, "idCheck", "toolbar=no, scrollbars=no, resizeable=no, " 
				+  "status=no, menubar=no, width=500, height=400");
	});
});
