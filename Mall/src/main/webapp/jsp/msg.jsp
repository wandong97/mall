<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>WEB01</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" />
		<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container-fluid">
        <%@include file="/jsp/head.jsp" %>
			<!--
            	时间：2015-12-30
            	描述：菜单栏
            -->
			

			<div class="container-fluid">
				<div class="main_con">
				  <c:if test="${empty msg}">
			   <p id="spanname" name="spanname" style="text-align:center;color:green;">注册成功,已向您的邮箱发送您的密钥，忘记密码时可用此密钥找回，请妥善保存</p>
			   </c:if>
			   <c:if test="${!empty msg}">
			   <p id="spanname" name="spanname" style="text-align:center;color:red;">${msg}</p>
			   </c:if>
			    
               </div>
			</div>

		</div>
		<div class="container-fluid">
				<div style="margin-top:50px;">
					<img src="${pageContext.request.contextPath}/img/footer.jpg" width="100%" height="78" alt="我们的优势" title="我们的优势" />
				</div>
		
				<div style="text-align: center;margin-top: 5px;">
					<ul class="list-inline">
						<li><a href="info.html">关于我们</a></li>
						<li><a>联系我们</a></li>
						<li><a>招贤纳士</a></li>
						<li><a>法律声明</a></li>
						<li><a>友情链接</a></li>
						<li><a>支付方式</a></li>
						<li><a>配送方式</a></li>
						<li><a>服务声明</a></li>
						<li><a>广告声明</a></li>
					</ul>
				</div>
				<div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
					Copyright &copy; 2019-2020 XXX商城 版权所有
				</div>
			</div>
		</div>

	</body>

</html>