// 출석 버튼 클릭 시 모달 표시

document.getElementById('attendanceButton').addEventListener('click', function() {

  // 모달 표시
  $('#attendanceModal').modal('show');
});

// 모달 닫기 버튼 기능
document.getElementsByClassName('close')[0].addEventListener('click', function() {
  $('#attendanceModal').modal('hide');
});

// 모달 외부 클릭 시 모달 닫기
$(window).on('click', function(event) {
  if ($(event.target).hasClass('modal')) {
    $('#attendanceModal').modal('hide');
  }
});
