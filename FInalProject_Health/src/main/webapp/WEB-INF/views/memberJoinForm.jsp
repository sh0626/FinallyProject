<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>


<style>
.contact-form, .contact-form input {
	border: none;
	margin-top: 10px;
	margin-bottom: 10px;
	font-weight: 500;
	font-size: 16px;
	color: #fff;
	line-height: 1;
	width: 50%;
}
</style>

<section class="contact-section spad">
	<div class="container">
		<div>
			<div class="contact-form">
				<div class="row my-3 text-center">
					<div class="col">
						<h4 class="fs-3 fw-bold">회원가입</h4>
					</div>
				</div>
				<form action="joinResult" name="joinForm" method="post"
					id="joinForm">
					<input type="hidden" name="isIdCheck" id="isIdCheck" value="false" />
					<%-- 회원 아이디 중복 검사를 했는지의 정보를 hidden 필드로 저장 --%>
					<div class="row">
						<div class="col-lg-12">
							<label for="authority" class="form-label">* 회원</label> <select
								class="form-select" name="authority" id="authority">
								<option value=2>일반 회원</option>
							</select> <label for="name" class="form-label my-3">* 회원명</label> <input
								type="text" class="form-control" name="userName" id="userName"
								placeholder="이름을 입력하세요"> <label for="id"
								class="form-label">* 아이디 : </label>
							<div class="row">
								<div class="col-9">
									<input type="text" class="form-control" name="id" id="id"
										placeholder="아이디를 입력하세요">
								</div>
								<div class="col-3">
									<input type="button" class="btn btn-warning" id="btnOverlapId"
										value="중복확인">
								</div>
							</div>
							<div>
								<label for="pw1" class="form-label">* 비밀번호 : </label> <input
									type="password" class="form-control" name="pw1" id="pw1"
									placeholder="비밀번호를 입력하세요">
							</div>
							<div>
								<label for="pw2" class="form-label">* 비밀번호 확인 : </label> <input
									type="password" class="form-control" name="pw2" id="pw2"
									placeholder="비밀번호를 확인하세요">
							</div>
							<div class="col-12">
								<label for="phone" class="form-label">* 휴대폰 번호 : </label>
								<div class="row">
									<div class="col-3">
										<select class="form-select my-3" name="phone1" id="phone1">
											<option>010</option>
											<option>011</option>
											<option>016</option>
											<option>017</option>
											<option>018</option>
											<option>019</option>
										</select>
									</div>
									<div class="col-4">
										<input type="text" pattern="[0-9]{4}"
											class="form-control form-control-sm" name="phone2"
											id="phone2" maxlength="4">
									</div>
									<div class="col-4">
										<input type="text" pattern="[0-9]{4}"
											class="form-control form-control-sm" name="phone3"
											id="phone3" maxlength="4">
									</div>
								</div>
							</div>

							<div class="row ">
								<div class="col-4">
									<div class="row mt-3">
										<div class="col-5 mt-2">
											<label for="phone" class="form-label">* 성별 : </label>
										</div>
										<div class="col-7">
											<select class="form-select" name="gender" id="gender">
												<option>남성</option>
												<option>여성</option>
											</select>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-5">
									<div class="row mt-3">
										<div class="col">
											<label for="phone" class="form-label mt-4">* (만)나이 : </label>
										</div>
										<div class="col">
											<input class="form-control form-control-sm" type="text"
												name="age" id="age" maxlength="2">
										</div>
									</div>
								</div>
							</div>

							<div class="row mt-3">
								<label for="phone" class="form-label">* 지점 </label>
								<div class="col-6">
									<select class="form-select" name="FK_user_point"
										id="FK_user_point">
										<option>강남점</option>
										<option>상도점</option>
										<option>서울대입구점</option>
									</select>
								</div>
								<div class="row mb-3 mt-5">
									<div class="col-5 ">
										<input type="submit" value="계정 생성하기"
											class="btn btn-primary c-btn">
									</div>
									<div class="col-5 ">
										<input class="btn btn-primary c-btn" type="button" value="홈으로"
											onclick="window.location.href ='/health/main'">
									</div>
								</div>
							</div>

						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>
