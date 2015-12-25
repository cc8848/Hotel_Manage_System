<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 15/12/25
  Time: 上午10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
<s:fielderror cssStyle="color:red"/>
<form action="userReg.action" method="post">
    <table border="1">
        <tr>
            <td>手机号:</td>
            <td><input name="phone" type="text"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="password" type="text"/></td>
        </tr>
    </table>
</form>
</body>
</html>
