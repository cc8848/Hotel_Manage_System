<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 16/1/2
  Time: 下午8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<s:set name="hotel" value="#session.hotel"/>
<style>
    .test_box {
        width: 400px;
        min-height: 120px;
        max-height: 300px;
        _height: 120px;
        margin-left: auto;
        margin-right: auto;
        padding: 3px;
        outline: 0;
        border: 1px solid #a0b3d6;
        font-size: 12px;
        word-wrap: break-word;
        overflow-x: hidden;
        overflow-y: auto;
        -webkit-user-modify: read-write-plaintext-only;
    }
</style>
<html>
<head>
    <title>评论页面</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<s:fielderror cssStyle="color:red"/>
<body>
<form action="comment.action" method="post">
    <table border="1" class="table table-hover">
        <tr>
            <th>旅店</th>
            <td><s:property value="#hotel.hotelName"/></td>
        </tr>
        <tr>
            <td class="text-center" colspan="2">
                <textarea name="message"></textarea>
            </td>
        </tr>
        <tr>
            <td class="text-right" colspan="2"><button class="btn btn-group">提交评论</button></td>
        </tr>

    </table>
</form>
</body>
</html>
