<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Details</title>
</head>
<body>
    <h1>Manager Details</h1>
    <h2>${manager.name} (Employee ID: ${manager.empId})</h2>
    <p>Email: ${manager.email}</p>
    <!-- Display the list of candidates managed by this manager if required -->
</body>
</html>
