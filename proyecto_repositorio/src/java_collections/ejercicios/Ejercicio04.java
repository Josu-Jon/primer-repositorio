package java_collections.ejercicios;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio04 {
	public static List<String> ordenarPalabrasLongitudInv(List<String> l){
		Collections.sort(l, Comparator.comparing(String::length).reversed());
		return l;
	}
}
