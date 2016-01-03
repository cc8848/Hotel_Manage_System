<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: stiles
  Date: 16/1/3
  Time: 上午10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理所有评论</title>
    <jsp:include page="../headOut.jsp"/>
    <jsp:include page="../head.jsp"/>
</head>
<s:fielderror cssStyle="color:red"/>
<body>
<s:iterator value="#request.list" id="comment">
    <div>
        <table border="1" cellspacing="1" class="table table-hover">
            <tr align="center" bgcolor="silver">
                <th width="100">旅店</th>
                <td><s:property value="#comment.hotel.hotelName"/></td>
                <th>评论内容</th>
                <td>时间: <s:property value="#comment.timeString"/></td>
            </tr>

            <tr>
                <td colspan="4"><s:property value="#comment.message"/></td>
            </tr>
            <tr>
                <th width="100">用户</th>
                <td colspan="3"><s:property value="#comment.user.nickname"/></td>
            </tr>
            <tr>
                <td colspan="4" class="text-right">
                    <a href="deleteComment.action?comment_id=<s:property value="#comment.id"/>"><button class="btn btn-danger">删 除</button></a>
                </td>
            </tr>
        </table>
    </div>
    <br>
</s:iterator>
<s:set name="page" value="#request.page"/>
<s:if test="#page.hasFirst">
    <a href="manageCommentsPage.action?pageNow=1">首页</a>
</s:if>
<s:if test="#page.hasPre">
    <a href="manageCommentsPage.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
</s:if>
<s:if test="#page.hasNext">
    <a href="manageCommentsPage.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
</s:if>
<s:if test="#page.hasLast">
    <a href="manageCommentsPage.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
</s:if>
</body>
</html>
