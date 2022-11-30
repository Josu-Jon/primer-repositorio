package practicasAPI;
import java.util.ArrayList;
import java.util.List;

public class principal {
		public static void main(String[] args) {
			List<Persona> listaPersonas = new ArrayList<>();
			
			Persona p1 = new Persona("22767695H", "Josu Jon","Lopez");
			
			listaPersonas.add(p1);
			listaPersonas.add(new Persona("22767698J", "Federico","Suarez"));
			listaPersonas.add(new Persona("22767696P", "Aritz","Iturbide"));
			
			System.out.println(listaPersonas.contains(p1));
	}
}
