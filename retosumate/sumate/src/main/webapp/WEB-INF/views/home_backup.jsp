<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Eclipse Digital">

    <title>S&uacute;mate</title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/plugins/bootstrap.min.css" rel="stylesheet">
    
    <!-- Bootstrap Social Buttons -->
    <link href="${pageContext.request.contextPath}/resources/css/plugins/bsocial/bootstrap-social.css" rel="stylesheet">
    
    <!-- MetisMenu CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/plugins/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/plugins/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/sumate-main.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/carousel.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    
    <body>
    	<div id="fb-root"></div>
		<script>
		(function(d, s, id) {
		  var js, fjs = d.getElementsByTagName(s)[0];
		  if (d.getElementById(id)) return;
		  js = d.createElement(s); js.id = id;
		  js.src = "//connect.facebook.net/es_LA/sdk.js#xfbml=1&version=v2.0";
		  fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));

		!function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';
			if (!d.getElementById(id)) {
				js = d.createElement(s);
				js.id = id;
				js.src = p + '://platform.twitter.com/widgets.js';
				fjs.parentNode.insertBefore(js, fjs);
			}
		}(document, 'script', 'twitter-wjs');
		</script>
	<div>
            <!-- Navegacion de la pagina -->
            <nav id="TopMenu" class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <p></p>
                    <a class="h1" href="#" style="margin-left: 5px;"><i class="fa fa-1 fa-fw fa-plus-square"></i>S&uacute;mate</a>
                   
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    
                </div>
                <!-- /.navbar-header -->
                
                <!-- Menu Principal -->
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                <i class="fa fa-star fa-fw"></i><i class="fa fa-caret-down"></i>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">
                                        <div>
                                            <i class="fa fa-asterisk fa-fw"></i>&nbsp;Campaña Social Preventiva del Tabaco
                                        </div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="#">
                                        <div>
                                            <i class="fa fa-bullhorn fa-fw"></i>&nbsp;SI TOMAS, NO MANEJES
                                        </div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a class="text-center" href="#">
                                        Ver todas<i class="fa fa-angle-right"></i> 
                                    </a>
                                </li>
                            </ul>
                            <!-- /.dropdown-messages -->
                        </li>
                        <!-- /.dropdown -->
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                <i class="fa fa-fw"><span class="glyphicon glyphicon-calendar"></span></i>  <i class="fa fa-caret-down"></i>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">
                                        <div><span class="pull-right text-muted"><strong>Marcha contra la drogadicción</strong></span></div>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a class="text-center" href="#">
                                        Ver Eventos <i class="fa fa-angle-right"></i>
                                    </a>
                                </li>
                            </ul>
                            <!-- /.dropdown-tasks -->
                        </li>
                        <!-- /.dropdown -->
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                <i class="fa fa-share fa-fw"></i>  <i class="fa fa-caret-down"></i>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="fa fa-facebook fa-1 fa-fw" data-href="https://developers.facebook.com/docs/plugins/" data-layout="icon" data-width="100""></i> Facebook </a></li>
                                <li><a href="https://www.facebook.com/sharer/sharer.php?u=" title="Share on Facebook" target="_blank" class="btn btn-social-icon btn-facebook"><i class="fa fa-facebook" onclick="_gaq.push(['_trackEvent', 'btn-social-icon', 'click', 'btn-facebook']);"></i> Facebook </a></li>
                                <li><div class="fb-like" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count" data-action="recommend" data-show-faces="true" data-share="true"></div></li>
                                <li><div class="fb-share-button" data-href="https://developers.facebook.com/docs/plugins/" data-layout="icon" data-width="100"></div></li>
                                <li><a href="#"><i class="fa fa-twitter fa-1 fa-fw"></i> Twitter</a> </li>
                                <li><a href="https://twitter.com/share" class="twitter-share-button" data-count="none"></a></li>
                            </ul>
                            
                            
                            
                            
                            <!-- /.dropdown-share -->
                        </li>
                        <!-- /.dropdown -->
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                                </li>
                                <li class="divider"></li>
                                <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                                </li>
                                <li class="divider"></li>   
                                <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                                </li>
                            </ul>
                            <!-- /.dropdown-user -->
                        </li>
                        <!-- /.dropdown -->
                    </ul>
                </div>
             </nav>
        </div>
        <!-- /#wrapper -->
        <div id="contenido-principal" class="container wrapper overlay">
            <div id="carousel-principal" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                   <li data-target="#carousel-principal" data-slide-to="0" class="active"></li>
                   <li data-target="#carousel-principal" data-slide-to="1"></li>
                   <li data-target="#carousel-principal" data-slide-to="2"></li>
                 </ol>
                 <div class="carousel-inner">
                   <div class="item active">
                     <img src="${pageContext.request.contextPath}/resources/gambar/carr_bkg_001.jpg" data-src="holder.js/1024x200" alt="Experiencias Previas">
                     <div class="container">
                         <div class="carousel-caption">                      
                           <a class="btn btn-success" href="#" role="button">Experiencias Previas&nbsp;<span class="badge">(8)</span></a>                   
                         </div>                  
                     </div>
                   </div>
                   <div class="item">
                     <img src="${pageContext.request.contextPath}/resources/gambar/carr_bkg_002.jpg" data-src="holder.js/1024x200" alt="Eventos">
                     <div class="container">
                         <div class="carousel-caption">
                             <a class="btn btn-info" href="#" role="button">Eventos&nbsp;<span class="badge">(3)</span></a>
                         </div>
                     </div>
                   </div>
                   <div class="item">
                     <img src="${pageContext.request.contextPath}/resources/gambar/carr_bkg_003.jpg" data-src="holder.js/1024x200" alt="Noticias">
                     <div class="container">
                         <div class="carousel-caption">
                             <a class="btn btn-danger" href="#" role="button">Noticias&nbsp;<span class="badge">(4)</span></a>
                         </div>
                     </div>
                   </div>
                 </div>
                 <a class="left carousel-control" href="#carousel-principal" role="button" data-slide="prev">
                   <span class="glyphicon glyphicon-chevron-left"></span>
                 </a>
                 <a class="right carousel-control" href="#carousel-principal" role="button" data-slide="next">
                   <span class="glyphicon glyphicon-chevron-right"></span>
                 </a>
            </div>            
