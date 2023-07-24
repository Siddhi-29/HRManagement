<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Work Under Construction</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            text-align: center;
            margin-top: 100px;
        }

        h1 {
            color: #333;
            font-size: 40px;
        }

        .construction-icon {
            font-size: 100px;
            color: #999;
        }

        .blink {
            animation: blinker 1s linear infinite;
        }

        @keyframes blinker {
            50% {
                opacity: 0;
            }
        }
    </style>
</head>
<body>
    <h1>Work Under Construction</h1>
    <span class="construction-icon blink">&#128679;</span>
    <p>This page is currently under construction. We are working hard to bring you something amazing!</p>
</body>
</html>
