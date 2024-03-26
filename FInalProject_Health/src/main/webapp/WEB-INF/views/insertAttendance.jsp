<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<section class="classes-section spad">
	<div class="container">
		<div class="row justify-content-center mt-5">
			<form id="insertAttendance" action="insertAttendance" method="post">
				<div class="col-6">
					<h2>출석이 완료되었습니다</h2>
				</div>
				<div class="modal-body">
					<p>
						이름: <span>${attend.userName}</span>
					</p>
					<p>
						잔여횟수: <span>${attend.possesNum}</span>
					</p>
					<p>
						출석일: <span>${attend.attendanceDate}</span>
					</p>
				</div>
			</form>
		</div>
	</div>

</section>