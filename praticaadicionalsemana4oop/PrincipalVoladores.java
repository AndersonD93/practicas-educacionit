package praticaadicionalsemana4oop;

public class PrincipalVoladores {

	public static void main(String[] args) {
		
			Avion av = new Avion("Boeing 737", "3",true, 2);
			Helicoptero he = new Helicoptero("Hela72","8",false);
			Ovni ov=new Ovni ("Ovni1","indefinido",true,"Saludo miembros de la tierra");
			Superman sp=new Superman("SupermanOriginal","N/A",true,true);
			
			Voladores[] elemntosEnAire= new Voladores[] {av,he,ov,sp};
			
			for(Voladores vo : elemntosEnAire) {
				if ( vo instanceof Aterrizables) {
				Aterrizables atr = (Aterrizables)vo;
				
				vo.mostarDatos();
				System.out.println("-------------------------------");
				atr.pidePista();
				System.out.println("-------------------------------");
				atr.aterriza();
				System.out.println("-------------------------------\n");		
				}else {
					System.out.println("El "+ vo.getNombre() +" no puede aterrizar dado no cumple con los requerimientos...");
					System.out.println("-------------------------------\n");
				}
				
			}
				
			
			
					

	}

}
