package aduran.com.crud.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import aduran.com.conexion.AdminConexiones;
import aduran.com.emun.Enums;
import aduran.com.exceptions.GenericException;
import aduran.com.vo.Alumnos;

public class EnviarQuery {
	

	public void enviarQueryCreate() throws GenericException, SQLException {
		
		Connection con = AdminConexiones.obtenerConexion1();
		CrudAlumnoImpl alumno1 = new CrudAlumnoImpl();
		ArrayList<Alumnos> al= alumno1.create();	
		
	int estatus=0;
	for (Alumnos alu : al) {
		int id1=alu.getId();
		String nombre1= alu.getNombre();
		String apellido1= alu.getApellido();
		int matricula1=alu.getMatricula();
	
	try {
		String query = "INSERT INTO alumnos(id,nombre,apellido,matricula) VALUES(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,id1);
		ps.setString(2, nombre1);
		ps.setString(3, apellido1);
		ps.setInt(4,matricula1);

		estatus = ps.executeUpdate();
		
		System.out.println("registro exitoso");
		
	} catch (Exception e) {
		System.out.println("error empleado");
	}
	}
	con.close();
	}	
	
	
	public static Collection<Alumnos> enviarQueryConsulta() throws GenericException, SQLException {
		Connection con = AdminConexiones.obtenerConexion1();
		
		//Statement / PreparedStatement: sql
		Statement st = con.createStatement();
		
		ResultSet res = st.executeQuery("select * from alumnos");//puede haber mas de 1 registro 
	
		Collection<Alumnos> lista = new ArrayList<>();
	
		
		while(res.next()) {
			//ResultSet: datos (columnas / filas)
			int id = res.getInt("id");//obtener un valor long de la columna 1
			String nombre = res.getString("nombre");
			String apellido = res.getString("apellido");
			int matricula = res.getInt("matricula");
			
	
			Alumnos alumnos = new Alumnos(id, matricula ,nombre, apellido);
			lista.add(alumnos);
		}
		con.close();
		return lista;
	}	
	public void enviarQueryDelete(int id) throws GenericException, SQLException{
		
		Collection<Alumnos>listaBD =EnviarQuery.enviarQueryConsulta();
		
		for (Alumnos lab : listaBD) {
			int id1=lab.getId();
			String nombre1= lab.getNombre();
			String apellido1= lab.getApellido();
			
		if (id1==id) {	
				
		String sql = "DELETE FROM alumnos WHERE id =? ";

		
		//connection
		try (Connection con1 = AdminConexiones.obtenerConexion1();) {

			try (PreparedStatement st = con1.prepareStatement(sql)) {
			
				
				st.setInt(1,id1);
				
				st.executeUpdate();
				con1.close();
				System.out.println("Alumno eliminado correctamente :" + nombre1+" "+ apellido1);
			}
		}catch (Exception e) {			
			throw new GenericException("No se pudo eliminar:" +sql, e);
		}
		}
		}
		}
		
	public void enviarQueryUpdate(int id) throws GenericException, SQLException{
		
		Collection<Alumnos>listaBD =EnviarQuery.enviarQueryConsulta();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dato a actualizar a->nombre/t b->apellido/t c->matricula");
		String opcambio=sc.next();
		String opcion = null;

		switch (opcambio) {
		case "a":
			opcion=Enums.a.getString();
			break;
		case "b":
			opcion=Enums.b.getString();
			break;	
		case "c":
			opcion=Enums.c.getString();
			break;
			
		default:
			break;
		}
		
		System.out.println("Digite el cambio: ");
		String variable=sc.next();
		
		
		String sql = "UPDATE alumnos SET "+ opcion+ "= '"+variable+"'" + " WHERE ID ="+id;
		
		System.out.println(sql);
				
		for (Alumnos lab : listaBD) {
			int id1=lab.getId();
			String nombre1= lab.getNombre();
			String apellido1= lab.getApellido();
			
		if (id1==id) {	
			
			Connection con1 = AdminConexiones.obtenerConexion1();
			PreparedStatement st = con1.prepareStatement(sql);
			st.execute();
			con1.close();
			System.out.println("Alumno con id : "+id1+" y nombre : "+nombre1 +" a sido actualizado");
		}		
		
	}
	}
	}



