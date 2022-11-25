package estructuras_de_datos;

import java.util.ArrayList;
import java.util.List;

public class listas {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>(); 
	}
	
	public static List<Integer> trabajarConListas(List<Integer> lista, int num) { 
		lista.set(0, num);
		return lista;
	}
}
