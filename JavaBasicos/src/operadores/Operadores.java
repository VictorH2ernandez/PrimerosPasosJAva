package operadores;

import java.util.Scanner;

public class Operadores {
	
	public static void main(String[] args) {
		//Operadores Aritmeticos
		// +,-,/,*,%
		
		int a= 10;
		int b=20;
		double c= 10.0;
		
		int suma= a+b;
		System.out.println(suma);
		//suma
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		//resta
		System.out.println("El resultado de la resta es: " + (a-b));
		
		//division
		
		int division= a / b;
		System.out.println("El resultado de la division es: " + division);
		
		double division2= (double)a/b;
		System.out.println("El resultado 2 de la division es: " + division2);
		
		double divisionDos = c/b;
		System.out.println("El resultado de la division es: " + divisionDos);
		
		//multiplicacion
		
		double multiplicacion= c *a;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		
		//modulo
		
		double modulo= a % b;
		System.out.println("El resultado del modulo es : " + modulo);
		
	 //operador de asignacion  =
		
		int d=5,e;// inicicializar las variables vacias 
		e=6;
		System.out.println(d + "- " + e);
		
		//Operadores de declaracion compuesta
		// += , -=, *=, /=, %= 
		//una operacion simplificada
		
		int f =0, g =5;
		f+=5;
		System.out.println(f);
		
		//operadores relacionales
		
		/* <, >, <=, >= 
		 * ==igualdad
		 * !=diferencia
		 * Resultado un valor de tipo boolean/booleando (true, false)
		 
		 */
		int h= 15, i=25;
		String j= "Hola";
		
		System.out.println(h>i);//false
		System.out.println(i != h);
		
		//operador unario
		
		/*
		 * ++,--
		 * preasignacion
		 * */
		
		int k=0,l=0;
		System.out.println(++k);
		System.out.println(--l);
		
		//Precedencia de operadores 
		
		int operacion = (4+5)*6/3;
		// 5*6=30
		//30/3=10
		//4+10=14
		
		System.out.println(operacion);
		
		int x=0 , y=0;
		int operacion2=++x + y--;
		//x=1,y =0;
		
		System.out.println(operacion2);
		
		//operador ternario   ? se ut
		
		int edad=19, valor1=0, valor2=1;
		
		int resultado = (edad<= 18)? valor1 : valor2;
		System.out.println(resultado);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int num = sc.nextInt();
		
	}

}
