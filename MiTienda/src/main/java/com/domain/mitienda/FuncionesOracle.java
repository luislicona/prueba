package com.domain.mitienda;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

import com.domain.controlador.*;


public class FuncionesOracle {
	
	//	public static void main (String [] args) {
	
	public int baseOracle(String nombre, String contraseña) {
		
	
	try {
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection
          ("jdbc:oracle:thin:@localhost:1522:BASEDATOSTR", "ESTUDIANTE", "hola");


  System.out.println("Conectado");
   
    CallableStatement cst=conn.prepareCall("{?=call VALIDAR(?,?)}");
    
	    cst.registerOutParameter(1,Types.NUMERIC);
	    cst.setString(2,nombre);
	    cst.setString(3,contraseña);
	    cst.execute();
	    int a = cst.getInt(1);
	    System.out.println(a);
	    conn.close();
	    return a;
	    
	
	    
    } catch (Exception e) {
    e.printStackTrace();

    }
	return 0;
	
	}
	
	public boolean RegOracle(String nombre, String contraseña) {
		
		

		try {
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			Connection conn = DriverManager.getConnection
	          ("jdbc:oracle:thin:@localhost:1522:BASEDATOSTR", "ESTUDIANTE", "hola");


	  System.out.println("Conectado verificar usu reg");
	   
	    CallableStatement cst=conn.prepareCall("{?=call VALIDAR2(?,?)}");
	    
		    cst.registerOutParameter(1,Types.NUMERIC);
		    cst.setString(2,nombre);
		    cst.setString(3,contraseña);
		    cst.execute();
		    int a = cst.getInt(1);
		    System.out.println(a);
		    conn.close();
		if (a==0) {
			
			boolean reg = false;
			
			try {
				DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
				Connection connn = DriverManager.getConnection
		          ("jdbc:oracle:thin:@localhost:1522:BASEDATOSTR", "ESTUDIANTE", "hola");

		    CallableStatement cs=connn.prepareCall("{call CREAR_USER(?,?)}");
		    
		    
			    cs.setString(1,nombre);
			    cs.setString(2,contraseña);
			    cs.execute();
			    
			    System.out.println("Fin del Registro");
			    connn.close();
			    reg=true;
			    return reg;
			    
			    
		    } catch (Exception e) {
	        e.printStackTrace();
		    }
	
		}

	    } catch (Exception e) {
	    e.printStackTrace();

	    }
	
		return false;
		
	}
	

}
