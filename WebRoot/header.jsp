<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="zh-CN">
	<head>
	    <script src="resources/jquery-1.10.2.min.js"></script>
		<script src="resources/js/header.js"></script>
	</head>
	<body>

		<!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
		<div class="masthead">
			<h3 class="text-muted">
				BUPT-PRIS
			</h3>
			<nav class="navbar navbar-inverse blog-nav">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index">Home</a>
				</div>

				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-2">
					<ul class="nav navbar-nav">
						<li class="type1 dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"
								role="button" aria-expanded="false">事务安排 <span class="caret"></span>
							</a>
							<ul class="dropdown-menu" role="menu">
								<li>
									<a href="matter.jsp">事务安排</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="arrange.jsp">人员安排</a>
								</li>
							</ul>
						</li>
						<li class="type1 dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"
								role="button" aria-expanded="false">规章制度 <span class="caret"></span>
							</a>
							<ul class="dropdown-menu" role="menu">
								<li>
									<a href="meetingArticle?id=1">考勤制度</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="meetingArticle?id=2">会议制度</a>
								</li>
							</ul>
						</li>
						<li class="type1 dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"
								role="button" aria-expanded="false">统计查询 <span class="caret"></span>
							</a>
							<ul class="dropdown-menu" role="menu">
								<li>
									<a href="travel">出差统计</a>
								</li>
								<li>
									<a href="#">报销会议统计</a>
								</li>
								<li class="divider"></li>
								<li>
									<a href="indexMachine">设备信息统计</a>
								</li>
							</ul>
						</li>
						<li class="type1 dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"
								role="button" aria-expanded="false">下载上传 <span class="caret"></span>
							</a>
							<ul class="dropdown-menu" role="menu">
								<li>
									<a href="fileUpload.jsp">公共上传下载</a>
								</li>
							</ul>
						</li>
						<li class="type1">
							<a href="indexBug">Bug提交<span class="sr-only"></span> </a>
						</li>
					</ul>
				</div>
			</div>
			</nav>
		</div>

	</body>
</html>
