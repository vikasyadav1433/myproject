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
</style>
</head>
<body>
	<%@ include file="navbarBeforelogin.jsp"%>

	<c:if test="${message!=null}">
		<div class="container">

			<div col-sm-3></div>
			<div col-sm-6>
				<div class="alert alert-success alert-dismissable fade in">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">�</a>
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

</body>
</html>
