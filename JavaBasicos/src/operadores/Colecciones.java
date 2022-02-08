package operadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
//https://www.adictosaltrabajo.com/2015/09/25/introduccion-a-colecciones-en-java/
public class Colecciones {
	public static void main(String[] args) {
		//Las colecciones nos sirven para alamcenar un conjunto 
		//de objetos
		//La diferencia de las colecciones y objetos
		// es  que las colecciones son dinamicas, pueden cambiar
		//el numero de objetos agregados
		//set  tiene 3 implicaciones
		//no puede contener elementos repetidos

		//HashSet
		//los elementos no mantienen un orden
		//Es la implementacion mas rapida
		//
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("Mango");
		frutas.add("Granada");
		frutas.add("Piña");
		frutas.add("Sandia");
		frutas.add("Uva");
		frutas.add("mamey");
		frutas.add("Platano");
		frutas.add("Fresa");
		*/
		//foreach, puede recorrer una coleccion y en cada
		//recorrdio recupera el valor y lo podemnos almacenar
		//en una variable
		//Sintaxis
		//for(tipoDeDatoElemento variable :elementoARecorrer
		/*for(String fruta:frutas) {
			System.out.println(fruta);
		//colecciones dinamicas
		//arreglo no	
		}
		*/
		
		//TreeSet
		//esta implementacion ordena los elementos
		//de sus valors
		//es la implementacion mas lenta
		
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("uva");
		frutas.add("Mamey");
		frutas.add("platano");
		frutas.add("fresa");
		
		for(String fruta:frutas) {
			System.out.println(fruta);
			
		}*/
			
		//LimkedHashSet
		//ordena los elementos en orden de insersión 
		//es mas costoso que HashSet
		/*
		 * Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("uva");
		frutas.add("Mamey");
		frutas.add("platano");
		frutas.add("fresa");
		
		for(String fruta:frutas) {
			System.out.println(fruta);
		}
		*/
		/*
		 * //Orden de velocidad 
//1.HashSet
//2.LinkedHashSet
//3.TreeSet

		 * */
		
		//Colecciones List
		//se permiten elementos duplicados
		//acceder a elementos especificos
		//buscar elementos
		//se respeta el orden de insersion
		//ArreyList
		
		List <String> pokemones = new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		pokemones.add("Gengar");
		
		//add si agregamos un indice y un elemento,posiciona el elemento en el indice y realiza un desplazamiento 
		//es decir no borra el elemento en la posición sino que lo desplaza
		
		pokemones.add(2,"Pikachu");//agregamos pikachu en la posision numero 2 desplazando al elemento anterior 
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("************");//obtenemos el metodo segun la posision
		System.out.println(pokemones.get(4));
		
		//indexOf, nos va a devolver la posición del elemento y si el elemento no se encuentra nos devuelve -1
		
		System.out.println(pokemones.indexOf("Gengar")); // si el elemento esta dos veces solo nos regresa 
		//la posicion del elemento en primera posición  //indesOf en pocas palabras nos regresa la primera posicion 
		//del elemento que se encuentr
		
		System.out.println(pokemones.lastIndexOf("Gengar")); // nos regresa el elemento repetido en ultima posicion
		
		
		//metodo remove remueve el elemento de la posicion especifica
		
		pokemones.remove(5);
		
		//set reemplaza el elemento en la posicion especifica.
		pokemones.set(0, "Flareon");
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
				
		}
		
		System.out.println("************");
		
		//LinkedList
		//Es una lista doblemente enlazada
		//Es mas rapido para insertar y remover elementos 
		
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("greymon");
		
		for (String digimon : digimones) {
			System.out.println(digimon);
		}
		
		System.out.println("************");
		
		// Map: Asocia claves a valores, no puede contener claves duplicadas
		//solo puede tener un valor asociado
		
		//HashMap: Muy parecida al setHash 
		//Tiene mejor rendimiento pero no garantiza un orden
		//a la hora de hacer interacciones 
		
		Map<Integer, String> usuarios= new HashMap<Integer,String>();
		usuarios.put(1,"Victor Hernández");  // usuario.put(clave,elemento)
		usuarios.put(2,"Karla");
		usuarios.put(3,"Victor Jugo");
		usuarios.put(4,"Den");
		usuarios.put(5,"Tavo");
		usuarios.put(6,"Rebe");
		usuarios.put(7,"Omar");
		usuarios.put(8,"Shain");
		usuarios.put(9,"wicho");
		usuarios.put(10, "Santiago");
		
		System.out.println(usuarios.get(2));
		
		//keySet
		//Nos permiete recuerar el nombre de la clave
		System.out.println(usuarios.keySet());
		//values
		//nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		
		System.out.println("**************************");
		//TreeMap
		Map<String,String>tamales=new TreeMap<String,String>();
		tamales.put("Oaxaqueño", "Mole Rojo");
		tamales.put("Torta","Mole verde");
		tamales.put("Dulces","Gansito");
		tamales.put("Salado","Cochinita");
		tamales.put("Tortas","Rajas");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		
		tamales.entrySet().forEach(elemento->{
			System.out.println(elemento);
			System.out.println(elemento.getValue());
		});
		
		System.out.println("******************************************");
		//LinkedHashMap
		Map<Integer,String> carros=new LinkedHashMap<Integer,String>();
		//guarda los elemento, según el orden en que se inserten
		carros.put(1,"volvo");
		carros.put(22,"pointer");
		carros.put(8,"Mustang");
		
		System.out.println("***********************************");
		System.out.println(carros.keySet());
		
		/* charAt
		String miCadena = "Hola a todos, todas y todes";
		System.out.println(miCadena.charAt(0));*/
	}
}