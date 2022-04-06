package com.aduran.educacionit.practicasemana11.idiomas;

import java.util.ArrayList;
import java.util.Collection;

public class PersonaPorIdiomas {
	
	Collection<Persona> personasIngles = new ArrayList<Persona>();
	Collection<Persona> personasEspanol = new ArrayList<Persona>();
	Collection<Persona> personasAleman = new ArrayList<Persona>();
	
	public void arrayPorIdioma (Collection<Persona> arrayPersonas){
			
		
	// RECORRER ARRAY PERSONAS PARA OBTENER LISTA DE PERSONAS POR IDIOMA
				
			for(Persona listaPersonas:arrayPersonas) {
				IdiomasEnum idiomanativoi=listaPersonas.getIdiomaNativo();
					
				
				if (idiomanativoi==IdiomasEnum.ESPANOL) {
					personasEspanol.add(listaPersonas);	
				}if (idiomanativoi==IdiomasEnum.INGLES) {
					personasIngles.add(listaPersonas);	
				}if (idiomanativoi==IdiomasEnum.ALEMAN) {
					personasAleman.add(listaPersonas);	
				}
				Collection<IdiomasEnum> idiomasaprend=listaPersonas.getNuevoIdioma();
				for(IdiomasEnum ia:idiomasaprend) {
					if(ia.equals(IdiomasEnum.ESPANOL)) {
						personasEspanol.add(listaPersonas);
					}if(ia.equals(IdiomasEnum.INGLES)) {
						personasIngles.add(listaPersonas);
					}if(ia.equals(IdiomasEnum.ALEMAN)) {
						personasAleman.add(listaPersonas);
					}
				}
			}
			
			System.out.println("\nlas personas que hablan Aleman son:" );
			for(Persona personasAle:personasAleman) {
				System.out.println(personasAle.toString2());}
			System.out.println("\nlas personas que hablan Español son:" );
			for(Persona personasEsp:personasEspanol) {
				System.out.println(personasEsp.toString2());
			}System.out.println("\nlas personas que hablan Ingles son:" );
			for(Persona personasIng:personasIngles) {
				System.out.println(personasIng.toString2());
			}
			
	}	
				
		}
	


