<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="resources/css/style.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src= "js/funciones.js">    </script>

</head>
<body>
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
      <img src="https://image.freepik.com/vector-gratis/gear-robot-logo_148584-6.jpg"  width="250" height="250"/>
    </div>

    <!-- Login  Form -->
    
    
    <div >
      <input type="text" id="login" class="fadeIn second" name="nombre" placeholder="user">
      <input type="password" id="password" class="fadeIn third" name="contrasena" placeholder="password">
      
      <button onclick="registrarte();"   type="button" class="btn btn-primary"  > Registrarte </button>
    </div>


 <div id="formFooter">
      <a class="underlineHover" href="index.jsp">iniciar sesion</a>
    </div>
  </div>
</div>
</body>
</html>