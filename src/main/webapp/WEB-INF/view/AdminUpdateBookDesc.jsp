<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改图书信息</title>
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

<div class="col-ld-10 " id="page_nav_area" style="padding-left:120px;padding-top:80px">
<br><br><li class="col-ld-1 glyphicon glyphicon-heart-empty">修改图书信息</li><br><br>
<form class="form-horizontal"  action="${pageContext.request.contextPath}/admin/updateBookDesc" method="post"  enctype="multipart/form-data" >
	<div class="row col-md-3 col-md-offset-2">
	  <div class="form-group">
	   <input type="hidden" class="form-control" name="bookCallno" id="bookCallno" value="${bookDesc.bookCallno }">
	    <label >书 名</label>
	    <input type="text" class="form-control" name="bookName" id="bNameChange" value="${bookDesc.bookName }">
	    <span class="bookName"></span>
	  </div>
	  <div class="form-group">
	    <label>图书简介</label>
	    <input type="text" class="form-control" name="bookIntro" id="bIntroChange" value="${bookDesc.bookIntro }">
	    <span class="bookIntro"></span>
	  </div>
	  <div class="form-group">
	    <label>作者:多个作者请用/分开</label>
	    <input type="text" class="form-control" name="writer" id="wChange" value="${writers }">
	    <span class="writer"></span>
	  </div>
	  <div class="form-group">
	    <label >价格</label>
	    <input type="text" class="form-control" name="bookPrice" id="bPriceChange" value="${bookDesc.bookPrice }">
	    <span class="bookPrice"></span>
	  </div>
	  <div class="form-group">
	    <label >图片</label>
	    <input type="file" class="form-control" id="bImageChange" name="bookImage" >
	    <span class="bookImage"></span>
	  </div>
	  <div class="form-group">
	    <label >可供借出数</label>
	    <input type="number" class="form-control" min="0" id="aLoanChange" name="avaliableLoan" value="${bookDesc.avaliableLoan}">
	    <span class="avaliableLoan"></span>
	  </div>
	  <div class="form-group">
	    <label >中图分类</label>
	    <select class="form-control" name="clcId" id="clcList">
			
	     </select>
	  </div>
	  <div class="form-group">
	    <label >借阅类型</label>
	    <select class="form-control" name="borrowTypeId" id="borrowTypeList">
	         
	     </select>
	  </div>
	</div>
	<div class="row col-md-3 col-md-offset-1">
	  <div class="form-group">
	    <label >索书号</label>
	    <input type="text" class="form-control" name="bookCallnoChange" id="bCallnoChange" value="${bookDesc.bookCallno }" readonly="readonly">
	    <span class="bookCallno"></span>
	  </div>
	  <div class="form-group">
	    <label >ISBN号</label>
	    <input type="text" class="form-control" name="isbn" id="isbnchange"  value="${bookDesc.isbn }">
	    <span class="ISBN"></span>
	  </div>
	  <div class="form-group">
	    <label >字数</label>
	    <input type="number" class="form-control" min="1000" name="wordNumber" id="wNumberChange"  value="${bookDesc.wordNumber }">
	     <span class="wordNumber"></span>
	  </div>
	  <div class="form-group">
	    <label >出版时间</label>
	    <input type="date" class="form-control" name="publishDate" id="pDataChange" value="${bookDesc.publishDate }">
	    <span class="publishDate"></span>
	  </div>
	  <div class="form-group">
	    <label >馆藏时间</label>
	    <input type="date" class="form-control"  name="collectionDate" id="cDateChange" value="${bookDesc.collectionDate }">
	    <span class="collectionDate"></span>
	  </div>
	  <div class="form-group">
	    <label >馆藏数</label>
	    <input type="number" class="form-control" min="1" name="collectionNumber" id="cNumberChange" value="${bookDesc.collectionNumber }">
	    <span class="collectionNumber"></span>
	  </div>
	  <div class="form-group">
	    <label >出版社</label>
	    <select class="form-control" name="pressId" id="pressList">
	        
	     </select>
	  </div>
	   <div class="form-group">
	    <label >馆藏地</label>
	    <select class="form-control" name="branchId" id="branchList">
	       
	    </select>
	  </div>
	  </div>
	<div style="padding-top:650px;padding-left:420px" >
     <br><br>
     <button type="submit" id="submitMess" class="btn btn-info btn-lg">修改</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
	var id = $("#bookCallno").val();
	
	press();
	branch();
	clc();
	borrowType();
	
});	
//出版社信息获取
function press(){
	$.ajax({
        url:"${pageContext.request.contextPath}/pressList",
        type:"GET",
        success:function (result) {
        	console.log(result);
            build_press(result);
        }
    });
};
function build_press(result){
	 var press =  result.objectMap.mylist;
	 $(".pressOption").remove();
	 $.each(press,function (index, press) {
		 if(press.pressId == "${bookDesc.pressId}")
		 var op = $("<option selected='selected'></option>").append(press.pressName).addClass("pressOption");
		 else
			 var op = $("<option></option>").append(press.pressName).addClass("pressOption");
		 op.val(press.pressId);
		 $("#pressList").append(op);
	 });
};
//分馆信息获取
function branch(){
	$.ajax({
        url:"${pageContext.request.contextPath}/branchList",
        type:"GET",
        success:function (result) {
        	console.log(result);
            build_branch(result);
        }
    });
};
function build_branch(result){
	 var branch =  result.objectMap.mylist;
	 $(".branchOption").remove();
	 $.each(branch,function (index, branch) {
		 if(branch.branchId = "${bookDesc.branchId }")
		    var op = $("<option selected='selected'></option>").append(branch.branchName).addClass("branchOption");
		 else
			 var op = $("<option></option>").append(branch.branchName).addClass("branchOption");
		 op.val(branch.branchId);
		 $("#branchList").append(op);
	 });
};
//借阅类型信息获取
function borrowType(){
	$.ajax({
        url:"${pageContext.request.contextPath}/borrowTypeList",
        type:"GET",
        success:function (result) {
        	console.log(result);
            build_borrowType(result);
        }
    });
};
function build_borrowType(result){
	 var borrowType =  result.objectMap.mylist;
	 $(".borrowTypeOption").remove();
	 $.each(borrowType,function (index, borrowType) {
		 if(borrowType.borrowTypeId =="${bookDesc.borrowTypeId }")
		    var op = $("<option selected='selected'></option>").append(borrowType.borrowTypeName).addClass("borrowTypeOption");
		 else
			 var op = $("<option></option>").append(borrowType.borrowTypeName).addClass("borrowTypeOption");
		 op.val(borrowType.borrowTypeId);
		 $("#borrowTypeList").append(op);
	 });
};
//中图分类
function clc(){
	$.ajax({
        url:"${pageContext.request.contextPath}/clcList",
        type:"GET",
        success:function (result) {
        	console.log(result);
            build_clc(result);
        }
    });
};
function build_clc(result){
	 var clc =  result.objectMap.mylist;
	 $(".clcOption").remove();
	 $.each(clc,function (index, clc) {
		 if(clc.clcId !="${bookDesc.clcId }")
			 var op = $("<option></option>").append(clc.clcName).addClass("clcOption");
		 else
		    var op = $("<option selected='selected'></option>").append(clc.clcName).addClass("clcOption");
		 op.val(clc.clcId);
		 $("#clcList").append(op);
	 });
};

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

