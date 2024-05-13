<%--
  Created by IntelliJ IDEA.
  User: Kobe
  Date: 2024/5/13
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>添加古董信息</h2>

<form action="method/items" method="post">
    <p>宝贝主人:<input type="text" name="ownerName"></p>
    <p>宝贝名称:<input type="text" name="itemName"></p>
    <p>宝贝价格:<input type="text" name="itemPrice"></p>
    <button type="submit">添加</button>
</form>
</body>
</html>
