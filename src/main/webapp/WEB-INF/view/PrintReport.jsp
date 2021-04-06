<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>打印报表</title>
<script
	src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/static/js/jquery.ss.menu.js"></script>
<!-- 引入bootstrap 样式文件 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/ss-menu.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/htmleaf.css">
</head>
<body>
	<!--Start Side Sticky Menu-->
	<nav class="ss-menu ">
	<ul>
		<li><a href="${pageContext.request.contextPath}/admin/adminHome"><i
				class="glyphicon glyphicon-home fa fa-android"></i>首页</a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/readerHandle"><i
				class="glyphicon glyphicon-user fa fa-android"></i>读者业务办理</a></li>
		<li><a href="${pageContext.request.contextPath}/admin/infoManage">
			 <i
				class="glyphicon glyphicon-film fa fa-bar-chart"></i>读者信息管理
		</a></li>
		<li><a href="${pageContext.request.contextPath}/admin/handleFine"><i
				class="glyphicon glyphicon-pencil fa fa-heartbeat"></i>罚款处理</a></li>
		<li><a href="${pageContext.request.contextPath}/admin/bookShelf"><i
				class="glyphicon glyphicon-align-center fa fa-bank"></i>图书上架</a></li>
		<li><a href="${pageContext.request.contextPath}/admin/bookManage"><i
				class="glyphicon glyphicon-folder-open fa fa-cc-paypal"></i> 图书管理</a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/renewManege"><i
				class="glyphicon glyphicon-grain fa fa-bookmark-o"></i> 借阅管理</a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/printReport"><i
				class="glyphicon glyphicon-download-alt fa fa-bookmark-o"></i> 打印报表</a></li>
		<li id="logout"><a href="#"><i
				class="glyphicon glyphicon-log-out fa fa-bookmark-o"></i>退出</a></li>
	</ul>
	</nav>
	<!--End Side Sticky Menu-->
	<div class="htmleaf-container" style="height: 50px">
		<header class="htmleaf-header">
		<h1>
			后台管理<span>LMS Administrator</span>
		</h1>
		</header>
	</div>
	<div class="container col-lg-11 col-md-offset-1"
		style="padding-top: 90px">
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1" style="width: 1500px">
			<form class="navbar-form navbar-left">
				<div class="row">
					<label>ID: <input type="text"
						style="width: 150px; height: 30px" name="searchContent"
						id="hideSearch" class="form-control" placeholder="请输入ID" />
					</label>
					&nbsp;&nbsp;&nbsp;
					<label>单位:<select class="form-control" name="unitId" id="unitList">
							<option value="">--请选择--</option>
					</select> &nbsp;&nbsp;&nbsp;
                    </label>
					 <label>开始时间: 
					<input type="date" name="strartDate" id="startDate" />
					</label> 
					&nbsp;&nbsp;&nbsp;
					<label>结束时间:
					<input type="date" name="endDate" id="endDate" />
					</label>
					&nbsp;&nbsp;&nbsp;
					<button type ="button" class="btn btn-info  glyphicon glyphicon-search">搜索</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="button" id="printReport" class="btn btn-warning ">打印报表</button>
				</div>
			</form>
		</div>
		   </br>
	</div>
	<div class="row">
		<div class="col-lg-11 col-lg-offset-1">
			<table class="table table-hover" id="reader_table">
				<thead style="background-color: #74777b; color: white">
					<tr>
						<th><input type="checkbox" id="check_all"></th>
						<th>图书ID</th>
						<th>用户名</th>
						<th>用户ID</th>
						<th>角色</th>
						<th>书名</th>
						<th>借阅时间</th>
						<th>到期时间</th>
						<th>归还时间</th>
						<th>续借状态</th>
					</tr>
				</thead>
				<tbody>

				</tbody>
			</table>
		</div>
	</div>
	<!-- 分页 -->
	<div class="row">
		<!-- 分页文字信息 -->
		<div class="col-lg-6 col-lg-offset-1" id="page_info_area"></div>
		<!-- 分页条信息 -->
		<div class="col-lg-6 col-lg-offset-4" id="page_nav_area"></div>
	</div>
	
	<div class="jumbotron jumbotron-fluid bg-dark"
		th:replace="_fragments::footer"
		style="background-color: #2F4F4F; margin-top: 100%; width: 100%;">
		<div class="container-lg" style="color: white">
			<div class="row ">
				<div class="col-lg-auto footer-div">
					<h4 class="me-h4 text-center">联系我们</h4>
					<div class="container text-center">
						<a href="#" class="me-a text-center "
							style="text-decoration: none;">Email：1457542968@qq.com</a> <br>
						<a href="#" class="me-a text-center"
							style="text-decoration: none;">QQ：1457542968</a>
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
			<div class="small text-center">Copyright 2020 - 2020 LMS
				Designed by HW</div>
		</div>
	</div>
	<script>
 $(document).ready(function(){ 
	   $(".ss-menu").ssMenu(); 	
}); 
 $(function () {
	     unit();
		 to_page(1);
		
		
	});
function to_page(pn) {
	    $.ajax({
	        url:"${pageContext.request.contextPath }/getPrintList",
	        data:{"pn":pn,"searchContent":$("#hideSearch").val(), 
	        	  "unitId":$("#unitList").val(),
	        	   "startDate":$("#startDate").val(),
	        	   "endDate":$("#endDate").val() },	   
	        type:"GET",
	        success:function (result) {
	             console.log(result);
	            //1、解析并显示图书信息
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
	        var piddTd = $("<td></td>").append(item.reader.userName);
	        var uid = $("<td></td>").append(item.readerId);
	        
	        var urole = $("<td></td>").append(item.reader.userRole);

	        var aa = $("<a></a>").attr("href","${pageContext.request.contextPath}"+"/bookDetail?bookCallno="+item.book.bookDesc.bookCallno).append(item.book.bookDesc.bookName);
	        var id= $("<td></td>").append(aa);
	        var brandTd = $("<td></td>").append(item.borrowDate);
	        var modelTd = $("<td></td>").append(item.returnDate);
	        
	        if(item.returnReadate == "" || item.returnReadate == null)
	            var priceTd = $("<td></td>").append("尚未归还");
	        else
	        	 var priceTd = $("<td></td>").append(item.returnReadate);	
	        if(item.renewState == 0)
	            var nameTd = $("<td></td>").append("否");
	        else
	        	var nameTd = $("<td></td>").append("是");
	        //append方法执行完成以后还是返回原来的元素，所以可以继续append
	        $("<tr></tr>")
	        	.append(checkBoxTd)
	        	.append(ii)
	            .append(piddTd)
	            .append(uid)
	            .append(urole)
	            .append(id)
	            .append(brandTd)
	            .append(modelTd)
	            .append(priceTd)
	            .append(nameTd)
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
//搜索
$(".glyphicon-search").click(function(){
	to_page(1);
});
//打印报表
$("#printReport").click(function(){
	$.ajax({
		    url:"${pageContext.request.contextPath}/derivedExcel",
		    data:{"searchContent":$("#hideSearch").val(), 
       	         "unitId":$("#unitList").val(),
   	             "startDate":$("#startDate").val(),
   	             "endDate":$("#endDate").val() },
		    dataType:"json",
		    type:"post",
		    success:function(data){
		       alert("报表打印成功！");
		    },
		    error:function(){
		        alert("数据传送失败！");
		    }
		});
});

</script>

</body>
</html>