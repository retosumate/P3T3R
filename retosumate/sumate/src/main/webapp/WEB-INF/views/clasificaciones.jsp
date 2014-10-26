<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Clasificaciones List</h1>
            <table border="1">
                <th>ID</th>
                <th>Clasificacion</th>
                <th>Activo</th>
                 
                <c:forEach var="clasif" items="${clasificacionesList}" varStatus="status">
                <tr>
                    <td>${clasif.idclasificacion}</td>
                    <td>${clasif.vdescripcion}</td>
                    <td>${clasif.iactivo}</td>
                </tr>
                </c:forEach>             
            </table>                        
        </div>
    </body>
</html>