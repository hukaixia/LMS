<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>个人中心</title>
<meta
	content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0"
	name="viewport" />
<meta content="yes" name="apple-mobile-web-app-capable" />
<meta content="black" name="apple-mobile-web-app-status-bar-style" />
<meta content="telephone=no" name="format-detection" />
<link href="${pageContext.request.contextPath}/static/bootstrap/css/style.css" rel="stylesheet"
	type="text/css" />
<!-- 引入bootstrap 样式文件 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
<!-- 引入我们自己的首页样式文件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/personal.css">
<!-- 先引入jquery js文件 -->
<script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<section class="jq22-flexView"> <section
		class="jq22-scrollView">
	<div class="jq22-head-read" >
		<div class="jq22-flex" >
			<div class="jq22-flex-box">
				<h2><font color="white">${sessionScope.loginReader.userName}</font></h2>
			</div>
			<div class="jq22-arrow jq22-arrow-one">
				<span ><h4><font color="white">个人中心</font></h4></span>
			</div>
		</div>
	</div>
	<div class="jq22-white-box">
		<div class="jq22-palace jq22-palace-one">
			<a href="#" class="jq22-palace-grid">
				<div class="jq22-palace-grid-text">
					<h2>
						<font color="#000000" size="4">${sessionScope.loginReader.userRole}</font>
					</h2>
				</div>
			</a> <a href="#" class="jq22-palace-grid">
				<div class="jq22-palace-grid-text"  data-toggle="modal" data-target=".login">
					<h2>
						<font color="#000000" size="4">修改个人信息</font>
					</h2>
				</div>
			</a> <a href="${pageContext.request.contextPath}/borrowDetails" class="jq22-palace-grid">
				<div class="jq22-palace-grid-text">
					<h2>
						<font color="#000000" size="4">借阅详情</font>
					</h2>
				</div>
			</a>
		</div>
	</div>
	<div class="jq22-white-box jq22-white-box-clear" style="background:white" >
		<div class="jq22-flex b-line">
			<div class="jq22-flex-box"  style="padding-left:200px">
				<font color="#000000" size="4">基本信息</font>
			</div>
			<div class="jq22-arrow">
				<span>查看全部</span>
			</div>
			
		</div>
		<div class="jq22-flex b-line">
		<article class="col-md-7" style="padding-left:100px;width: 850px">
		<div class="publish" style="padding-left:300px;width: 850px; height:500px">

					   <h4>用户ID:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.loginReader.readerId}</h4> </br>
					   <h4>姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.loginReader.userName}</h4> </br>
					   <c:if test="${sessionScope.loginReader.readerSex == '0' }">
					   <h4>性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;女</h4> </br>
					   </c:if>
					   	<c:if test="${sessionScope.loginReader.readerSex !='0'}">
					   <h4>性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;男</h4> </br>
					   </c:if>
				
					   <h4>单位:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.loginReader.unit.unitName}</h4> </br>
					   <h4>邮箱:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.loginReader.readerEmail}</h4> </br>
					   <h4>电话:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.loginReader.readerPhone}</h4> </br>
					   <h4>状态:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.loginReader.readerState}</h4> </br>
				
		 </div>
		<!-- 分页条信息 -->
		 <div class="col-md-6" id="page_nav_area" style="padding-left:100px"></div>
		</article>
		</div>
	</div>

	<!-- 模态框 -->
	<div class="modal fade login" tabindex="-1" role="dialog">
		 <div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">个人信息</h4>
				</div>
				<form action="${pageContext.request.contextPath}/reader/readerUpdate" method="post"  >
					<div class="modal-body">
						<label for="exampleInputEmail1">用户密码</label> 
						<input type="password" class="form-control" id="readerPswd"  name="userPswd"
						value="${sessionScope.loginReader.userPswd}"   /> 
					    <span id="rreaderPswdJudge"></span>
					</div>
					<div class="modal-body">
						<label for="exampleInputEmail1">确认密码</label> 
						<input type="password" class="form-control" id="rreaderPswd"  name="uuserPswd" 4 /> 
					    <span id="rreaderPswdJudge"></span>
					</div>
					<div class="modal-body">
						<label for="exampleInputEmail1">邮箱</label> 
						<input type="text" class="form-control subcontent"  name="readerEmail" id="readerEmail"
						value="${sessionScope.loginReader.readerEmail}" /> 
						<span id="readerEmailJudge"></span>
					</div>
					<div class="modal-body">
						<label for="exampleInputEmail1">电话</label> 
						<input type="text" class="form-control subcontent"  name="readerPhone"
						value="${sessionScope.loginReader.readerPhone}" /> 
						<span id="readerPhoneJudge"></span>
					</div>
					
					<div class="modal-footer">
						<input class="btn btn-default" data-dismiss="modal" type="button"
							value="关闭" /> <input type="submit" class="btn btn-primary"
							value="修改" />
					</div>
				</form>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	
	<!-- /.modal --> 
	
	</section>
	<footer class="jq22-footer jq22-footer-fixed">
		<a href="${pageContext.request.contextPath}/homePage" class="jq22-tabBar-item ">
                <span class="jq22-tabBar-item-icon">
                    <i class="icon icon-loan"></i>
                </span>
			<span class="jq22-tabBar-item-text">首页</span>
		</a>
		<a href="${pageContext.request.contextPath}/personalCenter" class="jq22-tabBar-item ">
                <span class="jq22-tabBar-item-icon">
                    <i class="icon icon-credit"></i>
                </span>
			<span class="jq22-tabBar-item-text">我的</span>
		</a>

		<a href="${pageContext.request.contextPath}/borrowDetails" class="jq22-tabBar-item ">
                <span class="jq22-tabBar-item-icon">
                    <i class="icon icon-ions"></i>
                </span>
			<span class="jq22-tabBar-item-text">借阅</span>
		</a>
		<a href="${pageContext.request.contextPath}/fineDetails" class="jq22-tabBar-item ">
                <span class="jq22-tabBar-item-icon">
                    <i class="icon icon-ions"></i>
                </span>
			<span class="jq22-tabBar-item-text">罚款</span>
		</a>
		<a href="#" class="jq22-tabBar-item "  id="readerLogout">
                <span class="jq22-tabBar-item-icon">
                    <i class="icon icon-credit"></i>
                </span>
			 <span class="jq22-tabBar-item-text" >退出</span>
		</a>
		
	</footer>
