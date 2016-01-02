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
    <jsp:include page="../headOut.jsp"/>
    <title>登陆界面</title>
</head>
<body>
<jsp:include page="../head.jsp"/>
<s:fielderror cssStyle="color:red"/>
<form action="userLog.action" method="post">
    <table border="1" class="table table-hover">
        <tr class="info">
            <td>手机号:</td>
            <td><input name="phone" type="text"/></td>
        </tr>
        <tr class="warning">
            <td>密码:</td>
            <td><input name="password" type="password"/></td>
        </tr>
        <tr class="text-center">
            <td colspan="2">
                <input type="submit" value="登录" class="btn btn-primary"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
