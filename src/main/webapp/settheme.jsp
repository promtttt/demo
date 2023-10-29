<%--
  Created by IntelliJ IDEA.
  User: kantaphong polmanee
  Date: 10/29/2023
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: ${cookie.bgk.value}">
<h2>select your theme</h2>
<form action="setThemecolor" method="post">
    <input type="radio" name="theme" value="cadetblue">
    <button style="background-color: cadetblue">cadetblue</button>
    <br>
    <input type="radio" name="theme" value="greenyellow">
    <button style="background-color: greenyellow">greenyellow</button>
    <br>
    <input type="radio" name="theme" value="darkgray">
    <button style="background-color: darkgray">darkgray</button>
    <br>
    <input type="submit" value="send">
</form>

</body>
</html>
