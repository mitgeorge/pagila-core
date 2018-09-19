<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
body {
	background-color: #FFFFFF;
}

.main.container {
	margin-top: 5em;
}

.wireframe {
	margin-top: 2em;
}
</style>
<link rel="stylesheet" type="text/css" href="assets/semantic.min.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"
	integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
	crossorigin="anonymous"></script>
<script src="assets/semantic.min.js"></script>

</head>
<body onload="init()">
	<div class="ui fixed inverted menu">
		<div class="ui container">
			<a href="#" class="header item"> <img class="logo"
				src="assets/images/.png"> movies
			</a> <a href="dashboard.jsp" class="item">Home</a>
			<div class="ui simple dropdown item">
				Dropdown <i class="dropdown icon"></i>
				<div class="menu">
					<a class="item" onclick="logout()">Logout</a> <a class="item"
						href="#">Link Item</a>
					<div class="divider"></div>
					<div class="header">payment method</div>
					<div class="item">
						<i class="dropdown icon"></i> non member
						<div class="menu">
							<a class="item" href="#">store 1</a> <a class="item" href="#">member
								Item</a>
						</div>
					</div>
					<a class="item" href="index1.jsp">Link Item</a>
				</div>
			</div>
		</div>
	</div>
	<div class="ui main container">
		<img id="ItemPreview" src="" />
		<div class="ui fluid icon input">
			<input id='searchField' type="text"
				placeholder="Search by title/language/year of release/genre">
			<i class="search icon"></i>
		</div>
	</div>
	<div class="ui main container">
		<div class="ui link  cards centered" id='results'></div>

	</div>
</body>
<script>
	function logout() {
		window.localStorage.clear();
		window.location.href = "index.jsp"
	}
	function init() {
		if (window.localStorage.staff === undefined) {
			window.location.href = "index.jsp";
		}
		$("#searchField")
				.keyup(
						function() {
							var x = $("#searchField").val();
							$('#results').html();
							var staff = JSON.parse(window.localStorage
									.getItem('staff'));
							var store_id = -1;
							if (staff != undefined) {
								store_id = staff.store_id;
							}
							$
									.get(
											'search?query=' + x + '&store_id='
													+ store_id)
									.done(
											function(movies) {
												var results = '';
												$
														.each(
																JSON
																		.parse(movies),
																function(k, v) {
																	results += '<div class="card" id="'+v.film_id+'"><div class="content"><div class="header">'
																			+ v.title
																			+ '</div>year of release<div class="date">'
																			+ v.year
																			+ '</div>rate<div class="content">'
																			+ v.rentalrate
																			+ '</div>availablity in store<div class="content">'
																			+ v.inventory_id
																			

																			+ '</div><div class="description">'
																			+ v.description
																			+ '</div></div></div>';
																});
												$('#results').html(results);

											});
						});
	};
</script>
</html>