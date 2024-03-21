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
								
							<label for="authority" class="form-label">* 회원인가요? 트레이너인가요?</label>
							<select class="form-select" name="authority" id="authority">
											<option value=2>일반 회원</option>
											<option value=1>트레이너</option>
							</select>	
								
							<label for="name" class="form-label">* 회원명</label>
							<input type="text" class="form-control" name="userName" id="userName" placeholder="이름을 입력하세요" required>
							
							<label for="id" class="form-label">* 아이디 : </label>
							<div class="row">
								<div class="col-9">
									<input type="text" class="form-control" name="id" id="id" required>
								</div>
								<div class="col-3">
									<input type="button" class="btn btn-warning" id="btnOverlapId" value="중복확인">
								</div>
							</div>

							<div>
								<label for="pw1" class="form-label">* 비밀번호 : </label>
								<input type="password" class="form-control" name="pw1" id="pw1" placeholder="비밀번호를 입력하세요" required>
							</div>

							<div>
								<label for="pw2" class="form-label">* 비밀번호 확인 : </label>
								<input type="password" class="form-control" name="pw2" id="pw2" placeholder="비밀번호를 확인하세요" required>
							</div>

							<div class="col-12">
								<label for="phone" class="form-label">* 휴대폰 번호 : </label>
								<div class="row">
									<div class="col-3">
										<select class="form-select" name="phone1" id="phone1" required>
											<option>010</option>
											<option>011</option>
											<option>016</option>
											<option>017</option>
											<option>018</option>
											<option>019</option>
										</select>
									</div>
									<div class="col-4">
										<input type="text" pattern="[0-9]{4}" class="form-control"
											name="phone2" id="phone2" maxlength="4" required>
									</div>
									<div class="col-4">
										<input type="text" pattern="[0-9]{4}" class="form-control"
											name="phone3" id="phone3" maxlength="4" required>
									</div>
								</div>
							</div>

							<div class="col-3">
								<select class="form-select" name="gender" id="gender">
									<option>남성</option>
									<option>여성</option>
								</select>
								
							<div class="row col-6">
								만<input type="text" name="age" id="age" maxlength="2" required>세
							</div>
							
							<div class="col-16">
								<select class="form-select" name="regPoint" id="regPoint" default="--------">
									<option>강남점</option>
									<option>상도점</option>
									<option>서울대입구점</option>
								</select>
							</div>
							
							<div class="row mb-3 mt-5 col-4">
								<div>
									<input class="c-btn" type="submit" value="계정 생성하기"
										class="btn btn-primary">
								</div>

								<div>
									<button class="c-btn" onclick="window.location.href ='www.naver.com'">홈으로</button>
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
<!-- Contact Section End -->

<!-- Cta Section Begin -->
<section class="cta-section">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="cta-text">
					<h3>오늘 바로 시작하세요!</h3>
					<p>신규 회원 가입 이벤트 중! 1주일 무료 체험 기간</p>
				</div>
				<a href="#" class="primary-btn cta-btn">book now</a>
			</div>
		</div>
	</div>
</section>
<!-- Cta Section End -->
