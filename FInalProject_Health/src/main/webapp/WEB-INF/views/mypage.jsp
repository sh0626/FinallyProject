<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- header Section -->
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

<!-- body Section -->
<section class="contact-section spad">
	<form action="memberUpdateResult" name="mypage" method="post" id="mypage">
		<h2 class="text-light text-center">회원정보</h2>
		<div class="container">
			<div class="row justify-content-center">
				<div class="row my-3">
					<div class="col-8 offset-4">
					<label for="id" class="form-label text-light">id : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="id" id="userId"
									value="${sessionScope.member.id}" readonly>
							</div>
						</div>
					</div>
					<div class="col-8 offset-4">
						<label for="name" class="form-label text-light">이 름 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="name"
									value="${sessionScope.member.userName}" readonly>
							</div>
						</div>
					</div>
					<div class="col-8 offset-4">
					<label for="gender" class="form-label text-light">성별 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="gender" id="gender"
									value="${sessionScope.member.gender}" readonly>
							</div>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="age" class="form-label text-light">나 이 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="age"
									value="${sessionScope.member.age}">
							</div>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="phone" class="form-label text-light">휴대폰 번호 : </label>
						<div class="row">
							<div class="col-md-2">
								<input type="text" class="form-control" name="phone1" id="phone1" maxlength="3"
									value="${member.phone1}">
							</div>
							<div class="col-md-2">
								<input type="text" class="form-control" name="phone2" id="phone2" maxlength="4"
									value="${member.phone2}">
							</div>
							<div class="col-md-2">
								<input type="text" class="form-control" name="phone3" id="phone3" maxlength="4"
									value="${member.phone3}">
							</div>
						</div>
					</div>
				</div>
			</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="oldPw" class="form-label text-light">기존 비밀번호 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="password" class="form-control" name="oldPw"
									id="oldPw" placeholder="기존 비밀번호를 입력해주세요.">
							</div>
							<div class="col-4">
								<input type="button" class="btn btn-warning" id="btnPwCheck"
									value="비밀번호 확인">
							</div>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="pw1" class="form-label text-light">새 비밀번호 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="password" class="form-control" name="pw1" id="pw1"
									placeholder="새 비밀번호를 입력해주세요">
							</div>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="pw2" class="form-label text-light">새 비밀번호 확인 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="password" class="form-control" name="pw2" id="pw2"
									placeholder="새 비밀번호를 다시 입력해주세요">
							</div>
						</div>
					</div>
				</div>
				<div class="row mb-4 mt-2">
					<div class="col-8 offset-8">
						<input type="submit" value="수정하기" class="btn btn-primary" id="su">
					</div>
				</div>
			</div>
		</div>
	</form>
		<h2 class="text-light text-center">멤버십 정보</h2>
		<div class="container">
			<div class="row justify-content-center">
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="FK_user_point" class="form-laber text-light">최초 등록 지점 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="FK_user_point"
									value="${member.FK_user_point}" readonly>
							</div>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="regDate" class="form-laber text-light">회원 등록일 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="regDate"
									value="${member.regDate}" readonly>
							</div>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="possessNum" class="form-laber text-light">이용 잔여 횟수 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="possessNum"
									value="${member.possessNum}" readonly>
							</div>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="ptPossessNum" class="form-laber text-light">PT 잔여 횟수 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="ptPossessNum"
									value="" readonly>
							</div>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8 offset-4">
						<label for="locker" class="form-laber text-light">사물함 기한 : </label>
						<div class="row">
							<div class="col-md-6">
								<input type="text" class="form-control" name="locker" value=""
									readonly>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</section>

<!-- footer Section -->
