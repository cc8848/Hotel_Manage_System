<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 15/12/25
  Time: 下午5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>管理员登陆</title>
</head>
<body>
<form action=".action" method="post">
    <table border="1">
        <tr>
            <td>账号:</td>
            <td><input name="username" type="text"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="password" type="password"/></td>
        </tr>
        <tr><s:submit align="center" value="登陆"/> </tr>
    </table>
</form>
</body>
</html>
