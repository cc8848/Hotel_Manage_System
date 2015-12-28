<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员主页</title>
</head>
<body>
    <h1>Welcome!</h1>
    <s:set name="admin" value="#session['admin']"/> <br>
    管理员:<s:property value="#admin.username"/> <br>
</body>
</html>
