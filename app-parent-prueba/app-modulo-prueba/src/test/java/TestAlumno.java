import java.util.Scanner;

import aduran.com.crud.implement.CrudAlumnoImpl;


public class TestAlumno {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el número de la opción deseada  " + "( 1.Realizar operaciones de CRUD"
				+ ", 2.Realizar operaciones del menú) :");
		int opcion = teclado.nextInt();

		CrudAlumnoImpl icrudalum = new CrudAlumnoImpl();
	

		if (opcion == 1) {
			System.out.println(
					"Indique 1. Para realizar operaciones con alumnos , 2. Para realizar operaciones con materias :");
			int opcionAlumMat = teclado.nextInt();

			if (opcionAlumMat == 1) {
				System.out
						.println("Indique que operación quiere realizar 1.Crear , 2.Leer , 3. Actualizar, 4.Eliminar");
				int opcionCrudAlum = teclado.nextInt();

				if (opcionCrudAlum == 1) {
					icrudalum.create();
				}
				if (opcionCrudAlum == 2) {
					icrudalum.read();
				}
				if (opcionCrudAlum == 3) {
					icrudalum.update();
				}
				if (opcionCrudAlum == 4) {
					icrudalum.delete();
				}
				if (opcionCrudAlum < 1 && opcionCrudAlum > 4) {
					System.out.println("Opcion invalida");
				}
		
	}
	}
	}
	}
