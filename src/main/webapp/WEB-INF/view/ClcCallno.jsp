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
<title>中图分类</title>
	<script type="text/javascript">
	window.onload = function() {

		//Initializing Tree

		//Tree Context Menu Structure
		var contex_menu = {
			'context1' : {
				elements : [
					{
						text : 'Node Actions',
						icon: 'static/images/blue_key.png',
						action : function(node) {

						},
						submenu: {
							elements : [
								{
									text : 'Toggle Node',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										node.toggleNode();
									}
								},
								{
									text : 'Expand Node',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										node.expandNode();
									}
								},
								{
									text : 'Collapse Node',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										node.collapseNode();
									}
								},
								{
									text : 'Expand Subtree',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										node.expandSubtree();
									}
								},
								{
									text : 'Collapse Subtree',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										node.collapseSubtree();
									}
								},
								{
									text : 'Delete Node',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										node.removeNode();
									}
								},
							]
						}
					},
					{
						text : 'Child Actions',
						icon: 'static/images/blue_key.png',
						action : function(node) {

						},
						submenu: {
							elements : [
								{
									text : 'Create Child Node',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										node.createChildNode('Created',false,'static/images/blue_key.png',null,'context1');
									}
								},
								{
									text : 'Create 1000 Child Nodes',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										for (var i=0; i<1000; i++)
											node.createChildNode('Created -' + i,false,'static/images/blue_key.png',null,'context1');
									}
								},
								{
									text : 'Delete Child Nodes',
									icon: 'static/images/blue_key.png',
									action : function(node) {
										node.removeChildNodes();
									}
								}
							]
						}
					}
				]
			}
		};

		//Creating the tree
		tree = createTree('div_tree','white',contex_menu);

		$.ajax({
			 url:"${pageContext.request.contextPath}/clcIdList",
		     type:"GET",
		     success:function (result) {
		    	 var clc = result.objectMap.mylist;
		    	 $.each(clc,function (index, clc) {
		    		   node1 = tree.createNode('<a href="javascript:void(0);" onclick=searchClc("' + clc.clcId+ '");>'+"<font size='1' color='black'>"+clc.clcName+"</font></a>",false,'static/images/blue_key.png',null,null,'context1');
		    	       getChildNode(node1,clc.clcId);
		    	 });
		      }
		});
	
        function  getChildNode(node,clcId){
        	$.ajax({
   			 url:"${pageContext.request.contextPath}/clcUpIdList",
   		     type:"GET",
   		     data:{"clcId":clcId},
   		     success:function (result) {
   		    	 var clc = result.objectMap.mylist;
   		    	 $.each(clc,function (index, clc) {
   		    		 
   		    		node1 = node.createChildNode('<a href="javascript:void(0);" onclick=searchClc("' + clc.clcId+ '");>'+"<font size='1' color='#2F4F4F'>"+clc.clcName+"</font></a>",false,'static/images/blue_key.png',null,null,'context1');
   		    	       getChildNode(node1,clc.clcId);
   		    	 });
   		      }
        	});
        }
        
        function searchClc(id){
        	alert(id);
        }
		//Rendering the tree
		tree.drawTree();
        
		//Adding node after tree is already rendered
		//tree.createNode('Real Time',false,'static/images/blue_key.png',null,null,'context1');


	};

	function expand_all() {
		tree.expandTree();
	}

	function clear_log() {
		document.getElementById('div_log').innerHTML = '';
	}

	function collapse_all() {
		tree.collapseTree();
	}
</script>
</head>
<body>
<div class='tabbed round'>
    <ul >
      <li class="readerLogout"><font color="white">退出系统</font></li>
      <li  ><a href="${pageContext.request.contextPath}/personalCenter"><font color="white">个人中心</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/newBookIntro"><font color="white">新书推荐</font></a></li>
      <li class="active"><a href="${pageContext.request.contextPath}/clcCallno"><font color="white">中图分类</font></a></li>
      <li ><a  href="${pageContext.request.contextPath}/readerBookCallno"><font color="white">图书检索</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/borrowIntro"><font color="white">借阅须知</font></a></li>
      <li ><a href="${pageContext.request.contextPath}/homePage"><font color="white">返回首页</font></a></li> 
    </ul>
</div>  
<div class="container "  style="width:380px; padding-left:80px;padding-top:0px;float:left; height:1000px">
 	<h3>中图分类(点击查看类别)</h3>
	 <div id="div_tree"></div> 
 </div>
<div class="row"  style="padding-top:10px">
			<div class="col-lg-8 ">
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
					</tr>
					</thead>
					<tbody>
					
					</tbody>	
				</table>
							<!-- 分页文字信息 -->
		<div class="col-lg-6 col-lg-offset-1" id="page_info_area"></div>
		<!-- 分页条信息 -->
		<div class="col-lg-6 col-lg-offset-4" id="page_nav_area">
				
		</div>
		</div>

</div>
<div class="jumbotron jumbotron-fluid bg-dark" th:replace="_fragments::footer" style="background-color:#2F4F4F; margin-top: 80%; width:100%;">
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


 $(function () {
		to_page(1,"");
	});
	function to_page(pn,id) {
	    $.ajax({
	        url:"${pageContext.request.contextPath}/clcBookLists",
	        data:{"pn":pn,"clcId":id},
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
	 function searchClc(id){
		 to_page(1,id);
	 };
	//构建图书信息
	function build_book_table(result) {
	    //清空table表格
	    $("#book_table tbody").empty();
	    var book = result.objectMap.mylist.list;
	    $.each(book,function (index, item) {
	        var checkBoxTd = $("<td></td>").append("<input type='checkbox' class='check_item'/>");
	        var piddTd = $("<td></td>").append(item.isbn);
	        var aa = $("<a></a>").attr("href","${pageContext.request.contextPath}"+"/readerBookDetail?bookCallno="+item.bookCallno).append(item.bookName);
	        var pictureTd = $("<td></td>").append(aa);
	        var nameTd = $("<td></td>").append(item.press.pressName);
	        var brandTd = $("<td></td>").append(item.publishDate);
	        var modelTd = $("<td></td>").append(item.bookCallno);
	        var priceTd = $("<td></td>").append(item.collectionNumber);
	        var introduction = $("<td></td>").append(item.avaliableLoan);
	   
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