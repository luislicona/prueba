package com.domain.mitienda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.domain.controlador.Datos;
import com.domain.controlador.productos;

@WebServlet("/librosServlet")
public class librosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int contadorvariable=0;
	
	
		
		String valor=request.getParameter("caso");
		System.out.println("ESTE ES EL VALOR DE NOMBRE" + valor);
		HttpSession sesion = request.getSession();
		Integer contadorProducto=Integer.parseInt(sesion.getAttribute("preciototal").toString());
		int numerodeproductos=1;
		
		
		
		productos produc= new productos();
		
		
		
		switch (valor){
		case "1":
		contadorvariable=	produc.piense(numerodeproductos);
			contadorProducto= contadorProducto +contadorvariable;
			sesion.setAttribute("preciototal", contadorProducto);
			System.out.println("LLEVAS "+ contadorProducto+"gastado");
			RequestDispatcher rd1 = request.getRequestDispatcher("libros.jsp");
			rd1.forward(request, response);
			break;
			
			case "2":		
				contadorvariable=	produc.infinito(numerodeproductos);
				contadorProducto= contadorProducto +contadorvariable;
				sesion.setAttribute("preciototal", contadorProducto);
				System.out.println("LLEVAS "+ contadorProducto+"gastado");
				RequestDispatcher rd2 = request.getRequestDispatcher("libros.jsp");
				rd2.forward(request, response);
				
			break;
			
			case "3":
				
				contadorvariable=	produc.teoria(numerodeproductos);
				contadorProducto= contadorProducto +contadorvariable;
				sesion.setAttribute("preciototal", contadorProducto);
				System.out.println("LLEVAS "+ contadorProducto+"gastado");
				RequestDispatcher rd3 = request.getRequestDispatcher("libros.jsp");
				rd3.forward(request, response);
				
				break;
				
case "4":
				
				contadorvariable=	produc.fortnite(numerodeproductos);
				contadorProducto= contadorProducto +contadorvariable;
				sesion.setAttribute("preciototal", contadorProducto);
				System.out.println("LLEVAS "+ contadorProducto+"gastado");
				RequestDispatcher rd4 = request.getRequestDispatcher("videojuegos.jsp");
				rd4.forward(request, response);
				
				break;
				
case "5":
	
	contadorvariable=	produc.callofduty(numerodeproductos);
	contadorProducto= contadorProducto +contadorvariable;
	sesion.setAttribute("preciototal", contadorProducto);
	System.out.println("LLEVAS "+ contadorProducto+"gastado");
	RequestDispatcher rd5 = request.getRequestDispatcher("videojuegos.jsp");
	rd5.forward(request, response);
	
	break;
	
case "6":
	
	contadorvariable=	produc.counter(numerodeproductos);
	contadorProducto= contadorProducto +contadorvariable;
	sesion.setAttribute("preciototal", contadorProducto);
	System.out.println("LLEVAS "+ contadorProducto+"gastado");
	RequestDispatcher rd6 = request.getRequestDispatcher("videojuegos.jsp");
	rd6.forward(request, response);
	
	break;
		
		
		}
		

	}

}
