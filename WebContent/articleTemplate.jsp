<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="css/demo1.css"/>' rel="stylesheet">
<link href='<c:url value="css/footer.css"/>' rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.2.0.js"></script>
<title>Постановка</title>

</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<div class="slider-position">
		<div class="slider-height">
			<jsp:include page="sliderImages1.jsp"></jsp:include>

		</div>
		<div class="container">

			<div class="main">
				<h1>
					<strong>${production.getName()}</strong>
				</h1>
				<p>по пиеса на ${production.getAutor() }</p>

				<img src="https://nglas.files.wordpress.com/2015/05/afi6-2.jpg"
					alt="English Holiday cover">

				<p>Времетраене: 185мин.</p>

			</div>

			<div class="main">


				<h2>Участват</h2>
				<p class="description">${production.getActors()}</p>

				<h2>Описание</h2>
				<p class="description">${production.getDescription() }</p>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</body>
</html>
