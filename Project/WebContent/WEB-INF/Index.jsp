<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cargo and Shipping Management System</title>
<style>
  .jumbotron {
  		background-image: url("https://www.wallpaperup.com/uploads/wallpapers/2014/09/27/458249/b9cdff2d92c67ea52f5fc5cfc921d959.jpg");
      background-repeat: no-repeat;
      color: #626262;
      padding: 200px 25px;
  }
  .bg-grey {
      background-color: #f6f6f6;
  }
  .container-fluid {
      padding: 60px 50px;
  }

  </style>
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
	        <li><a href="#contact">CONTACT</li>
	      </ul>
	    </div>
	  </div>
	</nav>
	
	<div class="jumbotron text-center">
	  <h1>Company</h1> 
	  <p>We specialize in blablabla</p> 
	  <form class="form-inline">
	  	<div class="col-sm-4">
		    <div class="input-group">
		      <input type="email" class="form-control" size="50" placeholder="Email Address" required>
		      <div class="input-group-btn">
		        <button type="button" class="btn btn-danger">Subscribe</button>
		      </div>
		    </div>
		</div> 
		<div class="col-sm-4">
		    <select class="custom-select custom-select-sm" style="padding: 8px; width: 200px;">
	  			<option selected>Open this select menu</option>
	  			<option value="1">One</option>
	 			<option value="2">Two</option>
	  			<option value="3">Three</option>
			</select>
		</div>     
		<div class="col-sm-4">
		    <div class="input-group">
		      <input type="email" class="form-control" size="50" placeholder="Email Address" required>
		      <div class="input-group-btn">
		        <button type="button" class="btn btn-danger">Subscribe</button>
		      </div>
		    </div>
		</div> 
	  </form>
	</div>
	<div class="container-fluid text-center bg-grey">
	  <h2>Portfolio</h2>
	  <h4>The Whole World to your hand</h4>
	  <div class="row text-center">
	    <div class="col-sm-4">
	      <div class="thumbnail">
	        <img src="paris.jpg" alt="Paris">
	        <p><strong>Paris</strong></p>
	        <p>Yes, we built Paris</p>
	      </div>
	    </div>
	   
	    <div class="col-sm-4">
	      <div class="thumbnail">
	        <img src="newyork.jpg" alt="New York">
	        <p><strong>New York</strong></p>
	        <p>We built New York</p>
	      </div>
	    </div>
	    <div class="col-sm-4">
	      <div class="thumbnail">
	        <img src="sanfran.jpg" alt="San Francisco">
	        <p><strong>San Francisco</strong></p>
	        <p>Yes, San Fran is ours</p>
	      </div>
	    </div>
	</div>
	</div>
	<footer class="container-fluid text-center"  style="background-color:#685F5A">
	  <p>Bootstrap Theme Made By </p>
	</footer>
</body>
</html>




