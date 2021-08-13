package com.domain.mitienda;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/registro")
public class registro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Error de acceso ingrese desde: http://localhost:8080/MiTienda/ ");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
System.out.println("Entrando a post del registro");
		
		String nombre=request.getParameter("nombre");
		
		String contrasena=request.getParameter("contrasena");
		
		FuncionesOracle reg= new FuncionesOracle();
		
		//reg.RegOracle(nombre, contraseña);
		
		boolean val = reg.RegOracle(nombre, contrasena);
		
		
		//Datos date = new Datos();
		
	//	boolean val=false;
		
		//val=date.registrar(nombre, contraseña);
		
		if (val==true) {
			

			System.out.println("Registro exitoso");
			
			request.setAttribute("nombreUsuario",nombre);
			
			response.setContentType("text");
			
			response.getWriter().append("0");
			
			response.sendRedirect("index.jsp");
		//	RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			//rd.forward(request, response);
			
		} else {
			
			
			System.out.println("Imposible registrar ");
			
			response.setContentType("text");
	
			response.getWriter().append("1");
			
	
		}
		
	}

}
