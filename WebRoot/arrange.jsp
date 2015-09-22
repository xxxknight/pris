<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="../../favicon.ico">

		<title>Arrange</title>

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

		<!-- DataTables CSS -->
		<link rel="stylesheet" type="text/css"
			href="plugins/datatable/css/jquery.dataTables.css">
	</head>

	<body>

		<div class="container">
			<%@ include file="header.jsp"%>
			<!-- 表格开始 -->
			<table cellpadding="0" cellspacing="0" border="0"
				class="table table-striped table-bordered table-hover" id="dtarrange">
				<thead>
					<tr>
						<th>
							id
						</th>
						<th>
							起始时间
						</th>
						<th>
							结束时间
						</th>
						<th>
							市级出差人员
						</th>
						<th>
						          县区出差人员
						</th>
						<th>
							报销人员
						</th>
						<th>
							会议纪要人员
						</th>
					</tr>
				</thead>
				<tbody>

				</tbody>
			</table>




			<%@ include file="footer.jsp"%>
		</div>


		<!-- /container -->

		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="resources/assets/js/ie10-viewport-bug-workaround.js"></script>
		<script src="resources/jquery-1.10.2.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="plugins/bootstrap/js/bootstrap.min.js"></script>

		<!-- DataTables CSS -->
		<link rel="stylesheet" type="text/css"
			href="plugins/datatable/css/jquery.dataTables.css">
		<!-- DataTables -->
		<script type="text/javascript"
			src="plugins/datatable/js/jquery.dataTables.js"></script>

		<script type="text/javascript" src="resources/js/dtArrange.js"></script>

	</body>
</html>
