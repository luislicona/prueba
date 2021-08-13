package com.domain.controlador;
import java.sql.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
public class ConexionOracle{
	
	Connection conn =null;
	
		public Connection Conectar() {
			try {
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
	    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:BASEDATOSTR", "ESTUDIANTE", "hola");
	    conn.setAutoCommit(true);
	    			//System.out.println("Conectado");
	    			
	    } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Conexion denegada");
			e.printStackTrace();
		}
			
			return conn;
		}
		
}	
	
	



















/*
	
try {
	System.out.println("Entre");
    // Se obtiene el ClassLoader y su metodo addURL()
    URLClassLoader classLoader = ((URLClassLoader) ClassLoader
            .getSystemClassLoader());
    Method metodoAdd = URLClassLoader.class.getDeclaredMethod("addURL",
            new Class[] { URL.class });
    metodoAdd.setAccessible(true);

    // La URL del jar que queremos anadir
    URL url = new URL(
            "file:///C:/Users/luanl/Desktop/Nueva carpeta/base datos lib/ojdbc8.jar");
    

    // Se invoca al metodo addURL pasando esa url del jar
    metodoAdd.invoke(classLoader, new Object[] { url });
    
    System.out.println("Sali");
} catch (Exception e) {
    e.printStackTrace();
}
	


try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    System.out.println("ya se encuentra com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
    System.out.println("Pues no, sigue sin estar accesible");
}
	
	
	
	
	
	
	
	
	
	
	
	*/
	
	

	
