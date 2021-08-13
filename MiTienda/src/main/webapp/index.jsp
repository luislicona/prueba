<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="resources/css/style.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src= "js/funciones.js">    </script>

</head>
<body > 

<div class="wrapper fadeInDown"> 
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
      <img src="https://image.freepik.com/vector-gratis/gear-robot-logo_148584-6.jpg"  width="250" height="250"/>
    </div>

    <!-- Login  Form -->
    
    <form action="/MiTienda/validacionDatos" method="post">
      <input type="text" id="login" class="fadeIn second" name="nombre" placeholder="user">
      <input type="password" id="password" class="fadeIn third" name="contraseña" placeholder="password">
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>

    <!-- Remind Passowrd --> 
    <!--    <div id="formFooter">
      <a class="underlineHover" href="recuperarcontraseña.jsp">Forgot Password?</a>
    </div>  -->

 <div id="formFooter">
      <a class="underlineHover" href="registro.jsp">Registrarse</a>
    </div>
  </div>
</div>

<!--  <form action="/MiTienda/validacionDatos" method="post">
  <label for="fname">Nombre:</label><br>
  <input type="text" id="nombre" name="nombre" value="John"><br>
  <label for="lname">Contraseña:</label><br>
  <input type="password" id="contraseña" name="contraseña" value="Doe"><br><br>
  <input type="submit" value="Submit">
</form>


-->

</body>
</html>