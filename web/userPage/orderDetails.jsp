<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 16/1/2
  Time: 下午12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单详情</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="./headUser.jsp"/>
</head>
<s:set name="start" value="#session['start']"/>
<s:set name="end" value="#session['end']"/>
<s:set name="order" value="#session['order']"/>
<s:set name="user" value="#session['user']"/>
<body>
    <table border="1" cellspacing="1" cellpadding="8" width="700" class="table table-hover">
        <tr>
            <td>订单号</td>
            <td><s:property value="#order.id"/></td>
        </tr>
        <tr>
            <td>旅店</td>
            <td><s:property value="#order.room.hotel.hotelName"/> </td>
        </tr>
        <tr>
            <td>旅店地址</td>
            <td><s:property value="#order.room.hotel.address"/></td>
        </tr>
        <tr>
            <td>旅店星级</td>
            <td><s:property value="#order.room.hotel.star"/></td>
        </tr>
        <tr>
            <td>旅店电话</td>
            <td><s:property value="#order.room.hotel.telephone"/></td>
        </tr>
        <tr>
            <td>房间号</td>
            <td><s:property value="#order.room.no"/></td>
        </tr>
        <tr>
            <td>价格</td>
            <td><s:property value="#order.price"/></td>
        </tr>
        <tr>
            <td>入住时间</td>
            <td><s:property value="#start"/></td>
        </tr>
        <tr>
            <td>退房时间</td>
            <td><s:property value="#end"/></td>
        </tr>
        <tr>
            <td>用户</td>
            <td><s:property value="#order.user.nickname"/></td>
        </tr>
        <tr>
            <td>是否有效</td>
            <td>
                <s:if test="#order.ifValid==true">
                    有效
                </s:if>
                <s:else>
                    无效
                </s:else>
            </td>
        </tr>
    </table>
</body>
</html>
