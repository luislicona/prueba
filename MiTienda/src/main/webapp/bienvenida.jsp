<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"  content="width=device-width, initial-scale=1">

    

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">
    <title>Inicio</title>

    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/style2.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src= "js/funciones.js">    </script>
  </head>
  <body>
 

 <h1>
 
 <%  HttpSession sesion=request.getSession();
   // out.print(sesion.getAttribute("NomvarS1"));   %>
<% out.print("Bienvenido "+ sesion.getAttribute("nombreusuario")); %> </h1>


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
					¡Disfruta la nueva experiencia de comprar tus libros y videojuegos favoritos!
					                         ¡En un mismo lugar!
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
				¡Tus libros favoritos!
			</h2>
			<p>
			 <div class="fadeIn first">
      <img src="https://fondosmil.com/fondo/1675.jpg"  width="350" height="250"/>
    </div>
				<h5>¡Entra y adquiere los mejores títulos!</h5>
			</p>
			<p>
				<a class="btn btn-primary" href="libros.jsp">Ver libros »</a>
			</p>
		</div>
		<div class="col-md-6">
			<h2>
				¡Los mejores videojuegos!
			</h2>
			<p>
			 <div class="fadeIn first">
      <img src="https://cdn1.epicgames.com/salesEvent/salesEvent/17BR_S17_Launcher_EGS_Blade_2560x1440_2560x1440-713334cd3a6adfe74ca68f25498f3d74?h=270&resize=1&w=480"  width="400" height="250"/>
    </div>
				<h5>¡Accede, descarga y disfruta!</h5>
			</p>
			<p>
			
		<!--	 <button onclick="libdin();">    ver videojuegos      </button> -->
			 	<a class="btn btn-primary"  href="videojuegos.jsp" >Ver videojuegos »</a> 
			</p>
		</div>
		<br>
		<br>

<h2>  <% 
if(sesion.getAttribute("preciototal") != null){
out.print("  Llevas gastado:      $"+ sesion.getAttribute("preciototal"));

}
else{
	
	
	out.print("Llevas gastado:    $0");
}


%> </h2>

		<form action="/MiTienda/ordenPago" method="post">
      <input type="submit" name ="añadir" class="btn btn-primary" placeholder= "pago" value="pagar">
    </form>
	<!--  	<a href="ordenPago" class="btn btn-primary" method="post">
                                   Pagar
                                    
                                    </a>
                                    
                                    -->
	</div>
</div>

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