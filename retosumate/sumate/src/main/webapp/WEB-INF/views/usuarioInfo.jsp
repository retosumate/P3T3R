<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <c:set var="usrInf" value="${usuarioInfo}" />
        <div align="center">
            <h1>Datos de Usuario</h1>
            
            <c:if test="${!empty usrInf.class.declaredMethods}">
            <table>
            	<tr><td colspan="2"><h3>${usrInf.vnombres}&nbsp;&nbsp;${usrInf.vapellidopaterno}&nbsp;&nbsp;${usrInf.vapellidomaterno}</h3></td></tr>
			    	<c:forEach var="attr" items="${usrInf.class.declaredMethods}">
			    		<tr>
			    			<c:catch><td>${attr.name}</td><td>${attr.value}</td></c:catch>
			    		</tr>
			        </c:forEach>
			 </table>   
			</c:if>             
        </div>
    </body>
</html>