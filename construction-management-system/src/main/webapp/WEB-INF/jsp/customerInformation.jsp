<%@ page language="java" import ="com.cms.util.URI" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <ul class="navbar-nav">
    
    <li class="nav-item">
      <a class="nav-link" href=" <%=URI.CUSTOMER_INFORMATION_PAGE%>">Customer Information</a>
    </li>
        <li class="nav-item">
      <a class="nav-link" href="/addCustomerInformation">Add Customer Information</a>
    </li>
  </ul>
  
  <form class="form-inline ml-auto"  action="/action_page.php">
    <input class="form-control mr-sm-2" type="text" placeholder="Search">
    <button class="btn btn-success" type="submit">Search</button>
  </form>
</nav>


<br>



<div class="container">

<c:choose>
         
         <c:when test = "${mode == 'CUSTOMER_VIEW'}">
           <table class="table table-striped">
   				<thead>
   					<tr>
   					  	<th>Customer Id</th>
    					<th>Customer Name</th>
     					<th>Mobile Number</th>
     					<th>Address</th>
     					<th>Occupation</th>
     					<th>Edit</th>
     					<th>Delete</th>
   					</tr>
 				</thead>
 				<tbody>
 					<c:forEach var="customerInfo" items = "${customerInformation}">
    				<tr>
						<td>${customerInfo.customerId}</td>
    					<td>${customerInfo.customerName}</td>
     					<td>${customerInfo.customerMobileNo}</td>
     					<td>${customerInfo.customerAddress}</td>
     					<td>${customerInfo.occupation}</td>
     					<td>
     						<a href="editCustomerInformation?customerId=${customerInfo.customerId}">
          						 <svg class="bi bi-pencil" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  								<path fill-rule="evenodd" d="M11.293 1.293a1 1 0 0 1 1.414 0l2 2a1 1 0 0 1 0 1.414l-9 9a1 1 0 0 1-.39.242l-3 1a1 1 0 0 1-1.266-1.265l1-3a1 1 0 0 1 .242-.391l9-9zM12 2l2 2-9 9-3 1 1-3 9-9z"></path>
  								<path fill-rule="evenodd" d="M12.146 6.354l-2.5-2.5.708-.708 2.5 2.5-.707.708zM3 10v.5a.5.5 0 0 0 .5.5H4v.5a.5.5 0 0 0 .5.5H5v.5a.5.5 0 0 0 .5.5H6v-1.5a.5.5 0 0 0-.5-.5H5v-.5a.5.5 0 0 0-.5-.5H3z"></path>
								</svg>
        					</a>
        				</td>
        				<td>
        					<a href="deleteCustomerInformation?customerId=${customerInfo.customerId}">
        						<svg class="bi bi-trash-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  								<path fill-rule="evenodd" d="M2.5 1a1 1 0 0 0-1 1v1a1 1 0 0 0 1 1H3v9a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V4h.5a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H10a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1H2.5zm3 4a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5zM8 5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7A.5.5 0 0 1 8 5zm3 .5a.5.5 0 0 0-1 0v7a.5.5 0 0 0 1 0v-7z"/>
								</svg>
        					</a>
        				</td>
   					</tr>
 					</c:forEach>
 				</tbody>
			</table>
         </c:when>

         
          <c:when test = "${mode == 'CUSTOMER_INFORMATION_EDIT'}">
             <form action="saveCustomerInformation" method="POST">
             	<input type="hidden" class="form-control" value="${customerInfo.customerId}"  id="customerId" name="customerId">
  			
    			<div class="form-group">
    	  			<label for="customerName">Customer Name :</label>
      				<input type="text" class="form-control" value="${customerInfo.customerName}" id="customerName" name="customerName">
    			</div>
    			<div class="form-group">
    	  			<label for="customerMobileNo">Customer Mobile Number :</label>
      				<input type="number" class="form-control" value="${customerInfo.customerMobileNo}" id="customerMobileNo" name="customerMobileNo">
    			</div>

				<div class="form-group">
    	  			<label for="customerAddress">Customer Address :</label>
      				<input type="text" class="form-control" value="${customerInfo.customerAddress}" id="customerAddress" name="customerAddress">
    			</div>
    			<div class="form-group">
    	  			<label for="occupation">Occupation :</label>
      				<input type="text" class="form-control" value="${customerInfo.occupation}" id="occupation" name="occupation">
    			</div>
    			
    			<button type="submit" class="btn btn-primary">Submit</button>
  			</form>
         </c:when> 
     
         
         
    <c:when test = "${mode == 'CUSTOMER_INFORMATION_ADD'}">
             <form action="saveCustomerInformation" method="POST">
  				
    			<div class="form-group">
      <label for="customerName">Customer Name :</label>
      <input type="text" class="form-control" id="customerName" placeholder="Enter Customer Name" name="customerName">
    </div>
    
    <div class="form-group">
      <label for="customerMobileNo">Mobile Number :</label>
      <input type="number" class="form-control" id="customerMobileNo" placeholder="Enter mobile Number" name="customerMobileNo">
    </div>
    
    <div class="form-group">
      <label for="address">Address :</label>
      <input type="text" class="form-control" id="customerAddress" placeholder="Enter Customer Address" name="customerAddress">
    </div>
    
    <div class="form-group">
      <label for="occupation">Occupation :</label>
      <input type="text" class="form-control" id="occupation" placeholder="Enter Customer Occupation" name="occupation">
    </div>
    
    
    			
    			<button type="submit" class="btn btn-primary">Submit</button>
  			</form>
         </c:when> 
         
    </c:choose> 
 <!--  <h2>Customer Registration</h2>
  <form action="/customerRegistrationurl" method="POST">
    <div class="form-group">
      <label for="customerName">Customer Name :</label>
      <input type="text" class="form-control" id="customerName" placeholder="Enter Customer Name" name="customerName">
    </div>
    
    <div class="form-group">
      <label for="customerMobileNo">Mobile Number :</label>
      <input type="number" class="form-control" id="customerMobileNo" placeholder="Enter mobile Number" name="customerMobileNo">
    </div>
    
    <div class="form-group">
      <label for="address">Address :</label>
      <input type="text" class="form-control" id="customerAddress" placeholder="Enter Customer Address" name="customerAddress">
    </div>
    
    <div class="form-group">
      <label for="occupation">Occupation :</label>
      <input type="text" class="form-control" id="occupation" placeholder="Enter Customer Occupation" name="occupation">
    </div>
    
    
    <button type="submit" class="btn btn-primary">Submit</button>
  </form> -->

</div>

</body>
</html>