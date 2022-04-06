package com.aduran.educacionit.practicasemana11.idiomas;

import java.util.Collection;

public class Persona {
	

	private String nombre;
	private String paisOrigen;
	private IdiomasEnum idiomaNativo;
	//Collection<IdiomasEnum> idiomasAprendidos();
	private Collection<IdiomasEnum> nuevoIdioma;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String paisOrigen, IdiomasEnum idiomaNativo) {
		super();
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.idiomaNativo = idiomaNativo;
	}

	public Persona(String nombre, String paisOrigen, IdiomasEnum idiomaNativo, Collection<IdiomasEnum> nuevoIdioma) {
		super();
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.idiomaNativo = idiomaNativo;
		this.nuevoIdioma = nuevoIdioma;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPaisOrigen() {
		return paisOrigen;
	}


	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}


	public IdiomasEnum getIdiomaNativo() {
		return idiomaNativo;
	}


	public void setIdiomaNativo(IdiomasEnum idiomaNativo) {
		this.idiomaNativo = idiomaNativo;
	}

	@Override
	public String toString() {
		return "\n"+ nombre + " , " + " Idioma nativo: " + idiomaNativo
				+ ", Nuevos idimas aprendidos " + nuevoIdioma;
	}
	
	public String toString2() {
		return nombre +" Nativo: "+ idiomaNativo +" Aprendido: " +nuevoIdioma ;
	}
	

	public void setNuevoIdioma(Collection<IdiomasEnum> arrayIdiomas) {
		this.nuevoIdioma=arrayIdiomas;
	}
	
	public Collection<IdiomasEnum> getNuevoIdioma() {
		return nuevoIdioma;
	}
	
	
	
	
	

}
