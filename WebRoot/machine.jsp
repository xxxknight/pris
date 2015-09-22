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

		<title>实验室设备清单</title>

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
			<h2>
				设备清单
			</h2>
			<!-- 表格开始 -->
			<button class="btn btn-primary" type="button" id="btnAdd">
				Add Machine
			</button>
			<br />
			<br />
			<table cellpadding="0" cellspacing="0" border="0"
				class="table table-striped table-bordered table-hover"
				id="dtmachine">
				<thead>
					<tr>
						<th>
							id
						</th>
						<th>
							位置
						</th>
						<th>
							ip
						</th>
						<th>
							设备名
						</th>
						<th>
							类型
						</th>
						<th>
							用途
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

		<div class="modal" id="mymodal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							id="btnClose">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title">
							Machine Infomation
						</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" action="updateMachine" method="post"
							id="form1">
							<input type="text" class="form-control" id="id" name="machine.id"
								style="display: none">
							<div class="form-group">
								<label for="location" class="col-lg-2 control-label">
									位置
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="location"
										name="machine.location">
								</div>
							</div>
							<div class="form-group">
								<label for="name" class="col-lg-2 control-label">
									名称
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="name"
										name="machine.name">
								</div>
							</div>
							<div class="form-group">
								<label for="ip" class="col-lg-2 control-label">
									IP
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="ip"
										name="machine.ip">
								</div>
							</div>
							<div class="form-group">
								<label for="type" class="col-lg-2 control-label">
									类型
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="type"
										name="machine.type">
								</div>
							</div>
							<div class="form-group">
								<label for="usage" class="col-lg-2 control-label">
									用途
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="usage"
										name="machine.usage">
								</div>
							</div>
							<div class="form-group">
								<label for="account" class="col-lg-2 control-label">
									账户名
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="account"
										name="machine.account">
								</div>
							</div>
							<div class="form-group">
								<label for="password" class="col-lg-2 control-label">
									密码
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="password"
										name="machine.password">
								</div>
							</div>
							<div class="form-group">
								<label for="manager" class="col-lg-2 control-label">
									管理者
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="manager"
										name="machine.manager">
								</div>
							</div>
							<div class="form-group">
								<label for="remark" class="col-lg-2 control-label">
									备注
								</label>
								<div class="col-lg-9">
									<textarea class="form-control" rows="4" id="remark"
										name="machine.remark"></textarea>
									<span class="help-block">不超过300字.</span>
								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button class="btn btn-primary" id="btnSave">
							save
						</button>
						<button class="btn btn-primary" id="btnEdit">
							update
						</button>
						<button class="btn btn-danger" data-dismiss="modal" id="btnCancel"
							aria-hidden="true">
							cancel
						</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->

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

		<script type="text/javascript" src="resources/js/dtMachine.js"></script>

	</body>
</html>
