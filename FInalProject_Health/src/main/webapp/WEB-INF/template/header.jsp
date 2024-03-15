<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- header  -->
<!-- Page Preloder -->
<div id="preloder">
	<div class="loader"></div>
</div>

<!-- Header Section Begin -->
<header class="header-section">
	<div class="container">
		<div class="row">
			<div class="col-4 text-start logo">
				<a href="main"> <img src="resources/img/logo.png" alt="">
				</a>
			</div>
			<div class="col-6 nav-menu">
				<nav class="mainmenu mobile-menu">
					<ul>
						<li class="active"><a href="main">Home</a></li>
						<li><a href="#">지점</a></li>
						<li><a href="#">트레이너 소개</a></li>
						<li><a href="#">메뉴</a>
							<ul class="dropdown">
								<li><a href="#">운동 일지</a></li>
								<li><a href="#">식단</a></li>
								<li><a href="#">인바디</a></li>
								<li><a href="#">눈바디</a></li>
								<li><a href="calendar">달력</a></li>
							</ul>
						</li>
					</ul>
				</nav>
			</div>

			<div class="col-2 text-end come">
				<div class="row">
					<div class="col">
						<a href="loginForm">로그인</a>
					</div>
					<div class="col">
						<a href="register">회원가입</a>
					</div>
				</div>
				<div>안녕하세요 OOO님~</div>
			</div>
		</div>
	</div>

	<div id="mobile-menu-wrap"></div>

</header>