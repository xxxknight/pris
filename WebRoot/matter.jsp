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

		<title>Matter</title>

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
				class="table table-striped table-bordered table-hover" id="dtmatter">
				<thead>
					<tr>
						<th>
							id
						</th>
						<th>
							标题
						</th>
						<th>
							起始时间
						</th>
						<th>
							结束时间
						</th>
						<th>
							分配人
						</th>
						<th>
							优先级
						</th>
						<th>
							状态
						</th>
						<th>
							实际完成时间
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

		<div class="modal" id="mymodal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							id="btnClose">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title">
							Matter Infomation
						</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" id="form1">
							<div class="form-group">
								<label for="id" class="col-lg-2 control-label">
									Id
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="id"
										name="matter.id">
								</div>
							</div>
							<div class="form-group">
								<label for="title" class="col-lg-2 control-label">
									标题
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="title"
										name="matter.title">
								</div>
							</div>
							<div class="form-group">
								<label for="startTime" class="col-lg-2 control-label">
									起始时间
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="startTime"
										name="matter.startTime">
								</div>
							</div>
							<div class="form-group">
								<label for="endTime" class="col-lg-2 control-label">
									结束时间
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="endTime"
										name="matter.endTime">
								</div>
							</div>
							<div class="form-group">
								<label for="assignPeople" class="col-lg-2 control-label">
									分配人
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="assignPeople"
										name="matter.assignPeople">
								</div>
							</div>
							<div class="form-group">
								<label for="state" class="col-lg-2 control-label">
									状态
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="state"
										name="matter.state">
								</div>
							</div>
							<div class="form-group">
								<label for="level" class="col-lg-2 control-label">
									优先级
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="level"
										name="matter.level">
								</div>
							</div>
							<div class="form-group">
								<label for="actualTime" class="col-lg-2 control-label">
									实际完成时间
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="actualTime"
										name="matter.actualTime">
								</div>
							</div>
							<div class="form-group">
								<label for="content" class="col-lg-2 control-label">
									内容
								</label>
								<div class="col-lg-9">
									<textarea class="form-control" rows="4" id="content"
										name="matter.content"></textarea>
									<span class="help-block">不超过300字.</span>
								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button class="btn btn-danger" data-dismiss="modal" id="btnCancel"
							aria-hidden="true">
							Close
						</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->

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

		<script type="text/javascript" src="resources/js/dtMatter.js"></script>

	</body>
</html>
