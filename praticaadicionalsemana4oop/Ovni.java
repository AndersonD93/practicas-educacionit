package praticaadicionalsemana4oop;

public class Ovni extends Voladores implements Aterrizables{
	
	private String saludoTerrenales;
	
	public Ovni(String nombre, String cantidadAsientos, Boolean vuelaMasMilMts,String saludoTerrenales) {
		super(nombre, cantidadAsientos, vuelaMasMilMts);
		this.saludoTerrenales=saludoTerrenales;
	}

	public void pidePista() {
		System.out.println("Objeto Volador no identificado pide pista para aterrizar....");
		
	}

	public void aterriza() {
		System.out.println("Dejenlo aterrizar que viene en son de paz...");
		
	}

	public String getSaludoTerrenales() {
		return saludoTerrenales;
	}
	
		
	}
	
	

