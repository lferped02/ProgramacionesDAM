package Boletin1;

import java.util.Scanner;

public class Ejercicio14Calculadora {

	public static void main(String[] args) {
		Scanner elEscaner = new Scanner(System.in);
		System.out.println("Escribe el primer número");
		int número1 = elEscaner.nextInt();
		System.out.println("Escribe el segundo número");
		int número2 = elEscaner.nextInt();
		System.out.println("Escribe la operación que quiere realizar");
		String operación = elEscaner.next();

		operación.toLowerCase();

		switch (operación) {
		case "sumar":
			System.out.println("Resultado de la suma:" + (número1 + número2));

		case "restar":
			System.out.println("Resultado de la resta" + (número1 - número2));

		case "multiplicación":
			System.out.println("Resultado de la multiplicación" + (número1 * número2));

		case "dividir":
			System.out.println("resultado de la divisón" + (número1 / número2));

			break;
		default:
			System.out.println("Operación no válida. Por favor, escribe una operación válida.");
			break;
		}

	}

}
