<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

		<title>编辑会议制度</title>

		<!-- Bootstrap core CSS -->
		<link href="<%=basePath%>plugins/bootstrap/css/bootstrap.min.css"
			rel="stylesheet">

		<!-- Custom styles for this template -->
		<link href="<%=basePath%>resources/css/admin/dashboard.css"
			rel="stylesheet">

		<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
		<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
		<script
			src="<%=basePath%>resources/assets/js/ie-emulation-modes-warning.js"></script>

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

		<script language="javascript" type="text/javascript"
			src="<%=basePath%>plugins/date97/WdatePicker.js"></script>

	</head>

	<body>

		<%@include file="/include/admin/common.jsp"%>
		<div class="container-fluid">
			<div class="row">
				<%@include file="/include/admin/common-left.jsp"%>
				<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h2>编辑会议制度</h2>
					<div>
					    <input type ="hidden" value="meeting" id = "type"/>
						<!-- 加载编辑器的容器 -->
						<script id="ue" name="content" type="text/plain" style="height:300px">
                               
                        </script>
						<!-- 配置文件 -->
						<script type="text/javascript"
							src="<%=basePath%>plugins/ueditor/ueditor.config.js"></script>
						<!-- 编辑器源码文件 -->
						<script type="text/javascript"
							src="<%=basePath%>plugins/ueditor/ueditor.all.js"></script>
						<!-- 实例化编辑器 -->
						<script type="text/javascript">
	                     var ue = UE.getEditor('ue');
	                     </script>
					</div>
					<br/>
                        <button class="btn btn-primary" id="btnSave">
							保存
						</button>
						&nbsp;
						<button class="btn btn-info" id="btnPreview">
							预览
						</button>
						&nbsp;
						<button class="btn btn-danger" id="btnReset">
							清空
						</button>
				</div>
			</div>
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
							人员安排
						</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" action="updateArrange" method="post"
							id="form1">
							<input type="text" class="form-control" id="id" name="arrange.id"
								style="display: none">
							<div class="form-group">
								<label for="fromtime" class="col-lg-2 control-label">
									起始时间
								</label>
								<div class="col-lg-8">
									<input type="text" id="fromtime" name="arrange.fromtime"
										class="Wdate form-control" onFocus="WdatePicker({})" />
								</div>
							</div>
							<div class="form-group">
								<label for="totime" class="col-lg-2 control-label">
									结束时间
								</label>
								<div class="col-lg-8">
									<input type="text" id="totime" name="arrange.totime"
										class="Wdate form-control" onFocus="WdatePicker({})" />
								</div>
							</div>
							<div class="form-group">
								<label for="travel" class="col-lg-2 control-label">
									市级出差人员
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="travel"
										name="arrange.travel">
								</div>
							</div>
							<div class="form-group">
								<label for="quxian" class="col-lg-2 control-label">
									区县出差人员
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="quxian"
										name="arrange.quxian">
								</div>
							</div>
							<div class="form-group">
								<label for="baoxiao" class="col-lg-2 control-label">
									报销人员
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="baoxiao"
										name="arrange.baoxiao">
								</div>
							</div>
							<div class="form-group">
								<label for="meeting" class="col-lg-2 control-label">
									会议纪要
								</label>
								<div class="col-lg-8">
									<input type="text" class="form-control" id="meeting"
										name="arrange.meeting">
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


		<!-- Bootstrap core JavaScript
    ================================================== -->
		<script src="<%=basePath%>resources/jquery-1.10.2.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="<%=basePath%>plugins/bootstrap/js/bootstrap.min.js"></script>
		<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
		<script src="<%=basePath%>resources/assets/js/vendor/holder.js"></script>

		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script
			src="<%=basePath%>resources/assets/js/ie10-viewport-bug-workaround.js"></script>
		
		<script src="<%=basePath%>resources/js/admin/UEmeeting.js"></script>


	</body>
</html>
