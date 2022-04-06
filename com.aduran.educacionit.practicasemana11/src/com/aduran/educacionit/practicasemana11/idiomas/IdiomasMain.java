package com.aduran.educacionit.practicasemana11.idiomas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class IdiomasMain {

	public static void main(String[] args) throws IdiomaException {

		Scanner teclado = new Scanner(System.in);
		int cantidadPersonas;
		String nombre = null;
		String paisOrigen = null;
		int opcionIdiomaNativo = 0;
		IdiomasEnum idiomaNativo = null;
		IdiomaAprendido idiomaAprendido = new IdiomaAprendido();
		PersonaPorIdiomas personaPorIdioma= new PersonaPorIdiomas();
		
		
		Collection<Persona> arrayPersonas = new ArrayList<>();
		
		System.out.println("Ingrese cantidad de personas a registrar : ");
		cantidadPersonas=teclado.nextInt();
		int indiceCantidadPersonas=0;
		
		while (indiceCantidadPersonas<cantidadPersonas) {			
			Persona persona = new Persona();
			System.out.println("Ingrese datos de la persona No." +(indiceCantidadPersonas+1));
			System.out.println("Ingrese nombre : ");
			nombre= teclado.next();
			persona.setNombre(nombre);
			System.out.println("Ingrese Pais de Origen: ");
			paisOrigen= teclado.next();
			persona.setPaisOrigen(paisOrigen);
			System.out.println("Ingrese Idioma Nativo: \n1->Español\n2->Ingles\n3->Aleman");
			opcionIdiomaNativo= teclado.nextInt();
			if(opcionIdiomaNativo==1) {
				idiomaNativo=IdiomasEnum.ESPANOL;
			}if(opcionIdiomaNativo==2) {
				idiomaNativo=IdiomasEnum.INGLES;
			}if(opcionIdiomaNativo==3) {
				idiomaNativo=IdiomasEnum.ALEMAN;
			}
			persona.setIdiomaNativo(idiomaNativo);
			persona.setNuevoIdioma(idiomaAprendido.aprenderIdioma());
			
			arrayPersonas.add(persona);
			indiceCantidadPersonas++;	
	}	
			personaPorIdioma.arrayPorIdioma(arrayPersonas);
			ValidadorIdiomasYaAprendidos.validadorIdiomas(arrayPersonas);
			
		
	}
}
