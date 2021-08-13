<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       <%@page import ="java.sql.*" %>
    <%@page import ="com.domain.controlador.*" %>
    <%@page import ="java.util.*" %>
     <%@page import ="com.domain.mitienda.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"  content="width=device-width, initial-scale=1">

    

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">
    

    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/style2.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src= "js/funciones.js">    </script>
    <title>Videojuegos</title>

  </head>
  <body >  <!--  background="https://fondosmil.com/fondo/9956.jpg"  width="250" height="250" -->


 <h1>
<% out.print("¡Bienvenido a la seccion de Video Juegos! "); %> </h1>

<%productos videojuego=new productos(); %>


    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				 
				 
				 
		
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="navbar-nav">
						<li class="nav-item active">
							 <a class="nav-link" href="#">Link <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item">
							 <a class="nav-link" href="#">Link</a>
						</li>
						<li class="nav-item dropdown">
							 <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown link</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
								 <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
								<div class="dropdown-divider">
								</div> <a class="dropdown-item" href="#">Separated link</a>
							</div>
						</li>
					</ul>
					<form class="form-inline">
						<input class="form-control mr-sm-2" type="text"> 
						<button class="btn btn-primary my-2 my-sm-0" type="submit">
							Search
						</button>
					</form>
					<ul class="navbar-nav ml-md-auto">
						<li class="nav-item active">
							 <a class="nav-link" href="#">Link <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item dropdown">
							 <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown link</a>
							<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
								 <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
								<div class="dropdown-divider">
								</div> <a class="dropdown-item" href="#">Separated link</a>
							</div>
						</li>
					</ul>
				</div>
			</nav>
			<div class="jumbotron">
				<h2>
					¡Compra tu juego favorito y empieza la aventura!
					                      
				</h2>
				<p>
					
				</p>
	<!--  		<p>
					<a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>
				
				-->	
			</div>
		</div>
	</div>
	<div class="row">
	
	
	
		<div class="col-md-6">
			<h2>
			<% out.print(videojuego.getNombrejuego(4));%>
			</h2>
			<p>
			 <div class="fadeIn first">
      <img src="https://cdn2.unrealengine.com/metaimage1-1920x1080-abb60090deaf.png"  width="650" height="450"/>
    </div>
				<h5>¡Compralo ya!  $<% out.print(videojuego.getPreciojuego(4));%></h5>
			</p>
			<p>
			
	
    
     <button onclick="asin4();" class="btn btn-primary">    Agregar al carrito Ajax        </button>
    
    
		  <br>
			</p>
		</div>
		
		
		
		
		<div class="col-md-6">
			<h2>
				<% out.print(videojuego.getNombrejuego(5));%>
			</h2>
			<p>
			 <div class="fadeIn first">
      <img src="https://i.blogs.es/696f63/call-of-duty-warzone/1366_2000.jpeg"  width="650" height="450"/>
    </div>
				<h5>         ¡Compralo ya!  $<% out.print(videojuego.getPreciojuego(5));%></h5>
			</p>
			<p>
		
    
     <button onclick="asin5();" class="btn btn-primary">    Agregar al carrito Ajax        </button>
			</p>
		</div>
		<br>
		<br>
	 
                                    
                                    <div class="col-md-6">
			<h2>
				<% out.print(videojuego.getNombrejuego(6));%>
			</h2>
			<p>
			 <div class="fadeIn first">
      <img src="https://www.hd-tecnologia.com/imagenes/articulos/2019/10/CSGO-alcanz%C3%B3-un-r%C3%A9cord-en-su-n%C3%BAmero-de-jugadores-promedio.jpg"  width="650" height="450"/>
    </div>
				<h5>         ¡Compralo ya!  $<% out.print(videojuego.getPreciojuego(6));%></h5>
			</p>
			<p>
		
    
     <button onclick="asin6();" class="btn btn-primary">    Agregar al carrito Ajax        </button>
    

			</p>
			
			
			
			
		</div>
		<br>
		<br>
	
	</div>
</div>


	<a href="bienvenida.jsp" class="btn btn-primary">
                                   Atrás
                                    
                                    </a>

<br>
<br>
<br>
<br>
<a href="cerrarsesion" class="btn btn-primary">
                                   Salir
                                    
                                    </a>                          
                                    

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>