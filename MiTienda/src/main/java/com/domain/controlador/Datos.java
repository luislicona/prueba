package com.domain.controlador;

import java.sql.*;

public class Datos {
	Connection con;
	boolean valid=false;
	
	ConexionOracle cone= new ConexionOracle();

	public void MostrarDatos() {
		
		
	try {
		
		con=	cone.Conectar();
			
		
		Statement stmt = con.createStatement();
	   // conex.setAutoCommit(false);
	   // stmt.executeUpdate("INSERT INTO PEDIDOS VALUES (8,13,170,SYSDATE,2)");
	 //  conex.commit();
	    ResultSet rset = stmt.executeQuery("select * from TERCEROS where usuario =? and contraseña=? ");
	    
	    while (rset.next()) {
	    	System.out.print (rset.getString(1)+" ");
	    	System.out.print (rset.getString(2)+" ");
	    }
	    	stmt.close();
	    	con.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

	public boolean validar(String nombre, String contraseña) {
		
	System.out.println(nombre+" holaaaaaaaaaaaaaaaaaa");
		
		try {
		PreparedStatement consul;
		con=	cone.Conectar();
		Statement stm = con.createStatement();
		String query="select * from TERCEROS where usuario ='"+nombre +"' and contraseña='"+contraseña+"'";
		System.out.println(query);
		ResultSet rse = stm.executeQuery(query);
		
		if (rse.next()) {
			valid= true;
			con.close();
			return valid;
			
		}else {
			
			valid=false;
			con.close();
			return valid;
			
		}
		}catch(Exception e){
			
			valid=false;
			
			return valid;
			
		}
		
		
	}
	
	
	
	public boolean registrar(String nombre, String contraseña) {
		
		try {
			PreparedStatement consul;
			con=	cone.Conectar();
			Statement stm = con.createStatement();
			String query="select * from TERCEROS where usuario ='"+nombre +"'" ;
			System.out.println(query);
			ResultSet rse = stm.executeQuery(query);
			
			if (rse.next()) {
				valid= true;
				System.out.println("Usuario ya registrado ");
				con.close();
				return valid;
				
			}else {
				PreparedStatement consu;
				con=	cone.Conectar();
				Statement st = con.createStatement();
				String queryregistro="insert into TERCEROS VALUES ('"+nombre+"',"+"'"+contraseña+"'"+")";
			//	String queryregistro="select * from TERCEROS where usuario ='"+nombre +"'" ;
				System.out.println(queryregistro);
				ResultSet rs = st.executeQuery(queryregistro);
			
				con.close();
				valid=false;
				return valid;
				
			}
			}catch(Exception e){
				
				valid=false;
				System.out.println("Ocurrio un error de excepcion en el registro");
				return valid;
				
			}
		
		
		
		
	}
	
	
	


	public void mostrarLibros() {
		
		
		try {
			
			con=	cone.Conectar();
				
			
			Statement stmt = con.createStatement();
		   // conex.setAutoCommit(false);
		   // stmt.executeUpdate("INSERT INTO PEDIDOS VALUES (8,13,170,SYSDATE,2)");
		 //  conex.commit();
		    ResultSet rset = stmt.executeQuery("select * from LIBROS");
		    
		    while (rset.next()) {
		    	System.out.print (rset.getString(1)+" ");
		    	System.out.print (rset.getString(2)+" ");
		    	System.out.print (rset.getString(3)+" ");
		    	System.out.print (rset.getString(4)+" ");
		    	System.out.print (rset.getString(5)+" ");
		    }
		    	stmt.close();
		    	con.close();
		    } 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
	}




	public String borrarpedido() {
		try {
			
			con=	cone.Conectar();
			Statement st = con.createStatement();
			String queryregistro="delete PEDIDO";
			System.out.println(queryregistro);
			System.out.println("Borraremos el pedido");
			ResultSet rs = st.executeQuery(queryregistro);
			con.close();
			
			return "Pedido borrado";
			}catch(Exception e) {
				
				e.printStackTrace();
			}
		
		return"No entro";
		
		
		
		
	}


	public void mostrarPedido() {
		
		
	try {
			
			con=	cone.Conectar();
				
			
			Statement stmt = con.createStatement();
		    ResultSet rset = stmt.executeQuery("select * from PEDIDO");
		    
		    while (rset.next()) {
		    	System.out.print (rset.getString(1)+" ");
		    	System.out.print (rset.getString(2)+" ");
		    	System.out.print (rset.getString(3)+" ");
		    	System.out.print (rset.getString(4)+" ");
		    	System.out.print (rset.getString(5)+" ");
		    }
		    	stmt.close();
		    	con.close();
		    } 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}






}



	