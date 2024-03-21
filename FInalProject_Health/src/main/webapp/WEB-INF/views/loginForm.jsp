<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!-- Contact Section Begin -->
<section class="contact-section spad">
	<div class="container">
		<div class="row">
			<div class="contact-form">
				<div class="row my-5" id="global-content">
					<div class="col-lg-12">
						<form class="my-5" id="loginForm" action="login" method="post">
							<h2 class="login fw-bold" style="color: white">Member Login</h2>
							<fieldset>
								<div id="login">
									<p>
										<label for="userId" class="labelStyle">아이디</label>
										<input type="text" id="id" name="userId" />
									</p>
									<p>
										<label for="userPass" class="labelStyle">비밀번호</label>
										<input type="password" id="userPw" name="pw" />
									</p>
									<input type="submit" class="c-btn" value="로그인" id="btnLogin" />
								</div>
								
								<div>
									<p id="btn1">
										<input type="checkbox" id="saveId" value="savedIdYes" />
										<label for="saveId">아이디저장</label>
										<input type="checkbox" id="secure" value="secureYes" />
										<label for="secure">보안접속</label>										
									</p>
								</div>
								<p id="btn2">
									<input type="button" value="회원가입" onclick="/register.jsp"
										id="btnJoin" />
									<input type="button" value="아이디/비밀번호 찾기"
										id="btnSearch" />
								</p>
							</fieldset>
							
						</form>
					</div>
				</div>
			</div>

		</div>
	</div>
</section>