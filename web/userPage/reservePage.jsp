<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 15/12/30
  Time: 上午11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>预定页面</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="./headUser.jsp"/>
</head>
<body>
<s:fielderror cssStyle="color:red"/>
<s:set name="room" value="#session['room']"/>
<s:set name="user" value="#session['user']"/>
<form action="reserveRoom.action" method="post">
    <table border="1" class="table table-hover">
        <tr>
            <th colspan="2" class="text-center">房间详情</th>
        </tr>
        <tr>
            <td>酒店名称</td>
            <td><s:property value="#room.hotel.hotelName"/> </td>
        </tr>
        <tr>
            <td>旅店地址</td>
            <td><s:property value="#room.hotel.address"/></td>
        </tr>
        <tr>
            <td>旅店星级</td>
            <td><s:property value="#room.hotel.star"/></td>
        </tr>
        <tr>
            <td>旅店电话</td>
            <td><s:property value="#room.hotel.telephone"/></td>
        </tr>
        <tr>
            <td>房间种类</td>
            <td>
                <s:if test="#room.hotel.type==1">小</s:if>
                <s:elseif test="#room.hotel.type==2">中</s:elseif>
                <s:else>大</s:else>
            </td>
        </tr>
        <tr>
            <td>房间号</td>
            <td><s:property value="#room.No"/> </td>
        </tr>
        <tr>
            <td>房间价格</td>
            <td><s:property value="#room.pricePerNight"/></td>
        </tr>
        <tr>
            <td>入住时间</td>
            <td><input type="date" name="start"></td>
        </tr>
        <tr>
            <td>退房时间</td>
            <td><input type="date" name="end"></td>
        </tr>
        <tr>
            <td>用户</td>
            <td>
                <s:if test="#user!=null">
                    <s:property value="#user.phone"/>
                </s:if>
                <s:else>
                    <input name="phone" type="text"/>
                </s:else>
            </td>
        </tr>
        <tr class="text-center">
            <td colspan="2">
                <button type="submit" value="提交订单" class="btn btn-primary">提交订单</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
