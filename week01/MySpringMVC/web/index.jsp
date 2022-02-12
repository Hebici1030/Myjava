<%--
  Created by IntelliJ IDEA.
  User: Hasee
  Date: 2022/2/8
  Time: 下午 8:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
未注册的用户，请
<a href="${pageContext.request.contextPath }/user/register"> 注册</a>！
<br /> 已注册的用户，去
<a href="${pageContext.request.contextPath }/user/login"> 登录</a>！
</body>
</html>