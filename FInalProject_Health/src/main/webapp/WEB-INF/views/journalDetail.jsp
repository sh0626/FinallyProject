<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- header Section -->
<!-- body Section -->
<section class="classes-section spad">
	<div class="container">
		<div class="row my-5">
			<form name="checkForm" id="checkForm">
			<input type="hidden" name="journalNo" id="journalNo" value="${journalNo}">
			<div class="col">
					<!-- 일지 타이틀 -->
					<div class="row">
						<div class="col">
							<h2 class="text-light">운동 일지</h2>
						</div>
						<div class="col text-end">
							<input type="button" value="글삭제" class="btn btn-danger btnCommend mt-1" id="btnDeleteJ" />
						</div>
					</div>
					<!-- 일지 헤더 -->
					<div class="row my-3">
						<div class="col">
							<table class="table text-center">
								<thead class="table-secondary">
									<tr class="text-dark">
										<th><input type="checkbox" id="checkAll"></th>
										<th>부 위</th>
										<th>운동명</th>
										<th>무 게</th>
										<th>세 트</th>
										<th>횟 수</th>
									</tr>
								</thead>
								<tbody class="text-light">
									<c:forEach var="e" items="${eList}">
										<tr class="exerciseForm">
											<td><input type="checkbox" class="checkbox" name="selectedItems" value="${e.exerciseNo}"></td>
											<td>${e.exerciseCate}</td>
											<td>${e.exerciseName}</td>
											<td>${e.exerciseWeight}Kg</td>
											<td>${e.exerciseSet}Set</td>
											<td>${e.exerciseRep}Rep</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<div class="row my-2">
						<div class="col text-end">
							<div class="text-end">
								<input type="button" value="수정" class="btn btn-danger btnCommend" id="btnUpdate" />
								<input type="button" value="등록" class="btn btn-danger btnCommend" id="btnInsert" 
								onclick="location.href='exerciseWrite?journalNo=${journalNo}'"/>
								<input type="button" value="삭제" class="btn btn-danger btnCommend" id="btnDelete" />
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
<script src="resources/js/journal.js"></script>
