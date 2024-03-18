<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Activitar Template">
<meta name="keywords" content="Activitar, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Activitar</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css?family=Nunito+Sans:400,600,700,800,900&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Oswald:300,400,500,600,700&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="resources/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="resources/css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="resources/css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="resources/css/nice-select.css" type="text/css">
<link rel="stylesheet" href="resources/css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="resources/css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="resources/css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<link rel="stylesheet" href="resources/css/index.css" type="text/css">
<link rel="stylesheet" href="resources/css/loginForm.css" type="text/css">

<!-- custom -->
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
	
	<link href="resources/custom/css/schedule.css" rel="stylesheet">
	<script src='resources/custom/js/schedule.js'></script>
	
	<!-- fullcalendar -->
	<link href='resources/fullcalendar/packages/core/main.css' rel='stylesheet' />
	<link href='resources/fullcalendar/packages/daygrid/main.css' rel='stylesheet' />
	<link href='resources/fullcalendar/packages/timegrid/main.css' rel='stylesheet' />
	<link href='resources/fullcalendar/packages/list/main.css' rel='stylesheet' />
	<script src='resources/fullcalendar/packages/core/main.js'></script>
	<script src='resources/fullcalendar/packages/interaction/main.js'></script>
	<script src='resources/fullcalendar/packages/daygrid/main.js'></script>
	<script src='resources/fullcalendar/packages/timegrid/main.js'></script>
	<script src='resources/fullcalendar/packages/list/main.js'></script>
	<!-- 템플릿 custom end -->
	
</head>

<body>
		<%@ include file="template/header.jsp" %>
		<jsp:include page="${ param.body }" />
		<%@ include file="template/footer.jsp" %>

	<!-- Js Plugins -->
	<script src="resources/js/jquery-3.3.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/jquery.magnific-popup.min.js"></script>
	<script src="resources/js/mixitup.min.js"></script>
	<script src="resources/js/jquery.nice-select.min.js"></script>
	<script src="resources/js/jquery.slicknav.js"></script>
	<script src="resources/js/owl.carousel.min.js"></script>
	<script src="resources/js/masonry.pkgd.min.js"></script>
	<script src="resources/js/main.js"></script>
	
	<!-- javascripts -->
	<script src="resources/origin/js/jquery.js"></script>
	<script src="resources/origin/js/bootstrap.min.js"></script>
	<!-- nice scroll -->
	<script src="resources/origin/js/jquery.scrollTo.min.js"></script>
	<script src="resources/origin/js/jquery.nicescroll.js"
		type="text/javascript"></script>
	<!-- jquery validate js -->
	<script type="text/javascript"
		src="resources/origin/js/jquery.validate.min.js"></script>

	<!-- custom form validation script for this page-->
	<script src="resources/origin/js/form-validation-script.js"></script>
	<!--custome script for all page-->
	<script src="resources/origin/js/scripts.js"></script>
	<!-- 부트스트랩 기본 템플릿 end -->
	
</body>

</html>