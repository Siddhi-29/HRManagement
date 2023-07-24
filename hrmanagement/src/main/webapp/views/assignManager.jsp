<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Manager</title>
</head>
<body>
    <h2>Assign Manager</h2>
    
<form action="/assignManager/${candidate.empId}" method="post">
    <label for="managerId">Select Manager:</label>
    <select id="managerId" name="managerId" required>
        <option value="" selected disabled>Select Manager</option>
        <c:forEach items="${managers}" var="manager">
            <option value="${manager.empId}">${manager.name}</option>
        </c:forEach>
    </select>
    <br>
    <input type="submit" value="Assign Manager">
</form>
</body>
</html>






