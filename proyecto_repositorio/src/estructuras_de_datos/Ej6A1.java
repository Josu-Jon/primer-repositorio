package estructuras_de_datos;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ej6A1 {
	
	
	public static void main(String[] args) {
		try (Scanner scaner = new Scanner(System.in)){
			System.out.println("Fase: ");
			String frase = scaner.nextLine();
			
			//Apilar
			Deque<String> pila = new LinkedList<>();
			for (String s: frase.split(" ")) {
				pila.push(s);
			}
			
			//Desapilar
			while (!pila.isEmpty()) {
				System.out.print(pila.pop() + " ");
			}
			
		}
	}
	
}
