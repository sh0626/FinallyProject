<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<section class="classes-section spad">
	<div class="container">
		<div class="row my-5 text-center">
			<div class="col">
				<div class="row my-5">
					<div class="col">
						<h2 class="text-light">출석버튼을 눌러주세요</h2>
					</div>
				</div>
				<form id="insertAttendance" action="insertAttendance" method="post">
					<div>
						<button id="attendanceButton" type="submit" class="btn btn-danger btnCommend btn-lg">출석</button>
					</div>
					<div class="modal fade" id="attendanceModal" tabindex="-1" role="dialog" aria-labelledby="attendanceModalLabel" aria-hidden="true">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title" id="attendanceModalLabel">출석이 완료되었습니다</h5>
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
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
							</div>
						</div>
					</div>
				</form>
				
			</div>
		</div>
	</div>
</section>