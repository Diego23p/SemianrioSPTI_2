<html>
	<head>
	  <title>Login</title>
	  <meta charset="UTF-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1.0">
	  <meta name="MobileOptimized" content="width" />

	  <script src="/webjars/jquery/3.1.0/jquery.min.js"></script>
	  <script src="/webjars/bootstrap/4.1.2/js/bootstrap.min.js"></script>
	  <script src="js/app.js"></script>
	  <script src="js/apiCliente.js"></script>
	  <script src="js/sha256.js"></script>

	  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	  <link rel="stylesheet" href="/webjars/bootstrap/4.1.2/css/bootstrap.min.css" />
	  <link rel="stylesheet" href="./styles/login.css">
	  <link rel="stylesheet" href="./styles/general.css">

	</head>

	<body>
	
	<div class="myAlert-top alert alert-success" id="notifyOk">
		<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	</div>
	<div class="myAlert-top2 alert alert-danger" id="notifyNoOk">
		<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	</div>

	  <div class="login-page">
		<div class="form">
		  <img src="img/logo.PNG">

		  <form class="login-form" action='javascript:app.checkPassword()'>
			<p class="message"><b>Ingresar:<b></p>
            <input type="text" placeholder="Username" id="username" />
			<br></br>
            <input type="password" placeholder="Password" id="psw" />
			<br></br>
			<button>login</button>
		  </form>

		</div>
	  </div>
	  
	</body>
<html>