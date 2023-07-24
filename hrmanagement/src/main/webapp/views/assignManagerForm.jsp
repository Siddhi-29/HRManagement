<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import='com.bravura.project.hrmanagement.model.Manager' %>
<%@ page import='java.util.ArrayList' %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Assign Manager to Candidate</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
        }

        h1 {
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

        select {
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
    </style>
</head>
<body>
<%
		ArrayList<Manager> manage = (ArrayList<Manager>)request.getAttribute("managers");
	%>
    <h1>Assign Manager to Candidate</h1>
    <form action="/under_construction" method="get">
        <label for="managerId">Select Manager:</label>
        <select id="managerId" name="managerId" required>
            <option value="" selected disabled>Select Manager</option>
            <% 
                // Assuming you have a list of managers in the model attribute "managers"
                for(Manager manager : manage) {
            %>
            <option value="<%= manager.getEmpId() %>"><%= manager.getName() %></option>
            <% } %>
        </select>
        <br>
        <input type="submit" value="Assign Manager">
    </form>
</body>
</html>
