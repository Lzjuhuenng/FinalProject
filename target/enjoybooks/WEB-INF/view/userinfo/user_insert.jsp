<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h3>用户信息添加</h3>
<hr>
<div>
	<form action="${pageContext.request.contextPath }/insertUser">
	<table>
		<tr>
			<td>用户编号:</td><td><input type="text" name="userNo"> </td>
		</tr>
		<tr>
			<td>用户姓名:</td><td><input type="text" name="userName"> </td>
		</tr>
		<tr>
			<td>性别:</td>
			<td>
				<c:forEach items="${genderMap }" var="gender">
					<input type="radio" name="gender" value="${gender.key }">${gender.value}
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td>用户邮箱:</td><td><input type="text" name="email"> </td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="提交" /> </td>
		</tr>
	</table>
	</form>
</div>
</div>

</body>
</html>