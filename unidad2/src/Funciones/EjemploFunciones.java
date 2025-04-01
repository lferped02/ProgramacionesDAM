package Funciones;

import java.util.Scanner;

public class EjemploFunciones {
	public static void main(String[] args) {
		EjemploFunciones f = new EjemploFunciones();
		int Resultado = f.sumaNúmero(4, 7);
		System.out.println(Resultado);
		String[] listaNombre = f.generaLista();
		System.out.println(listaNombre);
		for (String x : listaNombre) {
			System.out.println(x);
		}
	}

	public static int sumaNúmero(int Número1, int Número2) {
		return Número1 + Número2;

	}

	String[] generaLista() {
		String[] Nombres = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un nombre:");

		for (int i = 0; i < Nombres.length; i++) {
			String Nombre = sc.next();
			Nombres[i] = Nombre;
		}
		return Nombres;
	}

}
