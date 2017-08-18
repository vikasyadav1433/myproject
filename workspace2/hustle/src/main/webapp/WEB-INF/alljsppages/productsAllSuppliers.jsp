<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="links.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>

$(document).ready(function(){
	var searchCondition='${searchCondition}';
	$('.table').DataTable({
		"lengthMenu" : [[5,10,15,-1],["Five","Ten","Fifteen","All"]],
		"oSearch":{"sSearch":searchCondition}		
	})	
});

</script>
<style type="text/css">
.zoomin img {
  height: 100px;
  width: 100px;
  -webkit-transition: all 2s ease;
     -moz-transition: all 2s ease;
      -ms-transition: all 2s ease;
          transition: all 2s ease;
}
.zoomin img:hover {
  width: 200px;
  height: 200px;
}
</style>
</head>
<body>
	<%@ include file="userNavBar.jsp"%>
	<br>
	<br>
	<br> Products All Suppliers
	<div class="container">
		<div class="col-sm-6">
			<img src="resources/images/products/${allSupProd[0].productid}.jpg" height="400px" width="600px" />
		</div>
		<div class="col-sm-2">
		<br><br><br>
		<span class="badge" style="background-color:green;vertical-align: middle;">
				<span class="glyphicon glyphicon-star"></span> 
				${allSupProd[0].rating} 
			</span></div>
		<div class="col-sm-3" style="background-color:#9bf2e9; border-radius:15px;padding-bottom:10px;font-size:20px">
		    
			
			<br>
			<br>Name : ${allSupProd[0].productname}
			<br>Description : ${allSupProd[0].productdesc}
			<br>No. of Items Sold : ${allSupProd[0].noitemssold}
			<br>No. of Reviews : ${allSupProd[0].noreviews}
			<br><br><br>
		</div>
	</div>
	<div class="container">
	
	<table class="table table-stripped fixed_headers" style="font-weight:bold;background-color:green" >
		<thead>
			<tr style="background:rgba(60,60,90,1);color:yellow;table-layout: fixed;">
				<th style="text-align:center">Supplier Name</th>
				<th style="text-align:center">Price</th>
				<th style="text-align:center">Stock</th>
				<th style="text-align:center">Add</th>				
			</tr>
		</thead>
		<tbody>

				<c:forEach var="p" items="${allSupProd}">

					<tr>
						<td style="text-align: center; vertical-align: middle;">
						<div class="zoomin">
							<img src="resources/images/suppliers/${p.supplierid}.jpg" height="80px" width="100px"/>
							</div><br>
							${p.suppliername}
						</td>						
						<td style="text-align: center; vertical-align: middle;">${p.productsupplierprice}</td>
						<td style="text-align: center; vertical-align: middle;">${p.productsupplierstock}</td>
						<td style="text-align: center; vertical-align: middle;">
						 <form action="${url}">
								<select name="qty" id="qty" style="color: red">
									<option valu[]e="1" style="color: red">1</option>
									<option value="2" style="color: red">2</option>
									<option value="3" style="color: red">3</option>
									<option value="4" style="color: red">4</option>
									<option value="5" style="color: red">5</option>

								</select>
								<button type="submit" class="btn btn-warning btn-large">
									<span class="glyphicon glyphicon-shopping-cart"></span>Add to
									cart
								</button>
							</form>
						</td>
						


					</tr>

				</c:forEach>
			</tbody>
		
	</table>
	</div>

<div class="container">

<c:forEach items="${revdata}" var="review">

<div class="col-sm-12" style="color:pink">
	<c:url value="/resources/images/customers/${review.customerid}.jpg" var="url"></c:url>
	<img src="${url}" class="img-circle padding-right:20px" height="50" width="60"/> ${review.customername}
	<br><span class="badge" style="background-color:green"><span class="glyphicon glyphicon-star"></span> ${review.rating} </span>
	<br>Comments : ${review.comments}	
</div>

</c:forEach>
</div>


</body>
</html>