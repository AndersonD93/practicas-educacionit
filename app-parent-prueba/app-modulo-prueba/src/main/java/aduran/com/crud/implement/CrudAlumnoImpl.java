package aduran.com.crud.implement;

import java.util.ArrayList;
import java.util.Scanner;

import aduran.com.crud.IcrudGenerico;
import aduran.com.vo.Alumnos;

public class CrudAlumnoImpl implements IcrudGenerico<Alumnos>{
	Scanner teclado = new Scanner(System.in);
	int cantidadAInscribir;
	ArrayList<Alumnos> arrayAlum;
	String nombreAlum;
	String nombreAlum1;
	String apellidoAlum1;
	ValidacionExiste AlumExiste = new ValidacionExiste();

	@Override
	public ArrayList<Alumnos> create() {
		
		try {
			System.out.println("ingrese la cantidad de estudiantes a registar en la BD:");
			cantidadAInscribir = teclado.nextInt();

		} catch (Exception e) {
			System.out.println("Error, el valor digitado debe ser entero numerico..");
		}

		Alumnos vector = null;
		int id = 0;
		int matricula = 0;
		String nombre = "";
		String apellido = "";

		arrayAlum = new ArrayList<Alumnos>();

		for (int i = 0; i < cantidadAInscribir; i++) {
			try {
				System.out.println("Alumno No. " + (i + 1));
				System.out.print("Digite la identificación del alumno: ");
				id = teclado.nextInt();
				System.out.print("Digite el nombre del alumno: ");
				nombre = teclado.next();
				System.out.print("Digite el apellido del alumno : ");
				apellido = teclado.next();
				System.out.print("Digite el numero de la matricula : ");
				matricula = teclado.nextInt();

				vector = new Alumnos(id, matricula, nombre, apellido);
				arrayAlum.add(vector);

			} catch (Exception e) {
				System.out.println(
						"\nError, Valide el tipo de dato ingresado \n Id:Numerico Entero \n Nombre:Texto \n Apellido:Texto \n No.Matricula:Numerico Entero ");
			}

		}
		System.out.println("--------------------------------------");

		for (Alumnos arrayalum : arrayAlum) {
			System.out.println("ID: " + arrayalum.getId() + " " + "Nombre: " + arrayalum.getNombre());
			nombreAlum = arrayalum.getNombre();

		}
		return arrayAlum;

	};
		
		

	@Override
	public void delete() {
		
		
		if (AlumExiste.existeAlumno(AlumExiste.getIdAValidar()) == true) {
			nombreAlum1 = AlumExiste.getNombreAlum();
			apellidoAlum1 = AlumExiste.getApellidoAlum();
			System.out.println("Alumno " + nombreAlum1 + " " + apellidoAlum1 + " encontrado en los registros...");
			System.out.println("Alumno " + nombreAlum1 + " " + apellidoAlum1 + " Eliminado de la BD");
		} else {
			System.out.println("No existe alumno");
		}

	};
		

	@Override
	public void read() {
		if (AlumExiste.existeAlumno(AlumExiste.getIdAValidar()) == true) {
			System.out.println("Los datos encontrados en la BD son");
			System.out.println(arrayAlum);
		} else {
			System.out.println("No existe alumno");
		}

	};		
	

	@Override
	public void update() {
		if (AlumExiste.existeAlumno(AlumExiste.getIdAValidar()) == true) {
			nombreAlum1 = AlumExiste.getNombreAlum();
			apellidoAlum1 = AlumExiste.getApellidoAlum();
			System.out.println("Asigne nuevo nombre :");
			String nuevoNombre = teclado.next();
			AlumExiste.setNombreAlum(nuevoNombre);
			System.out.println("Nuevo nombre actualizado a : " + AlumExiste.getNombreAlum());
		} else {
			System.out.println("No existe alumno");
		}
	}

}
