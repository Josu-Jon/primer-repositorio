package java_collections;

import java.util.Comparator;

public class ComparadorPersonasDNI implements Comparator<Persona>{

		@Override
		public int compare (Persona a, Persona b) {
			return a.getDni().compareTo(b.getDni());
		}
	}