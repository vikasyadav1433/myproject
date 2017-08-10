<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="links.jsp"%>
<title>Insert title here</title>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 100%;
	margin: auto;
	height: 400px;
}

.carousel-control.left, .carousel-control.right {
	background-image: none;
	opacity
	=0.4;
}
</style>
<style type="text/css">
.zoomin img {
	height: 200px;
	width: 200px;
	-webkit-transition: all 2s ease;
	-moz-transition: all 2s ease;
	-ms-transition: all 2s ease;
	transition: all 2s ease;
}

.zoomin img:hover {
	width: 300px;
	height: 300px;
}

#preview {
	margin-top: 10px;
	border: 1px solid black;
	width: 350px;
	height: 500px;
	background-repeat: no-repeat;
	margin-left: auto;
	margin-right: auto;
}

#samples {
	text-align: center;
}

#samples img {
	margin: 10px;
	display: block;
	border: 2px solid #6A6462;
}

#samples img:hover {
	cursor: zoom-in;
	border: 0;
	-moz-box-shadow: 2px 2px 7px 2px rgba(130, 130, 130, 1), -1px -1px 7px
		2px rgba(130, 130, 130, 1);
	-webkit-box-shadow: 2px 2px 7px 2px rgba(130, 130, 130, .7), -1px -1px
		7px 2px rgba(130, 130, 130, 1);
	box-shadow: 2px 2px 7px 2px rgba(130, 130, 130, .7), -2px -2px 7px 2px
		rgba(130, 130, 130, 1);
}

@media screen and (max-width: 767px) {
	#samples img {
		display: inline-block;
	}
}
</style>
</head>
<body>
	<%@ include file="navbarBeforelogin.jsp"%>

	<c:if test="${message!=null}">
		<div class="container">

			<div col-sm-3></div>
			<div col-sm-6>
				<div class="alert alert-success alert-dismissable fade in">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
					${message}
				</div>
			</div>
		</div>
	</c:if>

	<div class="container">
		<div class="col-sm-12">
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner">
					<div class="item active">
						<img src="resources/images/carsousel/cr1.jpg" class="img-rounded"
							alt="Cinque Terre" width="800px;" height="500px">
					</div>

					<div class="item">
						<img src="resources/images/carsousel/cr2.jpg" class="img-rounded"
							alt="Cinque Terre" width="700px;" height="800px">
					</div>

					<div class="item">
						<img src="resources/images/carsousel/cr3.jpg" class="img-rounded"
							alt="Cinque Terre" width="1000px;" height="90px">
					</div>
				</div>

				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>



	</div>
	<div class="container">
		<div class="zoomin">

			<div class="col-sm-3 ">

				<img src="resources/images/carsousel/cr1.jpg" class="img-rounded"
					alt="Cinque Terre" width="150px;" height="130px" />
			</div>

			<div class="col-sm-3">
				<img src="resources/images/carsousel/cr2.jpg" class="img-rounded"
					alt="Cinque Terre" width="150px;" height="130px" />
			</div>

			<div class="col-sm-3">
				<img src="resources/images/carsousel/cr3.jpg" class="img-rounded"
					alt="Cinque Terre" width="150px;" height="130px" />
			</div>

			<div class="col-sm-3">
				<img src="resources/images/carsousel/cr4.jpg" class="img-rounded"
					alt="Cinque Terre" width="150px;" height="130px" />
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12" id="samples">
				<img id="zoom1" width="100px" height="250px"
					onmousemove="zoomIn(event)" onmouseout="zoomOut()"
					src="resources/images/carsousel/cr1.jpg"> <img id="zoom2"
					width="100px" height="250px" onmousemove="zoomIn(event)"
					onmouseout="zoomOut()" src="resources/images/carsousel/cr2.jpg">
			</div>
			<div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
				<div id="preview" onmousemove="zoomIn(event)"></div>
			</div>
		</div>
	</div>
<!-- hdksafhghliasdhfgal -->
</body>
</html>
