<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理页面</title>
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
<div class="container col-md-10 col-md-offset-3" style="padding-top:90px">
 <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="width:800px">
    <form class="navbar-form navbar-left" >
         <div class="row">
            <input type="text" style="width:550px;height:45px" name="searchProduct" id="hideSearch" class="form-control" placeholder="搜索"/>
            <button type="button" class="btn btn-default btn-lg glyphicon glyphicon-search">搜索</button></br>
            <label><input type="radio" name="searchField" value="bookName" checked="checked" /> &nbsp书名 &nbsp &nbsp</label>
			<label><input type="radio" name="searchField" value="themeWord"  />  &nbsp主题词 &nbsp &nbsp</label>	
			<label><input type="radio" name="searchField" value="bookCallno"  /> &nbsp索书号 &nbsp &nbsp</label>
			<label><input type="radio" name="searchField" value="bookISBN"  /> &nbspISBN号 &nbsp &nbsp</label>
         </div>
             
    </form>
   </div>
</div>
<!-- 表格数据 -->
		<div class="row">
			<div class="col-lg-11 col-lg-offset-1">
				<table class="table table-hover" id="book_table">
					<thead style="background-color:#74777b;color:white">
					<tr>
						<th>
                            <input type="checkbox" id="check_all">
                        </th>
						<th>ISBN号</th>
						<th>书名</th>
						<th>出版社</th>
						<th>出版日期</th>
						<th>索书号</th>
						<th>馆藏数</th>
						<th>可借</th>
						<th>操作</th>
					</tr>
					</thead>
					<tbody>
					
					</tbody>	
				</table>
			</div>
		</div>
	


<div class="row">
		<!-- 分页文字信息 -->
		<div class="col-lg-6 col-lg-offset-1" id="page_info_area"></div>
		<!-- 分页条信息 -->
		<div class="col-lg-6 col-lg-offset-4" id="page_nav_area">
				
		</div>
</div>
<div class="jumbotron jumbotron-fluid bg-dark" th:replace="_fragments::footer" style="background-color:#74777b; margin-top: 100%; width:100%;">
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
$(function () {
	to_page(1);
});
function to_page(pn) {
    $.ajax({
        url:"${pageContext.request.contextPath}/bookLists",
        data:{"pn":pn,
        	   "searchContent":$("#hideSearch").val(),
        	   "radioValue":$("input:radio:checked").val()},
        type:"GET",
        success:function (result) {
             console.log(result);
            //1、解析并显示图书信息
            build_book_table(result);
            //2、解析并显示分页信息
            build_page_info(result);
            //3、解析显示分页条
            build_page_nav(result);
        }
    });
}

//构建图书信息
function build_book_table(result) {
    //清空table表格
    $("#book_table tbody").empty();
    var book = result.objectMap.mylist.list;
    $.each(book,function (index, item) {
        var checkBoxTd = $("<td></td>").append("<input type='checkbox' class='check_item'/>");
        var piddTd = $("<td></td>").append(item.isbn);
        var aa = $("<a></a>").attr("href","${pageContext.request.contextPath}"+"/bookDetail?bookCallno="+item.bookCallno).append(item.bookName);
        var pictureTd = $("<td></td>").append(aa);
        var nameTd = $("<td></td>").append(item.press.pressName);
        var brandTd = $("<td></td>").append(item.publishDate);
        var modelTd = $("<td></td>").append(item.bookCallno);
        var priceTd = $("<td></td>").append(item.collectionNumber);
        var introduction = $("<td></td>").append(item.avaliableLoan);
        var editBtn = $("<button type='button'  class='btn btn-warning btn-sm' ></button>")
            .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
        //为编辑按钮添加一个自定义的属性，来表示当前商品id
        editBtn.attr("edit_id",item.bookCallno);
        var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
            .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
        //为删除按钮添加属性表示id
        delBtn.attr("del_id",item.bookCallno);
        //为两个按钮添加点击事件
        editBtn.click(function(){
        	editorBook(item.bookCallno);
        });
        delBtn.click(function(){
        	delBook(item.bookCallno);
        })
        var btnTd =$("<td></td>").append(editBtn).append("  ").append(delBtn);
        //append方法执行完成以后还是返回原来的元素，所以可以继续append
        $("<tr></tr>")
        	.append(checkBoxTd)
            .append(piddTd)
            .append(pictureTd)
            .append(nameTd)
            .append(brandTd)
            .append(modelTd)
            .append(priceTd)
            .append(introduction)
            .append(editBtn)
            .append(delBtn)
            .appendTo("#book_table tbody");
    });
}

//解析构建显示分页信息
function build_page_info(result) {
    //先清空
    $("#page_info_area").empty();
    $("#page_info_area").append("当前"+result.objectMap.mylist.pageNum+"页，总"+
    	result.objectMap.mylist.pages+"页，共"+
    	result.objectMap.mylist.total+"条记录");
    totalRecord = result.objectMap.mylist.total;
    //更新商品信息后，需返回显示当前页
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

 //页码1，2，3，4
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

function delBook(id){
	  if(confirm("确认删除吗？")){
   	   $.ajax({
   		      url:"${pageContext.request.contextPath}/admin/deleteBookDesc",
              method: "post",
			  data:{
				 "bookDescId":id
			 },
			 success:function(response){
				 if(response.errorCode=="100"){
					 alert("删除成功！");
				 }else{
					alert("删除失败,该种图书已有读者借阅！");
				 }
				 window.location="${pageContext.request.contextPath}/admin/bookManage";	 	 
			 },
			 error:function(){
				 console.log("请求发送失败...");
			 }
		 });
      }
      else
   	   return false;
   	
};
function editorBook(id){
	  window.location.href="${pageContext.request.contextPath}/admin/huixian?id="+id;
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
$(".glyphicon-search").click(function(){
	 to_page(1);
});
</script>

</body>
</html>