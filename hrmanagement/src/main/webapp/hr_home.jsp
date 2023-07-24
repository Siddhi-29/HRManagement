<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>HR Home</title>
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

        p {
            text-align: center;
            margin-top: 10px;
        }

        a {
            display: block;
            color: #007bff;
            text-decoration: none;
            margin-bottom: 10px;
        }

        a:hover {
            text-decoration: underline;s
        }
    </style>
</head>
<body>
    <h1>Welcome to the HR Home Page</h1>
 
    <p><a href="/viewCandidates">View Candidates</a></p>
    <p><a href="/viewManagers">View Managers</a></p>
  <p><a href="/assignManagerForm">Assign Manager to Candidate</a></p>
    <p><a href="/under_construction">View Managers assigned to Candidates</a></p>
  
    
</body>
</html>
