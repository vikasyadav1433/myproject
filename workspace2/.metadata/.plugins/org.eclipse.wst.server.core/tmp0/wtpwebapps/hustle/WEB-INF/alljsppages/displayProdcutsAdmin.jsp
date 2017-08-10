<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="links.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>

$(document).ready(function(){
	var searchCondition='${searchCondition}';
	$('.table').DataTable({
		"lengthMenu" : [[5,10,15,-1],[5,10,15,"All"]],
		"oSearch":{"sSearch":searchCondition}		
	})	
});

</script>
</head>
<body>
<%@ include file="adminNavBar.jsp" %>
<br><br><br>
<c:if test="${productmessage!=null}">
	<div class="container">
    
    <div col-sm-3></div>
    <div col-sm-6>
     <div class="alert alert-success alert-dismissable fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
    ${productmessage}
    </div>
  </div>
  </div>
  </c:if>
<div class="container">
<table class="table table-stripped fixed_headers" style="font-weight:bold"  >
<thead>
<tr>
<th bgcolor="#ff4000">Product Id</th>
<th bgcolor="#80ff00">Image</th>
<th bgcolor="#00ffbf">Product Name</th>
<th bgcolor="#bf00ff">Product Description</th>
<th bgcolor="#00FF00">Is Available</th>
<th bgcolor="#ff00ff">Options</th>
</tr>
</thead>

<tbody>

<c:forEach var="p" items="${allproducts}">

<tr style="background-color:vibgyor">
<td>${p.productid}</td>
<td><img src="resources/images/products/${p.productid}.jpg" class="img-rounded" alt="Cinque Terre" width="130px" height="100px" /> </td>
<td>${p.productname}</td>
<td>${p.productdesc}</td>
<td>${p.isproductavailable}</td>
 <td><a href="reqEditProductPageAdmin?pid=${p.productid}">
<span class="glyphicon glyphicon-pencil btn btn-warning btn-large"></span>
</a>
<a href="reqDeleteProductAdmin?pid=${p.productid}">
<span class="glyphicon glyphicon-trash btn btn-warning btn-large"></span>
</a>
 

</tr>

</c:forEach> 
</tbody>
</table></div>
</body>
</html>