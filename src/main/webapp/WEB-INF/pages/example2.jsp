<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Solomiya
  Date: 28.09.2017
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Example 2 GET</title>
</head>
<body>
<a href="/main">Main Page</a> <br>
<form action="save2" method="GET" <%--enctype="multipart/form-data"--%>>
    <div >
        Title 2
        <input type="text" name="title"/>
    </div>

    <div >
        File 2
        <input type="file" name="file" >
    </div>

    <div class="submits">
        <input type="submit" name="submit" value="Create">
    </div>
</form>
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
