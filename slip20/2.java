// Q2. Write a JSP program to perform Arithmetic operations such as Multiplication and Divison.
// Design a HTML to accept two numbers in text box and radio buttons to display operations. On
// submit display result as per the selected operation on next page using JSP.
// [20 Marks]

//HTML Page (arithmeticForm.html):
<!DOCTYPE html>
<html>
<head>
    <title>Arithmetic Operations</title>
</head>
<body>
    <h2>Enter Two Numbers</h2>
    <form action="arithmetic.jsp" method="post">
        <label for="num1">First Number:</label>
        <input type="text" name="num1" required><br><br>

        <label for="num2">Second Number:</label>
        <input type="text" name="num2" required><br><br>

        <label for="operation">Choose Operation:</label><br>
        <input type="radio" name="operation" value="multiply" checked> Multiply<br>
        <input type="radio" name="operation" value="divide"> Divide<br><br>

        <input type="submit" value="Calculate">
    </form>
</body>
</html>

//JSP Page (arithmetic.jsp):
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Arithmetic Operation Result</title>
</head>
<body>
    <h2>Result</h2>

    <%
        // Retrieve form data
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");

        // Convert strings to numbers
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double result = 0;

        // Perform the selected operation
        if ("multiply".equals(operation)) {
            result = num1 * num2;
            out.println("<p>Multiplication Result: " + result + "</p>");
        } else if ("divide".equals(operation)) {
            if (num2 != 0) {
                result = num1 / num2;
                out.println("<p>Division Result: " + result + "</p>");
            } else {
                out.println("<p>Cannot divide by zero!</p>");
            }
        }
    %>
</body>
</html>

