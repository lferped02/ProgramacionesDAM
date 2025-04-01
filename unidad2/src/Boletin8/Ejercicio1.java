package Boletin8;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int alumnosA = 25, alumnosB = 28, alumnosC = 31, alumnosD = 29;
		int numeroAlumno = 0;
		String grupos;
		System.out.println("Introduce el grupo (A,B,C,D):");
		grupos = input.nextLine().toUpperCase();

		switch (grupos) {
		case "A":
			numeroAlumno = alumnosA;
		case "B":
			numeroAlumno = alumnosB;
		case "C":
			numeroAlumno = alumnosC;
		case "D":
			numeroAlumno = alumnosD;
			break;
		default:
			System.out.println("Grupo no válido");
		}

	}

}
