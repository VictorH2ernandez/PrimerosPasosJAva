import java.util.Scanner;

public class EstructuraDeControlSwitch {
	//Estructuras de control sirve para controlar el flujo 
	//comportamiento de un programa, para la toma de desiciones.
	
	/*
	 * switch(condicion_a_evaluar){
	   case "valor":
	  // codigo a ejecutar
	  //break
	   
	   case "n":
	    //codigo a ejecutar
	    //break
	    default: (se ejecuta cuando ninguno de los demas casos se ejecutaran)
	    //codigo a ejecutar
	 * 
	 */

	
   public static void main(String[] args) {
		//Solicitarle al susuario un dia de la semana y mostrarle un mensaje 
		//Para solicitar datos necesitos scanner
		System.out.println("Introduce un de de la semana y recibe un bonito mensaje UwU : ");
		Scanner sc= new Scanner(System.in);
		String dia= sc.nextLine();

		
		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un cafe");
			break;
			
		case "martes":
			System.out.println("Martes, no de cases ni en embarques");
			break;
			
		case "miercoles":
			System.out.println("Miercoles, pero a que costo");
			break;
			
		case "jueves":
			System.out.println("Juebebes de sed peligrosa");
			break;
			
		case "viernes":
			System.out.println("Viernes de flojera");
			break;
			
		case "Sabado":
			System.out.println("sabado de gloria");
			break;
			
		default:
			System.out.println("¿Me quieres ver la cara de estupida?");
		}

   }
}
