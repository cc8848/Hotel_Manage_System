<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 16/1/2
  Time: 下午4:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>房间详情</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<s:set name="room" value="#session.room"/>
<body>
<form action="hotelUpdateRoom.action" method="post">
    <table border="1" class="table table-hover">
        <tr>
            <th>房间号</th>
            <td><s:property value="#room.no"/></td>
        </tr>
        <tr>
            <th>每晚价格</th>
            <td><input name="price" type="text" value="<s:property value="#room.pricePerNight"/>"></td>
        </tr>
        <tr>
            <th>是否有人入住</th>
            <td>
                <select name="empty">
                    <option value="true">否</option>
                    <option value="false">是</option>
                </select>
            </td>
        </tr>
        <tr class="text-center">
            <td colspan="2">
                <button class="btn btn-primary">提交</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
