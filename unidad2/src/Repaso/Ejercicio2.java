package Repaso;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		bosque();
	}

	public static void bosque() {
		int altura_total = 0;
		int altura_total1 = 0;
		int suma_altura = 0;
		int suma_altura1 = 0;
		int mayor_total = 0;
		int mayor_total1 = 0;
		int edad_media = 0;
		int suma_edad = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe el número de árboles de los que que introduce los datos");
		int arboles = scanner.nextInt();

		for (int i = 0; i < arboles; i++) {
			System.out.println("Dime el tipo de árbol (A||B):");
			String tipo = scanner.nextLine();

		}
		int edad1 = scanner.nextInt();
	}

}
