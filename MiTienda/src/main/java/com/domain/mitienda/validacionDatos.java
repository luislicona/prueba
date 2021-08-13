package com.domain.mitienda;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.domain.controlador.*;
import java.sql.*;


@WebServlet("/validacionDatos")
public class validacionDatos extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	Connection con;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando a get");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando a post");
		
		String nombre=request.getParameter("nombre");
		
		String contraseña=request.getParameter("contraseña");
		
	//	String nombreusuario;
		
		HttpSession sesion = request.getSession(); 
		
		//Datos date= new Datos();
		FuncionesOracle valbase= new FuncionesOracle();
		
	    int valor = valbase.baseOracle(nombre, contraseña);
		
		//boolean val=false;
		
	//	val=date.validar(nombre, contraseña);
		
	
		
		System.out.println(nombre);
		
		if (valor!=0) {
			//request.setAttribute("nombreUsuario",nombre);
			sesion.setAttribute("nombreusuario", nombre);
			sesion.setAttribute("preciototal", 0);
			Datos borrar = new Datos();
			String estado="";
			estado = borrar.borrarpedido();
			System.out.print(estado);
			RequestDispatcher rd = request.getRequestDispatcher("bienvenida.jsp");
			rd.forward(request, response);
			//response.sendRedirect("bienvenida.jsp");
			
		}
		else {
			
			response.sendRedirect("notuser.jsp");
			
		}
		
	
}
}
