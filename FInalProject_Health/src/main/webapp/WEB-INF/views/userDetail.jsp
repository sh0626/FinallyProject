<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- header Section -->
<!-- body Section -->
<section class="classes-section spad">
	<div class="container">
		<div class="row my-5">
			<!-- 회원 정보 상세 타이틀 -->
			<div class="col">
				<div class="row my-3">
					<div class="col">
						<h2 class="text-light">회원 정보 상세보기</h2>
					</div>
				</div>
			</div>
			<!-- 회원 기본 정보  -->
			<form id="updateUser" action="updateUser" method="post">
				<table class="table text-center">
					<thead class="table-secondary">
						<tr class="text-dark">
							<td class="">
								<div class="row">
									<div class="col">
										<div class="row">
											<div class="col-2">
												<div class="row">
													<div class="col-7">회원번호 :</div>
													<div class="col-5">
														<input class="userNo form-control text-end" type="text"
															value="${user.userNo}" id="userNo" name="userNo"
															aria-label="default input example" readonly>
													</div>
												</div>
											</div>
											<div class="col-2">
												<div class="row">
													<div class="col-6">회원명 :</div>
													<div class="col-6">
														<input class="userName form-control text-end" type="text"
															value="${user.userName}" id="userName" name="userName"
															aria-label="default input example">
													</div>
												</div>
											</div>
											<div class="col-2">
												<div class="row">
													<div class="col-6">나이(만) :</div>
													<div class="col-6">
														<input class="age form-control text-end" type="text"
															value="${user.age}" id="age" name="age"
															aria-label="default input example">
													</div>
												</div>
											</div>
											<div class="col-5">
												<div class="row justify-content-start">
													<div class="col-3">전화번호 :</div>
													<div class="col-2">
														<input class="phone1 form-control text-end" type="text"
															value="${user.phone1}" id="phone1" name="phone1"
															aria-label="default input example">
													</div>
													-
													<div class="col-3">
														<input class="phone2 form-control text-end" type="text"
															value="${user.phone2}" id="phone2" name="phone2"
															aria-label="default input example">
													</div>
													-
													<div class="col-3">
														<input class="phone3 form-control text-end" type="text"
															value="${user.phone3}" id="phone3" name="phone3"
															aria-label="default input example">
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</td>
						</tr>
					</thead>
					<tbody class="table-secondary">
						<tr class="text-dark">
							<td class="">
								<div class="row">
									<div class="col">
										<div class="row justify-content-start">
											<div class="col-5">
												<div class="row">
													<div class="col-4">사물함 기간 :</div>
													<div class="col-8">
														<div class="row">
															<div class="col-6">
																<input class="lockerRegDate form-control text-end"
																	type="text"
																	value="<fmt:formatDate value="${user.lockerRegDate}"
															pattern="yyyy-MM-dd" />"
																	id="lockerRegDate" name="lockerRegDate"
																	aria-label="default input example">
															</div>
															<div class="col-6">
																<input class="lockerDdate form-control text-end"
																	type="text"
																	value="<fmt:formatDate value="${user.lockerDdate}"
															pattern="yyyy-MM-dd" />"
																	id="lockerDdate" name="lockerDdate"
																	aria-label="default input example">
															</div>
														</div>
													</div>
												</div>
											</div>
											<div class="col-4 text-end">
												<div class="row">
													<div class="col-8">
														<div class="row">
															<div class="col-6">사물함 번호 :</div>
															<div class="col-6">
																<input class="FK_user_locker form-control text-end"
																	type="text" value="${user.lockerNo}"
																	id="FK_user_locker" name="FK_user_locker"
																	aria-label="default input example">
															</div>
														</div>
													</div>
													<div class="col-4">
														<input type="submit" value="수정"
															class="btn btn-danger btnCommend" id="btnInsert" />
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>

							</td>
						</tr>
					</tbody>
				</table>
			</form>
			<!-- 멤버십 정보  -->
			<table class="table text-center">
				<thead class="table-secondary">
					<tr class="text-dark">
						<th>담당PT 코치</th>
						<td>${user.employeeName}</td>
						<th>최초 등록 지점</th>
						<td>${user.regPoint}</td>
						<th>회원 등록일</th>
						<td><fmt:formatDate value="${user.regDate}"
								pattern="yyyy-MM-dd" /></td>
						<th>이용 잔여 횟수</th>
						<td>${user.possessNum}</td>
						<th>PT 잔여 횟수</th>
						<td>${user.ptPossessNum}</td>
					</tr>
				</thead>
			</table>
			<form action="">
				<div class="row my-5">
					<div class="col">
						<!-- 결제 정보 -->
						<div class="row">
							<div class="col">
								<h2 class="text-light">결제 이력</h2>
							</div>
							<div class="col text-end  mt-1">
								<div>
									<input type="button" value="등록"
										class="btn btn-danger btnCommend" id="addInfo"
										onclick="location.href='addInfo?userNo=${user.userNo}'">
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
											<th>결제일</th>
											<th>결제 항목</th>
											<th>결제 지점</th>
										</tr>
									</thead>
									<tbody class="text-light">
										<c:forEach var="r" items="${regInfo}" varStatus="num">
											<tr>
												<td>${regInfo.size() - num.index}</td>
												<td><fmt:formatDate value="${r.infoRegDate}"
														pattern="yyyy-MM-dd" /></td>
												<td>${r.regType}</td>
												<td>${r.regPoint}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</section>