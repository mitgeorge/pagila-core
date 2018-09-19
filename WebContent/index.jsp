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


<script src="assets/library/jquery.min.js"></script>
<script src="../dist/components/form.js"></script>
<script src="../dist/components/transition.js"></script>

<style type="text/css">
body {
	background-color: white;
}

body>.grid {
	height: 100%;
}

.image {
	margin-top: -100px;
}

.column {
	max-width: 450px;
}
</style>
</head>
<body>


	<div class="ui middle aligned center aligned grid">
		<div class="column">
			<h2 class="ui teal image header">

				<div class="content">Log-in to your account</div>
			</h2>

			<form class="ui large form" action="">
				<div class="ui stacked segment">
					<div class="field">
						<div class="ui left icon input">
							<i class="user icon"></i> <input type="text" name="email"
								id='email' placeholder="E-mail address">
						</div>
					</div>
					<div class="field">
						<div class="ui left icon input">
							<i class="lock icon"></i> <input type="password" name="password"
								id='password' placeholder="Password">
						</div>
					</div>
					<div class="ui fluid large blue submit button">Login</div>
				</div>

				<div class="ui error message"></div>

			</form>

			<div class="ui message">
				New to us? <a href="registration.jsp">Sign Up</a>
			</div>
		</div>
	</div>


</body>

<script type="text/javascript">
	$(document).ready(function() {
		if(!(window.localStorage.staff === undefined)){
			window.location.href = "dashboard.jsp";
		} 
		
		$('.ui.form').form({
			fields : {
				email : {
					identifier : 'email',
					rules : [ {
						type : 'empty',
						prompt : 'Please enter your e-mail'
					}, {
						type : 'email',
						prompt : 'Please enter a valid e-mail'
					} ]
				},
				password : {
					identifier : 'password',
					rules : [ {
						type : 'empty',
						prompt : 'Please enter your password'
					}, {
						type : 'length[8]',
						prompt : 'Your password must be at least 8 characters'
					} ]
				}
			}
		});
		var $form = $('.ui.form');
		$form.submit(function() {
			$.ajax({
				method : "POST",
				url : "login",
				data : {
					email : $('#email').val(),
					password : $('#password').val()
				}
			}).done(function(msg) {
				if (msg.success) {
					alert('Successful login redirecting');
					window.localStorage.removeItem('staff');
					window.localStorage.setItem('staff', JSON.stringify(msg.body))
					window.location.href = "dashboard.jsp";
				} else {
					alert('Failed because: ' + msg.message);
				}
			}).fail(function() {
				alert("Check if internet is available");
			}).always(function() {

			});
			return false;
		});
	});
</script>

</html>