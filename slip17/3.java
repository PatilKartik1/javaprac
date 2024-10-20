// Q2. Write a JSP program to perform Arithmetic operations such as Addition and Subtraction.
// Design a HTML to accept two numbers in text box and radio buttons to display operations. On
// submit display result as per the selected operation on next page using JSP

//Step 1: Create the HTML Form (index.html)
<!DOCTYPE html>
<html>
<head>
    <title>Arithmetic Operations</title>
</head>
<body>
    <h2>Arithmetic Operations</h2>
    <form action="result.jsp" method="post">
        <label for="num1">Number 1:</label>
        <input type="text" id="num1" name="num1" required><br><br>
        
        <label for="num2">Number 2:</label>
        <input type="text" id="num2" name="num2" required><br><br>
        
        <label>Select Operation:</label><br>
        <input type="radio" id="add" name="operation" value="add" checked>
        <label for="add">Addition</label><br>
        <input type="radio" id="subtract" name="operation" value="subtract">
        <label for="subtract">Subtraction</label><br><br>
        
        <input type="submit" value="Calculate">
    </form>
</body>
</html>


//Step 2: Create the JSP Page (result.jsp)
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String num1Str = request.getParameter("num1");
    String num2Str = request.getParameter("num2");
    String operation = request.getParameter("operation");

    double num1 = Double.parseDouble(num1Str);
    double num2 = Double.parseDouble(num2Str);
    double result = 0;

    if ("add".equals(operation)) {
        result = num1 + num2;
    } else if ("subtract".equals(operation)) {
        result = num1 - num2;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <h2>Result</h2>
    <p>Number 1: <%= num1 %></p>
    <p>Number 2: <%= num2 %></p>
    <p>Operation: <%= operation %></p>
    <p>Result: <%= result %></p>
    <a href="index.html">Back</a>
</body>
</html>
