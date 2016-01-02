<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 15/12/30
  Time: 下午8:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单提交成功</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<s:set value="#session['order']" name="order"/>
<body>
<h1>订单已经成功提交!</h1>
<h2>您的订单号为: <s:property value="#order.id"/> </h2>
<h3><a href="/hotelmanager/index.jsp">返回主页</a></h3>
</body>
</html>
