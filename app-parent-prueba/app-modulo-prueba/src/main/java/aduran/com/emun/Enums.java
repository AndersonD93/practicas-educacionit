package aduran.com.emun;

public enum Enums {

	a("nombre"),
	b("apellido"),
	c("matricula");
	
	
    private String string;
    
   
    private Enums(String string) {
		this.string = string;
	}


	public String getString() {
		return string;
	} 
	
    
}
