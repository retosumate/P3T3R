<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="${locale}"/>
<fmt:setLocale value="es_ES"/>
<fmt:setBundle basename="messages" />

<!-- --------------------------------------------------------------- -->
<!-- Seccion de Librerias CSS 							------------ -->
<!-- --------------------------------------------------------------- -->

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/resources/js/plugins/bootstrap-3.2.0/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Image Gallery 3.1.1 -->
<link rel="stylesheet" href="http://blueimp.github.io/Gallery/css/blueimp-gallery.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/plugins/bsimagegallery311/css/bootstrap-image-gallery.min.css">

<!-- Bootstrap Social Buttons -->
<link href="${pageContext.request.contextPath}/resources/js/plugins/bsocial/bootstrap-social.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/resources/css/sumate-main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/carousel.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<!-- Documentation extras -->
<link href="${pageContext.request.contextPath}/resources/js/plugins/bootstrap-3.2.0/docs/assets/css/docs.min.css" rel="stylesheet">

<!--[if lt IE 9]><script src="${pageContext.request.contextPath}/resources/js/plugins/bootstrap-3.2.0/docs/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="${pageContext.request.contextPath}/resources/js/plugins/bootstrap-3.2.0/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/plugins/bootstrap-3.2.0/docs/assets/js/ie-emulation-modes-warning.js"></script>

 
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lt IE 9]>
  <script src="${pageContext.request.contextPath}/resources/js/plugins/html5shiv/html5shiv.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/js/respond.min.js"></script>
<![endif]-->
