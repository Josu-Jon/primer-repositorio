package prueba_test;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombreCompleto() {
		if (apellido == null || nombre == null) {
			throw new NullPointerException();
		}
		return apellido + ", " + nombre;
	}

	public int getEdad() {
		return edad;
	}

	public boolean esMayorEdad() {
		return edad >= 18;
	}
}
