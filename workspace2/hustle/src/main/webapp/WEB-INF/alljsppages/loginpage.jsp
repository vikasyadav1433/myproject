<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="xyz"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="links.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>BikeAdda - Login</title>
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      margin: auto;
      height:400px;
  }
   .carousel-control.left, .carousel-control.right {
  background-image: none;opacity=0.4;
}
  </style>
  
</head>
<body>
	<%@ include file="navbarBeforelogin.jsp"%>
	 <c:if test="${errormsg!=null}">
	<div class="container">
   
    <div col-sm-3></div>
    <div col-sm-6>
     <div class="alert alert-danger alert-dismissable fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
    ${errormsg}
    </div>
  </div>
  </div>
  </c:if>
  
  <c:if test="${signupmsg!=null}">
	<div class="container">
    
    <div col-sm-3></div>
    <div col-sm-6>
     <div class="alert alert-success alert-dismissable fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
    ${signupmsg}
    </div>
  </div>
  </div>
  </c:if>
  
	<div class="container" style="padding-top:0px">
		<div class="col-sm-3"
			style="background-color: #0db9f2; border-radius: 15px; padding-bottom: 15px; padding-top: 5px;">

			<div align="center" style="font-size: 30px; color: green">
				<b>Login Page</b>
			</div>

			<xyz:form commandName="userObject" action="reqLoginCheck">

				<div class="form-group">
					<b> User ID </b> <br>
					<xyz:input path="userid" class="form-control"
						placeholder="Enter User ID" />
				</div>
				<div class="form-group">
					<b>Password</b> <br>
					<xyz:password path="password" class="form-control"
						placeholder="Enter Password" />
				</div>

	
				<a href=""> Forgot Password?</a>
				<div align="right">
					<xyz:button class="btn btn-primary">Login</xyz:button>
				</div>


			</xyz:form>
		</div>

		<div class="col-sm-9">

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
						<img src="resources/images/carsousel/cr1.jpg" class="img-rounded" alt="Cinque Terre" width="800px;"
							height="500px">
					</div>

					<div class="item">
						<img src="resources/images/carsousel/cr2.jpg" class="img-rounded" alt="Cinque Terre" width="700px;"
							height="800px">
					</div>

					<div class="item">
						<img src="resources/images/carsousel/cr3.jpg" class="img-rounded" alt="Cinque Terre" width="1000px;"
							height="90px">
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

		<div class="col-sm-3">
			<img src="resources/images/carsousel/cr1.jpg" class="img-rounded" alt="Cinque Terre"  width="150px;"
				height="130px" />
		</div>

		<div class="col-sm-3">
			<img src="resources/images/carsousel/cr2.jpg" class="img-rounded" alt="Cinque Terre"  width="150px;"
				height="130px" />
		</div>

		<div class="col-sm-3">
			<img src="resources/images/carsousel/cr3.jpg" class="img-rounded" alt="Cinque Terre"  width="150px;"
				height="130px" />
		</div>

		<div class="col-sm-3">
			<img src="resources/images/carsousel/cr4.jpg" class="img-rounded" alt="Cinque Terre" width="150px;"
				height="130px" />
		</div>
	</div>

	

</body>
</html>