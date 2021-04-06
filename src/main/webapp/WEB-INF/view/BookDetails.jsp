<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
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
	    <li><a href="${pageContext.request.contextPath}/admin/readerHandle"><i class="glyphicon glyphicon-user fa fa-android"></i>读者业务办理</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/infoManage"> <i class="glyphicon glyphicon-film fa fa-bar-chart"></i>读者信息管理 </a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/handleFine"><i class="glyphicon glyphicon-pencil fa fa-heartbeat"></i>罚款处理</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/bookShelf"><i class="glyphicon glyphicon-align-center fa fa-bank"></i>图书上架</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/bookManage"><i class="glyphicon glyphicon-folder-open fa fa-cc-paypal"></i> 图书管理</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/renewManege"><i class="glyphicon glyphicon-grain fa fa-bookmark-o"></i> 借阅管理</a></li>
	    <li id="logout"><a href="#"><i class="glyphicon glyphicon-log-out fa fa-bookmark-o"></i>退出</a></li>
	</ul>
</nav>
	<!--End Side Sticky Menu-->
<div class="htmleaf-container" style="height:50px" >
		<header class="htmleaf-header">
			<h1>后台管理<span>LMS Administrator</span></h1>
		</header>
</div>

<div class="row" style="padding-top:120px">
<li class="col-lg-offset-1 col-ld-1 glyphicon glyphicon-heart-empty">图书具体信息</li>
</br></br>
  <div class="col-lg-3 col-lg-offset-1">
 	<img src="${bookDesc.bookImage }" alt="..." style="height:300px;width:300px">
 </div>
 <div class="col-lg-7">
     <div class="caption">
        <h3>${bookDesc.bookName }</h3>
        <p>${bookDesc.bookIntro }</p>
        <h4>出版社：${bookDesc.press.pressName}${pressAdress }</h4>
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
        <h4>价格：${bookDesc.bookPrice}元&nbsp;&nbsp; 字数：${bookDesc.wordNumber}</h4>
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
						<th>是否可借</th>
						<th>图书状态</th>
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
					      <c:if test="${item.bookDamage == 0 }">
					       <th>正常</th>
					      </c:if>
					      <c:if test="${item.bookDamage == 1 }">
                          <th>缺页破损</th>
					      </c:if>
					      <c:if test="${item.bookDamage == 2 }">
					       <th>丢失</th>
					      </c:if>
					      <th>
					      <button  class ="btn btn-info glyphicon glyphicon-pencil" data-toggle='modal' data-target='.login' data-id="${item.bookId }"  onclick="editBtn(${item.bookId })"">编辑</button>
				          <button  class ="btn btn-danger glyphicon glyphicon-trash" data-id="${item.bookId }" onclick="deleteBtn(${item.bookId })">删除</button>
					      </th>
					  </tr>
					
					</c:forEach>
					</tbody>	
		</table>
	</div>
</div>
<div class="modal fade login" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title">实体图书信息</h4>
							</div>
							<div class="modal-body">
								 <form action="${pageContext.request.contextPath}/admin/updateRealBook" method="post"  enctype="multipart/form-data">
                                    <input type="hidden" name="bookId" value="0" id="bookId"/>
									
									 <div class="form-group">
										    <label >是否可借</label>
										    <select class="form-control" name="bookState" >
										    <option value="可借">可借</option>
										    <option value="不可借">不可借</option>
										    </select>
									</div>
									
									 <div class="form-group">
										    <label >图书状态</label>
										    <select class="form-control" name="bookDamage" >
										    <option value="0">正常</option>
										    <option value="1">缺页破损</option>
										    <option value="2">丢失</option>
										    </select>
									</div>
									
									<div class="modal-footer">
									  <input class="btn btn-default" data-dismiss="modal" type="submit" value="关闭"/>
                                      <input type="submit" class="btn btn-primary" value="修改"/>
									</div>
						</form>
					</div>
			</div>
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
<script>
 $(document).ready(function(){
	 
	   $(".ss-menu").ssMenu();	 	
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
//编辑
function editBtn(id){
	$("#bookId").val(id);
}
function deleteBtn(id){
	 if (confirm("确认删除吗？")) {
			$.ajax({
				url : "${pageContext.request.contextPath}/admin/deleteRealBook",
				method : "post",
				data:{"bookId":id},
				success : function(response) {		
					    alert("删除成功！");
						window.location = "${pageContext.request.contextPath}/admin/bookManage";
				},
				error : function() {
					console.log("请求发送失败...");
				}
			});
	 }
}
</script>

</body>
</html>