</section>
  <script>
  
  
 $("#readerLogout").click(function(){
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
 //密码
 $("#readerPswd").change(function(){
	 	var reg = /^[0-9a-zA-Z_-]{5,15}/ ;
	 	var ans = $("#readerPswd").val();
	 	if(reg.test(ans)){
	 		$("#readerPswdJudge").text("");
	 	}else{
	 		$("#readerPswdJudge").text("密码长度为5-15位").css({"color": "red"});
	 	}
 });
 //确认密码
 $("#rreaderPswd").change(function(){
	 	var reg = /^[0-9a-zA-Z_-]{5,15}/ ;
	 	var ans = $("#rreaderPswd").val();
	 	var ret = $("#readerPswd").val();
	 	if(ret == ans){
	 		$("#rreaderPswdJudge").text("");
	 	}else{
	 		$("#rreaderPswdJudge").text("两次密码不一致").css({"color": "red"});
	 	}
 });
//电话号码
 $("#readerPhone").change(function(){
 	var reg = /^1[34578]\d{9}$/ ;
 	var ans = $("#readerPhone").val();
 	if(reg.test(ans)){
 		$("#readerPhoneJudge").text("");
 	}else{
 		$("#readerPhoneJudge").text("手机号码格式不正确").css({"color": "red"});
 	}
 });
 //邮箱
 $("#readerEmail").change(function(){
 	var reg =/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/ ;
 	var ans =$("#readerEmail").val();
 	if(reg.test(ans)){
 		$("#readerEmailJudge").text("")
 	}else{
 		$("#readerEmailJudge").text("邮箱格式不正确").css({"color": "red"});
 	}
 });
 //退出系统
 $(".readerLogout").click(function(){
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