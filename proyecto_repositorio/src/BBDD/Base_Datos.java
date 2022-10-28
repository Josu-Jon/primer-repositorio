package BBDD;

public class Base_Datos {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			System.out.println("No se ha podido cargar el driver de la base de datos");
		}
		System.out.println("Programa terminado");
	}
}