//表格信息前端校验
//书名
$("#bNameChange").change(function(){
	var c = $("#bNameChange").val();
	if(c==""){
		$(".bookName").text("书名不能为空").css({"color": "red"});
		$("#submitMess").attr('disabled',true)
	}
	else{
		$(".bookName").text("");
		$("#submitMess").attr('disabled',false)
	}
});

//图书简介
$("#bIntroChange").change(function(){
	var c = $("#bIntroChange").val();
	if(c ==""){
		$(".bookIntro").text("图书简介不能为空").css({"color": "red"});
		$("#submitMess").attr('disabled',true)
	}
	else{
		$(".bookIntro").text("");	
		$("#submitMess").attr('disabled',false)
	}
		
});
//作者
$("#wChange").change(function(){
	var c = $("#wChange").val();
	if(c==""){
		$(".writer").text("作者不能为空").css({"color": "red"});
		$("#submitMess").attr('disabled',true)
	}	
	else{
		$("#submitMess").attr('disabled',false)
		$(".writer").text("");	
	}
});
//价格
$("#bPriceChange").change(function(){
	var reg  =/^\d+(\.\d{1,2})?$/;
	var ans = $("#bPriceChange").val();
	if(reg.test(ans)){
		$(".bookPrice").text("");
		$("#submitMess").attr('disabled',false);
	}else{
		$(".bookPrice").text("价格输入有误").css({"color": "red"});
		$("#submitMess").attr('disabled',true);
	}
		
});
//图片
$("#bImageChange").change(function(){
	var ans = $("#bImageChange").val();
	if(ans !=""){
		$(".bookImage").text("");
		$("#submitMess").attr('disabled',false);
	}else{
		$(".bookImage").text("图片不能为空").css({"color": "red"});
		$("#submitMess").attr('disabled',true);
	}
});

