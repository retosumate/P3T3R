<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">     
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Eclipse Digital">
    <jsp:include page="/WEB-INF/views/inc/INC_MainPageHeader.jsp" flush="true"></jsp:include>
    <title><fmt:message key="home.lbl.titulo"/></title>    
</head>
    
    <body>
    	<jsp:include page="/WEB-INF/views/inc/INC_BodyFirst.jsp" flush="true"></jsp:include>
     	<jsp:include page="/WEB-INF/views/inc/INC_MainMenu.jsp" flush="true"></jsp:include>    			
    	
        <!-- /#wrapper -->
        <div id="contenido-principal" class="col-md-12 col-sm-12">                           
<!-- -------------------------------------------- ROW#1 -------------------------------------------------------------------------------------------- -->
            <div class="row">
                <div class="col-md-12">
                	<h3><fmt:message key="home.lbl.subtitulo1"/></h3>
                </div>
                <%String  descripcion = "lorem ipsum "; %>                
                <% for (int i=0; i< 7; i++) { %>
                	
                	<div class="col-md-4 col-sm-12">
                		<jsp:include page="/WEB-INF/views/frags/FRG_PanelStyle1.jsp" flush="true">
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
		<jsp:include page="/WEB-INF/views/inc/INC_BodyScripts.jsp" flush="true"></jsp:include>        
        <jsp:include page="/WEB-INF/views/inc/INC_MainPageFooter.jsp" flush="true"></jsp:include>
    </body>    
</html>
