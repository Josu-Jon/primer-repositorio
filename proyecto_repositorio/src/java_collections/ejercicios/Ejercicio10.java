package java_collections.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ejercicio10 {
	public static List<String> eliminarDuplicados(List<String> lista){
//	- Set -
//	Usamos el Set para eliminar los elemntos duplicados, ya que el Set no los permite
		return new ArrayList<String> (new HashSet<>(lista));
		
//	- Stream -
/*	
 * return lista.stream().distinct().toList();
 */
	}
}