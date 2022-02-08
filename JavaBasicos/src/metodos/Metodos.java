package metodos;

public class Metodos {
	//Método es una función 
	//atributos de la clase
	
	int a,b;
	//Metodo void (vacio)
	
	public void sumar() {
		int resultado= a+b;
		System.out.println("El resultado de sumar " + a + " más " + b +" es= " + resultado);
		
	}
	//metodos con retorno de valores
	public int sumaConRetorno() {
		//int resultado= a+b;
		//return resultado;
		return a+b;
	}
	
	//argumentos 
	//suma(argumentos)
	
	public double multiplicarConArgumentos(int arg1, double arg2) {
		int c=arg1;
		double d= arg2;
		return c*d;
	}
	
    //metodo estatico
	//Este metodo es estsatico void(no regresa datos), usa argumentos
	public static void imrpimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
}
