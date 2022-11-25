package java_collections.ejercicios;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio03 {
	
	public static List<String> ordenarPalabrasLongitud(List<String> l){
		Collections.sort(l, Comparator.comparing(String::length));
		return l;
	}
}
