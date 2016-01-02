<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>旅店注册</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<body>
<s:fielderror cssStyle="color:red"/>
<form action="hotelReg.action" method="post">
    <table border="1" class="table table-hover">
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
        <tr class="text-center">
            <td colspan="2">
                <input type="button" value="登录" class="btn btn-primary"/>
            </td>
        </tr>
        <tr class="text-center">
            <td colspan="2">
                <input type="reset" value="重置" class="btn btn-warning"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
