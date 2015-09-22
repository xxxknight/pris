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

		<title>后台管理界面</title>

		<!-- Bootstrap core CSS -->
		<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css"
			rel="stylesheet">

		<!-- Custom styles for this template -->
		<link href="<%=basePath%>/resources/css/admin/dashboard.css"
			rel="stylesheet">

		<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
		<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
		<script
			src="<%=basePath%>/resources/assets/js/ie-emulation-modes-warning.js"></script>

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>

	<body>

		<%@include file="/include/admin/common.jsp"%>
		<div class="container-fluid">
			<div class="row">
				<%@include file="/include/admin/common-left.jsp"%>
				<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
					<h1 class="page-header">
						Dashboard
					</h1>

					<div class="row placeholders">
						<div class="col-xs-6 col-sm-3 placeholder">
							<img data-src="holder.js/200x200/auto/sky" class="img-responsive"
								alt="Generic placeholder thumbnail">
							<h4>
								Label
							</h4>
							<span class="text-muted">Something else</span>
						</div>
						<div class="col-xs-6 col-sm-3 placeholder">
							<img data-src="holder.js/200x200/auto/vine"
								class="img-responsive" alt="Generic placeholder thumbnail">
							<h4>
								Label
							</h4>
							<span class="text-muted">Something else</span>
						</div>
						<div class="col-xs-6 col-sm-3 placeholder">
							<img data-src="holder.js/200x200/auto/sky" class="img-responsive"
								alt="Generic placeholder thumbnail">
							<h4>
								Label
							</h4>
							<span class="text-muted">Something else</span>
						</div>
						<div class="col-xs-6 col-sm-3 placeholder">
							<img data-src="holder.js/200x200/auto/vine"
								class="img-responsive" alt="Generic placeholder thumbnail">
							<h4>
								Label
							</h4>
							<span class="text-muted">Something else</span>
						</div>
					</div>

					<h2 class="sub-header">
						Section title
					</h2>
					<div class="table-responsive">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>
										#
									</th>
									<th>
										Header
									</th>
									<th>
										Header
									</th>
									<th>
										Header
									</th>
									<th>
										Header
									</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										1,001
									</td>
									<td>
										Lorem
									</td>
									<td>
										ipsum
									</td>
									<td>
										dolor
									</td>
									<td>
										sit
									</td>
								</tr>
								<tr>
									<td>
										1,002
									</td>
									<td>
										amet
									</td>
									<td>
										consectetur
									</td>
									<td>
										adipiscing
									</td>
									<td>
										elit
									</td>
								</tr>
								<tr>
									<td>
										1,003
									</td>
									<td>
										Integer
									</td>
									<td>
										nec
									</td>
									<td>
										odio
									</td>
									<td>
										Praesent
									</td>
								</tr>
								<tr>
									<td>
										1,003
									</td>
									<td>
										libero
									</td>
									<td>
										Sed
									</td>
									<td>
										cursus
									</td>
									<td>
										ante
									</td>
								</tr>
								<tr>
									<td>
										1,004
									</td>
									<td>
										dapibus
									</td>
									<td>
										diam
									</td>
									<td>
										Sed
									</td>
									<td>
										nisi
									</td>
								</tr>
								<tr>
									<td>
										1,005
									</td>
									<td>
										Nulla
									</td>
									<td>
										quis
									</td>
									<td>
										sem
									</td>
									<td>
										at
									</td>
								</tr>
								<tr>
									<td>
										1,006
									</td>
									<td>
										nibh
									</td>
									<td>
										elementum
									</td>
									<td>
										imperdiet
									</td>
									<td>
										Duis
									</td>
								</tr>
								<tr>
									<td>
										1,007
									</td>
									<td>
										sagittis
									</td>
									<td>
										ipsum
									</td>
									<td>
										Praesent
									</td>
									<td>
										mauris
									</td>
								</tr>
								<tr>
									<td>
										1,008
									</td>
									<td>
										Fusce
									</td>
									<td>
										nec
									</td>
									<td>
										tellus
									</td>
									<td>
										sed
									</td>
								</tr>
								<tr>
									<td>
										1,009
									</td>
									<td>
										augue
									</td>
									<td>
										semper
									</td>
									<td>
										porta
									</td>
									<td>
										Mauris
									</td>
								</tr>
								<tr>
									<td>
										1,010
									</td>
									<td>
										massa
									</td>
									<td>
										Vestibulum
									</td>
									<td>
										lacinia
									</td>
									<td>
										arcu
									</td>
								</tr>
								<tr>
									<td>
										1,011
									</td>
									<td>
										eget
									</td>
									<td>
										nulla
									</td>
									<td>
										Class
									</td>
									<td>
										aptent
									</td>
								</tr>
								<tr>
									<td>
										1,012
									</td>
									<td>
										taciti
									</td>
									<td>
										sociosqu
									</td>
									<td>
										ad
									</td>
									<td>
										litora
									</td>
								</tr>
								<tr>
									<td>
										1,013
									</td>
									<td>
										torquent
									</td>
									<td>
										per
									</td>
									<td>
										conubia
									</td>
									<td>
										nostra
									</td>
								</tr>
								<tr>
									<td>
										1,014
									</td>
									<td>
										per
									</td>
									<td>
										inceptos
									</td>
									<td>
										himenaeos
									</td>
									<td>
										Curabitur
									</td>
								</tr>
								<tr>
									<td>
										1,015
									</td>
									<td>
										sodales
									</td>
									<td>
										ligula
									</td>
									<td>
										in
									</td>
									<td>
										libero
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>

		<!-- Bootstrap core JavaScript
    ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="<%=basePath%>/resources/jquery-1.10.2.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="<%=basePath%>/plugins/bootstrap/js/bootstrap.min.js"></script>
		<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
		<script src="<%=basePath%>/resources/assets/js/vendor/holder.js"></script>
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script
			src="<%=basePath%>/resources/assets/js/ie10-viewport-bug-workaround.js"></script>
	</body>
</html>
