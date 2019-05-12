<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Example 1 POST</title>
</head>
<body>
<a href="/main">Main Page</a> <br>
<form action="save1" method="post" enctype="multipart/form-data">
    <div >
        Title 1
        <input type="text" name="title"/>
    </div>

    <div >
      File 1
        <input type="file" name="file">
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
