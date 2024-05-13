<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    <!-- JstL -->

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>产品列表</title>
</head>
<body>
<div>
    <h2>商品信息列表</h2>
    <table class="table table-bordered">
        <tr>
            <th>编号</th>
            <th>名称</th>
            <th>价格</th>
            <th>详情</th>
        </tr>
        <c:forEach var="p" items="${prolist}">
            <tr>
                <td><c:out value="${p.id}"></c:out></td>
                <td><c:out value="${p.name}"></c:out></td>
                <td><c:out value="${p.price}"></c:out></td>
                <td><c:out value="${p.detail}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>