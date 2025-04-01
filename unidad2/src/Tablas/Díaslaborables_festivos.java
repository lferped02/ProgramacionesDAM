package Tablas;

public class Díaslaborables_festivos {

	public static void main(String[] args) {
		String díasSemanas[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		for (String día : díasSemanas) {
			System.out.println(día);
		}

		for (int pos = 0; pos < díasSemanas.length; pos++) {
			if (pos < 5) {
				System.out.println("Laborable" + díasSemanas[pos]);
			} else {
				System.out.println("Festivo" + díasSemanas[pos]);
			}
		}

	}

}
