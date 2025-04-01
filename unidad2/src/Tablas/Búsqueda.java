package Tablas;

import java.util.Scanner;

public class Búsqueda {

	public static void main(String[] args) {
		Scanner Elescaner = new Scanner(System.in);
		int tablaNúmero = Elescaner.nextInt();
		int posLista[] = new int[4];
		posLista[0] = 1;
		posLista[1] = 3;
		posLista[2] = 4;
		posLista[3] = 7;

		for (int i = 0; i < posLista.length; i++) {
			if (tablaNúmero == posLista[i]) {
				System.out.println("Este número está en la posición" + i);
			} else {
				if (tablaNúmero < posLista[i] && tablaNúmero > posLista[i - 1]) {
					int posición = i;
					System.out.println("El número está en la posición -" + posición);
				}

			}
		}

	}

}
