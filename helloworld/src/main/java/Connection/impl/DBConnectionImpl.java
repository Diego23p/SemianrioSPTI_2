package Connection.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Connection.DBConnection;
import Model.materia;


public class DBConnectionImpl implements DBConnection{

	
	private  String user = "SantiagoVega";
    private  String passw = "Admin1234";
    private  String host = "127.0.0.1";
	private  String port = "50382";
	private  String database = "localdb";
	private  String classname = "com.mysql.jdbc.Driver";
	private  String URL = "jdbc:mysql://"+host+":"+port+"/"+database;
    private  Connection connection;
    
    public DBConnectionImpl() throws SQLException {
    	conectar();
    }
    

	public void conectar() throws SQLException {
		try {
			Class.forName(classname);
	        connection = DriverManager.getConnection(URL, user, passw);
	     } catch (SQLException ex) {
	        throw new SQLException(ex);
	     } catch (ClassNotFoundException ex) {
	        throw new ClassCastException(ex.getMessage());
	     }
		
	}
	

	public ArrayList<materia> getMateria()
	   {
			ArrayList<materia> listaContactos=new ArrayList<materia>();
	      try
	      {
	
	         Statement st = connection.createStatement();
	         ResultSet rs = st.executeQuery("select * from materia" );
	         while (rs.next())
	         {
	        	 materia mat = new materia();
	        	 mat.setNemonico(rs.getString("nemonico"));
	        	 mat.setProfesor(rs.getString("profesor"));
	        	 mat.setCreditos(rs.getInt("creditos"));
	        	 mat.setNombre(rs.getString("nombre"));
	            listaContactos.add(mat);
	         }
	         rs.close();
	         st.close();
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	      return listaContactos;
	   }

}
