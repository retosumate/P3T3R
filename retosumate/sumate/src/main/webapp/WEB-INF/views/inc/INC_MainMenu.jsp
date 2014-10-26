<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!-- --------------------------------------------------------------- -->
<!-- Seccion de Definicion Menu Principal               ------------ -->
<!-- Deben de estar al inicio del <body>                ------------ -->
<!-- --------------------------------------------------------------- -->

<div id="BsMainMenu">
	<!-- Navegacion de la pagina -->
	<nav id="MenuSuperior" class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
		<div class="navbar-header">
			<p></p>
			<a class="h1" href="#"><i class="fa fa-1 fa-fw fa-plus-square"></i><fmt:message key="home.title"/></a>
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

		</div>
		<!-- /.navbar-header -->

		<!-- Menu Principal -->
		<div class="navbar-collapse collapse">
			<span class="navbar-right">
				<button type="button" class="btn navbar-btn btn-default"><fmt:message key="home.mainmnu.btn1"/></button>
				<button type="button" class="btn navbar-btn btn-default"><fmt:message key="home.mainmnu.btn2"/></button>
				<button type="button" class="btn navbar-btn btn-default"><c:out value="${pageContext.request.contextPath}" /><fmt:message key="home.mainmnu.btn3"/></button>
				
			</span>
		</div>
	</nav>
</div>