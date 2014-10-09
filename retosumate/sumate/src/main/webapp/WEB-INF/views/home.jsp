<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Eclipse Digital">
    
    <title>S&uacute;mate</title>    
	<jsp:include page="/resources/inc/INC_MainPageHeader.jsp" flush="true"></jsp:include>
    
</head>
    
    <body>
    	<jsp:include page="/resources/inc/INC_MainMenu.jsp" flush="true"></jsp:include>	
	
        <!-- /#wrapper -->
        <div id="contenido-principal" class="container wrapper overlay">             
             <jsp:include page="/resources/inc/INC_BodyCarousel.jsp" flush="true"></jsp:include>       
<!-- -------------------------------------------- ROW#1 -------------------------------------------------------------------------------------------- -->
            <div class="row">
                <div class="col-md-12"><h3>Eventos / Programas </h3></div>                
                <% for (int i=0; i< 3; i++) { %>
                	<div class="col-md-6 col-sm-12">
                		<jsp:include page="/resources/frags/FRG_PanelStyle1.jsp" flush="true"></jsp:include>
                	</div>
                <% } %>            
            </div>    
<!-- -------------------------------------------- ROW#2 -------------------------------------------------------------------------------------------- -->            
            <div class="row">
                <div class="col-md-12"><h3>Noticias </h3></div>                
                <% for (int i=0; i< 6; i++) { %>
                	<div class="col-md-6 col-sm-12">
                		<jsp:include page="/resources/frags/FRG_PanelStyle1.jsp" flush="true"></jsp:include>
                	</div>
                <% } %>            
            </div>   
<!-- -------------------------------------------- ROW#3 -------------------------------------------------------------------------------------------- -->            
            <div class="row">
                <div class="col-md-12"><h3> Reconocimientos </h3></div>                
                <% for (int i=0; i< 4; i++) { %>
                	<div class="col-md-6 col-sm-12">
                		<jsp:include page="/resources/frags/FRG_PanelStyle1.jsp" flush="true"></jsp:include>
                	</div>
                <% } %>            
            </div>   
            
        </div>
		<jsp:include page="/resources/inc/INC_BodyScripts.jsp" flush="true"></jsp:include>        
        <jsp:include page="/resources/inc/INC_MainPageFooter.jsp" flush="true"></jsp:include>
    </body>    
</html>
