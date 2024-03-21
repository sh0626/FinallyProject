<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<meta charset="UTF-8">
<meta name="description" content="Activitar Template">
<meta name="keywords" content="Activitar, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>회원정보 | 마이페이지</title>


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
</head>


<body>

	<!-- Contact Section Begin -->
	<section class="contact-section spad">
		<div class="container">
			<div>
				<div class="contact-form">
					<h4>회원 정보 - 마이페이지</h4>
					<form method="post" action="UpdateServlet" name="frm">
						<table align="center" width="600">
							<tr>
								<td colspan="2">My Page</td>
							</tr>
							
							<tr>
								<td>이름</td>
								<td><input type="text" name="name"
									value="${loginUser.name }" readonly="readonly"></td>
							</tr>
							
							<tr>
								<td>비밀번호</td>
								<td><input type="password" name="pass"></td>
							</tr>
							<tr>
								<td>이름</td>
								<td><input type="text" name="name"
									value="${loginUser.name }" readonly="readonly"></td>
							</tr>
							
							<tr>
								<td>휴대폰번호1</td>
								<td><input type="text" name="phone"
									value="${loginUser.phone1 }"></td>
							</tr>
							<tr>
								<td>휴대폰번호2</td>
								<td><input type="text" name="phone"
									value="${loginUser.phone2 }"></td>
							</tr>
							<tr>
								<td>휴대폰번호3</td>
								<td><input type="text" name="phone"
									value="${loginUser.phone3 }"></td>
							</tr>
							
							
							<tr>
								<td>최초 등록일</td>
								<td><input type="text" name="phone"
									value="${regDate }"></td>
							</tr>
							<tr>
								<td>최초 등록 지점</td>
								<td><input type="text" name="phone"
									value="${regPoint }"></td>
							</tr>
							
							<tr>
								<td>PT 잔여 횟수</td>
								<td><input type="text" name="phone"
									value="${ptPossessNum }"></td>
							</tr>
							
								<tr>
								<td>짐 이용 잔여 횟수</td>
								<td><input type="text" name="phone"
									value="${possessNum}"></td>
							</tr>
							
							<tr>
								<td>사물함</td>
								<td><input type="text" name="phone"
									value="${locker}"></td>
							</tr>
							
							
							
							<tr>
								<td style="type =padding: 10px">권한</td>
								<td><select name="athority">
										<c:choose>
											<c:when test="${result == 2 }">
												<option value="A" selected="selected">관리자</option>
												<option value="B">트레이너</option>

											</c:when>
											<c:otherwise>
												<option value="A">관리자</option>
												<option value="B" selected="selected">트레이너</option>
												<br>
												<br>
												<br>
												<br>

											</c:otherwise>
										</c:choose>
								</select></td>
							</tr>

							<tr>
								<td>성별</td>
								<td><select name="gender">
										<c:choose>
											<c:when test="${loginUser.gender == 1}">
												<option value="1" selected="selected">남자</option>
												<option value="2">여자</option>
											</c:when>
											<c:otherwise>
												<option value="1">남자</option>
												<option value="2" selected="selected">여자</option>
											</c:otherwise>
										</c:choose>
								</select></td>
							</tr>
							<tr>
								<td>휴대폰번호</td>
								<td><input type="text" name="phone"
									value="${loginUser.phone }"></td>
							</tr>
							
							
							<tr align="center">
								<td colspan="2"><input type="submit" value="수정하기">
									&nbsp; <input type="reset" value="취소"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>

</html>







<!-- Js Plugins -->


<script src="<c:url value='/resources/js/jquery-3.3.1.min.js'/>"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
<script
	src="<c:url value='/resources/js/jquery.magnific-popup.min.js'/>"></script>
<script src="<c:url value='/resources/js/mixitup.min.js'/>"></script>
<script src="<c:url value='/resources/js/jquery.nice-select.min.js'/>"></script>
<script src="<c:url value='/resources/js/jquery.slicknav.js'/>"></script>
<script src="<c:url value='/resources/js/owl.carousel.min.js'/>"></script>
<script src="<c:url value='/resources/js/masonry.pkgd.min.js'/>"></script>
<script src="<c:url value='/resources/js/main.js'/>"></script>


</body>

</html>