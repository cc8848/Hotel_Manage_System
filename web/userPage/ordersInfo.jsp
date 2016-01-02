<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户订单信息</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<body>
<table border="1" cellspacing="1" cellpadding="8" width="700" class="table table-hover">
    <tr align="center" bgcolor="silver">
        <th>订单号</th>
        <th>旅店</th>
        <th>价格</th>
        <th>查看</th>
    </tr>
    <s:iterator value="#request.list" id="order">
        <tr>
            <td><s:property value="#order.id"/></td>
            <td><s:property value="#order.room.hotel.hotelName"/> </td>
            <td><s:property value="#order.price"/> </td>
            <td>
                <a href="orderDetails.action?order_id=<s:property value="#order.id"/>"><button class="btn btn-primary">查看详情</button></a>
            </td>
        </tr>
    </s:iterator>
    <s:set name="page" value="#request.page"/>
    <s:if test="#page.hasFirst">
        <a href="ordersInfo.action?pageNow=1">首页</a>
    </s:if>
    <s:if test="#page.hasPre">
        <a href="ordersInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
    </s:if>
    <s:if test="#page.hasNext">
        <a href="ordersInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
    </s:if>
    <s:if test="#page.hasLast">
        <a href="ordersInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
    </s:if>
</table>
</body>
</html>
