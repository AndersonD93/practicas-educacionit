package com.aduran.educacionit.practicasemana11.idiomas;

import java.util.Collection;

public class ValidadorIdiomasYaAprendidos {
	
	// RECORRER LOS ARRAYS PARA VALIDAR SI YA CONOCE EL IDIOMA Y NO PUEDA APRENDER NUEVAMENTE EL MISMO 
			public static void validadorIdiomas(Collection<Persona> arrayPersonas) throws IdiomaException {	
				
				IdiomaException idiomaException =new IdiomaException("No puede aprender un idioma que ya conozca (Nativo)...");
				for(Persona listaPersonas:arrayPersonas) {
					IdiomasEnum idiomanativo=listaPersonas.getIdiomaNativo();
					Collection<IdiomasEnum> idiomasaprend=listaPersonas.getNuevoIdioma();
					for(IdiomasEnum ia:idiomasaprend) {		
					if(ia==idiomanativo) {
						throw idiomaException;	
					}
					}
					}
				}

}
