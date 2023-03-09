<%--
  Created by IntelliJ IDEA.
  User: kevinfowler
  Date: 3/9/23
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>

<form method="POST">

  <div>
    <label>Pick a number betwen 1 and 3.</label>
    <input type="number" id="numberGuess" name="numberGuess"><br><br>
  </div>

  <p>
    <button type="submit">Submit</button>
  </p>

</form>

</body>
</html>
