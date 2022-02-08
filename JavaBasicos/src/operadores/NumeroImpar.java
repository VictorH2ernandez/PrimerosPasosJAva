package operadores;
/* Crear un nuevo proyecto llamado NumeroParImpar
crear el método main
crear una función que evalúe si un número es par o impar (se puede usar el operador ternario)
Imprimir en terminal el resultado

*extra, investigar cómo usar la clase Scanner en java.
*/
public class NumeroImpar {
	public static void main(String[]args) {
		
		int numero1=15;
		
		
		if((numero1 % 2) !=0) {
			System.out.println("El numero " + numero1+ " no es numero par");
		} else {
			System.out.println("Es un numero par: ");
		}
	}

}
