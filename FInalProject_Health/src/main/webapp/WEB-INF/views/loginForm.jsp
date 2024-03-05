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

#btn1 checkbox {
	width: 15%;
	margin: 10%;
}

#btn1 input {
	width: 35%;
	text-align: center;
}
</style>

<!-- Contact Section Begin -->
<section class="contact-section spad">
	<div class="container">
		<div class="row">
			<div class="contact-form">
				<h4>Log in - 로그인</h4>
				<div class="row my-5" id="global-content">
					<div class="col-lg-12">
						<form class="my-5" id="loginForm" action="login" method="post">
							<h2 class="fw-bold">Member Login</h2>
							<fieldset>
								<legend>Member Log in</legend>
								<div id="login">
									<p>
										<label for="userId" class="labelStyle">아이디</label> <input
											type="text" id="id" name="userId" />
									</p>
									<p>
										<label for="userPass" class="labelStyle">비밀번호</label> <input
											type="password" id="userPass" name="pass" />
									</p>
								</div>
								<input type="submit" class="c-btn" value="로그인" id="btnLogin" />
								<div>
									<p id="btn1">
										<label for="saveId">아이디저장</label> <input type="checkbox"
											style="height: 20px;" id="saveId" value="savedIdYes" /> <label
											for="secure">보안접속</label> <input type="checkbox"
											style="height: 20px;" id="secure" value="secureYes" />

									</p>
								</div>
								<p id="btn2">
									<input type="button" value="회원가입" onclick="/register.jsp"
										id="btnJoin" /> <input type="button" value="아이디/비밀번호 찾기"
										id="btnSearch" />
								</p>
							</fieldset>
						</form>
					</div>
				</div>
			</div>


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
		</div>
	</div>
</section>