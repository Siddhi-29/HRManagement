<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import='com.bravura.project.hrmanagement.model.Candidate' %>
<%@ page import='java.util.ArrayList' %>
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
		ArrayList<Candidate> candids = (ArrayList<Candidate>)request.getAttribute("candidates");
	%>
    <h1>View Candidates</h1>
    <table>
    <tr>
        <th>Employee ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Manager ID</th>
		
		
        
    </tr>
    	<% 
    		for(Candidate candidate : candids) {
    	%>
        <tr>
            <td><%= candidate.getEmpId() %></td>
            <td><%= candidate.getName() %></td>
            <td><%= candidate.getEmail() %></td>
            <td><%= candidate.getManagerId() %></td>
        </tr>
        <% } %>
    </table>
    
</body>
</html>
