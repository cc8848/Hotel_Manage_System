<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="./headIn.jsp"/>
    <title>Error</title>
</head>
<body>
<s:set name="errorMessage" value="#session['error']"/>
<jsp:include page="./headIndex.jsp"/>
    <h1>Some errors happened!</h1> <br>
    <h1><s:property value="#errorMessage"/></h1>

</body>
</html>
