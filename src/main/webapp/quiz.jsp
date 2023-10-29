<%--
  Created by IntelliJ IDEA.
  User: kantaphong polmanee
  Date: 10/28/2023
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Quiz</title>
</head>
<body style="background-color: ${cookie.bgk.value}">
<h1>Quiz</h1>
<h2>${requestScope.question.title}</h2>
<form action="QuizController" method="post">
    <x:forEach items="${requestScope.question.options}" var="option" varStatus="vs">
        <label>
            <input type="radio" name="option" value="${vs.index}">${option}
        </label>
        <br>
    </x:forEach>
    <input type="submit" value="send">
</form>
</body>
</html>
