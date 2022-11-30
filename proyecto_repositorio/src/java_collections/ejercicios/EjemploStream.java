package java_collections.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStream {
	public static void main(String[] args) {
		List<String> palabras = Arrays.asList("historia", "caricatura", "historia");
		
		List<String> nuevaLista = palabras.stream().map(s -> s.toUpperCase()).toList();
		System.out.println(nuevaLista);
	}
}
