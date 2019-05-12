<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page 1</title>
</head>
<body>
<p><a href="example1" ><button>Example 1 POST</button> </a></p>

<p><a href="example2" ><button>Example 2 GET</button> </a></p>

<p><a href="example3" ><button>Example 3 Ajax</button> </a></p>

<a href="/picture">picture</a>
<%--<table>


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
    </table>--%>
</body>
</html>
