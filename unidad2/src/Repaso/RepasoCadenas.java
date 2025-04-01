package Repaso;

import java.util.Scanner;

public class RepasoCadenas {
	public static void main(String[] args) {
		RepasoCadenas r = new RepasoCadenas();
		String[] palabras = r.cargaTabla();
		System.out.println(palabras);
		r.imprimeTabla(palabras);
		String[] numeros = r.filtraNumero(palabras);
		String[] minusculas = r.filtraPrimeraMinusculas(palabras);
		r.imprimeTabla(numeros);
		r.imprimeTabla(minusculas);
		System.out.println("Termino");
	}

	boolean comparaTablas(int[] Tabla1, int Tabla2) {
		boolean iguales = true;
		// Comparo elemento a elemento si son iguales.
		if (Tabla1.length != Tabla2.length) {
			iguales = false;
		} else {
			// Comparo elemento a elemento si son iguales.
			for (int i = 0; Tablas.length; i++) {

			}
		}
	}

	String[] cargaTabla() {
		System.out.println("Introduce tu frase:");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		String[] Tablas = frase.split("");
		return Tablas;
	}

	void imprimeTabla(String[] Tablas) {
		for (int i = 0; i < Tablas.length; i++)
			;

	}

	String[] filtraNumero(String[] Tablas) {
		String[] Numeros = new String[Tablas.length];
		for (int i = 0; i < Tablas.length; i++)
			;
		// Si tabla [i] es número -> lo guardo.
		{
			if (isCadenaEsNumero(Tablas[i])) {
				Numeros[i] = Tablas[i];
			}

		}
		return Numeros;
	}

	boolean isCadenaEsNumero(String palabras) {
		boolean es = false;
		for (int i = 0; i < palabras.length(); i++) {
			Character c = palabras.charAt(i);
			Character.isDigit(c);
		}
		return es;
	}

	String[] filtraPrimeraMinusculas(String[] Tablas) {
		String[] minusculas = new String[Tablas.length];
		for (int i = 0; i < Tablas.length; i++) {
			if (isMinusculaPrimeraLetra(Tablas[i])) {
				minusculas[i] = Tablas[i];
			}
		}
		return minusculas;
	}

	boolean isMinusculas(String palabras) {
		boolean esMin = false;
		if (Character.isLowerCase(palabras.charAt(0)))
			esMin = true;
		return esMin;

	}

	String[] convierteTabla(String[] palabras) {
		String convertidas = new String[palabras.length];
		// TODO Tengo que iterar palabra a palabra e ir guardando la palabra convertida.
		return convertidas;
	}

	String realizaConversion(String palabras) {
		String palabraConvertida = "";
		// Convierte el primer caracter a mayúsculas.
		// Si es un una O lo cambio a 0.
		// Cambio último caracter a la longitud de la palabra.
		return palabraConvertida;
	}

}
