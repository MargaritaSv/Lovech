<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href='<c:url value="css/index.css"/>' rel="stylesheet">
<script src="<c:url value="js/index.js" />"></script>
<script src="https://code.jquery.com/jquery-3.2.0.js"></script>

<header>
	<section class="navigation">

		<div class="nav-container">

			<div class="brand">
				<img src="teatar_logo_small1.jpg" alt="Logo">

			</div>
			<nav>
				<div class="nav-mobile">
					<a id="nav-toggle" href="#!"><span></span></a>
				</div>
				<ul class="nav-list">
					<li><a href="#!">За театъра</a>
						<ul class="nav-dropdown">
							<li><a href="history.jsp">История</a></li>
							<li><a href="#!">Сцени</a></li>
							<li><a href="#!">Награди</a></li>
							<li><a href="#!">Етикет</a></li>
						</ul></li>
					<li><a href="#!">Програма</a>
						<ul class="nav-dropdown">
							<li><a href="schedule for month">Актуална</a></li>
							<li><a href="schedule for week">Седмична</a></li>
						</ul></li>
					<li><a href="#!">Екип</a>
						<ul class="nav-dropdown">
							<li><a href="actors">Творчески състав</a></li>
							<li><a href="#!">Ръководство и администрация</a></li>
							<li><a href="#!">Технически екип</a></li>
						</ul></li>
					<li><a href="articles">Постановки</a></li>
					<li><a href="#!">Фестивал на младите</a>
						<ul class="nav-dropdown">
							<li><a href="festival_history.jsp">История</a></li>
							<li><a href="Rules_For_Festival.jsp">За участие</a></li>
						</ul></li>
					<li><a href="#!">Контакти</a></li>
				</ul>
			</nav>
		</div>
	</section>
</header>
