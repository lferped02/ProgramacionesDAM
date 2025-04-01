package Tablas;

public class Mostrar_contenido_tabla {

	public static void main(String[] args) {
		String díasSemanas[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		for (String día : díasSemanas) {
			System.out.println(día);
		}

		for (int pos = 0; pos < díasSemanas.length; pos++) {
			System.out.println(díasSemanas[pos]);
		}

	}

}
