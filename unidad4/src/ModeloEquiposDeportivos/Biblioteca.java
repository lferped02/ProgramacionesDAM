package ModeloEquiposDeportivos;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libro> libros;

	public Biblioteca() {
		this.libros = new ArrayList<>();
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void mostrarLibros() {
		for (Libro libro : libros) {
			System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
		}
	}

}
