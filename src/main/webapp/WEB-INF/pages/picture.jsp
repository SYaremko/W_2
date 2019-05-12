<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Solomiya
  Date: 13.10.2017
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>


    <table  border="1">
        <tr>
            <td>Title</td>
            <td>File</td>
        </tr>

<c:forEach items="${allProducts}" var="products">
    <tr>
        <td>${products.title} </td>
        <td> <img class="image-list" style="height: 150px; width: 180px"
                  src="${products.file}"></td>
    </tr>
</c:forEach>
    </table>
</body>
</html>
