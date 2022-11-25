package estructuras_de_datos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemplMapa {
	public static void main(String[] args) {
		Map<String, Integer> mapaH = new HashMap<>();
		
		mapaH.put("Juan",  2);
		mapaH.put("Jesus",  4);
		mapaH.put("Juan",  3);
		
		System.out.println(mapaH.get("Juan"));
	}
}
