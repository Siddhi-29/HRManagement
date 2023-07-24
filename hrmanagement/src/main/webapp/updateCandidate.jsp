<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Candidate</title>
</head>
<body>
    <h1>Update Candidate</h1>
    <form method="post" action="/updateCandidate">
        <input type="hidden" name="empId" value="${candidate.empId}">

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${candidate.name}" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="${candidate.email}" required><br>

        <label for="managerId">Manager ID:</label>
        <input type="text" id="managerId" name="managerId" value="${candidate.managerId}" required><br>

        <input type="submit" value="Update Candidate">
    </form>
</body>
</html>