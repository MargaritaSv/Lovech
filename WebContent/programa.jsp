<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='<c:url value="css/program.css"/>' rel="stylesheet">
<link href='<c:url value="css/footer.css"/>' rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.2.0.js"></script>
<title>ПРОГРАМА</title>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>

	<div class="slider-position">
			<jsp:include page="sliderImages1.jsp"></jsp:include>

		<div id="idDV">
			<main id="mainId"> <section> <header>
			<div class="headerStyle">
				<h1>ПРОГРАМА ЗА МЕСЕЦ ЮНИ</h1>

				<div class="dataProduction">
					<span id="color-text-white">ДЕН </span>
				</div>
				<div class="production2">
					<span id="color-text-white">ПОСТАНОВКА</span>
				</div>

				<div class="hourProduction">
					<span id="color-text-white">ЧАС</span>
				</div>

				<div class="productionPlace">
					<span id="color-text-white">МЯСТО</span>
				</div>
			</div>
			</header>
			<div id="menu">
				<div class="productionAll"></div>
				<c:forEach items="${program}" var="pr">
					<arcticle>
					<div class="productionAll">
						<div class="dataProduction">
							<span id="date-upper"><strong>${pr.getDate() }</strong> </span>
						</div>
						<div class="production2">
							<h2 class="productionName">${pr.getProduction() }</h2>
						</div>

						<div class="hourProduction">
							<span id="color-text">${pr.getHour() }ч</span>
						</div>

						<div class="productionPlace">
							<span id="color-text">${pr.getPlace() }</span>

						</div>
					</div>
					</arcticle>
				</c:forEach>
			</div>
			</section> </main>
		</div>
	</div>
		<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>