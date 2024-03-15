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
						<table class="table text-center">
						<thead class="table-light">
							<tr class="text-dark">
								<th>
									<div class="row">
										<div class="col-1 text-end fs-5 mt-1">
											제목
										</div>
										<div class="col-3">
											<input class="form-control" type="text">
										</div>
										<div class="col-1 text-end fs-5 mt-1">
											작성자
										</div>
										<div class="col-3">
											<input class="form-control" type="text" readonly>
										</div>
									</div>
								</th>
							</tr>
							</thead>
							<thead class="table-secondary">
								<tr class="text-dark">
									<th>
										<div class="row">
											<div class="col-2">부 위</div>
											<div class="col-3">운동명</div>
											<div class="col-2">무 게</div>
											<div class="col-2">세 트</div>
											<div class="col-2">횟 수</div>
											<div class="col-1">추 가</div>
										</div>
									</th>
								</tr>
							</thead>
							<tbody class="text-light">
								<tr>
									<td colspan="6">
										<form id="jWriteForm" action="" method="post">
											<div class="row">
												<div class="col-2">
													<select id="jcate" class="form-select text-center"
														aria-label="Default select example">
														<option value="하체">하체</option>
														<option value="가슴">가슴</option>
														<option value="등">등</option>
														<option value="어깨">어깨</option>
														<option value="이두">이두</option>
														<option value="삼두">삼두</option>
														<option value="코어">코어</option>
													</select>
												</div>
												<div class="col-3">
													<input class="form-control text-end" type="text" placeholder="Name  "
														id="jname" aria-label="default input example">
												</div>
												<div class="col-2">
													<input class="form-control text-end" type="text" placeholder="Kg  "
														id="weight" aria-label="default input example">
												</div>
												<div class="col-2">
													<input class="form-control text-end" type="text" placeholder="Set  "
														id="set" aria-label="default input example">
												</div>
												<div class="col-2">
													<input class="form-control text-end" type="text" placeholder="Rep  "
														id="rep" aria-label="default input example">
												</div>
												<div class="col-1">
													<input class="btn btn-danger btnCommend" type="button"
														value="추가">
												</div>
											</div>
										</form>
									</td>
								</tr>
							</tbody>
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
		</div>
	</div>
</section>
<!-- footer Section -->