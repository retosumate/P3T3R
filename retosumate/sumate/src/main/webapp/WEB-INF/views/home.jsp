<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">     
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Eclipse Digital">
    
    <title>S&uacute;mate</title>    
	<jsp:include page="/resources/inc/INC_MainPageHeader.jsp" flush="true"></jsp:include>
    
</head>
    
    <body>
    	<jsp:include page="/resources/inc/INC_BodyFirst.jsp" flush="true"></jsp:include>
     	<jsp:include page="/resources/inc/INC_MainMenu.jsp" flush="true"></jsp:include> 
    	<jsp:include page="/resources/inc/INC_BodyBckg.jsp" flush="true"></jsp:include>		
    	
        <!-- /#wrapper -->
        <div id="contenido-principal" class="container wrapper overlay">             
              <jsp:include page="/resources/inc/INC_BodyCarousel.jsp" flush="true"></jsp:include>        
<!-- -------------------------------------------- ROW#1 -------------------------------------------------------------------------------------------- -->
            <div class="row">
                <div class="col-md-12"><h3>Eventos / Programas </h3></div>
                <%String  descripcion = "lorem ipsum "; %>                
                <% for (int i=0; i< 7; i++) { %>
                	
                	<div class="col-md-6 col-sm-12">
                		<jsp:include page="/resources/frags/FRG_PanelStyle1.jsp" flush="true">
                			<jsp:param name="p_img" 		value="5"></jsp:param>
                			<jsp:param name="p_titulo1" 	value="p_titulo1"></jsp:param>
                			<jsp:param name="p_titulo2" 	value="p_titulo2"></jsp:param>
                			<jsp:param name="p_titulo3" 	value="p_titulo3"></jsp:param>
                			<jsp:param name="p_descr" 		value="<%=descripcion + \" - \" + i %>"></jsp:param>
                			<jsp:param name="p_tipo" 		value=""></jsp:param>
                			<jsp:param name="p_fechaCrea" 	value=""></jsp:param>
                			<jsp:param name="p_fechaModf" 	value=""></jsp:param>
                			<jsp:param name="p_fechaCr" 	value=""></jsp:param>
                			<jsp:param name="p_fechaIni" 	value=""></jsp:param>
                			<jsp:param name="p_fechaEnd" 	value=""></jsp:param>
                			<jsp:param name="p_capMin" 		value=""></jsp:param>
                			<jsp:param name="p_capMax" 		value=""></jsp:param>
                			<jsp:param name="p_totVolt" 	value=""></jsp:param>
                			<jsp:param name="p_totBenf" 	value=""></jsp:param>
                			<jsp:param name="p_totPtos" 	value=""></jsp:param>
                			<jsp:param name="p_activo" 		value=""></jsp:param>
                			<jsp:param name="p_style1" 		value="<%=\"gradient-diag\" + (i+1)%>"></jsp:param>
                			
                		</jsp:include>
                	</div>
                <% } %>            
            </div>                
        </div>
		<jsp:include page="/resources/inc/INC_BodyScripts.jsp" flush="true"></jsp:include>        
        <jsp:include page="/resources/inc/INC_MainPageFooter.jsp" flush="true"></jsp:include>
    </body>    
</html>
