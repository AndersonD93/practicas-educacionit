package praticaadicionalsemana4oop;

public class Superman extends Voladores {
	
	private boolean tieneCapa;

	public Superman(String nombre, String cantidadAsientos, Boolean vuelaMasMilMts,Boolean tieneCapa) {
		super(nombre, cantidadAsientos, vuelaMasMilMts);
		this.tieneCapa= tieneCapa;
	}

	public boolean isTieneCapa() {
		return tieneCapa;
	}

	
	
}
