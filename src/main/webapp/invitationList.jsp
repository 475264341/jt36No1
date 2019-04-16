<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/4/9
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>帖子列表</title>
</head>
<body>
<table border="1" style="align-content: center">
    <tr>
        <td colspan="5"> <h1>帖子列表</h1></td>
    </tr>
    <tr>
        <form action="/queryPage/1" method="post">
             <td>帖子标题：<input type="text" name="title" value="${title}"><input type="submit" value="搜索" ></td>
        </form>
    </tr>
    <tr style="text-align: center;background-color: gray">
        <td>标题</td>
        <td>内容摘要</td>
        <td>作者</td>
        <td>发布时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${page.pageList}" var="inv">
        <tr>
            <td>${inv.title}</td>
            <td>${inv.summary}</td>
            <td>${inv.author}</td>
            <td><fmt:formatDate value="${inv.createDate}" pattern="yyyy-MM-dd"/></td>
            <td><a href="/showDetaList/${inv.id}">查看回复</a>||<a href="/delInvitation/${inv.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
    <div>第${page.currentPage}<%--当前页--%>/${page.pageSum}页<%--总页数--%>
        <span><a href="/queryPage/1?title=${title}">首页</a></span><%--点击首页请求--%>
        <span><a href="/queryPage/${page.currentPage-1}?title=${title}">上一页</a></span>
        <span><a href="/queryPage/${page.currentPage+1}?title=${title}">下一页</a></span>
        <span><a href="/queryPage/${page.pageSum}?title=${title}">末页</a></span>
    </div>
</body>
</html>
