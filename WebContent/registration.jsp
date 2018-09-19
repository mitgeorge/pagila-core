<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>




<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="assets/semantic.min.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"
	integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
	crossorigin="anonymous"></script>

<script src="assets/semantic.min.js"></script>

<div class="ui menu">
  <div class="header item">
 movies
  </div>
  <a class="item">
    About Us
  </a>

</div>
</head>

   <div class="ui container">
  <div class="item">

 </div>
    <div class="ui button"> already have an account</div>
 </div>
  
<body  >


<div class="ui container">
<div class="ui form">
  <div class="fields">
    <div class="field">
      <label>First name</label>
      <input type="text" placeholder="First Name">
    </div>
   
    <div class="field">
      <label>Last name</label>
      <input type="text" placeholder="Last Name">
    </div>
  </div>
</div>
<div class="ui form">
  <div class="field">
    <select>
      <option value="">gender</option>
      <option value="1">Male</option>
      <option value="0">Female</option>
    </select>
  </div>
</div>
</div>
<div class="ui container">
<div class="ui form">
  <div class="fields">
 <div class="field">
      <label>address id</label>
      <input type="text" placeholder="address id">
    </div></div></div></div>
<div class="ui container">
<div class="ui form">
  <div class="fields">
 <div class="field">
      <label>username</label>
      <input type="text" placeholder="username">
    </div></div></div></div>
    <div class="field">
      <label>picture</label>
      <input type="image" placeholder="picture">
    </div></div></div></div>

<div class="ui container">

<div class="ui inverted segment">
  <div class="ui inverted form">
    <div class="two fields">
      <div class="field">
        <label>email address</label>
        <input placeholder="email" type="text">
      </div>
      <div class="field">
        <label>password</label>
        <input placeholder="password" type="text">
      </div>
    </div>
    <div class="inline field">
     <div class="ui checkbox">
  <input type="checkbox" name="example">
  <label>i agree to the terms and conditions </label>
</div>
    </div>
    <div class="ui submit button">Submit</div>
  </div>
</div>
</div>
<div class="ui container">
<div class="ui buttons">
  <button class="ui button"  onclick="cancel()">Cancel</button>
  <div class="or"></div>
  <button class="ui positive button">Save</button>
</div>
</div>
</body>
<script >function cancel() {
	window.localStorage.clear();
	window.location.href = "registration.jsp"
</script>
</html>