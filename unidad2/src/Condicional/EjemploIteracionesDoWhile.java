package Condicional;

import java.util.Scanner;

public class EjemploIteracionesDoWhile {

	public static void main(String[] args) {
		Scanner elEscaner = new Scanner(System.in);
		int opción;

		do {
			System.out.println("1. Asignar el coche a surtidor y repostar");
			System.out.println("2. Consultar estado de surtidores");
			System.out.println("3. Asignar precio al surtidor.");
			System.out.println("4. Recargar surtidor");
			System.out.println("5. Cerrar y salir del programa");

			System.out.println("Elige una opción:");
			opción = elEscaner.nextInt();

			switch (opción) {

			case 1:
				System.out.println("Asignar el coche a surtidor y repostar.");
				break;

			case 2:
				System.out.println("Consultar estado de surtidores.");
				break;

			case 3:
				System.out.println("Asginar precio al surtidor.");
				break;

			case 4:
				System.out.println("Recargar surtidor.");
				break;

			case 5:
				System.out.println("Cerrar y salir del programa.");
				break;

			default:
				System.out.println("Opción no válida. Intentalo de nuevo");
			}
		} while (opción != 5);

	}

}
