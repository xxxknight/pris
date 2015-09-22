<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="../../favicon.ico">

		<title>会议制度</title>

		<!-- Bootstrap core CSS -->
		<link href="<%=basePath%>plugins/bootstrap/css/bootstrap.min.css"
			rel="stylesheet">

		<!-- Custom styles for this template -->
		<link href="resources/css/justified-nav.css" rel="stylesheet">

		<!-- Custom styles for this template -->
		<link href="<%=basePath%>resources/css/blog.css" rel="stylesheet">

		<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
		<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
		<script
			src="<%=basePath%>resources/assets/js/ie-emulation-modes-warning.js"></script>

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>

	<body>
		<div class="container">
			<%@ include file="header.jsp"%>
		</div>
		<div id="c1" class="container">


			<div class="row">

				<div class="col-sm-8 blog-main">

					<div class="blog-post">
						<h2 class="blog-post-title">
							<s:property value="#request.meeting.title"/>
						</h2>
						<p class="blog-post-meta">
							<s:property value="#request.meeting.updateTime"/> , by
							<a href="#"><s:property value="#request.meeting.createPeople" escape="false"/></a>
						</p>
						<div>
							<s:property value="#request.meeting.content" escape="false" />
						</div>

					</div>
					<!-- /.blog-post -->



				</div>
				<!-- /.blog-main -->

				<div class="col-sm-3 col-sm-offset-1 blog-sidebar">
					<div class="sidebar-module sidebar-module-inset">
						<h4>
							关于本文
						</h4>
						<p>
							<s:property value="#request.meeting.remark"/>
						</p>
					</div>
					<div class="sidebar-module">
						<h4>
							其他文章
						</h4>
						<ol class="list-unstyled">
							<li>
								<a href="#">考勤制度</a>
							</li>
							<li>
								<a href="#">请假制度</a>
							</li>
							<li>
								<a href="#">会议纪要安排</a>
							</li>
							<li>
								<a href="#">出差统计</a>
							</li>
						</ol>
					</div>
				</div>
				<!-- /.blog-sidebar -->

			</div>
			<!-- /.row -->

		</div>
		<!-- /.container -->

		<footer class="blog-footer">
		<center>
			<a href="#">回到顶部</a>
		</center>
		</footer>


		<!-- Bootstrap core JavaScript
    ================================================== -->

		<!-- Placed at the end of the document so the pages load faster -->
		<script src="<%=basePath%>resources/jquery-1.10.2.min.js"></script>
		<script src="<%=basePath%>plugins/bootstrap/js/bootstrap.min.js"></script>
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script
			src="<%=basePath%>resources/assets/js/ie10-viewport-bug-workaround.js"></script>
	</body>
</html>
