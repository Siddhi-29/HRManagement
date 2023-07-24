<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #0055a5;
            margin-top: 40px;
        }

        form {
            max-width: 300px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
            margin-top: 30px;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        p.error-message {
            color: red;
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>Login</h2>
    <form action="login" method="get">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <input type="submit" value="Login">
    </form>

    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String message = "";

        if (username != null && password != null) {
            if (username.equals("user") && password.equals("123")) {
                // User login successful, redirect to the home page
                response.sendRedirect("hr_home.jsp");
            } else {
                // Invalid credentials, show error message
                message = "Invalid username or password";
            }
        }
    %>

    <%-- Display error message if present --%>
    <p class="error-message"><%= message %></p>
</body>
</html>
