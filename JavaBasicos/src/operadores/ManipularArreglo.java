/*crea un array con los siguientes números enteros:

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.

*/
package operadores;

public class ManipularArreglo {
	public static void main(String[]arg) {
		
		int numeros[];
		numeros=new int[10];
		
		numeros[0]=1;
		numeros[1]=6;
		numeros[2]=45;
		numeros[3]=53;
		numeros[4]=80;
		numeros[5]=102;
		numeros[6]=145;
		numeros[7]=326;
		numeros[8]=450;
		numeros[9]=892;
		
		int sumaT=0;
		int sumaPar=0;
		int sumaImp=0;
		for(int i=0; i<numeros.length;i++) {
			sumaT=sumaT+numeros[i];
		
			
			if(numeros[i]% 2==0) {
				sumaPar=sumaPar+numeros[i];
			} else {
				sumaImp= sumaImp+numeros[i];
			}
		}
		
		System.out.println("Suma total= "+sumaT);
		System.out.println("Suma par= "+sumaPar);
		System.out.println("Suma impar= "+sumaImp);
	}
}
