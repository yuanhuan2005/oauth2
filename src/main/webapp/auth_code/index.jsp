<%@ page contentType="text/html;charset=gbk"%>
<%@ page language="java" import="java.sql.*" errorPage=""%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Auth code</title>
<script language="javascript">
	function loadimage() {
		document.getElementById("randImage").src = "image.jsp?" + Math.random();
	}
</script>
</head>
<body>
	<table width="356" border="0" cellpadding="0" cellspacing="0">
		<!--DWLayoutTable-->
		<form action="validate.jsp" method="post" name="loginForm">
			<tr>
				<td width="118" height="22" valign="middle" align="center"><input
					type="text" name="rand" size="15">
				</td>
				<td width="138" valign="middle" align="center"><img
					alt="code..." name="randImage" id="randImage" src="image.jsp"
					width="60" height="20" border="1" align="absmiddle">
				</td>
				<td width="100" height="22" colspan="2" align="center" valign="left">
					<a href="javascript:loadimage();"><font class=pt95>Refresh</font></a>
				</td>
			</tr>
			<br>
			<tr>
				<td height="36" colspan="2" align="left" valign="middle"><input
					type="submit" name="login" value="Submit"></td>
			</tr>
		</form>
	</table>
</body>
</html>