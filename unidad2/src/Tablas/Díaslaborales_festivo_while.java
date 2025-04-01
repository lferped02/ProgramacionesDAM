package Tablas;

public class Díaslaborales_festivo_while {

	public static void main(String[] args) {
		String díasSemanas[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		for (String día : díasSemanas) {
			System.out.println(día);
		}
		int pos = 0;
		while (pos < díasSemanas.length) {
			if (pos < 5) {
				System.out.println("Laborables" + díasSemanas[pos]);
			} else {
				System.out.println("Festivales" + díasSemanas[pos]);
			}
			pos = pos + 1;
		}

	}

}
