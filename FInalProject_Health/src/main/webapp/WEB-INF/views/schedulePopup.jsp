<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일정 추가</title>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

<!-- datepicker -->
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<!-- custom -->
<link href="resources/custom/css/schedule.css" rel="stylesheet" />
<script src="resources/custom/js/schedule.js" type="text/javascript"></script>

</head>
<body>
	<div class="group" id="popupGroup">
		<div class="group-head">
			<h1 class="zTree-h1">일정 추가</h1>
		</div>
		<div class="group-body">
			<form id="scheduleData">
				<div class="domain">
					<h3 class="zTree-h3">회원명</h3>
				</div>
				<div class="top">
					<input class="subject" id="subject" type="text" name="subject"
						placeholder="회원명 입력">
				</div>
				<div class="domain">
					<h3 class="zTree-h3">시작일</h3>
				</div>
				<div class="domain">
					<input class="date" id="startDate" type="text" name="startDate"
						id="startDate">
				</div>
				<div class="domain">
					<h3 class="zTree-h3">종료일</h3>
				</div>
				<div class="domain">
					<input class="date" id="endDate" type="text" name="endDate"
						id="endDate">
				</div>
				<div class="domain">
					<h3 class="zTree-h3">메모</h3>
				</div>
				<div class="domain">
					<input class="memo" id="memo" type="text" name="memo" placeholder="시간 입력">
				</div>
				<div class="domain">
					<h3 class="zTree-h3">담당 트레이너</h3>
				</div>
				<div class="domain">
					<input class="employeeName" id="employeeName" type="text"
						name="employeeName" placeholder="트레이너 이름 입력">
				</div>
				<button class="ok-button" type="button" onclick="click_ok();">확인</button>
			</form>
		</div>

	</div>
</body>
</html>