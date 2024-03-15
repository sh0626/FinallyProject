<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- header Section -->
<!-- body Section -->
<section class="classes-section spad">
	<div class="container">
		<div class="row my-5">
			<!-- 회원 정보 상세 타이틀 -->
			<div class="col">
				<div class="row">
					<div class="col">
						<h2 class="text-light">회원 정보 상세보기</h2>
					</div>
				</div>
			</div>
			<!-- 회원 기본 정보  -->
			<table class= "table text-center">
					<thead class="table-secondary">
						<tr class="text-dark">
							<th>회원번호</th>
							<td>${u.userNo}</td>
							<th>회원명</th>
							<td>${u.userName}</td>						
							<th>나이</th>
							<td>${u.age}</td>						
							<th>전화번호</th>
							<td>${u.phone1}-${u.phone2}-${u.phone3}</td>				
						</tr>
					</thead>
			</table>
			<!-- 멤버십 정보  -->
			<table class= "table text-center">
				<thead class="table-secondary">
						<tr class="text-dark">
							<th>담당PT 코치</th>
							<td>${u.employeeName}</td>
							<th>최초 등록 지점</th>
							<td>${r.regPoint}</td>						
							<th>회원 등록일</th>
							<td>${u.regDate}</td>						
							<th>이용 잔여 횟수</th>
							<td>${u.possessNum}</td>	
							<th>PT 잔여 횟수</th>
							<td>${u.ptPossessNum}</td>	
							<th>사물함 기한</th>
							<td>~${l.lockerRegDate}</td>				
						</tr>
				</thead>
			</table>
		</div>
	</div>
</section>