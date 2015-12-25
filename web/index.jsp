<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 15/12/16
  Time: 下午3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <title>HomePage</title>
    </head>
    <body>
    <h1>Welcome!</h1>
    <s:set name="user" value="#session['user']"/>
    手机: <s:property value="#user.phone"/>
    昵称: <s:property value="#user.nickname"/>
    姓名: <s:property value="#user.name"/>
    </body>
</html>
