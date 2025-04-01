package Condicional;

import java.util.Scanner;

public class Ejercicio2FOR {

	public static void main(String[] args) {
		Scanner elEscaner = new Scanner(System.in);
		System.out.println("Introduce un número para que te construya el triángulo:");
		int número = elEscaner.nextInt();
		String cadena = "";
		System.out.println("Triángulo:");
		for (int i = 1; i <= número; i++) {
			cadena = cadena + "*";
			System.out.println(cadena);

		}

	}

}
