<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 引入bootstrap 样式文件 -->
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">

    <!-- 先引入jquery js文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/tab.css">

<title>图书检索</title>
</head>
<body>
<div class='tabbed round' style="background-color:#000000">
    <ul>
      <li class="tab">退出</li>
      <li >个人中心</li>
      <li >读者推购</li>
      <li >高级检索</li>
      <li >导航检索</li>
      <li >目录检索</li>
      <li>首页</li>
    </ul>
</div>  
<div class="container">

   <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="width:900px;padding-left:200px">
   
    <form class="navbar-form navbar-left" >
         <div class="row" >
            <input type="text" style="width:550px;height:45px;" name="searchProduct" id="hideSearch" class="form-control" placeholder="搜索"/>
            <button  class="btn btn-info btn-lg glyphicon glyphicon-search">搜索</button></br>
            <label><input type="radio" name="searchField" value="bookName" checked="checked" /> &nbsp书名 &nbsp &nbsp</label>
			<label><input type="radio" name="searchField" value="bookAuthor"  />  &nbsp作者 &nbsp &nbsp </label>
			<label><input type="radio" name="searchField" value="themeWord"  />  &nbsp主题词 &nbsp &nbsp</label>	
			<label><input type="radio" name="searchField" value="bookCallno"  /> &nbsp索书号 &nbsp &nbsp</label>
			<label><input type="radio" name="searchField" value="bookISBN"  /> &nbspISBN号 &nbsp &nbsp</label>
			<label class="clsLabel" style=""><input type="checkbox" name="cls" value="0A" checked="checked" />当前分类检索</label>
         </div>            
    </form>
   </div>
</div>
<div class="container">
<div class="row newBook">
  <br><br><li class="col-ld-1 glyphicon glyphicon-heart-empty">新书推荐</li><br><br>
  
</div>
<div class="col-md-6" id="page_nav_area" style="padding-left:100px">

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
                //2、解析显示分页条
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
     var h3 = $("<h3></h3>").append(book.bookName);
     var pp = $("<p></p>").append(book.isbn);
     var readBtn = $("<button type='button'  class='btn btn-info btn-sm'></button>");
     readBtn.append("查看")
     div3.append(h3).append(pp).append(readBtn);
     div2.append(img).append(div3);
     div1.append(div2);
     $(".newBook").append(div1);
 });
};
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
</script>
</body>
</html>