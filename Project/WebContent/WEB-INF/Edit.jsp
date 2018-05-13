<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#about">ABOUT</a></li>
        <li><a href="#services">SERVICES</a></li>
        <li><a href="#portfolio">PORTFOLIO</a></li>
        <li><a href="Register.jsp">LOG IN</a></li>
        <li><a href="#contact">CONTACT</a></li>
      </ul>
    </div>
  </div>
</nav>

<h1>Admin's page</h1>
<div class="form">
	<form action="Login" method="post">
  		<div class="form-group">
    		<label>Cargo ID</label>
    		<input type="text" name="Cargo_Id" class="form-control" placeholder="Cargo ID">
  		</div>
  		<div class="form-group">
    		<label>Ship ID</label>
    		<input type="text" name="Ship_Id" class="form-control" placeholder="Ship ID">
		</div>
		<div class="form-group">
    		<label>Starting Date</label>
    		<input type="text" name="StartDate" class="form-control" placeholder="0000-00-00">
		</div>
		<div class="form-group">
    		<label>Ending Date</label>
    		<input type="text" name="EndDate" class="form-control" placeholder="0000-00-00">
		</div>
		<div class="form-group">
    		<label>Cargo Content</label>
    		<input type="text" name="CargoContent" class="form-control" placeholder="Eg : Furntiure">
		</div>
		<div class="form-group">
    		<label>Status</label>
    		<input type="text" name="Status" class="form-control" placeholder="on going">
		</div>
		<div class="form-group">
    		<label>Last Port</label>
    		<input type="text" name="LastPort" class="form-control" placeholder="Eg : Chicago">
		</div>
		<div class="form-group">
    		<label>Next Port</label>
    		<input type="text" name="NextPort" class="form-control" placeholder="Eg : China">
		</div>
 
 		<input type="hidden" name="action" value="add">
  		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</div>
</body>
</html>