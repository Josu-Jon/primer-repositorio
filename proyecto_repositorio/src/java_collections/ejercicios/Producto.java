package java_collections.ejercicios;

import java.time.LocalDate;

/**
 * Clase que representa un producto
 */
public class Producto implements Comparable<Producto>{
    
    private int id; // id del producto
    private String nombre; // nombre del producto
    private int unidades; // número de unidades compradas
    private LocalDate entrega; // fecha de entrega del producto

    public Producto(int id, String nombre, int unidades, LocalDate entrega) {
        this.id = id;
        this.nombre = nombre;
        this.unidades = unidades;
        this.entrega = entrega;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public LocalDate getEntrega() {
        return entrega;
    }

	@Override
	public int compareTo(Producto p) {
		return this.id - p.getId();
	}

}
