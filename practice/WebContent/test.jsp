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

	<s:form action="NameAction">
		<s:textfield name="name" label="氏名" />
		<s:textfield name="age" label="年齢" />
		<s:submit value="送信" />
	</s:form>

</body>
</html>