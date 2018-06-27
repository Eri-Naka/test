<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<s:property value="send" />

	<s:form action="PlaceAction">
		<s:textfield name="place" lavel="出身地" />
		<s:hidden name="valueAAA" value="%{send}" />
		<s:submit value="送信" />
	</s:form>
</body>
</html>