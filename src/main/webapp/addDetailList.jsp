
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>添加回复</title>
</head>
<body>
<form action="/saveDetail" method="post">
    <table>
        <tr style="text-align: center"><td colspan="3">添加回复</td></tr>
        <input type="hidden" name="invid" value="${invid}">
        <tr>
            <td>
                回复内容：
            </td>
            <td>
                <textarea name="content" id="" cols="30" rows="10"></textarea>
            </td>
        </tr>
        <tr>
            <td>
                回复昵称：
            </td>
            <td>
                <input type="text" name="autor" value="龙行天下">
            </td>
        </tr>
        <tr><td>___________</td><td>___________________</td></tr>
        <tr>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交"></td>
            <td><input type="button" value="返回"></td>
        </tr>
    </table>
</form>
</body>
</html>
