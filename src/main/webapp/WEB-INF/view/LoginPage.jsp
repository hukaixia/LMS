<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登入界面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalizepage.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/loginpage.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/sign-up-login.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/inputEffect.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/verifyCode.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/tooltips.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/spop.min.css" />
<script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.pure.tooltips.js"></script>
<script src="${pageContext.request.contextPath}/static/js/verifyCode.js"></script>
<script src="${pageContext.request.contextPath}/static/js/spop.min.js"></script>
<script>	
	(function() {
		// trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
		if (!String.prototype.trim) {
			(function() {
				// Make sure we trim BOM and NBSP
				var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
				String.prototype.trim = function() {
					return this.replace(rtrim, '');
				};
			})();
		}

		[].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {
			// in case the input is already filled..
			if( inputEl.value.trim() !== '' ) {
				classie.add( inputEl.parentNode, 'input--filled' );
			}

			// events:
			inputEl.addEventListener( 'focus', onInputFocus );
			inputEl.addEventListener( 'blur', onInputBlur );
		} );

		function onInputFocus( ev ) {
			classie.add( ev.target.parentNode, 'input--filled' );
		}

		function onInputBlur( ev ) {
			if( ev.target.value.trim() === '' ) {
				classie.remove( ev.target.parentNode, 'input--filled' );
			}
		}
	})();
	
	$(function() {	
		$('#login #login-password').focus(function() {
			$('.login-owl').addClass('password');
		}).blur(function() {
			$('.login-owl').removeClass('password');
		});
		$('#login #register-password').focus(function() {
			$('.register-owl').addClass('password');
		}).blur(function() {
			$('.register-owl').removeClass('password');
		});
		$('#login #register-repassword').focus(function() {
			$('.register-owl').addClass('password');
		}).blur(function() {
			$('.register-owl').removeClass('password');
		});
		$('#login #forget-password').focus(function() {
			$('.forget-owl').addClass('password');
		}).blur(function() {
			$('.forget-owl').removeClass('password');
		});
	});
	
	function goto_register(){
		$("#register-username").val("");
		$("#register-password").val("");
		$("#register-repassword").val("");
		$("#register-code").val("");
		$("#tab-2").prop("checked",true);
	}
	
	function goto_login(){
		$("#login-username").val("");
		$("#login-password").val("");
		$("#tab-1").prop("checked",true);
	}
	
	function goto_forget(){
		$("#forget-username").val("");
		$("#forget-password").val("");
		$("#forget-code").val("");
		$("#tab-3").prop("checked",true);
	}
	
	//读者登录
	function login(){
		var username = $("#login-username").val(),
			password = $("#login-password").val(),
			verifycode = $("#login-verify-code").val(),
			validatecode = null;
		//判断用户名密码是否为空
		if(username == ""){
			$.pt({
        		target: $("#login-username"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"用户名不能为空"
        	});
			return;
		}
		if(password == ""){
			$.pt({
        		target: $("#login-password"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"密码不能为空"
        	});
			return;
		}
		if(verifycode == ""){
			$.pt({
        		target: $("#login-verify-code-canvas"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"验证码不能为空"
        	});
			return;
		}		
		if(timeout_flag){
			$.pt({
        		target: $("#login-verify-code-canvas"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"验证码已经失效"
        	});
			return;
		}
		//用户名只能是15位以下的字母或数字
		var regExp = new RegExp("^[a-zA-Z0-9_]{1,15}$");
		if(!regExp.test(username)){
			$.pt({
        		target: $("#login-username"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"用户名必须为15位以下的字母或数字"
        	});
			return;
		}
		//判断验证码是否正确
		if(verifycode != show_num.join("")){
			$.pt({
        		target: $("#login-verify-code-canvas"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"验证码不正确"
        	});
			return;
		}
		
		//登录
		//调用后台登录验证的方法，发送ajax请求
		$.ajax({
			
			url:"${pageContext.request.contextPath}/reader/login",//请求路径
			data:{"readerId":username,"userPswd":password},//传递的数据
			method:"POST",//请求方法
			success:function(response){//返回成功的回调函数
				if(response.errorCode=="100"){
					  alert("登录成功！");			
					  //跳转到首页
					  window.location="${pageContext.request.contextPath}/homePage"; 
				 }else{
					  alert("登录失败，账号或密码输入错误！");
					  //清除密码
					  $("#login-password").val("");
				 }
			},
			
		});
		
		return false;
	}
	
	//管理员登录
	function register(){
		var username = $("#admin-username").val(),
			password = $("#admin-password").val(),
			flag = false,
			validatecode = null;
		//判断用户名密码是否为空
		if(username == ""){
			$.pt({
        		target: $("admin-username"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"用户名不能为空"
        	});
			flag = true;
		}
		if(password == ""){
			$.pt({
        		target: $("#adminr-password"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"密码不能为空"
        	});
			flag = true;
		}
		
		//用户ID只能是8到12位以下的数字
		//正则表达式
		var regExp = new RegExp("^[0-9_]{1,12}$");
		if(!regExp.test(username)){
			$.pt({
        		target: $("#register-username"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"用户名必须为15位以下的字母或数字"
        	});
			flag = true;
		}
		//管理员登录，发送ajax请求后天验证账号密码是否正确。
		$.ajax({
			url:"${pageContext.request.contextPath}/admin/login",
			data:{"adminId":username,"userPswd":password},
			method:"POST",
			success:function(response){
				if(response.errorCode=="100"){
					  alert("登录成功！");			
					  //跳转到管理员首页
					  window.location="${pageContext.request.contextPath}/admin/adminPage"; 
				 }else{
					  alert("登录失败，账号或密码输入错误！");
					  //清除密码
					  $("#admin-password").val("");
				 }
			}
		});
		
		
	}
	
	//忘记密码,读者找回密码
	function forget(){
		var username = $("#forget-username").val(),
			email = $("#forget-email").val(),
			code = $("#forget-code").val(),
			flag = false,
			validatecode = null;
		//判断用户名密码是否为空
		if(username == ""){
			$.pt({
        		target: $("#forget-username"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"用户名不能为空"
        	});
			flag = true;
		}
		if(email == ""){
			$.pt({
        		target: $("#forget-email"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"邮箱不能为空"
        	});
			flag = true;
		}
		//用户名只能是15位以下的字母或数字
		var regExp = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
		if(!regExp.test(email)){
			$.pt({
        		target: $("#forget-email"),
        		position: 'r',
        		align: 't',
        		width: 'auto',
        		height: 'auto',
        		content:"邮箱格式不正确"
        	});
			flag = true;
		}
		//调用后台方法，发送邮箱找回密码
		$.ajax({
			url:"${pageContext.request.contextPath}/sendEmailForPswd",
			method:"POST",
			data:{"readerId":username,"readerEmail":email},
			success:function(response){
				if(response.errorCode=="100"){
					  alert("邮箱成功发送！");			
				
					//  window.location="${pageContext.request.contextPath}/admin/adminPage"; 
				 }else{
					  alert("邮箱发送失败，请确定你绑定的邮箱是否正确！");
				 }
			}
			
			
		});
		
						
		
	}
	
	
</script>
<style type="text/css">
html{
width: 100%; 
height: 100%;
}

body{
	background-repeat: no-repeat;
	background-position: center center #2D0F0F;
	background-color: #00BDDC;
	background-image: url(/LMS/static/images/snow.jpg);
	background-size: 100% 100%;
}

.snow-container { 
position: fixed; 
top: 0; 
left: 0; 
width: 100%; 
height: 100%; 
pointer-events: none; 
z-index: 100001; 
}
</style>
</head>
<body>
<!-- 雪花背景 -->
	<div class="snow-container"></div>
	<!-- 登录控件 -->
	<div id="login">
		<input id="tab-1" type="radio" name="tab" class="sign-in hidden" checked />
		<input id="tab-2" type="radio" name="tab" class="sign-up hidden" />
		<input id="tab-3" type="radio" name="tab" class="sign-out hidden" />
		<div class="wrapper">
			<!-- 登录页面 -->
			<div class="login sign-in-htm">
				<form class="container offset1 loginform">
					<!-- 猫头鹰控件 -->
					<div id="owl-login" class="login-owl">
						<div class="hand"></div>
						<div class="hand hand-r"></div>
						<div class="arms">
							<div class="arm"></div>
							<div class="arm arm-r"></div>
						</div>
					</div>
					<div class="pad input-container">
						<section class="content">
							<span class="input input--hideo">
								<input class="input__field input__field--hideo" type="text" id="login-username" 
									autocomplete="off" placeholder="请输入用户ID" tabindex="1" maxlength="15" />
								<label class="input__label input__label--hideo" for="login-username">
									<i class="fa fa-fw fa-user icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>
							</span>
							<span class="input input--hideo">
								<input class="input__field input__field--hideo" type="password" id="login-password" placeholder="请输入密码" tabindex="2" maxlength="15"/>
								<label class="input__label input__label--hideo" for="login-password">
									<i class="fa fa-fw fa-lock icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>
							</span>
							<span class="input input--hideo input--verify_code">
								<input class="input__field input__field--hideo" type="text" id="login-verify-code" 
									autocomplete="off" placeholder="请输入验证码" tabindex="3" maxlength="4" />								
								<label class="input__label input__label--hideo" for="login-verify-code">
									<i class="fa fa-fw fa-bell-o icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>								
							</span>
							<canvas class="verify-code-canvas" id="login-verify-code-canvas"></canvas>
						</section>
						
					</div>
					<div class="form-actions">
						<a tabindex="4" class="btn pull-left btn-link text-muted" onclick="goto_forget()">忘记密码?</a>
						<a tabindex="5" class="btn btn-link text-muted" onclick="goto_register()">管理员登录</a>
						<input class="btn btn-primary" type="button" tabindex="3" onclick="login()" value="登录" 
							style="color:white;"/>
					</div>
				</form>
			</div>
			<!-- 忘记密码页面 -->
			<div class="login sign-out-htm">
				<form action="#" method="post" class="container offset1 loginform">
					<!-- 猫头鹰控件 -->
					<div id="owl-login" class="forget-owl">
						<div class="hand"></div>
						<div class="hand hand-r"></div>
						<div class="arms">
							<div class="arm"></div>
							<div class="arm arm-r"></div>
						</div>
					</div>
					<div class="pad input-container">
						<section class="content">
							<span class="input input--hideo">
								<input class="input__field input__field--hideo" type="text" id="forget-username" autocomplete="off" placeholder="请输入用户名"/>
								<label class="input__label input__label--hideo" for="forget-username">
									<i class="fa fa-fw fa-user icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>
							</span>
							
							<span class="input input--hideo">
								<input class="input__field input__field--hideo" type="text" id="forget-email" placeholder="请输入绑定邮箱" />
								<label class="input__label input__label--hideo" for="forget-password">
									<i class="fa fa-fw fa-lock icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>
							</span>
						</section>
					</div>
					<div class="form-actions">
						<a class="btn pull-left btn-link text-muted" onclick="goto_login()">返回登录</a>
						<input class="btn btn-primary" type="button" onclick="forget()" value="找回" 
							style="color:white;"/>
					</div>
				</form>
			</div>
			
			<!-- 管理员登录页面 -->
			<div class="login sign-up-htm">
				<form action="#" method="post" class="container offset1 loginform">
					<!-- 猫头鹰控件 -->
					<div id="owl-login" class="register-owl">
						<div class="hand"></div>
						<div class="hand hand-r"></div>
						<div class="arms">
							<div class="arm"></div>
							<div class="arm arm-r"></div>
						</div>
					</div>
					<div class="pad input-container">
						<section class="content">
							<span class="input input--hideo">
								<input class="input__field input__field--hideo" type="text" id="admin-username" 
									autocomplete="off" placeholder="请输入用户名" maxlength="15"/>
								<label class="input__label input__label--hideo" for="admin-username">
									<i class="fa fa-fw fa-user icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>
							</span>
							<span class="input input--hideo">
								<input class="input__field input__field--hideo" type="password" id="admin-password" placeholder="请输入密码" maxlength="50"/>
								<label class="input__label input__label--hideo" for="admin-password">
									<i class="fa fa-fw fa-lock icon icon--hideo"></i>
									<span class="input__label-content input__label-content--hideo"></span>
								</label>
							</span>
						</section>
					</div>
					<div class="form-actions">
					<a tabindex="4" class="btn btn-link text-muted" onclick="goto_forget()">忘记密码?</a>
					<a tabindex="5" class="btn pull-left btn-link text-muted" onclick="goto_login()">读者登录</a>
						<input class="btn btn-primary" type="button" onclick="register()" value="登录" 
							style="color:white;"/>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>