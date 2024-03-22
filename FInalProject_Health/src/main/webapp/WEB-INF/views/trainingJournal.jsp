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
					<div class="col text-end  mt-1">
						<div>
							<input type="button"  value="등록" class="btn btn-danger btnCommend" id="btnInsertJ"
							onclick="location.href='journalWrite'">
						</div>
					</div>
				</div>
				<!-- 일지 헤더 -->
				<div class="row my-3">
					<div class="col">
						<table class="table text-center">
							<thead class="table-secondary">
								<tr class="text-dark">
									<th>번 호</th>
									<th>글이름</th>
									<th>회원명</th>
									<th>날 짜</th>
								</tr>
							</thead>
							<tbody class="text-light">
								<c:forEach var="j" items="${jList}"  varStatus="num">
									<tr>
										<td>${jList.size() - num.index}</td>
										<td><a href="journalDetail?journalNo=${j.journalNo}"
											class="text-decoration-none text-light">${j.journalTitle}</a></td>
										<td>${j.userName}</td>
										<td><fmt:formatDate value="${j.journalDate}"
												pattern="yyyy-MM-dd HH:mm" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row my-2"></div>
			</div>
		</div>
	</div>
</section>
<!-- footer Section -->