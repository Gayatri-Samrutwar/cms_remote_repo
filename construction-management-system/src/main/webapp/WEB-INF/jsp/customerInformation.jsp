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

<div class="container">
  <h2>Customer Registration</h2>
  <form action="/customerRegistrationurl" method="POST">
    <div class="form-group">
      <label for="customerName">Customer Name :</label>
      <input type="text" class="form-control" id="customerName" placeholder="Enter Customer Name" name="customerName">
    </div>
    
    <div class="form-group">
      <label for="customerMobileNo">Mobile Name :</label>
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
</div>

</body>
</html>