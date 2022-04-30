package aduran.com.crud.implement;

import java.util.ArrayList;
import java.util.Scanner;

import aduran.com.vo.Alumnos;


public class ValidacionExiste {
	
	public static ArrayList<Alumnos> arrayAlum1;
	private int idAValidar;
	Scanner teclado1 = new Scanner(System.in);
	public static CrudAlumnoImpl createalum = new CrudAlumnoImpl();
	public String nombreAlum;
	

	public String apellidoAlum;
	
	public boolean existeAlumno(int id) {

		try {
			System.out.println("Ingrese el id del alumno a (Inscribir , Eliminar o Buscar en BD): ");
			idAValidar = teclado1.nextInt();

		} catch (Exception e) {
			System.out.println("Error, el valor a ingresar debe ser de tipo numerico..");
		}

		// obtengo el retorno del arraylist de la clase IcrudAlum
		arrayAlum1 = createalum.create();

		boolean existe = false;
		for (int i = 0; i < arrayAlum1.size(); i++) {
			if (arrayAlum1.get(i).getId().equals(idAValidar)) {
				nombreAlum = arrayAlum1.get(i).getNombre();
				apellidoAlum = arrayAlum1.get(i).getApellido();
				existe = true;
				break;
			}
		}
		return existe;
	};

	public int getIdAValidar() {
		return idAValidar;
	}

	public void setIdAValidar(int idAValidar) {
		this.idAValidar = idAValidar;
	}
	
	public String getNombreAlum() {
		return nombreAlum;
	}

	public String getApellidoAlum() {
		return apellidoAlum;
	}
	public void setNombreAlum(String nombreAlum) {
		this.nombreAlum = nombreAlum;
	}

	public void setApellidoAlum(String apellidoAlum) {
		this.apellidoAlum = apellidoAlum;
	}
	
}
