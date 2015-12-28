<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>旅店注册</title>
</head>
<body>
<s:fielderror cssStyle="color:red"/>
<form action="hotelReg.action" method="post">
    <table border="1">
        <tr>
            <td>旅店名称</td>
            <td><input type="text" name="hotel.hotelName" /></td>
        </tr>

        <tr>
            <td>密码:</td>
            <td><input type="password" name="hotel.password" /></td>
        </tr>
        <tr>
            <td>星级:</td>
            <td>
                <select name="hotel.star">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>地址:</td>
            <td><input type="text" name="hotel.address"/></td>
        </tr>
        <tr>
            <td>电话:</td>
            <td><input type="text" name="hotel.telephone"/></td>
        </tr>
        <tr>
            <s:submit align="center" value="注册"/>
            <s:reset align="center" value="重置"/>
        </tr>
    </table>
</form>
</body>
</html>
