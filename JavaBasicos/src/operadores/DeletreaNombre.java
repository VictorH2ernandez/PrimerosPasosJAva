package operadores;

import java.util.Scanner;

public class DeletreaNombre {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		
		String palabra= sc.next();
		
		 int i=0;
		 while(i < palabra.length()){
		 System.out.println(palabra.charAt(i++));
		 }
		 
		/*for (int i=0; i<palabra.length();i++) {
			System.out.println(palabra.charAt(i));
		}*/
	
	}
}
