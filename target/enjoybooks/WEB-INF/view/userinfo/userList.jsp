<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息列表</title>
</head>
<body>
	<div align="center">
		<h3>用户信息列表</h3>
		<hr>
		<div>
			<table width="70%" border="1px" cellspacing="0" bordercolor="#00FFFF">
				<tr>
					<th>用户编号</th><th>用户名称</th><th>性别</th><th>手机号</th><th>邮箱</th>
				</tr>
				<c:forEach items="${requestScope.userData }" var="user">
				<tr>
					<td>${user.userNo }</td><td>${user.userName }</td><td>${user.gender }</td><td>${user.phoneNo }</td><td>${user.email }</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>