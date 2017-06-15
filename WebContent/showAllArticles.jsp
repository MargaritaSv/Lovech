<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="css/demo.css"/>' rel="stylesheet">
<link href='<c:url value="css/style_common.css"/>' rel=" stylesheet">
<link href='<c:url value="css/style1.css"/>' rel="stylesheet">
<link href='<c:url value="css/footer.css"/>' rel="stylesheet">

<link href='http://fonts.googleapis.com/css?family=Oswald'
	rel='stylesheet' type='text/css' />
<script src="https://code.jquery.com/jquery-3.2.0.js"></script>

<title>Постановки</title>
</head>

<body>
	<jsp:include page="index.jsp"></jsp:include>

	<div class="slider-position">
		<div class="slider-height">
			<jsp:include page="sliderImages1.jsp"></jsp:include>

		</div>
	</div>
	<section>

	<div class="container">


		<h1>
			ПОСТАНОВКИ <span>театър Ловеч</span>
		</h1>

		<div class="more"></div>


		<div class="main">
			<c:forEach items="${productions }" var="pr">
				<div class="view view-first">
					<img src="https://nglas.files.wordpress.com/2015/05/afi6-2.jpg" />
					<div class="mask">
						<h2>${pr.getName()}</h2>
						<p>Автор: ${pr.getAutor()}</p>
						<a href="production?name=${pr.getName() }" class="info">Read
							More</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	</section>


	<div class="clr">
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>
