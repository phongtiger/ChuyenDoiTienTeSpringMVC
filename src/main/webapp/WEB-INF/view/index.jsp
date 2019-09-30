<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="${pageContext.request.contextPath}/result">
  <label>Rate: </label><br/>
  <input type="text" name = "rate" placeholder="RATE" value="${requestScope["memory"].getRate()}"/><br/>
  <label>USD: </label><br/>
  <input type="text" name = "usd" placeholder="USD" value="${requestScope["memory"].getUsd()}"/><br/>
  <input type = "submit" value = "Converter"/>
</form>
<p>${ketqua}</p>
</body>
</html>
