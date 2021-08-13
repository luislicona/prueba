/*
 
*/

function funcionTry() {


	alert("Registro correcto");
}


function funcionSalir() {


	alert("Hasta pronto");
}

function pago() {

alert("Pago realizado con exito");


}

function registrarte() {
	id="login"
	id="password"
	$.ajax( {
		method :"POST",
		url: "/MiTienda/registro",
		data: { nombre:$("#login").val(),contrasena:$("#password").val() }
	})
		.done(function(msg) {
			if(msg=="1"){
				
				alert("No se pudo registrar, intenta con otro nombre de usuario");
				
			}else{
				
				alert("Registro exitoso");
				window.location="index.jsp";
				
				
			}

			console.log("Data saved: " + msg);
		});

}




function asin1() {

	$.ajax( {
		method :"POST",
		url: "librosServlet",
		data: { caso:1  }
	})
		.done(function(msg) {
			alert("Producto agregado al carrito");
			console.log("Data saved: " + msg);
			$("#resp").text(msg);
		});


}



function asin2() {

	$.ajax( {
		method :"POST",
		url: "librosServlet",
		data: { caso:2  }
	})
		.done(function(msg) {
			alert("Producto agregado al carrito");
			console.log("Data saved: " + msg);
			$("#resp").text(msg);
		});


}

function asin3() {

	$.ajax( {
		method :"POST",
		url: "librosServlet",
		data: { caso:3  }
	})
		.done(function(msg) {
			alert("Producto agregado al carrito");
			console.log("Data saved: " + msg);
			$("#resp").text(msg);
		});


}




function asin4() {

	$.ajax( {
		method :"POST",
		url: "librosServlet",
		data: { caso:4  }
	})
		.done(function(msg) {
			alert("Producto agregado al carrito");
			console.log("Data saved: " + msg);
			$("#resp").text(msg);
		});


}




function asin5() {

	$.ajax( {
		method :"POST",
		url: "librosServlet",
		data: { caso:5  }
	})
		.done(function(msg) {
			alert("Producto agregado al carrito");
			console.log("Data saved: " + msg);
			$("#resp").text(msg);
		});


}






function asin6() {

	$.ajax( {
		method :"POST",
		url: "librosServlet",
		data: { caso:6  }
	})
		.done(function(msg) {
			alert("Producto agregado al carrito");
			console.log("Data saved: " + msg);
			$("#resp").text(msg);
		});


}




function libdin() {

	$.ajax( {
		method :"POST",
		url: "videojuegos.jsp",
		data: {}
	})
		.done(function(msg) {
			alert("estamos en videojuegos");
			console.log("Data saved: " + msg);
			$("#videojuegos").load("videojuegos.jsp");
		});


}










