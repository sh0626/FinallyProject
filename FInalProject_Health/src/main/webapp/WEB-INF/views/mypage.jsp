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
										value="${userName}" readonly="readonly"></td>
							</tr>
							
							<tr>
								<td>ID</td>
								<td><input type="text" name="id"
										value="${id}" readonly="readonly"></td>
							</tr>
							
							<tr>
								<td>PW</td>
								<td><input type="password" name="pw"></td>
							</tr>
							
							<tr>
								<td>휴대폰 번호</td>
								<td><input type="text" name="phone"
										value="${phone1}-${phone2}-${phone3}"></td>
							</tr>
						
							<tr>
								<td colspan="5">헬스장 정보</td>
							</tr>
							
							<tr>
								<td>최초 등록일</td>
								<td><input type="text" name="regDate"
										value="${regDate}"></td>
							</tr>
							
							<tr>
								<td>최초 등록 지점</td>
								<td><input type="text" name="regPoint"
										value="${regPoint}"></td>
							</tr>
							
							<tr>
								<td>PT 잔여 횟수</td>
								<td><input type="text" name="ptPossessNum"
										value="${ptPossessNum}"></td>
							</tr>
							
								<tr>
								<td>짐 이용 잔여 횟수</td>
								<td><input type="text" name="possessNum"
										value="${possessNum}"></td>
							</tr>
							
							<tr>
								<td>사물함</td>
								<td><input type="text" name="locker"
										value="${locker}"></td>
							</tr>
					
							<tr align="center">
								<td colspan="2"><input type="submit" value="수정하기">&nbsp; 
								<input type="reset" value="취소"></td>
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