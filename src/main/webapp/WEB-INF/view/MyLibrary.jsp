<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的图书馆</title>
 <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/pinterest_grid.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/pubu.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/default.css">
<style type="text/css">
		#gallery-wrapper {
		position: relative;
		max-width: 75%;
		width: 75%;
		margin:50px auto;
		}
		img.thumb {
		width: 100%;
		max-width: 100%;
		height: auto;
		}
		.white-panel {
		position: absolute;
		background: white;
		border-radius: 5px;
		box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
		padding: 10px;
		}
		.white-panel h1 {
		font-size: 1em;
		}
		.white-panel h1 a {
		color: #A92733;
		}
		.white-panel:hover {
		box-shadow: 1px 1px 10px rgba(0,0,0,0.5);
		margin-top: -5px;
		-webkit-transition: all 0.3s ease-in-out;
		-moz-transition: all 0.3s ease-in-out;
		-o-transition: all 0.3s ease-in-out;
		transition: all 0.3s ease-in-out;
		}
	</style>
</head>
<body>
<section id="gallery-wrapper">
<li><a href="${pageContext.request.contextPath}/homePage"><i class="glyphicon glyphicon-home fa fa-android"></i>返回首页</a></li>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/01.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>图书馆</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/02.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>图书馆</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/03.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>图书馆</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/04.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>图书馆</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/05.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>图书馆</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/06.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>图书馆</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/07.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>图书馆</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/08.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>嘉庚湖</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/09.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>景</p>
		</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/10.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>夜景</p>
		</article>
			</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/11.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>夜景</p>
		</article>
			</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/12.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>景</p>
		</article>
			</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/13.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>景</p>
		</article>
			</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/14.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>景</p>
		</article>
			</article>
		<article class="white-panel">
			<img src="${pageContext.request.contextPath}/static/images/15.jpg" class="thumb">
			<h1><a href="#">集美大学</a></h1>
	  		<p>嘉庚湖</p>
		</article>
    </section>
	<script src="js/pinterest_grid.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#gallery-wrapper").pinterest_grid({
				no_columns: 4,
                padding_x: 10,
                padding_y: 10,
                margin_bottom: 50,
                single_column_breakpoint: 700
			});
			
		});
	</script>
</body>
</html>