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
			</a> <a href="#" class="jq22-palace-grid">
				<div class="jq22-palace-grid-text">
					<h2>
						<font color="#000000" size="4">借阅详情</font>
					</h2>
				</div>
			</a>
		</div>
	</div>
	<div class="jq22-white-box jq22-white-box-clear" style="background:white;height:800px" >
		<div class="jq22-flex b-line">
			<div class="jq22-flex-box"  style="padding-left:200px">
				<font color="#000000" size="4">借阅记录</font>
			</div>
			<div class="jq22-arrow">
				<span>查看全部</span>
			</div>	
		</div>
	  <div class="col-lg-11 col-lg-offset-1" >
			<table class="table table-hover" id="reader_table">
				<thead style="background-color: #2F4F4F; color: white">
					<tr>
						<th><input type="checkbox" id="check_all"></th>
						<th>图书ID</th>
						<th>用户ID</th>
						<th>书名</th>
						<th>借阅时间</th>
						<th>到期时间</th>
						<th>归还时间</th>
						<th>续借状态</th>
						<th>借阅状态</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>

				</tbody>
			</table>  
   </div>
   	<div class="row">
		<!-- 分页文字信息 -->
		<div class="col-lg-6 col-lg-offset-1" id="page_info_area"></div>
		<!-- 分页条信息 -->
		<div class="col-lg-6 col-lg-offset-4" id="page_nav_area"></div>
	</div>
</div>


	
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
		<a href="#" class="jq22-tabBar-item " >
                <span class="jq22-tabBar-item-icon" id="readerLogout">
                    <i class="icon icon-credit"></i>
                </span>
			 <span class="jq22-tabBar-item-text" >退出</span>
		</a>
		
	</footer>
