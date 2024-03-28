<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<section class="classes-section spad">
	<div class="container">
		<!-- content -->
		<div class="row my-5" id="global-content">
			<div class="col">
				<form id="InBodyWriteForm" action="InBodyWriteProcess" method="post"
							enctype="multipart/form-data">
					<div class="row text-center">
						<div class="col">
							<h2 class="fs-3 fw-bold" style="color: white">인바디 등록</h2>
						</div>
					</div>
					<div class="row my-3">
						<div class="col">
							<table class="table table-bordered">
								<tbody>
									<tr>
										<th class="table-secondary">회원 번호</th>
										<th class="table-secondary">파일</th>
									</tr>
									<tr>
										<td class="data">
											<input class="form-control" type="text"
														name="FK_inbody_user" id="FK_inbody_user"
														value="${sessionScope.member.userNo}"></td>
										<td class="data">
											<input class="form-control" type="file"
														name="inbodyURL" id="inbodyURL"></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="row my-2">
						<div class="col text-end">
							<div class="text-end">
								<input class="btn btn-danger btnCommend" type="submit" value="등록">
								<input class="btn btn-danger btnCommend" type="button" value="목록"
											onclick="location.href='inBody'" />
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>