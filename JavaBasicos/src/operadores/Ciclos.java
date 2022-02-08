package operadores;

public class Ciclos {
	public static void main(String[] args) {
		//while
		/*
		int control=0;
		
		while(control < 10) {
			System.out.println("Control =" + control);
			control++;
		}*/
		
		/*
		int control=0;
		do {
			//codigo a ejecutar
			System.out.println("Control = " + control);
			//modificiador de la variable control
			control++;
		}while(control<9);
	*/
		// ciclo for
		
		/*for(int i=0; i < 3; i++) {
			System.out.println("Control = " + i);
		}*/
		
		//break & continue
		/*for (int i=0; i<10; i++){
			if(i%2==0) { // solamente se muestra cuando el valor de i es un numero par
				System.out.println("Control = " + i);
				break;// termina el ciclo y solo deja que se ejecute una vez lo que esta antes 
			}
		}*/
		
		for (int i=0; i<10; i++){
			if(i%2==0) { // solamente se muestra cuando el valor de i es un numero par
				continue;// permite saltarnos una ejecucion del ciclo 
				// deja que continúe el ciclo
				
			}	
			System.out.println("control = " + i);
		}
		for (int i=0; i <3; i++) {
			System.out.println("control2 = " + i);
			continue;
		}
	}
}
