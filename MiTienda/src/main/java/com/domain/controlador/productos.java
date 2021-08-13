package com.domain.controlador;
import java.sql.*;

public class productos {
	
	Connection conn =null;
	ConexionOracle con= new ConexionOracle();
	
	String nombrelib="";
	String autorlib="";
	
	String nombrejuego="";
	String distribuidorjuego="";
	
	String datoactual="";
	int idlib=0;
	int idjuego=0;
	int preciolib=0;
	int preciojuego=0;
	int productoActual;

	int suma=0;
	
	public int piense( int cantidad) {
		
		
		try {
			
			conn=con.Conectar();
				
			
			Statement stmt = conn.createStatement();
	
		    ResultSet rset = stmt.executeQuery("select * from LIBROS where ID_LIBRO = '1' ");
		    
		    while (rset.next()) {
		    	
		    	idlib=rset.getInt(1);
		    	nombrelib=rset.getString(2);
		    	autorlib=rset.getString(3);
		    	preciolib=rset.getInt(4);
		    	System.out.print (idlib+" ");
		    	System.out.print (nombrelib+" ");
		    	System.out.print (autorlib+" ");
		    	System.out.print (preciolib+" ");
		    }
		    
		  //  PreparedStatement consu;
			Statement st = conn.createStatement();
			String queryregistro="insert into PEDIDO VALUES ('"+1+ "',"+ "'"  + idlib +   "',"+"'"+nombrelib +"'," + "'" +  autorlib+ "','"+preciolib+"')";
		//	String queryregistro="select * from TERCEROS where usuario ='"+nombre +"'" ;
			System.out.println(queryregistro);
			ResultSet rst = st.executeQuery(queryregistro);
		
		    	stmt.close();
		    	conn.close();
		    } 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		suma= (preciolib*cantidad);
		return suma;
		
		
	}
	
public int infinito(int cantidad) {
	
	
	try {
		
		conn=con.Conectar();
			
		
		Statement stmt = conn.createStatement();
	   // conex.setAutoCommit(false);
	   // stmt.executeUpdate("INSERT INTO PEDIDOS VALUES (8,13,170,SYSDATE,2)");
	 //  conex.commit();
	    ResultSet rset = stmt.executeQuery("select * from LIBROS where ID_LIBRO = '2' ");
	    
	    while (rset.next()) {
	    	
	    	idlib=rset.getInt(1);
	    	nombrelib=rset.getString(2);
	    	autorlib=rset.getString(3);
	    	preciolib=rset.getInt(4);
	    	
	    	System.out.print (idlib+" ");

	    	System.out.print (nombrelib+" ");
	    	System.out.print (autorlib+" ");
	    	System.out.print (preciolib+" ");
	    }
	    
	    
	    //  PreparedStatement consu;
		Statement st = conn.createStatement();
		String queryregistro="insert into PEDIDO VALUES ('"+1+ "',"+ "'"  + idlib +   "',"+"'"+nombrelib +"'," + "'" +  autorlib+ "','"+preciolib+"')";
	//	String queryregistro="select * from TERCEROS where usuario ='"+nombre +"'" ;
		System.out.println(queryregistro);
		ResultSet rst = st.executeQuery(queryregistro);
	    
	    
	    	stmt.close();
	    	conn.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	suma= (preciolib*cantidad);
	return suma;
	
		
	}
public int teoria(int cantidad) {
	
	try {
		
		conn=con.Conectar();
			
		
		Statement stmt = conn.createStatement();
	   // conex.setAutoCommit(false);
	   // stmt.executeUpdate("INSERT INTO PEDIDOS VALUES (8,13,170,SYSDATE,2)");
	 //  conex.commit();
	    ResultSet rset = stmt.executeQuery("select * from LIBROS where ID_LIBRO = '3' ");
	    
	    while (rset.next()) {
	    	
	    	idlib=rset.getInt(1);
	    	nombrelib=rset.getString(2);
	    	autorlib=rset.getString(3);
	    	preciolib=rset.getInt(4);

	    	System.out.print (nombrelib+" ");
	    	System.out.print (autorlib+" ");
	    	System.out.print (preciolib+" ");
	    }
	    
	    
	    //  PreparedStatement consu;
		Statement st = conn.createStatement();
		String queryregistro="insert into PEDIDO VALUES ('"+1+ "',"+ "'"  + idlib +   "',"+"'"+nombrelib +"'," + "'" +  autorlib+ "','"+preciolib+"')";
	//	String queryregistro="select * from TERCEROS where usuario ='"+nombre +"'" ;
		System.out.println(queryregistro);
		ResultSet rst = st.executeQuery(queryregistro);
	    
	    
	    
	    
	    
	    
	    	stmt.close();
	    	conn.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	suma= (preciolib*cantidad);
	return suma;
	
	
}

public int fortnite(int cantidad) {
	
	try {
		
		conn=con.Conectar();
			
		
		Statement stmt = conn.createStatement();
	   // conex.setAutoCommit(false);
	   // stmt.executeUpdate("INSERT INTO PEDIDOS VALUES (8,13,170,SYSDATE,2)");
	 //  conex.commit();
	    ResultSet rset = stmt.executeQuery("select * from VIDEOJUEGOS where ID_JUEGO = '4' ");
	    
	    while (rset.next()) {
	    	
	    	idjuego=rset.getInt(1);
	    	nombrejuego=rset.getString(2);
	    	distribuidorjuego=rset.getString(3);
	    	preciojuego=rset.getInt(4);
	    	
	    	System.out.print(idjuego+" ");
	    	System.out.print (nombrejuego+" ");
	    	System.out.print (distribuidorjuego+" ");
	    	System.out.print (preciojuego+" ");
	    }
	    
	    
	    //  PreparedStatement consu;
		Statement st = conn.createStatement();
		String queryregistro="insert into PEDIDO VALUES ('"+1+ "',"+ "'"  + idjuego +   "',"+"'"+nombrejuego +"'," + "'" +  distribuidorjuego+ "','"+preciojuego+"')";
	//	String queryregistro="select * from TERCEROS where usuario ='"+nombre +"'" ;
		System.out.println(queryregistro);
		ResultSet rst = st.executeQuery(queryregistro);
	    
	    
	    
	    
	    	stmt.close();
	    	conn.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	suma= (preciojuego*cantidad);
	return suma;
	
	
}


public int callofduty(int cantidad) {
	
	try {
		
		conn=con.Conectar();
			
		
		Statement stmt = conn.createStatement();
	   // conex.setAutoCommit(false);
	   // stmt.executeUpdate("INSERT INTO PEDIDOS VALUES (8,13,170,SYSDATE,2)");
	 //  conex.commit();
	    ResultSet rset = stmt.executeQuery("select * from VIDEOJUEGOS where ID_JUEGO = '5' ");
	    
	    while (rset.next()) {
	    	
	    	idjuego=rset.getInt(1);
	    	nombrejuego=rset.getString(2);
	    	distribuidorjuego=rset.getString(3);
	    	preciojuego=rset.getInt(4);
	    	
	    	System.out.print(idjuego+" ");
	    	System.out.print (nombrejuego+" ");
	    	System.out.print (distribuidorjuego+" ");
	    	System.out.print (preciojuego+" ");
	    }
	    
	    
	    
	    //  PreparedStatement consu;
		Statement st = conn.createStatement();
		String queryregistro="insert into PEDIDO VALUES ('"+1+ "',"+ "'"  + idjuego +   "',"+"'"+nombrejuego +"'," + "'" +  distribuidorjuego+ "','"+preciojuego+"')";
	//	String queryregistro="select * from TERCEROS where usuario ='"+nombre +"'" ;
		System.out.println(queryregistro);
		ResultSet rst = st.executeQuery(queryregistro);
	    
	    
	    
	    
	    	stmt.close();
	    	conn.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	suma= (preciojuego*cantidad);
	return suma;
	
	
}


//CounterStrike Global Offensive
public int counter(int cantidad) {
	
try {
		
		conn=con.Conectar();
			
		
		Statement stmt = conn.createStatement();
	   // conex.setAutoCommit(false);
	   // stmt.executeUpdate("INSERT INTO PEDIDOS VALUES (8,13,170,SYSDATE,2)");
	 //  conex.commit();
	    ResultSet rset = stmt.executeQuery("select * from VIDEOJUEGOS where ID_JUEGO = '6' ");
	    
	    while (rset.next()) {
	    	
	    	idjuego=rset.getInt(1);
	    	nombrejuego=rset.getString(2);
	    	distribuidorjuego=rset.getString(3);
	    	preciojuego=rset.getInt(4);
	    	
	    	
	    	System.out.print(idjuego+" ");
	    	System.out.print (nombrejuego+" ");
	    	System.out.print (distribuidorjuego+" ");
	    	System.out.print (preciojuego+" ");
	    }
	    
	    
	    //  PreparedStatement consu;
		Statement st = conn.createStatement();
		String queryregistro="insert into PEDIDO VALUES ('"+1+ "',"+ "'"  + idjuego +   "',"+"'"+nombrejuego +"'," + "'" +  distribuidorjuego+ "','"+preciojuego+"')";
	//	String queryregistro="select * from TERCEROS where usuario ='"+nombre +"'" ;
		System.out.println(queryregistro);
		ResultSet rst = st.executeQuery(queryregistro);
	    
	    
		conn.close();
	    	stmt.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	suma= (preciojuego*cantidad);
	return suma;
	

	
	
}

public String getNombrelib(int a) {
try {
		
		conn=con.Conectar();
			
		
		Statement stmt = conn.createStatement();
	    ResultSet rset = stmt.executeQuery("select * from LIBROS where ID_LIBRO = '"+a+"' ");
	    
	    while (rset.next()) {
	    	
	 
	    	nombrelib=rset.getString(2);
	    //	preciolib=rset.getInt(4);
	    //	System.out.print (preciolib+" ");
	    }
	    	stmt.close();
	    	conn.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	return nombrelib;
}




public String getNombrejuego(int a) {
	
	
	try {
	conn=con.Conectar();
	
	
	Statement stmt = conn.createStatement();
    ResultSet rset = stmt.executeQuery("select * from VIDEOJUEGOS where ID_JUEGO = '"+a+"' ");
    
    while (rset.next()) {
    	
 
    	nombrejuego=rset.getString(2);
    //	preciolib=rset.getInt(4);
    //	System.out.print (preciolib+" ");
    }
    	stmt.close();
    	conn.close();
    } 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	
	return nombrejuego;
}


public int getPreciolib(int a) {
	try {
		conn=con.Conectar();
		
		
		Statement stmt = conn.createStatement();
	    ResultSet rset = stmt.executeQuery("select * from LIBROS where ID_LIBRO = '"+a+"' ");
	    
	    while (rset.next()) {
	    	
	 
	    	//nombrejuego=rset.getString(2);
	   	preciolib=rset.getInt(4);
	    //	System.out.print (preciolib+" ");
	    }
	    	stmt.close();
	    	conn.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	return preciolib;
}


public int getPreciojuego(int a) {
	
	try {
		conn=con.Conectar();
		
		
		Statement stmt = conn.createStatement();
	    ResultSet rset = stmt.executeQuery("select * from VIDEOJUEGOS where ID_JUEGO = '"+a+"' ");
	    
	    while (rset.next()) {
	    	
	 
	    	//nombrejuego=rset.getString(2);
	    	preciojuego=rset.getInt(4);
	    //	System.out.print (preciolib+" ");
	    }
	    	stmt.close();
	    	conn.close();
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	return preciojuego;
}




public void setNombrejuego(String nombrejuego) {
	this.nombrejuego = nombrejuego;
}




public void setPreciolib(int preciolib) {
	this.preciolib = preciolib;
}



public void setPreciojuego(int preciojuego) {
	this.preciojuego = preciojuego;
}












}


