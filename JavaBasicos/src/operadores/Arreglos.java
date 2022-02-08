package operadores;

public class Arreglos {
	 public static void main(String[]args) {
			//solo un tipo de dato
			//especificar tamaño o la cantidad de elementos que va a contener 
			
			//1ra manera de hacer arreglos 
			int numeros[];//creamos la variable
			numeros = new int[4] ; //(creamos el arreglo)(new para crear una copia del objeto)  
			
			//2da manera de hacer arreglos 
			
			String[] nombres = new String[4]; // los corchetes cuadrados se usan antes o despues de la variable.
			                                  // El 4 nos indica el espacio de memoria en 0 [0,1,2,3]
			
			//3ra manera
			//array literal
			
			String []nombreFrutas=new String[] {"Manzana" ,"Platano","Piña","Uva"};
			
						
			numeros[0]=10;
			numeros[1]=8;
			numeros[2]=100;
			numeros[3]=200;
			//numeros[4]=200;
			
			nombres[0]="juan";
			nombres[1]="roberto";
			nombres[2]="pepe";
			nombres[3]="hugo";
			
			System.out.println(numeros[0]);
			System.out.println(numeros);
			
			for(int i=0; i<numeros.length;i++) {//en arrays, lenght es una propiedad 
				//por lo tanto no se usan parenteces en lenght(); 
				System.out.println("Elemento de números: "+numeros[i]);
				System.out.println("Elemento de nomnbres: "+nombres[i]);
				System.out.println("Elemento de frutas: "+ nombreFrutas[i]);
				System.out.println("*********************************");
				
			
			}
			
	 }
	  
	 
}
