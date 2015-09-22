<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

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

		<title>Welcome to bupt-pris</title>

		<!-- Bootstrap core CSS -->
		<link href="plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">

		<!-- Custom styles for this template -->
		<link href="resources/css/justified-nav.css" rel="stylesheet">

		<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
		<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
		<script src="resources/assets/js/ie-emulation-modes-warning.js"></script>

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>

	<body>

		<div class="container">

			<%@ include file="header.jsp"%>

			<!-- Jumbotron -->
			<div class="jumbotron">
				<h1>
					Welcome to BUPT-PRIS!
				</h1>
				<p class="lead">
					Stay hungry! Stay foolish!
				</p>
				<p>
					<a class="btn btn-lg btn-success" href="#" role="button">Get
						started today</a>
				</p>
			</div>

			<!-- Example row of columns -->
			<div class="row">
				<div class="col-lg-8">
					<h2>
						本周主要事宜
					</h2>
					<p>
						<ol>
							<s:iterator value="#request.list" id="us">
								<li>
									<s:property value="#us.title" />
									——
									<s:property value="#us.content" />
								</li>
							</s:iterator>
						</ol>
					</p>
					<p>
						<a class="btn btn-primary" href="matter.jsp" role="button">View
							MORE &raquo;</a>
					</p>
				</div>
				<div class="col-lg-4">
					<h2>
						本周人员安排
					</h2>
					<p class="text-danger">
						时间：
						<s:property value="%{arrange.fromtime}" />
						&nbsp;~ &nbsp;
						<s:property value="%{arrange.totime}" />
					</p>
					<p>
						市本级出差人员：
						<s:property value="%{arrange.travel}" />
					</p>
					<p>
						县区出差人员：
						<s:property value="%{arrange.quxian}" />
					</p>
					<p>
						报销人员：
						<s:property value="%{arrange.baoxiao}" />
					</p>
					<p>
						会议纪要人员：
						<s:property value="%{arrange.meeting}" />
					</p>

					<p>
						<a class="btn btn-primary" href="arrange.jsp" role="button">View
							MORE &raquo;</a>
					</p>
				</div>
			</div>
			<%@ include file="footer.jsp"%>

		</div>
		<!-- /container -->


		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="resources/assets/js/ie10-viewport-bug-workaround.js"></script>
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="resources/jquery-1.10.2.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="plugins/bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>
