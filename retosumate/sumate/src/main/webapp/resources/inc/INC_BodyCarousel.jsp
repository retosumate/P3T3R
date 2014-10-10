<!-- --------------------------------------------------------------- -->
<!-- Seccion despliege de Carrusel de imagenes         ------------- -->
<!-- --------------------------------------------------------------- -->

<div id="carousel-principal" class="carousel slide" data-ride="carousel">
	<ol class="carousel-indicators">
		<li data-target="#carousel-principal" data-slide-to="0" class="active"></li>
		<li data-target="#carousel-principal" data-slide-to="1"></li>
		<li data-target="#carousel-principal" data-slide-to="2"></li>
	</ol>
	<div class="carousel-inner">
		<div class="item active">
			<img
				src="${pageContext.request.contextPath}/resources/imgs/carrt/carr_bkg_001.jpg"
				data-src="holder.js/1024x200" alt="Experiencias Previas">
			<div class="container">
				<div class="carousel-caption">
					<a class="btn btn-success" href="#" role="button">Experiencias
						Previas&nbsp;<span class="badge">(8)</span>
					</a>
				</div>
			</div>
		</div>
		<div class="item">
			<img
				src="${pageContext.request.contextPath}/resources/imgs/carrt/carr_bkg_002.jpg"
				data-src="holder.js/1024x200" alt="Eventos">
			<div class="container">
				<div class="carousel-caption">
					<a class="btn btn-info" href="#" role="button">Eventos&nbsp;<span
						class="badge">(3)</span></a>
				</div>
			</div>
		</div>
		<div class="item">
			<img
				src="${pageContext.request.contextPath}/resources/imgs/carrt/carr_bkg_003.jpg"
				data-src="holder.js/1024x200" alt="Noticias">
			<div class="container">
				<div class="carousel-caption">
					<a class="btn btn-danger" href="#" role="button">Noticias&nbsp;<span
						class="badge">(4)</span></a>
				</div>
			</div>
		</div>
	</div>
	<a class="left carousel-control" href="#carousel-principal"
		role="button" data-slide="prev"> <span
		class="glyphicon glyphicon-chevron-left"></span>
	</a> <a class="right carousel-control" href="#carousel-principal"
		role="button" data-slide="next"> <span
		class="glyphicon glyphicon-chevron-right"></span>
	</a>
</div>
