package Simulacro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Simulacro {
	private static char[] jugada;
	private static String numeroDados;
	{
		class Jugada {
			int numeroApuesta;
			double dineroApuesta;
			int numeroDados;
			double ganancias;
		}

	}

	// Imprimir el menú.
	public static int imprimeMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Realizar una apuesta");
		System.out.println("2. Ver historial de jugadas");
		System.out.println("3. Salir");
		System.out.print("Elige una opción: ");
		return sc.nextInt();
	}

	// Pedir el número de dinero de la apuesta.
	public static double dineroApuesta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir el dinero a apostar:");
		return sc.nextDouble();
	}

	// Tirar los dados y obtener la suma.
	public static int tirarDadosSuma() {
		Random aleatorioR = new Random();
		int dado1 = aleatorioR.nextInt(6) + 1;
		int dado2 = aleatorioR.nextInt(6) + 1;
		return dado1 + dado2;
	}

	// Calcular las ganancias.
	public static double calculaGanancias(double numeroApuesta, double dineroApuesta, int numeroDados) {
		double ganancias = 0;
		if (numeroDados == 7) {
			ganancias = dineroApuesta * 2;
		}
		return ganancias;
	}

	// Mostrar el historial de jugadas.
	public static <Jugada> void mostrarHistorial(List<Jugada> historial) {
		if (historial.isEmpty()) {
			System.out.println("No hay jugadas registradas.");
		} else {
			for (Jugada jugada : historial)
				;
			System.out.println(jugada);
		}
	}

	public static <Jugada> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Jugada> historial = new ArrayList();
		int opcion = 0;
		int numeroVecesJuagdo = 0;

		while (opcion != 3) {
			opcion = imprimeMenu();

			switch (opcion) {
			case 1: {
				double numeroApuesta = dineroApuesta();
				double dineroApuesta = dineroApuesta();
				int numeroDados = tiraDadosYSuma();
				double ganancias = calculaGanancias(numeroApuesta, dineroApuesta, numeroDados);
				registraJugadaEnHistorial(historial, numeroApuesta, dineroApuesta, numeroDados, ganancias);
				int numeroVecesJugado = 0;
				numeroVecesJugado++;
				System.out.println("Apuesta registrada. Ganaste: " + ganancias);
				break;
			}
			case 2: {
				mostrarHistorial(historial);
				break;
			}
			default:
				System.out.println("Introduce una opción correcta.");
			}
		}
		System.out.println("¡Gracias por jugar!");
	}

	private static <Jugada> void registraJugadaEnHistorial(List<Jugada> historial, double numeroApuesta,
			double dineroApuesta, int numeroDados2, double ganancias) {
	}

	public static int tiraDadosYSuma() {
		Random aleatorioR = new Random();
		int dado1 = aleatorioR.nextInt(6) + 1;
		int dado2 = aleatorioR.nextInt(6) + 1;
		return dado1 + dado2;
	}

}
