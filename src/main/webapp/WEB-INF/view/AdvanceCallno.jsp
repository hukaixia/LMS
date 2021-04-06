<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <!-- 先引入jquery js文件 -->
	<script src="${pageContext.request.contextPath}/static/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/file-explore.js"></script>
    <!-- 引入bootstrap 样式文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/file-explore.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/tab.css">
   
<title>高级检索</title>
</head>
<body>
 <div class='tabbed round' >
   <ul >
      <li class="readerLogout"><font color="white">退出</font></li>
      <li ><a href="${pageContext.request.contextPath}/personalCenter"><font color="white">个人中心</font></li>
      <li ><a href="${pageContext.request.contextPath}/newBookIntro"><font color="white">新书推荐</font></li>
      <li ><a href="${pageContext.request.contextPath}/advanceCallno"><font color="white">高级检索</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/clcCallno"><font color="white">中图分类</font></a></li>
      <li ><a  href="${pageContext.request.contextPath}/readerBookCallno"><font color="white">图书检索</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/homePage"><font color="white">返回首页</font></a></li> 
    </ul>
</div>
 
<div class="row " style="text-align:center">
 <br><h3>高级检索</h3><br>
</div>
<form class="form-horizontal">
	<div class="row col-md-3 col-md-offset-3">
	  <div class="form-group">
	    <label >书 名</label>
	    <input type="text" class="form-control" id="bookName" placeholder="书名">
	  </div>
	  <div class="form-group">
	    <label>主题词</label>
	    <input type="text" class="form-control" id="bookIntro" placeholder="主题词">
	  </div>
	  <div class="form-group">
	    <label>作者</label>
	    <input type="text" class="form-control" id="writer" placeholder="作者">
	  </div>
	</div>
	<div class="row col-md-3 col-md-offset-1">
	  <div class="form-group">
	    <label >索书号:</label>
	    <input type="text" class="form-control" id="bookCallno" placeholder="索书号">
	  </div>
	  <div class="form-group">
	    <label >ISBN号：</label>
	    <input type="text" class="form-control" id="ISBN" placeholder="ISBN">
	  </div>
	   <div class="form-group">
	    <label >馆藏地</label>
	    <select class="form-control" name="branchId" id="branchList">
	    </select>
	  </div>
	  </div>
	<div class="row col-md-3 col-md-offset-5">
     <br><br>
     <button type="submit" class="btn btn-info btn-lg">检索</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <button type="reset" class="btn btn-primary btn-lg">重置</button>
    </div>
</form>
<div class="jumbotron jumbotron-fluid bg-dark" th:replace="_fragments::footer" style="background-color:#2F4F4F	; margin-top: 90%;margin-bottom: 2%;">
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
<script >
$(document).ready(function() {
      $(".file-tree").filetree();
      branch();
});
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
			 var op = $("<option></option>").append(branch.branchName).addClass("branchOption");
			 op.val(branch.branchId);
			 $("#branchList").append(op);
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
</body>
</html>