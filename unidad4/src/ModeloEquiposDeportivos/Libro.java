package ModeloEquiposDeportivos;
import java.util.ArrayList;
import java.util.List;

public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private int anoPublicacion;
	private List<String> ejemplaresDisponibles;
	private List<String> ejemplaresPrestados;

	public Libro(String titulo, String autor, String genero, int anoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anoPublicacion = anoPublicacion;
		this.ejemplaresDisponibles = new ArrayList<>();
		this.ejemplaresPrestados = new ArrayList<>();
	}

	public void agregarEjemplar(String ejemplar) {
		ejemplaresDisponibles.add(ejemplar);
	}

	public void prestarEjemplar(String ejemplar) throws Exception {
		if (ejemplaresDisponibles.contains(ejemplar)) {
			ejemplaresDisponibles.remove(ejemplar);
			ejemplaresPrestados.add(ejemplar);
		} else {
			throw new Exception("No hay ejemplares disponibles para prestar.");
		}
	}

	public void devolverEjemplar(String ejemplar) throws Exception {
		if (ejemplaresPrestados.contains(ejemplar)) {
			ejemplaresPrestados.remove(ejemplar);
			ejemplaresDisponibles.add(ejemplar);
		} else {
			throw new Exception("Este ejemplar no fue prestado.");
		}
	}

	public void mostrarEjemplares() {
		System.out.println("Ejemplares disponibles: " + ejemplaresDisponibles);
		System.out.println("Ejemplares prestados: " + ejemplaresPrestados);
	}

	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAutor() {
		// TODO Auto-generated method stub
		return null;
	}

}
