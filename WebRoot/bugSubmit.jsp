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

		<title>Submit BUG</title>

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
			<button class="btn btn-primary" type="button" id="btnAdd">
				Add Bug
			</button>
			<br />
			<br />
			<table cellpadding="0" cellspacing="0" border="0"
				class="table table-striped table-bordered table-hover" id="dtbug">
				<thead>
					<tr>
						<th>
							id
						</th>
						<th>
							BUG名称
						</th>
						<th>
							添加时间
						</th>
						<th>
							描述
						</th>
						<th>
							附件
						</th>
						<th>
							提交人
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
							Edit Bug Infomation
						</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" action="updateBug" method="post"
							id="form1">
							<input type="text" class="form-control" id="id" name="bug.id"
								style="display: none">
							<div class="form-group">
								<label for="bname" class="col-lg-2 control-label">
									名称
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="bname"
										name="bug.bname">
								</div>
							</div>
							<div class="form-group">
								<label for="edittime" class="col-lg-2 control-label">
									编辑时间
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="edittime"
										name="bug.edittime">
								</div>
							</div>
							<div class="form-group">
								<label for="person" class="col-lg-2 control-label">
									提交人
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="person"
										name="bug.person">
								</div>
							</div>
							<div class="form-group">
								<label for="attachment" class="col-lg-2 control-label">
									附件
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="attachment"
										name="bug.attachment">
								</div>
							</div>
							<div class="form-group">
								<label for="description" class="col-lg-2 control-label">
									说明
								</label>
								<div class="col-lg-9">
									<textarea class="form-control" rows="6" id="description"
										name="bug.description"></textarea>
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

		<script type="text/javascript" src="resources/js/dtBug.js"></script>

	</body>
	
</html>