</section>
  <script>
  $(function () {
		to_page(1);
	});
	function to_page(pn) {
	    $.ajax({
	        url:"${pageContext.request.contextPath}/readerBorrowDetails",
	        data:{"pn":pn},
	        type:"GET",
	        success:function (result) {
	             console.log(result);
	            //1、解析并显示借阅信息
	            build_reader_table(result);
	            //2、解析并显示分页信息
	            build_page_info(result);
	            //3、解析显示分页条
	           build_page_nav(result);
	        }
	    });
	}

	//构建图书信息
	function build_reader_table(result) {
	    //清空table表格
	    $("#reader_table tbody").empty();
	    var reader = result.objectMap.mylist.list;
	    $.each(reader,function (index, item) {
	        var checkBoxTd = $("<td></td>").append("<input type='checkbox' class='check_item'/>");
	        var ii = $("<td></td>").append(item.bookId);
	        var uid = $("<td></td>").append(item.readerId);

	        var aa = $("<a></a>").attr("href","${pageContext.request.contextPath}"+"/readerBookDetail?bookCallno="+item.book.bookCallno).append(item.book.bookDesc.bookName);
	        var id= $("<td></td>").append(aa);
	        var brandTd = $("<td></td>").append(item.borrowDate);
	        var modelTd = $("<td></td>").append(item.returnDate);
	        var priceTd = $("<td></td>").append(item.returnReadate);
	        if(item.renewState == 0)
	            var nameTd = $("<td></td>").append("否");
	        else
	        	var nameTd = $("<td></td>").append("是");
	        //判断书是否归还
	        if(item.borrowState == 0)
	        	var borrowId = $("<td></td>").append("正常");
	        else 
	        	var borrowId = $("<td></td>").append("逾期");
	        
	        if(item.returnReadate ==null || item.returnReadate==""){
	        	//判断书是否续借
	        	if(item.borrowState==null || item.borrowState==0){
	        		var editBtn = $("<button type='button'  class='btn btn-info btn-sm' data-toggle='modal' data-target='.login'></button>")
		            .append($("<span></span>").addClass("glyphicon glyphicon-queen")).append("续借");
		  	        editBtn.attr("edit_id",item.readerId);
	        	}
	        	
	  	        var delBtn = $("<button></button>").addClass("btn btn-warning btn-sm delete_btn")
	  	            .append($("<span></span>").addClass("glyphicon glyphicon-pawn")).append("还书");
	  	        delBtn.attr("del_id",item.readerId);
	  	      //为两个按钮添加点击事件
		        editBtn.click(function(){
		        	renewBook(item.readerId,item.borrowDate,item.bookId,result.objectMap.mylist.pageNum);
		        });
		        delBtn.click(function(){
		        	delBook(item.readerId,item.borrowDate,item.bookId,result.objectMap.mylist.pageNum);
		        });
	        	
	        }
	        else{
	        	var editBtn="";
	        	var delBtn="";
	        }
	        	 
	        var btnTd =$("<td></td>").append(editBtn).append(" ").append(delBtn);
	        //append方法执行完成以后还是返回原来的元素，所以可以继续append
	        $("<tr></tr>")
	        	.append(checkBoxTd)
	        	.append(ii)
	            .append(uid)
	            .append(id)
	            .append(brandTd)
	            .append(modelTd)
	            .append(priceTd)
	            .append(nameTd)
	            .append(borrowId)
	            .append(editBtn)
	            .append(delBtn)
	            .appendTo("#reader_table tbody");
	    });
	}
	

	//解析构建显示分页信息
	function build_page_info(result) {
	    //先清空
	    $("#page_info_area").empty();
	    $("#page_info_area").append("当前第"+result.objectMap.mylist.pageNum+"页，总共"+
	    	result.objectMap.mylist.pages+"页，共"+
	    	result.objectMap.mylist.total+"条记录");
	    totalRecord = result.objectMap.mylist.total;
	    currentPage = result.objectMap.mylist.pageNum;
	}

	//解析构建分页条信息，点击进行跳转下一页
	function build_page_nav(result) {
	 //page_nav_area
	 $("#page_nav_area").empty();
	 var ul = $("<ul></ul>").addClass("pagination");

	 //构建元素
	 var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
	 var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
	 if (result.objectMap.mylist.hasPreviousPage == false) {
	     firstPageLi.addClass("disabled");
	     prePageLi.addClass("disabled");
	 }else {
	     //为元素添加翻页事件
	     firstPageLi.click(function () {
	         to_page(1);
	     });
	     prePageLi.click(function () {
	         to_page(result.objectMap.mylist.pageNum -1);
	     });
	 }

	 var nextPageLi = $("<li></li>").append($("<a style=></a>").append("&raquo;"));
	 var lastPageLi = $("<li></li>").append($("<a ></a>").append("末页").attr("href","#"));
	 if (result.objectMap.mylist.hasNextPage == false) {
	     nextPageLi.addClass("disabled");
	     lastPageLi.addClass("disabled");
	 }else {
	     nextPageLi.click(function () {
	         to_page(result.objectMap.mylist.pageNum +1);
	     });
	     lastPageLi.click(function () {
	         to_page(result.objectMap.mylist.pages);
	     });
	 }

	 ul.append(firstPageLi).append(prePageLi);
	 $.each(result.objectMap.mylist.navigatepageNums,function (index, item) {
	     var numLi = $("<li></li>").append($("<a></a>").append(item));
	     if (result.objectMap.mylist.pageNum == item) {
	         numLi.addClass("active");
	     }
	     numLi.click(function () {
	         to_page(item);
	     });
	     ul.append(numLi);
	 });

	 ul.append(nextPageLi).append(lastPageLi);

	 //把ul加入到nav
	 var navEle = $("<nav></nav>").append(ul);
	 navEle.appendTo("#page_nav_area");
	};

function delBook(readerId,borrowDate,bookId,page){
		  if(confirm("确定还书吗？")){
	   	   $.ajax({
				  url: "${pageContext.request.contextPath}/reader/retuenBook",
	              method: "post",
				  data:{
					 "readerId":readerId,
					 "borrowDate":borrowDate,
					 "bookId":bookId
				 },
				 success:function(response){
					 if(response.errorCode=="100"){
						 alert("还书成功！");
						 to_page(page);
					 }else{
						alert("还书失败！");
					    to_page(page);
					 }
						 	 
				 },
				 error:function(){
					 console.log("请求发送失败...");
				 }
			 });
	      }
	      else
	   	   return false;
	   	
	};
function renewBook(readerId,borrowDate,bookId,page){
  if(confirm("确认续借吗？")){
  	   $.ajax({
	    	 url: "${pageContext.request.contextPath}/reader/renewBook",
             method: "post",
			  data:{
				  "readerId":readerId,
			      "borrowDate":borrowDate,
				   "bookId":bookId
			 },
			 success:function(response){
				 if(response.errorCode=="100"){
					 alert("续借成功！");
					 to_page(page);
				 }else{
					alert("续借失败,请确定您的当前状态是否正常或者您借阅的书为新书！");
				    to_page(page);
				 }
					 	 
			 },
			 error:function(){
				 console.log("请求发送失败...");
			 }
		 });
     }
     else
  	   return false;
  	
};	 
  //退出系统
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
  
</script>
</body>

</html>