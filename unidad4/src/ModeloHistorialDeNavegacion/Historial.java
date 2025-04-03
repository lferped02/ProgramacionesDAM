package ModeloHistorialDeNavegacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Historial {
	Set<PaginaWeb> historial;

	public Historial() {
		super();
		this.historial = new TreeSet<PaginaWeb>();
	}

	public void agregarPagina(PaginaWeb pagina) throws HistorialException {
		if (pagina.getFechaVisita() == null) {
			pagina.setFechaVisita(LocalDate.now());
			historial.add(pagina);
			System.out.println("Pagina añadida correctamente");
		} else if (pagina.getFechaVisita() != null) {
			historial.add(pagina);
			System.out.println("Pagina añadida correctamente");
		} else if (pagina.getFechaVisita().isAfter(null)) {
			throw new HistorialException("No es posible añadir una pagina web con una fecha futura");
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(historial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Historial other = (Historial) obj;
		return Objects.equals(historial, other.historial);
	}

	public Set<PaginaWeb> consultarHistorial() {
		return this.historial;
	}

	public Set<PaginaWeb> consultarHistorialPorDia(LocalDateTime fecha) {
		Set<PaginaWeb> registroDia = new TreeSet<PaginaWeb>();
		for (PaginaWeb cadena : historial) {
			if (cadena.getFechaVisita().equals(fecha) == true)
				registroDia.add(cadena);
		}
		return registroDia;
	}

	public Set<PaginaWeb> consultarPorUrl(String url) {
		Set<PaginaWeb> registroUrl = new TreeSet<PaginaWeb>();
		for (PaginaWeb cadena : historial) {
			if (cadena.getUrl().equals(url) == true)
				registroUrl.add(cadena);
		}
		return registroUrl;
	}

	public Set<PaginaWeb> borrarVisitasPorUrl(String url) {
		Set<PaginaWeb> registroModificado = new TreeSet<PaginaWeb>();
		registroModificado = historial;
		for (PaginaWeb cadena : registroModificado) {
			if (cadena.getUrl().equals(url) == true)
				registroModificado.remove(cadena);
		}
		return registroModificado;
	}

	public void agregarPagina(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		
	}

}
