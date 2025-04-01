package Prueba;

import java.util.Scanner;

public class Fernández_prueba1 {
	public static void main(String[] args) {
		// Identificar las palabras que tienen al menos 3 vocales.
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		System.out.println("aeropuerto, ciencia, educacuón, europeo, feria, idea, unión");
		String palabra;
		System.out.println("Introduce las palabras (aeropuerto, educación, europeo,unión):");
		palabra = scanner.nextLine().toUpperCase();
	}

	// Vamos a separarlas.
	int vocales(String vocal) {
		String[] parte = vocal.split(",");
		return parte[1].length();

	}

}
