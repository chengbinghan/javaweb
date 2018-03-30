<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/29
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

欢迎login，请输入用户名和密码 idea
<form method="post" action="/user/login">
    <p>姓名：<input type="text" name="name" size="10"></p>

    <p>密码：<input type="password" name="password" size="10"></p>

    <p><input type="submit" value="确定">
        <input type="reset" value="取消"></p>
</form>

</body>
</html>
