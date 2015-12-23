<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 15/12/22
  Time: 下午8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>游客注册</title>
</head>
<body>
<form action="userReg" method="post">
    <s:textfield name="user.phone" label="手机号"/> <br>
    <s:password name="user.password" label="密码"/> <br>
    <s:textfield name="user.nickname" label="昵称"/> <br>
    <s:textfield name="user.name" label="真实姓名"/> <br>
    <s:textfield name="user.IDCard" label="身份证号"/> <br>
    <s:submit align="left"/>
</form>
</body>
</html>
