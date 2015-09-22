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

		<title>文件上传</title>

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
			<h1>
				文件上传
			</h1>
			<form action="upload" method="post" enctype="multipart/form-data"
				class="form-horizontal">
				<div class="form-group">
					<label for="uname" class="control-label col-xs-3">
						上传人
					</label>
					<div class="col-xs-3">
						<input type="text" class="form-control" id="uname" name="uname"
							size="10" maxlength="10" placeholder="上传人" />
					</div>
				</div>
				<div class="form-group">
					<label for="upload" class="control-label col-xs-3">
						上传文件
					</label>
					<div class="col-xs-3">
						<input type="file" class="form-control" id="upload" name="upload" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-10 col-xs-offset-3">
						<button type="submit" class="btn btn-primary">
							Submit
						</button>
						&nbsp;&nbsp; &nbsp;
						<button type="reset" class="btn btn-danger">
							Reset
						</button>
					</div>
				</div>

			</form>
			<br/>
			<h1>文件下载</h1>
				<table cellpadding="0" cellspacing="0" border="0"
				class="table table-striped table-bordered table-hover" id="dtfile">
				<thead>
					<tr>
						<th>
							id
						</th>
						<th>
							文件名称
						</th>
						<th>
							上传时间
						</th>
						<th>
							上传人
						</th>
						<th>
							操作
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

		<script type="text/javascript" src="resources/js/dtFile.js"></script>

	</body>
</html>
