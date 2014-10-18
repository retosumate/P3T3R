<!-- --------------------------------------------------------------- -->
<!-- Panel Style #1							           ------------- -->
<!-- --------------------------------------------------------------- -->
<% {
// ========================== Definiendo los valores de los parametros del evento ==========================
String p_img 		= (String) request.getParameter("p_img");
String p_titulo1 	= (String) request.getParameter("p_titulo1");
String p_titulo2 	= (String) request.getParameter("p_titulo2");
String p_titulo3 	= (String) request.getParameter("p_titulo3");
String p_descr   	= (String) request.getParameter("p_descr");
String p_tipo 		= (String) request.getParameter("p_tipo");
String p_fechaCrea 	= (String) request.getParameter("p_fechaCrea");
String p_fechaModf 	= (String) request.getParameter("p_fechaModf");
String p_fechaCr 	= (String) request.getParameter("p_fechaCr");
String p_fechaIni 	= (String) request.getParameter("p_fechaIni");
String p_fechaEnd 	= (String) request.getParameter("p_fechaEnd");
String p_capMin 	= (String) request.getParameter("p_capMin");
String p_capMax 	= (String) request.getParameter("p_capMax");
String p_totVolt 	= (String) request.getParameter("p_totVolt");
String p_totBenf 	= (String) request.getParameter("p_totBenf");
String p_totPtos 	= (String) request.getParameter("p_totPtos");
String p_activo 	= (String) request.getParameter("p_activo");

// ----- Estilos ------
String p_style1 	= (String) request.getParameter("p_style1");

if (p_img!=null && p_img.trim().equals("")) {
	p_img="DEFAULT";	
}

if (p_titulo1!=null && p_titulo1.trim().equals("")) {
	p_titulo1="- NA -";	
}

if (p_titulo2!=null && p_titulo2.trim().equals("")) {
	p_titulo2="- NA -";	
}

if (p_titulo3!=null && p_titulo3.trim().equals("")) {
	p_titulo3="- NA -";	
}

if (p_descr!=null && p_descr.trim().equals("")) {
	p_descr="- NA -";	
}

if (p_fechaIni!=null && p_fechaIni.trim().equals("")) {
	p_fechaIni="";	
}

if (p_fechaEnd!=null && p_fechaEnd.trim().equals("")) {
	p_fechaEnd="";	
}

if (p_capMin!=null && p_capMin.trim().equals("")) {
	p_capMin="- NA -";	
}

if (p_capMax!=null && p_capMax.trim().equals("")) {
	p_capMax="- NA -";	
}

if (p_totVolt!=null && p_totVolt.trim().equals("")) {
	p_totVolt="- NA -";	
}

if (p_totBenf!=null && p_totBenf.trim().equals("")) {
	p_totBenf="- NA -";	
}

if (p_totPtos!=null && p_totPtos.trim().equals("")) {
	p_totPtos="- NA -";	
}

if (p_style1!=null && p_style1.trim().equals("")) {
	p_style1="";	
}

// =========================================================================================================
%>
<div class="panel panel-default">
	<div class="panel-heading panel-margin-narrow1 <%=p_style1 %>">
		<a href="#"><h4><%=p_titulo1 %></h4></a>
	</div>
	<div class="panel-body panel-style1">
	
		<div class="media">
			<a class="pull-left" href="#">
		    	<img class="media-object" src="${pageContext.request.contextPath}/resources/imgs/eventos/EVENTO_<%=p_img %>.jpg" alt="..." width="200px" height="150px">
		  	</a>
		  	<div class="media-body">
		    	<h4 class="media-heading"><%=p_titulo2 %></h4>
		    	<div class="text-justify">
					<p>	<%=p_descr %> </p>
				</div>
		  	</div>
		</div> <br />
		<div id="image-gallery">
			<a href="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" title="noimage" data-gallery class="panel-style1-a"> 
				<img src="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" alt="noimage" class=" panel-style1-img">
			</a>
			<a href="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" title="noimage" data-gallery class="panel-style1-a"> 
				<img src="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" alt="noimage" class=" panel-style1-img">
			</a>
			<a href="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" title="noimage" data-gallery class="panel-style1-a"> 
				<img src="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" alt="noimage" class=" panel-style1-img">
			</a>
			<a href="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" title="noimage" data-gallery class="panel-style1-a"> 
				<img src="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" alt="noimage" class=" panel-style1-img">
			</a>
			<a href="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" title="noimage" data-gallery class="panel-style1-a"> 
				<img src="${pageContext.request.contextPath}/resources/imgs/thumbnails/noimage.jpg" alt="noimage" class=" panel-style1-img">
			</a>
		</div>				
		<div class="panel-footer">
			<div id="socialbuttons" class="panel-style1-footer-right">
				<a class="btn btn-social-icon btn-xs btn-twitter"> 
				<i class="fa fa-twitter"></i>
			</a> 
			<a class="btn btn-social-icon btn-xs btn-facebook"> 
				<i class="fa fa-facebook"></i>
			</a> 
			<a class="btn btn-social-icon btn-xs btn-google-plus"> 
				<i class="fa fa-google-plus"></i>
			</a>
			</div>
		</div>
	</div>
</div>
<% } %>