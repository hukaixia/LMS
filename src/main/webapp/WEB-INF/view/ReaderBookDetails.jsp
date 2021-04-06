<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书馆藏信息</title>
  <script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/Aimara.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/tab.css">
     <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
	<script src="${pageContext.request.contextPath}/static/js/Aimara.js" type="text/javascript"></script>
</head>
<body>
<div class='tabbed round' >
     <ul >
      <li class="readerLogout"><font color="white">退出系统</font></li>
      <li ><a href="${pageContext.request.contextPath}/personalCenter"><font color="white">个人中心</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/newBookIntro"><font color="white">新书推荐</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/clcCallno"><font color="white">中图分类</font></a></li>
      <li ><a  href="${pageContext.request.contextPath}/readerBookCallno"><font color="white">图书检索</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/borrowIntro"><font color="white">借阅须知</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/homePage"><font color="white">返回首页</font></a></li> 
    </ul>
</div> 
<div class="row" style="padding-top:30px">
<li class="col-lg-offset-1 col-ld-1 glyphicon glyphicon-heart-empty">图书详细信息</li>
<br><br>
  <div class="col-lg-3 col-lg-offset-1">
 	<img src="${bookDesc.bookImage }" alt="..." style="height:300px;width:300px">
 </div>
 <div class="col-lg-7">
     <div class="caption">
        <h3>${bookDesc.bookName }</h3>
        <p>${bookDesc.bookIntro }</p>
        <h4>出版社：${bookDesc.press.pressName} ${pressAdress }</h4>
        <h4>出版时间：${bookDesc.publishDate}</h4>
        <h4>上架时间：${bookDesc.collectionDate}</h4>
         <h4>作者：<c:forEach items="${editors }" var="item" varStatus="status">
                   <c:if test="${status.first}">
                       ${item.editorRole } ${item.writer.writerName }
                   </c:if>
                   
                   <c:if test="${status.first == false}">
                       、${item.editorRole } ${item.writer.writerName }
                   </c:if>
                </c:forEach>
        
        </h4>
        <h4>价格：${bookDesc.bookPrice}&nbsp;&nbsp; 字数：${bookDesc.wordNumber}</h4>
      </div>
  </div>
</div>
<br>
<div class="row">
	<div class="col-lg-10 col-lg-offset-1">
				<table class="table table-hover" id="book_table">
					<thead style="background-color:#74777b;color:white">
					<tr>
						<th>id</th>
						<th>借阅类型</th>
						<th>中图分类</th>
						<th>索书号</th>
						<th>馆藏地</th>
						<th>状态</th>
						<th>操作</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach items="${books }" var="item">
					  <tr>
					      <th>${item.bookId }</th>
						  <th>${bookBranch.borrowType.borrowTypeName }</th>
						  <th>${bookBranch.clc.clcName }</th>
						  <th>${bookDesc.bookCallno }</th>
					      <th>${bookBranch.branch.branchName }</th>
					      <th>${item.bookState }</th>
					      
					      <th>
					      <c:if test="${item.bookState == '可借'}">
					      
					      <button type="button" class ="btn btn-info glyphicon glyphicon-pencil" onclick="borrowBtn(${item.bookId })" data-id="${item.bookId }">借阅</button>					      
					      </c:if>
					   
					      </th>
					      
					  </tr>
					
					</c:forEach>
					</tbody>	
		</table>
	</div>
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
</body>
<script>
//读者借阅图书
function borrowBtn(id){
	$.ajax({
		 url: "${pageContext.request.contextPath}/reader/readerBorrow",
         method: "post",
		 data:{
			 "bookId":id
		 },
		 success:function(response){
			 if(response.errorCode=="100"){
				 alert("借阅成功");
				 
			 }else{
				 alert("借阅失败");
			  
			 }
			 window.location="${pageContext.request.contextPath}/readerBookCallno";	 	 
		 },
		 error:function(){
			 console.log("请求发送失败...");
		 }
	 });
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
});
</script>
</html>