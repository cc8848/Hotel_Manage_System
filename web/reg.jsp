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
    <form action="userReg.action" method="post">
        <input type="text" name="user.ID"/><br>
        <input type="password" name="user.password"/><br>
        <input type="submit">
    </form>
</body>
</html>
