package operadores;

import java.util.Scanner;

public class Tabla {
	public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Ingresa cualquier número positivo: ");
        int num;
        num = console.nextInt();

        System.out.println("Tabla de multiplicar de  " + num);
        int op=0;
        for(int i=1; i < 10; i++) {
        	op= num * i;
			System.out.println(i+ " x "+num + "= "+ op);
        }
       //Implementa un bucle while que imprima el resultado
    }
}
