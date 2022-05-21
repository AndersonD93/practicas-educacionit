package aduran.com.bo;

public class Imagen {
	
	int id;
	String descripcion;
	String url;
	int activo;
	
	
	public Imagen(int id, String descripcion, String url, int activo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.url = url;
		this.activo = activo;
	}


	public Imagen() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public int getActivo() {
		return activo;
	}


	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	
	

}
