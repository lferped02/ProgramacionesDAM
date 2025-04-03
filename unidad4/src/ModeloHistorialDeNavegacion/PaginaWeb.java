package ModeloHistorialDeNavegacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class PaginaWeb implements Comparable<PaginaWeb> {
	private String url;
	private LocalDateTime fechaVisita;

	public PaginaWeb(String url, LocalDateTime fechaVisita) {
		this.url = url;
		this.fechaVisita = fechaVisita;
	}

	public String getUrl() {
		return url;
	}

	public LocalDateTime getFechaVisita() {
		return fechaVisita;
	}

	@Override
	public String toString() {
		return "URL: " + url + ", Fecha de visita: " + fechaVisita;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaVisita, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(fechaVisita, other.fechaVisita) && Objects.equals(url, other.url);
	}

	@Override
	public int compareTo(PaginaWeb o) {
		int compare = this.fechaVisita.compareTo(o.fechaVisita);
		if (compare == 0)
			compare = this.url.compareTo(o.url);
		return compare;

	}

	public void setFechaVisita(LocalDate localDate) {
		// TODO Auto-generated method stub

	}
}
