<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<section class="classes-section spad">
	<div class="container">
		<!-- content -->
		<div class="row my-5" id="global-content">
			<div class="col">
				<div class="row text-center">
					<div class="col">
						<h2 class="fs-3 fw-bold">인바디 상세보기</h2>
					</div>
				</div>
				<div class="row my-3">
					<div class="col">
						<table class="table table-bordered">
							<tbody>
								<c:forEach var="i" items="${inBody}">
									<tr>
										<th class="table-secondary">번호</th>
										<th class="table-secondary">회원</th>
										<th class="table-secondary">날짜</th>
										<th class="table-secondary">파&nbsp;&nbsp;&nbsp;&nbsp;일</th>
									</tr>
									<tr>
										<td class="data">${i.inbodyNo}</td>
										<td class="data">${i.FK_inbody_user}</td>
										<td class="data">${i.inbodyDate}</td>
										<td class="data"><a href="fileDownload?fileName=${i.inbodyURL}">${i.inbodyURL}</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row my-2">
				<div class="col text-end">
					<div class="text-end">
						<span class="btn btn-danger btnCommend" id="btnInsert">등록</span>
						<span class="btn btn-danger btnCommend" id="btnDelete">삭제</span>
					</div>
				</div>
			</div>
			</div>
		</div>
	</div>
</section>