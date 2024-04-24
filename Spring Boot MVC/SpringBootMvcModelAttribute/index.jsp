<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<!-- DOCTYPE HTML -->
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Demo</title>
</head>
<body>
<h3>Enter Two Numbers</h3>
    <form action="addWatch" method="post">
        <div>
            <label for="price">Enter the Watch Price:</label>
            <input type="number" id="price" name="price" required>
        </div>
        <div>
            <label for="model">Enter the Watch Name:</label>
            <input type="text" id="model" name="model" required>
        </div>
        <div> 
            <button type="submit">Submit</button>
        </div>
    </form>
</body>
</html>
