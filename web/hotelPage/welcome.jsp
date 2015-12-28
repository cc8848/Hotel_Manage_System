<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎</title>
</head>
<body>
    <h1>Welcome!</h1>
    <s:set name="hotel" value="#session['hotel']"/> <br>
    旅店名称:<s:property value="#hotel.hotelName"/> <br>
    旅店地址:<s:property value="#hotel.address"/> <br>
    旅店星级:<s:property value="#hotel.star"/> <br>
    旅店电话:<s:property value="#hotel.telephone"/> <br>
</body>
</html>
