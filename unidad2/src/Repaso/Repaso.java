package Repaso;

import java.util.Scanner;

public class Repaso {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("¿Cuánto número quieres?");
		int Resultado = input.nextInt();
		System.out.println(Resultado);
		Repaso r = new Repaso();
		r.Sumapar(Resultado, input);
	}

	int Sumapar(int Númeroconsiderar, Scanner input) {
		int Número = 0;
		for (int i = 0; i < Númeroconsiderar; i++) {

			Scanner input1 = new Scanner(System.in);
			System.out.println("Dame un número");
			int Númeroveces = input1.nextInt();
			if (Númeroconsiderar % 2 == 0) {
				Número = Número + Númeroveces;
			}
			return Número;
		}
		return Número;

	}

}
