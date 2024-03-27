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
									<input type="submit" class="c-btn mt-3" value="로그인" id="btnLogin" />
								</div>
								<p id="btn2">
									<input type="button" value="회원가입" class="my-3"
										onclick="window.location.href='/health/memberJoinForm'" id="btnJoin"/>
								</p>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>