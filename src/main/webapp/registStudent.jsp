

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>注册</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<form action="student/addStudent" method="post">
   用户名： <input type="text" name="username"/>
    密码：<input type="text" name="password"/>
    邮箱：<input type="text" name="email"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
