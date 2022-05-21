package aduran.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import aduran.com.bo.Imagen;
import aduran.com.conexion.AdministradorDeConexiones;
import aduran.com.exceptionsS15.GenericException;

public class SentenciaSQL {
	
	public Collection<Imagen> obtenerListaimg () throws GenericException, SQLException {
		Connection con = AdministradorDeConexiones.obtenerConexion();
	
		Statement st = con.createStatement();
		
		ResultSet res = st.executeQuery("select * from carrousel"); 
	
		Collection<Imagen> lista = new ArrayList<>();
		
		while(res.next()) {
			//ResultSet: datos (columnas / filas)
			int id = res.getInt("id");//obtener un valor long de la columna 1
			String descripcion = res.getString("descripcion");
			String url = res.getString("url");
			int activo = res.getInt("activo");
			
			
			Imagen imagen1 = new Imagen(id, descripcion ,url, activo);
			lista.add(imagen1);
		}
		con.close();
		return lista;
		
	}
	
	public void crearImagenBD(Imagen imagen ) throws GenericException, SQLException {
		
		Connection con= AdministradorDeConexiones.obtenerConexion();
		
	
		int estatus=0;
			
		int id1= imagen.getId();
		String descripcion1= imagen.getDescripcion();
		String url1= imagen.getUrl();
		int activo1= imagen.getActivo();
		
		try {
			String query = "INSERT INTO carrousel (id,descripcion,url,activo) VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,id1);
			ps.setString(2, descripcion1);
			ps.setString(3, url1);
			ps.setInt(4,activo1);
			
			estatus = ps.executeUpdate();
			
			System.out.println("registro exitoso");
			
		} catch (Exception e) {
			System.out.println("error en inserción a BD");
		}
		
		con.close();
		
		
	}
}
