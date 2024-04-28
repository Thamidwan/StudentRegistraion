<%-- 
    Document   : add_subject
    Created on : Apr 27, 2024, 11:55:10 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add subject</h1>
         <form action="AddSubjecstServlet.do" method="POST">
            <table>
                <tr>
                    <td>Subject Name :</td>
                    <td><input type="text" name="subjectName"></td>
                </tr>
                 <tr>
                    <td>Subject Code :</td>
                    <td><input type="text" name="subjectCode"></td>
                </tr>
                
                 <tr>
                    <td></td>
                    <td><input type="submit" value="ADD SUBJECT"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
