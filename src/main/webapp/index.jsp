<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>首页</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<p>
<h2>整合SSM</h2></p>
<a href="registStudent.jsp">注册</a>
<a href="viewStudent">浏览</a>
</body>
</html>
