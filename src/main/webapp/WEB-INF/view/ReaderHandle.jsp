<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>读者业务处理</title>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery.ss.menu.js"></script>
    <!-- 引入bootstrap 样式文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/ss-menu.css">
     <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/htmleaf.css">
</head>
<body>
	<!--Start Side Sticky Menu-->
<nav class="ss-menu ">
	<ul>
	    <li><a href="${pageContext.request.contextPath}/admin/adminHome"><i class="glyphicon glyphicon-home fa fa-android"></i>首页</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/readerHandle"><i class="glyphicon glyphicon-user fa fa-android"></i>读者账号注册</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/infoManage"><i class="glyphicon glyphicon-film fa fa-bar-chart"></i>读者信息管理 </a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/handleFine"><i class="glyphicon glyphicon-pencil fa fa-heartbeat"></i>罚款处理</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/bookShelf"><i class="glyphicon glyphicon-align-center fa fa-bank"></i>图书上架</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/bookManage"><i class="glyphicon glyphicon-folder-open fa fa-cc-paypal"></i> 图书管理</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/renewManege"><i class="glyphicon glyphicon-grain fa fa-bookmark-o"></i>借阅管理</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/printReport"><i class="glyphicon glyphicon-download-alt fa fa-bookmark-o"></i> 打印报表</a></li>
	    <li id="logout"><a href="#"><i class="glyphicon glyphicon-log-out fa fa-bookmark-o"></i>退出</a></li>
	</ul>
</nav>
	<!--End Side Sticky Menu-->
<div class="htmleaf-container" style="height:50px" >
		<header class="htmleaf-header">
			<h1>后台管理<span>LMS Administrator</span></h1>
		</header>
</div>

<div class="col-ld-10 " id="readerService" style="padding-left:120px;padding-top:80px">
<br><br><li class="col-ld-1 glyphicon glyphicon-heart-empty">读者账号注册</li><br><br>
<form class="form-horizontal" >
	<div class="row col-md-3 col-md-offset-2">
	  <div class="form-group">
	    <label>学号</label>
	    <input type="text" class="form-control" name="readerId" id="readerId" placeholder="学号">
	    <span id="readerIdJudge"></span>
	  </div>
	  <div class="form-group">
	    <label >姓名</label>
	    <input type="text" class="form-control" id="userName" name="userName" placeholder="姓名">
	    <span id="userNameJudge"></span>
	  </div>
	  <div class="form-group">
	    <label>性别</label>
	    <select class="form-control" name="readerSex" id="readerSex">
	      <option value="0">女</option>
	      <option value="1">男</option>
	    </select>
	  </div>
	  <div class="form-group">
	    <label >单位</label>
	    <select class="form-control" name="unitId" id="unitList">
	    </select>
	  </div>
	</div>
	<div class="row col-md-3 col-md-offset-1">
	  <div class="form-group">
	    <label >电话号码</label>
	    <input type="text" class="form-control" id="readerPhone" name="readerPhone" placeholder="电话号码">
	    <span id="readerPhoneJudge"></span>
	  </div>
	  <div class="form-group">
	    <label >邮箱</label>
	    <input type="text" class="form-control" id="readerEmail" name="readerEmail" placeholder="邮箱">
	    <span id="readerEmailJudge"></span>
	  </div>
	  
	  <div class="form-group">
	    <label >读者状态</label>
	    <select class="form-control" name="readerState" >
	     <option vlaue="正常">正常</option>	
	     <option value="不正常">不正常</option>
	     </select>
	  </div>
	   <div class="form-group">
	    <label >读者类型</label>
	    <select class="form-control" name="readerTypeId" id="readerTypeList">
	    </select>
	  </div>
	  </div>
	<div  style="padding-top:350px;padding-left:420px">
     <br><br>
     <button type="button" class="btn btn-info btn-lg" id="addReader">添加</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <button type="reset" class="btn btn-primary btn-lg">重置</button>
    </div>
