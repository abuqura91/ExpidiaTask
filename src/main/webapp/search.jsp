<%-- 
    Document   : search
    Created on : Feb 22, 2017, 1:57:33 AM
    Author     : abuqura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="resources/search.css" />
        <link type="text/css" rel="stylesheet" href="resources/date.css" />
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#datepickerStart").datepicker();
            });
            $(function () {
                $("#datepickerEnd").datepicker();
            });
        </script>

        <title>Search Page</title>
    </head>
    <body>
        <form action="RequestData" method="POST">
            <center><h1><p style="color:#4682B4">Find Cheapest Hotels All Over The World...</p></h1>
                <p style="color:#4682B4">City Name: <input type="text" name="city" placeholder="ex:Amman" required></p>
                <p style="color:#4682B4">Start date: <input type="text" id="datepickerStart"  name="startDate" required></p>
                <p style="color:#4682B4">Start date: <input type="text" id="datepickerEnd"  name="endDate" required></p>
                <input type="submit" value="Search">
            </center>
        </form>
    </body>
</html>
