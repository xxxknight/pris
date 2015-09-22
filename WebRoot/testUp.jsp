<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
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

		<title>My JSP 'testUp.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<form action="updateBug" method="post" id="form1">

			<input type="text" id="id" name="bug.id">

			<input type="text" id="bname" name="bug.bname">

			<input type="text" id="edittime" name="bug.edittime">

			<input type="text" id="person" name="bug.person">

			<input type="text" id="attachment" name="bug.attachment">

			<textarea rows="6" id="description" name="bug.description"></textarea>

			<input type="submit" value="submit" />
		</form>
	</body>
</html>
