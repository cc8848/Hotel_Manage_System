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
<s:fielderror cssStyle="color:red"/>
<form action="userReg" method="post">
    手机号:<input type="text" name="user.phone" /> <br>
    密码:<input type="password" name="user.password" /> <br>
    昵称:<input type="text" name="user.nickname"/> <br>
    真实姓名:<input type="text" name="user.name"/> <br>
    身份证号:<input type="text" name="user.IDCard"/> <br>
    <s:submit align="left"/>
</form>
</body>
</html>