<!-- -------------------------------------------- ROW#1 -------------------------------------------------------------------------------------------- -->
            <div class="row">
                <div class="col-md-12"><h3>Eventos / Programas </h3></div>
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-heading panel-margin-narrow1 gradient-diag1">
                            <a href="#"><h4>Construyendo Hogares</h4></a>
                        </div>
                        <div class="panel-body panel-margin-narrow2">   
                            <div class="boxed-image1">
                                <img src="${pageContext.request.contextPath}/resources/gambar/ImagenPortada4.jpg" width="250" height="200" />
                                
                            </div>
                            
                            <div class="text-justify">
                                <a><i class="fa fa-bullhorn fa-fw"></i>&nbsp;&nbsp;Vivienda para ¡TODOS!</a><br>
                                Apóyanos construyendo casas para personas desauciadas en Guadalajara Jalisco
                                
                            </div>
                            <div class="text-left">
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
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-heading panel-margin-narrow1 gradient-diag2">
                            <a href="#"><h4>Construyendo Hogares</h4></a>
                        </div>
                        <div class="panel-body panel-margin-narrow2">   
                            <div class="img-thumbnail boxed-image1">
                                <img src="${pageContext.request.contextPath}/resources/gambar/ImagenPortada4.jpg" width="100" height="100" />
                            </div>
                            <div class="text-justify">
                                <p><a><span class="glyphicon glyphicon-bullhorn"></span>Vivienda para ¡TODOS!</a></p>
                                <p>Apóyanos construyendo casas para personas desauciadas en Guadalajara Jalisco</p>
                            </div>                                
                        </div>
                    </div>                    
                </div>
            </div>    
