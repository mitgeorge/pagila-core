<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
form button:hover {
	background: #0b7dda;
}

.center {
	margin: auto;
	width: 90%;
}

input {
	padding: 10px;
	font-size: 17px;
    
	width: 80%;
	background: #f1f1f1;
	float :left;
	width: 77.85%;
	
}

button {
	width: 20%;
	padding: 15px;
	background: #2196F3;
	color: white;
	font-size: 17px;
float :left;
 /* Prevent double borders */
	cursor: pointer;

}

.card {
	/* Add shadows to create the "card" effect */
	width: 20%;
	float: left;
	transition: 0.3s;

	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	transition: 0.3s; /* 5px rounded corners */
}
 {
    box-sizing: border-box;
}
div {
    -webkit-column-gap: 40px; /* Chrome, Safari, Opera */
    -moz-column-gap: 40px; /* Firefox */
    column-gap: 40px;
}

/* On mouse-over, add a deeper shadow */
.card:hover {
	box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
}

/* Add some padding inside the card container */
.container {
	padding: 2px 20px;
}
</style>
</head>
<body>
	<div class="center searchArea">
		<form>
			<input type="text" placeholder="Search by title/actor/catogory/language/genre">
			<button type="search" onclick="alert('search successful')">
				<i class="fa fa-search"></i>
			</button>
		</form>
	</div>


	<div class='searchResults center'>
		<%
			for (int i = 0; i < 20; i++) {
		%>
		<div class="card">
			<div class="container">
				<h4>
					<b>John Doe</b>
				</h4>
				<p>Architect & Engineer</p>
			</div>
		</div>
		<%
			}
		%>
	</div>
</body>
</html>