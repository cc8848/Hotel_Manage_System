<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 16/1/3
  Time: 上午10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看评论</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<body>
<s:iterator value="#request.list" id="comment">
    <div>
        <table border="1" cellspacing="1" class="table table-hover">
            <tr align="center" bgcolor="silver">
                <th width="100">用户</th>
                <th width="700">评论内容</th>
                <td>时间: <s:property value="#comment.timeString"/></td>
            </tr>

            <tr>
                <td><s:property value="#comment.user.nickname"/></td>
                <td colspan="2"><s:property value="#comment.message"/></td>
            </tr>
        </table>
    </div>
    <br>
</s:iterator>
</body>
</html>
