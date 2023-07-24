<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Candidate</title>
</head>
<body>
    <h1>Add Candidate</h1>
    <form method="post" action="/addCandidate">
        <label for="empId">Employee ID:</label>
        <input type="text" id="empId" name="empId" required><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="managerId">Manager ID:</label>
        <input type="text" id="managerId" name="managerId" required><br>

        <input type="submit" value="Add Candidate">
    </form>
</body>
</html>