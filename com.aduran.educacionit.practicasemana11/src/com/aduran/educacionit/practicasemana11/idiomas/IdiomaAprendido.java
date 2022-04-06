package com.aduran.educacionit.practicasemana11.idiomas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class IdiomaAprendido extends Idiomas {
	
	Persona persona =new Persona();
	Scanner teclado = new Scanner(System.in);
	IdiomaException idiomaException= new IdiomaException("Idioma ya aprendido...");
	public Collection<IdiomasEnum> aprenderIdioma() throws IdiomaException {
		int opcionAprendioNuevoIdioma;
		int numeroIdiomasAprendidos;
		int indiceIdiomasAprendidos;
		int opcionIdiomaAprendido;
		Collection<IdiomasEnum> arrayIdiomas= new ArrayList<>();
		do {
			System.out.println("La persona ha aprendido un nuevo Idioma 1->Si 2->No: ");
			opcionAprendioNuevoIdioma = teclado.nextInt();
			
		} while (opcionAprendioNuevoIdioma!=1 && opcionAprendioNuevoIdioma!=2 );
		if(opcionAprendioNuevoIdioma==1) {
		System.out.println("Cuantos idiomas aprendio :");
		numeroIdiomasAprendidos= teclado.nextInt();
		indiceIdiomasAprendidos=0;
		while(numeroIdiomasAprendidos>indiceIdiomasAprendidos) {	
			
			do {
				System.out.println("Que idioma aprendio:\n1->Español\n2->Ingles\n3->Aleman");
				opcionIdiomaAprendido= teclado.nextInt();
				
			} while (opcionIdiomaAprendido<1 || opcionIdiomaAprendido>3);
				
				if(opcionIdiomaAprendido==1) {
					if(arrayIdiomas.contains(IdiomasEnum.ESPANOL)) {
						throw  idiomaException;
					}
					arrayIdiomas.add(IdiomasEnum.ESPANOL);
				}if(opcionIdiomaAprendido==2) {
					if(arrayIdiomas.contains(IdiomasEnum.INGLES)) {
						throw  (idiomaException);
					}
					arrayIdiomas.add(IdiomasEnum.INGLES);
				}if(opcionIdiomaAprendido==3) {
					if(arrayIdiomas.contains(IdiomasEnum.ALEMAN)) {
						throw  idiomaException;
					}arrayIdiomas.add(IdiomasEnum.ALEMAN);
				}
			  indiceIdiomasAprendidos++;	
			}
		//
		}
		return arrayIdiomas;
		}
			
	}

