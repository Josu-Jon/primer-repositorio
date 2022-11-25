package java_collections;

public class Persona implements Comparable<Persona>{
	private String dni;
	private String nombre;
	private String apellido;
	
	public Persona(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String toString() {
		return dni + " " + nombre + " " + apellido;
	}

	@Override
	public int compareTo(Persona p) {
		return this.nombre.compareTo(p.getNombre());
		
	}
}
