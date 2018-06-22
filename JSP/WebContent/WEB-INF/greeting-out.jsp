<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<p>こんにちは、<%=request.getParameter("user") %>さん!</p>
<form method="post" action="total-out.jsp">
<input type="text" name="teihen">
底辺 ×
<input type="text" name="tahasa">
高さ ÷ ２ ＝
<input type="submit" value="計算">



</form>
</body>
</html>