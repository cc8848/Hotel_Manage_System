<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加房间页面</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<body>
<form action="addRooms.action" method="post">
    <table border="1" class="table table-hover">
        <tr>
            <td>房间价格(每晚):</td>
            <td><input name="room.pricePerNight" type="text"/></td>
        </tr>
        <tr>
            <td>房间号</td>
            <td><input name="No" type="text"/></td>
        </tr>
        <tr>
            <td>房间大小:</td>
            <td>
                <select name="room.type">
                    <option value="1">小</option>
                    <option value="2">中</option>
                    <option value="3">大</option>
                </select>
            </td>
        </tr>
        <tr><td colspan="2">
            <input type="submit" value="登录" class="btn btn-primary"/>
        </td></tr>
    </table>
</form>
</body>
</html>
