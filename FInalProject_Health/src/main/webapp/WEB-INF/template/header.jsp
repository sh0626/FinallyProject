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
			<div class="col-5 nav-menu">
				<nav class="mainmenu mobile-menu">
					<ul>
						<li class="active"><a href="main">Home</a></li>
						<li><a href="employeeDetail">트레이너 소개</a></li>
						<li><a href="#">메뉴</a>
							<ul class="dropdown">
								<li><a href="attendance">출석</a></li>
								<li><a href="trainingJournal">운동 일지</a></li>
								<li><a href="inBody">인바디</a></li>
								<li><a href="schedule">달력</a></li>
							</ul>
						</li>
					</ul>
				</nav>
			</div>
			<div class="col-3 text-end come">
				<div>
					<div class="row">
						<c:if test="${not sessionScope.isLogin }" >
							<div class="col">
								<a class="nav-link" href="loginForm">로그인</a>
							</div>
							<div class="col">
								<a class="nav-link" href="memberJoinForm">회원가입</a>
							</div>
						</c:if>
						
						<c:if test="${sessionScope.isLogin}">
							<c:if test="${sessionScope.member.authority eq '2'}">
								<div class="col">
									<a class="nav-link" href="logout">로그아웃</a>
								</div>
								<div class="col">
									<a class="nav-link" href="mypage">마이페이지</a>
								</div>
							</c:if>
							<c:if test="${sessionScope.member.authority eq '0'}">
								<div class="col">
									<a class="nav-link" href="userList">회원관리</a>
								</div>
								<div class="col">
									<a class="nav-link" href="logout">로그아웃</a>
								</div>
							</c:if>
							<c:choose>
							
								<c:when test="${sessionScope.member.authority eq '0'}">
						            <div>관리자 계정입니다.</div>
						        </c:when>
						        
						        <c:when test="${sessionScope.member.authority eq '2'}">
						            <div>${sessionScope.member.userName} 회원님</div>
						        </c:when>
						        
							</c:choose>
							
						</c:if>
					</div>			
				</div>
			</div>
		</div>
	</div>
</header>