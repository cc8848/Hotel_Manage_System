<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 16/1/2
  Time: 下午2:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>房间详情</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<body>
<table border="1" cellspacing="1" cellpadding="8" width="700" class="table table-hover">
    <tr align="center" bgcolor="silver">
        <th>房间号</th>
        <th>是否住人</th>
        <th>房间价格(每晚)</th>
        <th>操作</th>
    </tr>
    <s:iterator value="#session.list" id="room">
        <tr>
            <td><s:property value="#room.no"/> </td>
            <td>
                <s:if test="#room.empty==true">否</s:if>
                <s:else>是</s:else>
            </td>
            <td><s:property value="#room.pricePerNight"/> </td>
            <td>
                <a href=""><button class="btn btn-primary">修改</button></a>
                <a href=""><button class="btn btn-danger">删除</button></a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
