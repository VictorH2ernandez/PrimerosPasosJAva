package operadores;
/* Crear un nuevo proyecto llamado NumeroParImpar
crear el m�todo main
crear una funci�n que eval�e si un n�mero es par o impar (se puede usar el operador ternario)
Imprimir en terminal el resultado

*extra, investigar c�mo usar la clase Scanner en java.
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
