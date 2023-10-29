<%--
  Created by IntelliJ IDEA.
  User: kantaphong polmanee
  Date: 10/28/2023
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body style="background-color: ${cookie.bgk.value}">
<h1>Your score is ${requestScope.score}</h1>
<a href="ResetQuizServlet">Reset</a>
</body>
</html>
