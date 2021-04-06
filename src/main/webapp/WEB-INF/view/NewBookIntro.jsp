<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/Aimara.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/tab.css">
     <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
	<script src="${pageContext.request.contextPath}/static/js/Aimara.js" type="text/javascript"></script>
<title>图书检索</title>
</head>
<body>
<div class='tabbed round'>
     <ul >
      <li class="readerLogout"><font color="white">退出系统</font></li>
      <li ><a href="${pageContext.request.contextPath}/personalCenter"><font color="white">个人中心</font></a></li>
      <li class="active"><a href="${pageContext.request.contextPath}/newBookIntro"><font color="white">新书推荐</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/clcCallno"><font color="white">中图分类</font></a></li>
      <li ><a  href="${pageContext.request.contextPath}/readerBookCallno"><font color="white">图书检索</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/borrowIntro"><font color="white">借阅须知</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/homePage"><font color="white">返回首页</font></a></li> 
    </ul>
</div>  
<div class="container">
<div class="row newBook">
  <br><br><li class="col-ld-1 glyphicon glyphicon-heart-empty">新书推荐</li><br><br>
  
</div>
</div>
<div class="row">
		<!-- 分页文字信息 -->
		<div class="col-lg-6 col-lg-offset-1" id="page_info_area"></div>
		<!-- 分页条信息 -->
		<div class="col-lg-6 col-lg-offset-4" id="page_nav_area">
				
		</div>
</div>
<div class="jumbotron jumbotron-fluid bg-dark" th:replace="_fragments::footer" style="width:100%; background-color:#2F4F4F; margin-top: 100%;">
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
            <div class="small text-center">Copyright © 2020 - 2020 LMS Designed by HW</div>
        </div>
</div>
<script>
  $(function(){
  	to_page(1);
  });
  function to_page(pn) {
      $.ajax({
          url:"${pageContext.request.contextPath}/getNewBooks",
          data:{"pn":pn},
          type:"GET",
          success:function (result) {
              console.log(result);
            if(result.objectMap.bookList.list.length>0){
         	    //1、解析并显示商品信息
         	    build_booklist_table(result);
         	   //2、解析并显示分页信息
                build_page_info(result);
                //3、解析显示分页条
                build_page_nav(result);
            }
             
          }
      });
};
//构建信息
function build_booklist_table(result) {
 //清空table表
 $(".col-lg-3").remove();
 var prods =  result.objectMap.bookList.list;
 $.each(prods,function (index, book) {
     var div1 = $("<div></div>").addClass("col-lg-3");
     var div2 = $("<div ></div>").addClass("thumbnail");
     var img = $("<img src='"+book.bookImage+"'"+"style='height:200px;width:252px' alt='...' >");
     var div3 = $("<div></div>").addClass("caption");
     var aa = $("<a></a>").attr("href","${pageContext.request.contextPath}"+"/readerBookDetail?bookCallno="+book.bookCallno).append(book.bookName);
     var h3 = $("<h3></h3>").append(aa);
     var pp = $("<p></p>").append(book.isbn);
 
     div3.append(h3).append(pp);
     div2.append(img).append(div3);
     div1.append(div2);
     $(".newBook").append(div1);
 });
};
//解析构建显示分页信息
function build_page_info(result) {
    //先清空
    $("#page_info_area").empty();
    $("#page_info_area").append("当前"+result.objectMap.bookList.pageNum+"页，总"+
    		result.objectMap.bookList.pages+"页，共"+
    		result.objectMap.bookList.total+"条记录");
    totalRecord = result.objectMap.bookList.total;
    //更新商品信息后，需返回显示当前页
    currentPage = result.objectMap.bookList.pageNum;
}
//解析构建分页条信息，点击进行跳转下一页
function build_page_nav(result) {
 //page_nav_area
 $("#page_nav_area").empty();
 var ul = $("<ul></ul>").addClass("pagination");

 //构建元素
 var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
 var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
 if (result.objectMap.bookList.hasPreviousPage == false) {
     firstPageLi.addClass("disabled");
     prePageLi.addClass("disabled");
 }else {
     //为元素添加翻页事件
     firstPageLi.click(function () {
         to_page(1);
     });
     prePageLi.click(function () {
         to_page(result.objectMap.bookList.pageNum -1);
     });
 }

 var nextPageLi = $("<li></li>").append($("<a style=></a>").append("&raquo;"));
 var lastPageLi = $("<li></li>").append($("<a ></a>").append("末页").attr("href","#"));
 if (result.objectMap.bookList.hasNextPage == false) {
     nextPageLi.addClass("disabled");
     lastPageLi.addClass("disabled");
 }else {
     nextPageLi.click(function () {
         to_page(result.objectMap.bookList.pageNum +1);
     });
     lastPageLi.click(function () {
         to_page(result.objectMap.bookList.pages);
     });
 }

 //页码1，2，3，4
 ul.append(firstPageLi).append(prePageLi);
 $.each(result.objectMap.bookList.navigatepageNums,function (index, item) {
     var numLi = $("<li></li>").append($("<a></a>").append(item));
     if (result.objectMap.bookList.pageNum == item) {
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
})
</script>
</body>
</html>