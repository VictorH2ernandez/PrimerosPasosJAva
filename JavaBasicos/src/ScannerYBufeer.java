import java.util.Scanner;

public class ScannerYBufeer {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //leer datos desde el scaner
		
		
		System.out.println("Introduce un número");
		int numero1= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce tu nombre");
		String nombre=sc.nextLine();

		sc.close(); // se debe cerrar el scaner despues de guardar los valores pedidos.
		
		System.out.println("Numero 1: " + numero1 +  " Tu nombre es: " + nombre);
		
		}

}
