package Simulacro;

import java.util.Scanner;

public class Simulacro2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame un número");
		String numeroCadena = scanner.next();
		Simulacro2 r = new Simulacro2();
		String resultado = r.redondear(numeroCadena);
		System.out.println(resultado);
	}

	String redondear(String numero) {
		int numeroDecimal = calculaNumeroDecimal(numero);
		String resultado = numero;
		if (numeroDecimal >= 3) {
			// resultado = redondeoCon3MasDecimales (numero);
		} else if (numeroDecimal < 2) {
			resultado = redondeoCon2MenosDecimales(numero);
		}
		return numero;
	}

	// Vamos a calcular el número decinal.
	int calculaNumeroDecimal(String numero) {
		String[] parte = numero.split(",");
		return parte[1].length();
	}

	// Redondeamos con menos de dos decimales.
	String redondeoCon2MenosDecimales(String numero) {
		String resultado = numero;
		int numeroDecimal = calculaNumeroDecimal(resultado);
		while (numeroDecimal != 2) {
			if (numeroDecimal == 0) {
				resultado = resultado + ",0";
			} else {
				resultado = resultado + "0";
			}
			return resultado;
		}
		return resultado;
	}

}
