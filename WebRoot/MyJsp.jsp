<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'MyJsp.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!-- DataTables CSS -->
		<link rel="stylesheet" type="text/css"
			href="plugins/datatable/css/jquery.dataTables.css">

		<!-- jQuery -->
		<script type="text/javascript" src="resources/jquery-1.10.2.min.js"></script>

		<!-- DataTables -->
		<script type="text/javascript"
			src="plugins/datatable/js/jquery.dataTables.js"></script>
		<script type="text/javascript">
	$(document).ready(function() {
		$('#table_id').DataTable( {
			ajax: {
                url: "listBug"
            },
            columns: [
                {"data": "id"},
                {"data": "bname"},
                {"data": "edittime"},
                {"data": "description"},
                {"data": "attachment"},
                {"data": "person"}
            ]
		});

	});
</script>
	</head>

	<body>
		<table id="table_id" class="display">
			<thead>
				<tr>
					<th>
						id
					</th>
					<th>
						bugname
					</th>
					<th>
						edittime
					</th>
					<th>
						description
					</th>
					<th>
						attachment
					</th>
					<th>
						person
					</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</body>
</html>
