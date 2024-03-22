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
			<form action="updateUser">
				<table class="table text-center">
					<thead class="table-secondary">
						<tr class="text-dark">
							<td class="">
								<div class="row">
									<div class="col">

										<div class="row">
											<div class="col-3">
												<div class="row">
													<div class="col-6">회원번호 :</div>
													<div class="col-6">
														<input class="exerciseName form-control text-end"
															type="text" value="${user.userNo}" id="userNo"
															name="userNo" aria-label="default input example">
													</div>
												</div>
											</div>
											<div class="col-2">
												<div class="row">
													<div class="col-6">회원명 :</div>
													<div class="col-6">
														<input class="exerciseName form-control text-end"
															type="text" value="${user.userName}" id="userName"
															name="userName" aria-label="default input example">
													</div>
												</div>
											</div>
											<div class="col-2">
												<div class="row">
													<div class="col-6">나이(만) :</div>
													<div class="col-6">
														<input class="exerciseName form-control text-end"
															type="text" value=" ${user.age}" id="age" name="age"
															aria-label="default input example">
													</div>
												</div>
											</div>
											<div class="col-5">
												<div class="row">
													<div class="col-4">사물함 기간 :</div>
													<div class="col-8">
														<div class="row">
															<div class="col-6">
																<input class="exerciseName form-control text-end"
																	type="text"
																	value=" <fmt:formatDate value="${user.lockerRegDate}"
															pattern="yyyy-MM-dd" />"
																	id="lockerRegDate" name="lockerRegDate"
																	aria-label="default input example">
															</div>
															<div class="col-6">
																<input class="exerciseName form-control text-end"
																	type="text"
																	value=" <fmt:formatDate value="${user.lockerDdate}"
															pattern="yyyy-MM-dd" />"
																	id="lockerDdate" name="lockerDdate"
																	aria-label="default input example">
															</div>
														</div>
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
											<div class="col-3">
												<div class="row justify-content-start">
													<div class="col-6">담당 코치 :</div>
													<div class="col-6">
														<input class="exerciseName form-control text-end"
															type="text" value="${user.employeeName}"
															id="employeeName" name="employeeName"
															aria-label="default input example">
													</div>
												</div>
											</div>
											<div class="col-5">
												<div class="row justify-content-start">
													<div class="col-3">전화번호 :</div>
													<div class="col-2">
														<input class="exerciseName form-control text-end"
															type="text" value="${user.phone1}" id="phone1"
															name="phone1" aria-label="default input example">
													</div>
													-
													<div class="col-3">
														<input class="exerciseName form-control text-end"
															type="text" value="${user.phone2}" id="phone2"
															name="phone2" aria-label="default input example">
													</div>
													-
													<div class="col-3">
														<input class="exerciseName form-control text-end"
															type="text" value="${user.phone3}" id="phone3"
															name="phone3" aria-label="default input example">
													</div>
												</div>
											</div>
											<div class="col-3 text-end">
												<input type="submit" value="수정"
													class="btn btn-danger btnCommend" id="btnInsert" />
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
						<th>사물함 번호</th>
						<td>${user.lockerNo}</td>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<button type="submit">s</button>

</section>