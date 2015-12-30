<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 15/12/29
  Time: 下午7:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>房间查询页面</title>
</head>
<body>
    <table border="1" cellspacing="1" cellpadding="8" width="700">
        <tr align="center" bgcolor="silver">
            <th>酒店名称</th>
            <th>房间种类</th>
            <th>价格</th>
        </tr>
        <s:iterator value="#request.list" id="room">
            <tr>
                <td><s:property value="#room.hotel.hotelName"/></td>
                <td>
                    <s:if test="#room.type==1">小</s:if>
                    <s:elseif test="#room.type==2">中</s:elseif>
                    <s:else>大</s:else>
                </td>
                <td><s:property value="#room.pricePerNight"/> </td>
                <td><a href="#">预定</a></td>
            </tr>
        </s:iterator>
        <s:set name="page" value="#request.page"/>
        <s:if test="#page.hasFirst">
            <a href="roomsInfo.action?pageNow=1">首页</a>
        </s:if>
        <s:if test="#page.hasPre">
            <a href="roomsInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
        </s:if>
        <s:if test="#page.hasNext">
            <a href="roomsInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
        </s:if>
        <s:if test="#page.hasLast">
            <a href="roomsInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
        </s:if>
    </table>
</body>
</html>
