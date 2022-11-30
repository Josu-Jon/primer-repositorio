package java_collections.ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class Ejercicio09 {
//	Operador unario
	static class AMayusculas implements UnaryOperator<String>{

		@Override
		public String apply(String t) {
			return t.toUpperCase();
		}
		
	}
	
	public static List<String> convertirMayusculas(List<String> lista){
//	- For (sobre la lista) -
//	Crea otra lista mas a parte de la original
/*		
 * List<String> nuevalista = new ArrayList<>();
 *		for (String s : lista) {
 *			nuevalista.add(s.toUpperCase());
 *		}
 *		return nuevalista;
*/
		
//	- For (iterador) -	
//	No crea otra lista, sino que modifica la lista original
/*	
 * Pero recorre muchas veces la lista y es bastatnte ineficiente
 *		for (int i = 0; i < lista.size(); i++) {
 *			lista.set(i,lista.get(i).toUpperCase());
 *		}
 *		return lista;
*/
	
//	- UnaryOperator -	
//	Modifica la lista aplicando a cada elemento el operador unario	
/*
 *		lista.replaceAll(new AMayusculas());
 *		return lista;
*/		
		
//	- Funciones Lambda -
		lista.replaceAll(s -> s.toUpperCase());
		return lista;
	}
}