<!-- -------------------------------------------- ROW#2 -------------------------------------------------------------------------------------------- -->            
            <div class="row">
                <div class="col-md-12"><h3>Eventos / Programas</h3></div>
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-heading panel-margin-narrow1">
                            <a href="#"><h4>Construyendo Hogares</h4></a>
                        </div>
                        <div class="panel-body panel-margin-narrow2">   
                            <div class="img-thumbnail boxed-image1">
                                <img src="${pageContext.request.contextPath}/resources/gambar/ImagenPortada4.jpg" width="100" height="100" />
                            </div>
                            <div class="text-justify">
                                <p><a><span class="glyphicon glyphicon-bullhorn"></span>Vivienda para ¡TODOS!</a></p>
                                <p>Apóyanos construyendo casas para personas desauciadas en Guadalajara Jalisco</p>
                            </div>                                
                        </div>
                    </div>                    
                </div>
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-heading panel-margin-narrow1">
                            <a href="#"><h4>Construyendo Hogares</h4></a>
                        </div>
                        <div class="panel-body panel-margin-narrow2">   
                            <div class="img-thumbnail boxed-image1">
                                <img src="${pageContext.request.contextPath}/resources/gambar/ImagenPortada4.jpg" width="100" height="100" />
                            </div>
                            <div class="text-justify">
                                <p><a><span class="glyphicon glyphicon-bullhorn"></span>Vivienda para ¡TODOS!</a></p>
                                <p>Apóyanos construyendo casas para personas desauciadas en Guadalajara Jalisco</p>
                            </div>                                
                        </div>
                    </div>                    
                </div>
            </div>    
<!-- -------------------------------------------- ROW#3 -------------------------------------------------------------------------------------------- -->            
            <div class="row">
                <div class="col-md-12"><h3>Eventos / Programas</h3></div>
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-heading panel-margin-narrow1">
                            <a href="#"><h4>Construyendo Hogares</h4></a>
                        </div>
                        <div class="panel-body panel-margin-narrow2">   
                            <div class="img-thumbnail boxed-image1">
                                <img src="${pageContext.request.contextPath}/resources/gambar/ImagenPortada4.jpg" width="100" height="100" />
                            </div>
                            <div class="text-justify">
                                <p><a><span class="glyphicon glyphicon-bullhorn"></span>Vivienda para ¡TODOS!</a></p>
                                <p>Apóyanos construyendo casas para personas desauciadas en Guadalajara Jalisco</p>
                            </div>                                
                        </div>
                    </div>                    
                </div>
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-heading panel-margin-narrow1">
                            <a href="#"><h4>Construyendo Hogares</h4></a>
                        </div>
                        <div class="panel-body panel-margin-narrow2">   
                            <div class="img-thumbnail boxed-image1">
                                <img src="${pageContext.request.contextPath}/resources/gambar/ImagenPortada4.jpg" width="100" height="100" />
                            </div>
                            <div class="text-justify">
                                <p><a><span class="glyphicon glyphicon-bullhorn"></span>Vivienda para ¡TODOS!</a></p>
                                <p>Apóyanos construyendo casas para personas desauciadas en Guadalajara Jalisco</p>
                            </div>                                
                        </div>
                    </div>                    
                </div>
            </div>
            
        </div>
        


        <!-- Custom Theme JavaScript -->
        <script src="${pageContext.request.contextPath}/resources/js/sumate-main.js"></script>
        
        
        <footer class="footer-fixed">
                <div id="BottomMenu" class="navbar navbar-inverse navbar-fixed-bottom">
                    <div class="container">
                        <div class="navbar-collapse collapse" id="footer-body">
                            <ul class="nav navbar-nav">
                                <li><a href="#">Browse Our Library</a></li>
                                <li><a href="#">About Us</a></li>
                                <li><a href="#">Contact Us</a></li>
                                <li><a href="#">Our Partners</a></li>
                                <li><a href="#">User Review</a></li>
                                <li><a href="#">Terms &amp; Conditions</a></li>
                                <li><a href="#">Privacy Policy</a></li>
                            </ul>
                        </div>
                            <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#footer-body">
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <ul class="footer-bar-btns visible-xs">
                                <li><a href="#" class="btn" title="History"><i class="fa fa-2x fa-clock-o blue-text"></i></a></li>
                                <li><a href="#" class="btn" title="Favourites"><i class="fa fa-2x fa-star yellow-text"></i></a></li>
                                <li><a href="#" class="btn" title="Subscriptions"><i class="fa fa-2x fa-rss-square orange-text"></i></a></li>
                            </ul>
                        </div>

                    </div>
                </div>
            </footer>
    </body>
    
</html>
