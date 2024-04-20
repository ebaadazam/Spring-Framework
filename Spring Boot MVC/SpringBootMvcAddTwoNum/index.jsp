<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Demo</title>
</head>
<body>
<!-- Just a layout for entering the two numbers -->
<h3>Enter Two Numbers</h3>
    <form action="add" method="post">
        <div>
            <label for="num1">Number 1:</label>
            <input type="number" id="num1" name="num1" required>
        </div>
        <div>
            <label for="num2">Number 2:</label>
            <input type="number" id="num2" name="num2" required>
        </div>
        <div> 
            <button type="submit">Submit</button>
        </div>
    </form>
</body>
</html>
