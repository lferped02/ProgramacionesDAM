package Tablas;

public class Días_semanas_miércoles {

	public static void main(String[] args) {
		String díasSemanas[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		int pos = 0;

		while (!díasSemanas[pos].equals("Miércoles")) {
			System.out.println(díasSemanas[pos]);
			pos++;
		}

	}

}
