package java_collections;

import java.util.Comparator;

public class ComparadorPersonasApellido implements Comparator<Persona>{

		@Override
		public int compare (Persona a, Persona b) {
			return a.getApellido().compareTo(b.getApellido());
		}
	}