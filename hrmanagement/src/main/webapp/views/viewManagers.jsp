<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import='com.bravura.project.hrmanagement.model.Manager' %>
<%@page import='java.util.ArrayList' %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>View Candidates</title>
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

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 0 auto;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
            color: #0055a5;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
	<%
		ArrayList<Manager> manags = (ArrayList<Manager>)request.getAttribute("managers");
	%>
    <h1>View Managers</h1>
    <table>
    <tr>
        <th>Manager ID</th>
        <th>Name</th>
        <th>Email</th>
        
    </tr>
    	<% 
    		for(Manager manager : manags) {
    	%>
        <tr>
            <td><%= manager.getEmpId() %></td>
            <td><%= manager.getName() %></td>
            <td><%= manager.getEmail() %></td>
        </tr>
        <% } %>
</table>
    </body>
   
</html>
