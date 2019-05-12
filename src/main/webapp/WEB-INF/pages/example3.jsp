<%--
  Created by IntelliJ IDEA.
  User: Solomiya
  Date: 29.09.2017
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Example 3 Ajax </title>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
</head>
<body>
<a href="/main">Main Page</a> <br>
NAME:
<input type="text" name="name">

<button id="save">Save</button>
<button id="show">Show</button>
<div id="showAll"></div>
<a href="/next">Next</a>
<script src="/javascript/AddUser.js"></script>
</body>
</html>
