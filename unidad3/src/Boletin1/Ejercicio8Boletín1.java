package Boletin1;

import java.util.Scanner;

public class Ejercicio8Boletín1 {

	public static void main(String[] args) {
		float descuento, precio;
		System.out.println("Dame un número:");
		Scanner input = new Scanner(System.in);
		Scanner elEscaner = new Scanner(System.in);
		int edad = elEscaner.nextInt();
		/*
		 * if (edad > 60) { descuento = 0.3F; } else { descuento = 0.1F;
		 * 
		 * }
		 */
		descuento = (edad > 60) ? 0.3F : 0.1F;

		System.out.println("Dame el precio del producto:");
		precio = input.nextFloat();
		precio = precio - descuento * precio;
		System.out.println("El precio final es:" + precio);

		elEscaner.close();
		input.close();

	}

}
