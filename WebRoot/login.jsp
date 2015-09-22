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
		<meta name="robots" content="noindex">

		<title>后台登录</title>
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>/resources/css/admin/login.css">

	</head>
	<body>
		<div id="page"
			style="width: 800px; text-align: center; background-color: #F8F8F8">


			<br>
			<br>
			<br>
			<br>
			<br>
			<br>

			<form name="form1" id="form1" action="loginAction" method="post"
				onsubmit="return checkForm1(this)">

				<fieldset id="login">
					<legend>
						BUPT-pris USER LOGIN
					</legend>

					<table width="100%" cellspacing="10">
						<tr class="login_table_left">
							<td width="100" align="right" class="label">
								Username
							</td>
							<td>
								<input name="username" id="username" type="text" maxlength="32"
									autofocus="autofocus" class="input" tabindex="1" size="24"
									border="0" />
							</td>
							</td>
							<tr class="login_table_left">
								<td width="100" align="right" class="label">
									Password
								</td>
								<td>
									<input name="password" id="password" type="password"
										maxlength="28" tabindex="2" class="input" size="24" border="0" />
								</td>
								</td>
					</table>

					<input class="button" type="submit" value="Log in"
						style="margin-top: 10px">
					<p class="hint" style="margin-bottom: 0px">
						该网站不允许注册
					</p>
				</fieldset>
			</form>


			<div class="hint">
				<a href="<%=basePath%>index">回到前台首页</a>
			</div>



			<br>
			<br>
			<br>
			<br>
			<br>
			<br>

		</div>
	</body>
</html>