</form>
</div>
<div class="jumbotron jumbotron-fluid bg-dark" th:replace="_fragments::footer" style="background-color:#2F4F4F; margin-top: 100%; width:100%;">
        <div class="container-lg" style="color: white">
            <div class="row ">
                <div class="col-lg-auto footer-div">
                    <h4 class="me-h4 text-center">联系我们</h4>
                    <div class="container text-center">
                        <a href="#" class="me-a text-center " style="text-decoration:none;">Email：1457542968@qq.com</a>
                        <br>
                        <a href="#" class="me-a text-center" style="text-decoration:none;">QQ：1457542968</a>
                    </div>
                </div>
                <div class="col-lg-auto footer-div" style="border: none !important;">
                    <div class="container text-center">
                        <h4 class="me-h4 text-center">LMS</h4>
                        <p class="small text-light summary-text">图书馆管理系统...</p>
                    </div>

                </div>
            </div>
            <div class="divier"></div>
            <div class="small text-center">Copyright  2020 - 2020 LMS Designed by HW</div>
        </div>
 </div>
<script>
$(document).ready(function(){
	 
  $(".ss-menu").ssMenu();
	 	
}); 
//页面加载时获取出版社，馆藏，中图分类，借阅类型信息
$(function(){
	unit();
	readerType();
	
});	
//出版社信息获取
function readerType(){
	$.ajax({
        url:"${pageContext.request.contextPath}/getReaderTypeList",
        type:"GET",
        success:function (result) {
            build_readerType(result);
        }
    });
};
function build_readerType(result){
	 var readerType =  result.objectMap.mylist;
	 $(".readerTypeOption").remove();
	 $.each(readerType,function (index, readerType) {
		 var op = $("<option></option>").append(readerType.readerTypeName).addClass("readerTypeOption");
		 op.val(readerType.readerTypeId);
		 $("#readerTypeList").append(op);
	 });
};
//获区unit信息
function unit(){
	$.ajax({
        url:"${pageContext.request.contextPath}/getUnitList",
        type:"GET",
        success:function (result) {
            build_unit(result);
        }
    });
};
function build_unit(result){
	 var unit =  result.objectMap.mylist;
	 $(".unitOption").remove();
	 $.each(unit,function (index, unit) {
		 var op = $("<option></option>").append(unit.unitName).addClass("unitOption");
		 op.val(unit.unitId);
		 $("#unitList").append(op);
	 });
};
//为各输入框添加change事件

//用户名
$("#userName").change(function(){
	var reg = /(^[\u4E00-\u9FA5]{2,8}$)|(^[a-zA-Z_-]{3,16})/;
	var ans = $("#userName").val();
	if(reg.test(ans)){
		$("#userNameJudge").text("");
	}else{
		$("#userNameJudge").text("用户名必须是2-8位中文或3-16位英文").css({"color": "red"});
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
$("#readerId").change(function(){
	var reg = /^\d{8,12}$/;
	var readerId = $("#readerId").val();
	if(reg.test(readerId)){
		$("#readerIdJudge").text("")
	}else{
		$("#readerIdJudge").text("用户ID长度为8到12位").css({"color": "red"});
		return false;
	}
	$.ajax({
		url:"${pageContext.request.contextPath}/reader/readerIdCheck",
		data:{"readerId":$("#readerId").val()},
		type:"POST",
		success:function(result){
			
		if(	result.errorCode=="100")
			$("#readerIdJudge").text("");
		else
			$("#readerIdJudge").text("改用户ID已存在").css({"color": "red"});
		}
	});
})
//点击添加按钮，发送ajax请求
$("#addReader").click(function(){
	
	
	$.ajax({
        url:"${pageContext.request.contextPath}/admin/addReader",
        type:"POST",
        data:$("#readerService form").serialize(),
        success:function (result) {
        	console.log(result);
            if(result.errorCode=="100"){
            	alert("添加成功！");
            	window.location="${pageContext.request.contextPath}/admin/readerHandle";
            }
            else
            {
            	var errors = result.objectMap.fieldErrors;
            	 $.each(errors,function (index,errors){
            		 $("#"+errors.field+"Judge").text(errors.defaultMessage).css({"color": "red"});
            	 });
            }
        }
    });
});
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