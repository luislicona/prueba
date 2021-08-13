package com.domain.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class cerrarsesion
 */
@WebServlet("/cerrarsesion")
public class cerrarsesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	
		Datos borrar = new Datos();
		String estado="";
		
		
		estado = borrar.borrarpedido();
				
		System.out.println(estado);
		
	HttpSession sesion=request.getSession();
	sesion.removeAttribute("preciototal");
	sesion.invalidate();
	
	System.out.println("sesion cerrada");
	
	response.sendRedirect("index.jsp");
	
	
	

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
