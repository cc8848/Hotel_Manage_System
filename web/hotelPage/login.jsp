<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 15/12/27
  Time: 下午7:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>旅店登陆</title>
</head>
<body>
<s:fielderror cssStyle="color:red"/>
<form action="hotelLog.action" method="post">
    <table border="1">
        <tr>
            <td>旅店名称:</td>
            <td><input name="name" type="text"/></td>
        </tr>
        <tr>
            <td>旅店密码:</td>
            <td><input name="password" type="password"/></td>
        </tr>
        <tr><s:submit align="center" value="登陆"/> </tr>
    </table>
</form>
</body>
</html>
