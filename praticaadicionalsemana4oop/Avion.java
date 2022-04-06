package praticaadicionalsemana4oop;

public class Avion extends Voladores implements Aterrizables{
	
	private int numeroAlas;
	
	
	public Avion(String nombre, String cantidadAsientos, Boolean vuelaMasMilMts,int numeroAlas) {
		super(nombre, cantidadAsientos, vuelaMasMilMts);
		this.numeroAlas=numeroAlas;
	}	
	
	
	public void pidePista() {
	
		System.out.println("El Volador avión se encuentra pidiendo pista para aterrizar....");
	}

	public void aterriza() {
		System.out.println("Pista Despejada... Puede aterrizar");
		
	}


	public int getNumeroAlas() {
		return numeroAlas;
	}
		
	

}
