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
				<div class="row">
					<div class="col">
						<h2 class="text-light">결제 추가</h2>
					</div>
				</div>
				<!-- 결제폼 -->
				<form id="addInfoProcess" action="addInfoProcess" method="post">
					<input type="hidden" name="FK_regInfo_user" value="${user.userNo}">
					<div class="row my-3">
						<div class="col">
							<table class="table text-center">
								<thead class="table-light">
									<tr class="text-dark">
										<th>
											<div class="row">
												<div class="col-2 text-end fs-5 mt-1">결제 지점</div>
												<div class="col-2">
													<select id="regPoint" name="regPoint"
														class="pointCate form-select text-center"
														aria-label="Default select example">
														<option value="서울대입구점">서울대입구</option>
														<option value="강남점">강남점</option>
														<option value="상도점">상도점</option>
													</select>
												</div>
												<div class="col-2 text-end fs-5 mt-1">회원명</div>
												<div class="col-3">
													<input class="form-control" type="text"
														value="${user.userName}" readonly>
												</div>
											</div>
										</th>
									</tr>
								</thead>
								<thead class="table-secondary">
									<tr class="text-dark">
										<th>
											<div class="row">
												<div class="col-2 text-end fs-5 mt-1">결제일</div>
												<div class="col-2">
													<input class="form-control" type="text" value="${date}">
												</div>
												<div class="col-2 text-end fs-5 mt-1">결제 항목</div>
												<div class="col-3">
													<input class="form-control" type="number" name="regType" 
													id="regType" placeholder="회 권" >
												</div>
												<div class="col-1">
													<input class="btn btn-danger btnCommend" type="submit"
														id="addInfo" value="추가">
												</div>
											</div>
										</th>
									</tr>
								</thead>
							</table>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</section>
<!-- footer Section -->