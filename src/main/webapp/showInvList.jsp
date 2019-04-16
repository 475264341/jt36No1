<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/4/9
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>查看回复列表</title>
</head>
<body>
    <table border="1" style="text-align: center">
        <tr><a href="/toAddDeta/${id}">添加回复</a></tr>
        <tr style="background-color: aquamarine;">
            <td>回复内容</td>
            <td>回复昵称</td>
            <td>回复时间</td>
        </tr>
        <c:forEach items="${detailList}" var="deta">
            <tr>
                <td>${deta.content}</td>
                <td>${deta.autor}</td>
                <td>
                    <fmt:formatDate value="${deta.createDate}" pattern="yyyy-MM-dd"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
