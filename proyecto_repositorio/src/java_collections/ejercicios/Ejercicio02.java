package java_collections.ejercicios;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio02 {
	public static List<String> ordenarPalabrasInverso(List<String> l) {
		//Se revierte el comparador natural de Strings	<-- Concreto
		Collections.sort(l,Comparator.<String>naturalOrder().reversed());
		//Se revirte el comparador natural por defecto	<-- Generico
		Collections.sort(l, Collections.reverseOrder());
		return l;
	}
}
