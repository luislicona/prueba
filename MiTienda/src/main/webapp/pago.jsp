<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.sql.*" %>
    <%@page import ="com.domain.controlador.*" %>
    <%@page import ="java.util.*" %>
     <%@page import ="com.domain.mitienda.*" %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagar</title>

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src= "js/funciones.js">    </script>
    
</head>
<body>

<%Connection con; 
ConexionOracle conn= new ConexionOracle();       //parametros de conexion 
%>

<h1>La orden de su pedido:</h1>


  
 <h3>Descripcion</h3>
<%try {
	
	con=	conn.Conectar();
	Statement stmt = con.createStatement();
    ResultSet rset = stmt.executeQuery("select * from PEDIDO ");
    
    %>
    
    
    
   <%  while (rset.next()) {   %>
   
   <table>
  <caption></caption>
  <thead>
    <tr>
      <th>Id pedido</th>
      <th>  Id producto </th>
      <th> Nombre  </th>
      <th>  Autor/Distribuidor  </th>
       <th>  Precio  </th>
    </tr>
  </thead>
  <tbody>
       <tr>
      <td><% 	out.println (rset.getString(1)+" "); %> </td>
      <td><% 	out.println (rset.getString(2)+" "); %></td>
      <td><% 	out.println (rset.getString(3)+" "); %></td>
      <td><% 	out.println (rset.getString(4)+" "); %></td>
      <td><% 	out.println (rset.getString(5)+" "); %></td>
    </tr>
    
</table>
  <%   }%>
  <%
    	stmt.close();
    } 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} %>
	
	
	
	
	<%  HttpSession sesssion=request.getSession();
   // out.print(sesion.getAttribute("NomvarS1"));   %>
<h2>  <% 
if(sesssion.getAttribute("preciototal") != null){
out.print("  Total a pagar:      $"+ sesssion.getAttribute("preciototal"));

}
else{
	
	
	out.print("Aún no has comprado nada");
} %>
	 </h2>
	 
	 <button onclick="pago();" class="btn btn-primary">   Confirmar Pago        </button>
	 
	 <a href="bienvenida.jsp" class="btn btn-primary">
                                   Atrás
                                    
                                    </a>
	 
	
	

</body>
</html>