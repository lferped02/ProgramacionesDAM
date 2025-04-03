package ControladorHistorialDeNavegación;

import java.time.LocalDateTime;
import java.util.Scanner;

import ModeloHistorialDeNavegacion.Historial;
import ModeloHistorialDeNavegacion.HistorialException;
import ModeloHistorialDeNavegacion.PaginaWeb;

public class GestionaHistorial {

	public static void main(String[] args) {
		Historial historial = new Historial();
		Scanner scanner = new Scanner(System.in);

		try {
			historial.agregarPagina(new PaginaWeb("http://ejemplo1.com", LocalDateTime.of(2023, 4, 1, 10, 30)));
			historial.agregarPagina(new PaginaWeb("http://ejemplo2.com", LocalDateTime.of(2025, 4, 2, 10, 30))); // Fecha
																													// futura
			historial.agregarPagina(new PaginaWeb("http://ejemplo1.com", LocalDateTime.now())); // Fecha actual
			historial.agregarPagina(new PaginaWeb("http://ejemplo3.com", LocalDateTime.of(2023, 3, 29, 15, 0)));
			historial.agregarPagina(new PaginaWeb("http://ejemplo2.com", LocalDateTime.of(2024, 7, 15, 8, 45)));
			historial.agregarPagina(new PaginaWeb("http://ejemplo1.com", LocalDateTime.of(2023, 11, 20, 12, 0)));

		} catch (HistorialException e) {
			System.out.println("Error al agregar página: " + e.getMessage());
		}

		boolean salir = false;

		while (!salir) {
			System.out.println("Menu:");
			System.out.println("1. Agregar página al historial");
			System.out.println("2. Consultar historial completo");
			System.out.println("3. Consultar historial de un día");
			System.out.println("4. Consultar registros de una URL");
			System.out.println("5. Borrar visitas a una página");
			System.out.println("6. Salir");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				System.out.print("Ingresa la URL: ");
				String url = scanner.nextLine();
				System.out.print("Ingresa la fecha (aaaa-MM-dd HH:mm): ");
				String fechaStr = scanner.nextLine();
				PaginaWeb fecha = new PaginaWeb(url, fechaVisita(fechaStr));

				try {
					historial.agregarPagina(fecha);

				} catch (HistorialException e) {
					System.out.println("Error al agregar página: " + e.getMessage());
				}
				break;

			case 2:
				System.out.println("Historial completo:");
				for (PaginaWeb pagina : historial.consultarHistorial()) {
					System.out.println(pagina);
				}
				break;

			case 3:
				System.out.print("Ingresa la fecha (aaaa-MM-dd): ");
				String fechaDiaStr = scanner.nextLine();
				LocalDateTime fechaDia = LocalDateTime.parse(fechaDiaStr + "T00:00:00");
				for (PaginaWeb pagina : historial.consultarHistorialPorDia(fechaDia)) {
					System.out.println(pagina);
				}
				break;

			case 4:
				System.out.print("Ingresa la URL a consultar: ");
				String urlConsulta = scanner.nextLine();
				for (PaginaWeb pagina : historial.consultarPorUrl(urlConsulta)) {
					System.out.println(pagina);
				}
				break;

			case 5:
				System.out.print("Ingresa la URL a borrar: ");
				String urlBorrar = scanner.nextLine();
				historial.borrarVisitasPorUrl(urlBorrar);
				System.out.println("Visitas a la URL " + urlBorrar + " borradas.");
				break;

			case 6:
				salir = true;
				break;

			default:
				System.out.println("Opción no válida.");
			}
		}

	}

	private static LocalDateTime fechaVisita(String fechaStr) {
		// TODO Auto-generated method stub
		return null;
	}

}
