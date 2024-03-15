<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   
<!-- header Section -->
<!-- body Section -->
<section class="classes-section spad">
<div class="container">
	<div class="row my-5">
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
					<table class= "table text-center">
						<thead class="table-secondary">
							<tr class="text-dark"> 
								<th>부 위</th>
								<th>운동명</th>
								<th>무 게</th>
								<th>세 트</th>
								<th>횟 수</th>
							</tr>
						</thead>
						<tbody class="text-light">
							<c:forEach var="e" items="${eList}">
							<tr>
								<td>${e.exerciseCate}</td>
								<td>${e.exerciseName}</td>
								<td>${e.exerciseWeight} Kg</td>
								<td>${e.exerciseSet} Set</td>
								<td>${e.exerciseRep} Rep</td>				
							</tr>
							</c:forEach>
						</tbody>	
					</table>
				</div>
			</div>
			<div class="row my-2">
				<div class="col text-end">
					<div class="text-end">
						<span class=" btn btn-danger btnCommend" id="btnUpdate">수정</span>
						<span class="btn btn-danger btnCommend" id="btnInsert">등록</span>
						<span class="btn btn-danger btnCommend" id="btnDelete">삭제</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</section>
<!-- footer Section -->