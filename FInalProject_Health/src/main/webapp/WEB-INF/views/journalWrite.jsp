<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- header Section -->
<!-- body Section -->
<section class="classes-section spad">
	<div class="container">
		<div class="row my-5">
		<form id="jWriteForm" action="jWriteProcess" method="post">
			<div class="col">
				<!-- 일지 타이틀 -->
				<div class="row">
					<div class="col">
						<h2 class="text-light">운동 일지</h2>
					</div>
				</div>
				<!-- 일지 헤더 -->
				<div class="row my-3">
					<div class="col">
						<table class="table text-center">
						<thead class="table-light">
							<tr class="text-dark">
								<th>
								
									<div class="row">
										<div class="col-1 text-end fs-5 mt-1">
											제목
										</div>
										<div class="col-3">
											<input class="form-control" type="text" name="journalTitle" id="journalTitle" 
											placeholder="제목을 입력하시오">
										</div>
										<div class="col-1 text-end fs-5 mt-1">
											작성자
										</div>
										<div class="col-3">
											<input class="form-control" type="text" name= "userName" id="userName"
											value="${sessionScope.member.userName}" readonly>
											<input type="hidden" name="no" id="no" value="1">
										</div>									
									</div>
								
								</th>
							</tr>
							</thead>

						</table>
					</div>
				</div>
				<div class="row my-2">
					<div class="col text-end">
						<div class="text-end">
							<input type="submit" value="등록" class="btn btn-danger btnCommend" id="btnInsert" />
							<input type="button" value="목록" class="btn btn-danger btnCommend" id="btnReturn"
							onclick="location.href='trainingJournal'"/>
						</div>
					</div>
				</div>
			</div>
			</form>
		</div>
	</div>
</section>
<!-- footer Section -->