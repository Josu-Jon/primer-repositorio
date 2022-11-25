package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenacion {
	
	public static void main(String[] args) {
//------Ejemplo 1
//		Lista de enteros de ejemplo
		List<Integer> listaEnteros = new ArrayList<>();
		listaEnteros.add(2);
		listaEnteros.add(-28);
		listaEnteros.add(72);
		listaEnteros.add(5);
		
//		Ordena usando el sort del List
		//Por defecto ordena de menor a mayor --> orden natural
		listaEnteros.sort(null);
		
//		Ordena usando el sort de Collections
		//Ordena por defecto de menor a mayor --> orden natural
		Collections.sort(listaEnteros);
		//Ordena la lista mediante un comparador
		Collections.sort(listaEnteros, Comparator.<Integer>reverseOrder());

//		Visualiza los elementos de la lista
		for (Integer i : listaEnteros) {
			System.out.println(i);
		}
//------Ejemplo 2
//		Lista de Persona de ejemplo
		List<Persona> listaP = new ArrayList<>();
		listaP.add(new Persona("1111X", "Jose", "Perezdez"));
		listaP.add(new Persona("3333X", "Felipe", "Fernandez"));
		listaP.add(new Persona("2222X", "Fernando", "Sanchez"));
		
//		Ordenamos la lista de Personas
		//Personas no tiene comparador definido
		//Para que funcione la clase Persona tiene que implementar Comparable<Persona>
		//Lo que implica que tenga el metodo compateTo()
		Collections.sort(listaP);
		
		//Ordenamos la lista usando el comparador que hemos creado en la clase ComparadorPersonaDNI
		Collections.sort(listaP, new ComparadorPersonasDNI());
		
		for (Persona i : listaP) {
			System.out.println(i);
		}
		System.out.println();
		
		//Ordenamos la lista usando el comparador que hemos creado en la clase ComparadorPersonaApellido
		Collections.sort(listaP, new ComparadorPersonasApellido());
		
		for (Persona i : listaP) {
			System.out.println(i);
		}
		System.out.println();
		
		//Ordenamos la lista usando el comparador que hemos creado en la clase ComparadorPersonaApellido 
		//Invertimos el orden del comparador --> .reversed()
		Collections.sort(listaP, new ComparadorPersonasDNI().reversed());
				
		for (Persona i : listaP) {
			System.out.println(i);
		}
		System.out.println();
	}
}
