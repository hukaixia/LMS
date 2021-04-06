<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>首页</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/base.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/demo2.css" />
	<script src="${pageContext.request.contextPath}/static/js/demo.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/imagesloaded.pkgd.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/anime.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/menu2.js"></script>  
<body class="demo-2 loading">
		<svg class="hidden">
			<symbol id="icon-arrow" viewBox="0 0 24 24">
				<title>arrow</title>
				<polygon points="6.3,12.8 20.9,12.8 20.9,11.2 6.3,11.2 10.2,7.2 9,6 3.1,12 9,18 10.2,16.8 "/>
			</symbol>
			<symbol id="icon-drop" viewBox="0 0 24 24">
				<title>drop</title>
				<path d="M12,21c-3.6,0-6.6-3-6.6-6.6C5.4,11,10.8,4,11.4,3.2C11.6,3.1,11.8,3,12,3s0.4,0.1,0.6,0.3c0.6,0.8,6.1,7.8,6.1,11.2C18.6,18.1,15.6,21,12,21zM12,4.8c-1.8,2.4-5.2,7.4-5.2,9.6c0,2.9,2.3,5.2,5.2,5.2s5.2-2.3,5.2-5.2C17.2,12.2,13.8,7.3,12,4.8z"/><path d="M12,18.2c-0.4,0-0.7-0.3-0.7-0.7s0.3-0.7,0.7-0.7c1.3,0,2.4-1.1,2.4-2.4c0-0.4,0.3-0.7,0.7-0.7c0.4,0,0.7,0.3,0.7,0.7C15.8,16.5,14.1,18.2,12,18.2z"/>
			</symbol>
		</svg>
		<main>
			<div class="message">To see the menu, please view on a larger screen.</div>
			<div class="content content--fixed">
				<header class="codrops-header">
					<div class="codrops-links">
						<a class="codrops-icon codrops-icon--prev" href="#" title="返回下载页"><svg class="icon icon--arrow"><use xlink:href="#icon-arrow"></use></svg></a>
						<a class="codrops-icon codrops-icon--drop" href="#" title="jQuery之家"><svg class="icon icon--drop"><use xlink:href="#icon-drop"></use></svg></a>
					</div>
					<h1 class="codrops-header__title">${loginReader.userName }</h1>
					<span class="info">welcome to  LMS </span>
				</header>
				<nav class="demos">
					<a class="demo" href="#" id="logout">退出</a>
				</nav>
				<button class="menu-trigger">+ Enter（进入系统）</button>
			</div>
			<div id="content-1" class="content content--switch content--switch-current" style="background-image: url(static/images/bg.jpg)">
				<h2 class="content__title">Welcome to LMS</h2>
				<div class="content__subtitle">Explore your limits</div>
			</div>
			
			<nav class="grim">
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--1"></div>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--2"></div>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--3"></div>
					<div class="grim__item-content">
						<div class="grim__item-inner">
							<button class="menu-trigger menu-trigger--close">- close</button>
						</div>
					</div>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--4"></div>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--5"></div>
					<a href="#" class="grim__link grim__item-content">
						<div class="grim__item-inner">
							<h3 class="grim__item-title">Home</h3>
						</div>
					</a>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--6"></div>
					<div class="grim__item-img grim__item-img--1" style="background-image: url(static/images/1.jpg);"></div>
					<a href="${pageContext.request.contextPath}/myLibrary" class="grim__link grim__item-content">
						<div class="grim__item-inner">
							<h3 class="grim__item-title">馆舍风貌</h3>
							<span class="grim__item-desc">Lift your spirits</span>
						</div>
					</a>
					<div class="grim__item-bg grim__item-bg-cover grim__item-bg--6"></div>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--7"></div>
					<div class="grim__item-img grim__item-img--2" style="background-image: url(static/images/2.jpg);"></div>
					<a href="${pageContext.request.contextPath}/newBookIntro" class="grim__link grim__item-content">
						<div class="grim__item-inner">
							<h3 class="grim__item-title">新书推荐</h3>
							<span class="grim__item-desc">Find yourself</span>
						</div>
					</a>
					<div class="grim__item-bg grim__item-bg-cover grim__item-bg--7"></div>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--8"></div>
					<div class="grim__item-img grim__item-img--3" style="background-image: url(static/images/3.jpg);"></div>
					<a href="${pageContext.request.contextPath}/borrowGuidence" class="grim__link grim__item-content">
						<div class="grim__item-inner">
							<h3 class="grim__item-title">入馆须知</h3>
							<span class="grim__item-desc">Uncover beauty</span>
						</div>
					</a>
					<div class="grim__item-bg grim__item-bg-cover grim__item-bg--8"></div>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--9"></div>
					<div class="grim__item-img grim__item-img--4" style="background-image: url(static/images/4.jpg);"></div>
					<a href="${pageContext.request.contextPath}/personalCenter" class="grim__link grim__item-content">
						<div class="grim__item-inner">
							<h3 class="grim__item-title">个人中心</h3>
							<span class="grim__item-desc">Feel nature</span>
						</div>
					</a>
					<div class="grim__item-bg grim__item-bg-cover grim__item-bg--9"></div>
				</div>
				<div class="grim__item">
					<div class="grim__item-bg grim__item-bg--10"></div>
					<div class="grim__item-img grim__item-img--5" style="background-image: url(static/images/5.jpg);"></div>
					<a href="${pageContext.request.contextPath}/bookCallno" class="grim__link grim__item-content">
						<div class="grim__item-inner">
							<h3 class="grim__item-title">图书检索</h3>
							<span class="grim__item-desc">Explore your limits</span>
						</div>
					</a>
					<div class="grim__item-bg grim__item-bg-cover grim__item-bg--10"></div>
				</div>
			</nav>
		</main>
<script>
//退出系统
$("#logout").click(function(){
	 if (confirm("确认退出吗？")) {
			$.ajax({
				url : "${pageContext.request.contextPath}/reader/logout",
				method : "post",
				success : function(response) {				
						window.location = "${pageContext.request.contextPath}/reader/returnLogin";
				},
				error : function() {
					console.log("请求发送失败...");
				}
			});
	 }
});
</script>
	</body>
</html>