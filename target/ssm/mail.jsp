<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css">
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
<title>发送邮件</title>
</head>
<body>
<button id="sendEmail">发送邮件</button>
<script>
$("#sendEmail").click(function(){
	alert("发送邮件");
	//收件人邮箱
	var toEmailAddress="1457542968@qq.com";
	 
	//邮件主题
	var emailTitle="我是邮件主题";
	 
	//邮件内容
	var emailContent="我是小屁屁猪……";
	 
	$.ajax({
	    type:"post",
	    url:"/ssm/sendEmailOwn",
	    data:{
	        "emailTitle":emailTitle,
	        "emailContent":emailContent,
	        "toEmailAddress":toEmailAddress
	    },
	    dataType:"json",
	    success:function(data){
	        if(0 == data.code){
	            alert("邮件发送成功！");
	        } else {
	            alert(data.msg);
	        }
	    },
	    error:function(){
	        alert("数据传送失败！");
	    }
	});

})
</script>
</body>
</html>