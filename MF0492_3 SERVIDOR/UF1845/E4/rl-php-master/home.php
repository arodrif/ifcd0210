<?php
session_start();
if(!isset($_SESSION["user_id"]) || $_SESSION["user_id"]==null){
	print "<script>alert(\"Acceso invalido!\");window.location='login.php';</script>";
}

?>
<html>
	<head>
		<title>.: HOME :.</title>
		<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
	</head>
	<body>
<?php include "php/navbar.php"; ?>
<div class="container">
<div class="row">
<div class="col-md-6">
	    <h2> BIENVENIDOS</h2>
		<a class = "btn btn__sist" href="./CRUD PHP-MYSQL/index.php"> Ingresar al Control de Clientes </a>
</div>
</div>
</div>
	</body>
</html>