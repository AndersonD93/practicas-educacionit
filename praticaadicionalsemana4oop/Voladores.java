package praticaadicionalsemana4oop;

public class Voladores {

	protected String nombre;
	protected String cantidadAsientos;
	protected Boolean vuelaMasMilMts;
	
	
		public Voladores(String nombre, String cantidadAsientos, Boolean vuelaMasMilMts) {
		super();
		this.nombre = nombre;
		this.cantidadAsientos = cantidadAsientos;
		this.vuelaMasMilMts = vuelaMasMilMts;
	}

		


		public String getNombre() {
			return nombre;
		}



		public String getCantidadAsientos() {
			return cantidadAsientos;
		}



		public Boolean getVuelaMasMilMts() {	
			if (vuelaMasMilMts==true) {
				System.out.println("El "+nombre+" vuela por encima de los 1000 mts");
			}
			return vuelaMasMilMts;
		}


		public String mostarDatos() {
			return "El nombre del Volador \n:"+ nombre +" cuenta con "+ cantidadAsientos + " asientos " +"y vuela a " + getVuelaMasMilMts() ;
			
		}
		
		
		
}