//可供借出数量
$("#aLoanChange").change(function(){
	var ans = $("#aLoanChange").val();
	var reg =/^[1-9]*[1-9][0-9]*$/;
	if(reg.test(ans)){
		$(".avaliableLoan").text("");
		$("#submitMess").attr('disabled',false);
	}else{
		$(".avaliableLoan").text("请正确输入一个正整数").css({"color": "red"});
		$("#submitMess").attr('disabled',true);
	}
});
//索书号
$("#bCallnoChange").change(function(){
	var ans = $("#bCallnoChange").val();
	var reg =  /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z.]{4,10}$/;
	if(reg.test(ans)){
		$(".bookCallno").text("");
		$.ajax({
	        url:"${pageContext.request.contextPath}/bookCallnoCheck",
	        data:{"bookCallno":ans},
	        type:"POST",
	        success:function (result) {
	        	 if(result.errorCode=="100"){
	        		 $(".bookCallno").text("");
	        		 $("#submitMess").attr('disabled',false);
	        	 }
	        	 else{
	        		 $("#submitMess").attr('disabled',true);
	        		 $(".bookCallno").text("索书号已存在,不可用").css({"color": "red"}); 
	        	 }  	 
	        }
	    });
	}else{
		$(".bookCallno").text("长度为4-10位").css({"color": "red"});
		$("#submitMess").attr('disabled',true);
	}
});
//ISBN号
$("#isbnchange").change(function(){
	var ans = $("#isbnchange").val();
	if(ans!=""){
		$(".ISBN").text("");
		$("#submitMess").attr('disabled',false);
	}else{
		$(".ISBN").text("ISBN号不能为空").css({"color": "red"});
		$("#submitMess").attr('disabled',true);
	}
});
//出版时间
$("#pDataChange").change(function(){
	var ans =$("#pDataChange").val();
	var ret=$("#cDateChange").val();
	
	//获取当前系统时间（年月日）
	var myDate = new Date();             
	var year=myDate.getFullYear();        //获取当前年
	var month=myDate.getMonth()+1;   //获取当前月
	var date=myDate.getDate();            //获取当前日
	//转换为时间标准格式
	var now=year+'-'+p(month)+"-"+p(date);
	if(now<=ans){
		$(".publishDate").text("不能超过当前时间，请重新输入。").css({"color": "red"});
		$("#submitMess").attr('disabled',true);
	}else{
		$(".publishDate").text("");
		$("#submitMess").attr('disabled',false);
	}
});

function p(s) {
    return s < 10 ? '0' + s: s;
}
//上架时间
$("#cDateChange").change(function(){
	var ans =$("#pDataChange").val();
	var ret=$("#cDateChange").val();
	
	//获取当前系统时间（年月日）
	var myDate = new Date();             
	var year=myDate.getFullYear();        //获取当前年
	var month=myDate.getMonth()+1;   //获取当前月
	var date=myDate.getDate();            //获取当前日
	//转换为时间标准格式
	var now=year+'-'+p(month)+"-"+p(date);
	
	if(ans>ret){
		$(".collectionDate").text("时间输入有误，不能在出版时间前。").css({"color": "red"});
		$("#submitMess").attr('disabled',true);
	}else{
		$(".collectionDate").text("");
		$("#submitMess").attr('disabled',false);
	}
});
</script>
</body>
</html>