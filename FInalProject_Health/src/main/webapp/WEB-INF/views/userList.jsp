<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- header Section -->
<style>
.background-gray {
	background-color: rgba(128, 128, 128, 0.3);
}
</style>
<!-- body Section -->
<section class="classes-section spad">
	<div class="container">
		<div class="row my-5">
			<!-- 회원 정보 리스트 타이틀 -->
			<div class="col">
				<div class="row">
					<div class="col">
						<h2 class="text-light">회원 정보 리스트</h2>
					</div>
				</div>
				<!-- 리스트 헤더 -->
				<div class="row my-3">
						<table class="table text-center">
							<thead class="table-secondary">
								<tr class="text-dark">
									<th>회원번호</th>
									<th>회원명</th>
									<th>담당PT 코치</th>
									<th>전화번호</th>
									<th>짐 이용 잔여횟수</th>
									<th>PT 잔여횟수</th>
									<th>상세버튼</th>
								</tr>
							</thead>
							<!-- 리스트 -->
							<tbody class="text-light">
								<c:choose>
									<c:when test="${sessionScope.member.authority eq '0'}">
										<c:if test="${not empty uList}">
											<c:forEach var="u" items="${uList}">
												<c:set var="backgroundColor"
													value="${empty u.employeeName ? '': 'background-gray'}" />
												<tr class="${backgroundColor}">
													<td>${u.userNo}</td>
													<td>${u.userName}</td>
													<td>${u.employeeName}</td>
													<td>${u.phone1}-${u.phone2}-${u.phone3}</td>
													<td>${u.possessNum}</td>
													<td>${u.ptPossessNum}</td>
													<td><a href="userDetail?userNo=${u.userNo}"
														class="text-decoratiosn-none link-secondary">상세보기</a></td>
												</tr>
											</c:forEach>
										</c:if>
										<c:if test="${empty uList}">
											<tr>
												<td colspan="7" class="text-center">유저 정보가 존재하지 않음</td>
											</tr>
										</c:if>
									</c:when>
									<c:when test="${not sessionScope.member.authority}">
										<tr>
											<th colspan="7" class="text-center">접근 권한이 없습니다.</th>
										</tr>										
									</c:when>

								</c:choose>
							</tbody>
						</table>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- footer Section -->
