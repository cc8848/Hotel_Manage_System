<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 16/1/2
  Time: 下午4:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>预定信息</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<body>
<table border="1" cellspacing="1" cellpadding="8" width="700" class="table table-hover">
    <tr align="center" bgcolor="silver">
        <th>订单号</th>
        <th>房间</th>
        <th>价格</th>
        <th>预定客户电话</th>
        <th>操作</th>
    </tr>
    <s:iterator value="#request.list" id="order">
        <tr>
            <td><s:property value="#order.id"/></td>
            <td><s:property value="#order.room.no"/> </td>
            <td><s:property value="#order.price"/> </td>
            <td><s:property value="#order.user.phone"/> </td>
            <td>
                <a href=""><button class="btn btn-primary">接受</button></a>
                <a href=""><button class="btn btn-danger">删除</button></a>
            </td>
        </tr>
    </s:iterator>
    <s:set name="page" value="#request.page"/>
    <s:if test="#page.hasFirst">
        <a href="hotelOrdersInfo.action?pageNow=1">首页</a>
    </s:if>
    <s:if test="#page.hasPre">
        <a href="hotelOrdersInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
    </s:if>
    <s:if test="#page.hasNext">
        <a href="hotelOrdersInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
    </s:if>
    <s:if test="#page.hasLast">
        <a href="hotelOrdersInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
    </s:if>
</table>
</body>
</html>
