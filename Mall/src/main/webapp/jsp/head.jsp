<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"
	type="text/javascript"></script>

<script type="text/javascript">
	$(function() {
		$.post(
			"${pageContext.request.contextPath}/typeServlet",
			{
				"typeTodo" : "getType"
			},
			function(data) {
				$(data).each(function(a, b) {
					//alert(b.tname);
					$("#types").append("<li><a href=${pageContext.request.contextPath}/productServlet?currentPage=1&cid=" + b.cid + "&todo=findProductList>" + b.cname + "</a></li>");

				})
			},
			"json"
		);
	});
</script>
</head>

<body>

	<div class="container-fluid">
		<div class="col-md-4">
			<img src="${pageContext.request.contextPath}/img/logo2.png" />
		</div>
		<div class="col-md-5">
			<img src="${pageContext.request.contextPath}/img/header.png" />
		</div>
		<div class="col-md-3" style="padding-top:20px">
			<ol class="list-inline">
				<c:if test="${empty user}">
					<li><a
						href="${pageContext.request.contextPath}/userServlet?userTodo=loginUI">登录</a></li>
					<li><a
						href="${pageContext.request.contextPath}/userServlet?userTodo=registUI">注册</a></li>
				</c:if>
				<c:if test="${!empty user}">
					<li>您好，${user.name}</li>
					<li><a
						href="${pageContext.request.contextPath}/userServlet?userTodo=quit">我的订单</a></li>
					<li><a
						href="${pageContext.request.contextPath}/userServlet?userTodo=quit">退出</a></li>
				</c:if>
				<li><a href="${pageContext.request.contextPath}/jsp/cart.jsp">购物车</a></li>
			</ol>
		</div>
	</div>
	<!--
            	时间：2015-12-30
            	描述：导航条
            -->
	<div class="container-fluid">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand"
						href="${pageContext.request.contextPath}/jsp/index.jsp">首页</a>
				</div>

				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav" id="types">
					</ul>
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>

				</div>
			</div>
			<!-- /.container-fluid -->
		</nav>
	</div>
</body>
</html>
