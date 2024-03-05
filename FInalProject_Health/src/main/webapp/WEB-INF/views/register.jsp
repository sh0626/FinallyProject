<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<style>
.contact-form, .contact-form input {
	width: 60%;
	border: none;
	margin-top: 10px;
	margin-bottom: 10px;
	font-weight: 500;
	font-size: 16px;
	color: #fff;
	line-height: 1;
}
</style>
<!-- Contact Section Begin -->
<section class="contact-section spad">
	<div class="container">
		<div>
			<div class="contact-form">
				<h4>Register - 회원가입</h4>
				<form action="#">
					<div class="row">
						<div class="col-lg-12">
							회원 이름 <input type="text" placeholder="이름을 입력하세요"> 휴대폰 번호<input
								id="id" type="text" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}"
								minlength="13" maxlength="13" placeholder="010-1234-5678"
								required> &nbsp;
							<button type="button" id=send-code-button
								class="btn btn-outline-light" width="20px" onclick="sendCode()">인증번호
								발송</button>
							<br> <input type="text"
								style="color: whitesmoke; font-size: 13px" minlength="6"
								maxlength="6" required placeholder="인증번호를 입력하세요">&nbsp;&nbsp;
							<button type="button" id="code-check-button"
								class="btn btn-outline-light" onclick="codeCheck()">&nbsp;&nbsp;인증하기&nbsp;&nbsp;</button>
							<br> <br>
							<!-- 휴대폰 코드 6자 -->

							이메일 주소 <input id="memberEmail" type="email" minlength="10"
								maxlength="30"
								pattern="^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}"
								required> &nbsp;
							<!-- <button type="button" class="btn btn-outline-light" required title="between 10 and 30 letters"> 이메일로 URL 받기</button><br>
                                        이메일주소 10~30자 정규식 추가함 -->
							<button type="button" id="send-email-button"
								class="btn btn-outline-light" onclick="sendEmail()">이메일주소
								인증</button>
							<br> <br>
							<div class="col-lg-12">
								<button type="submit" class="c-btn" id="create-acc-button">계정
									생성하기</button>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<button class="c-btn"
									onclick="window.location.href ='index.html'">취소하고 홈으로
									이동</button>
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
