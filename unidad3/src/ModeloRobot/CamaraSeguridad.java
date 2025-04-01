package ModeloRobot;

import java.time.LocalDate;
import java.util.Date;

public class CamaraSeguridad extends DispositivoWifi {
	private String resolucion;

	public CamaraSeguridad(String mac, String estado, LocalDate fechaActualizacion) {
		super(mac, estado, fechaActualizacion);
		this.resolucion = resolucion;
	}

	@Override
	public void conectarInternet() {
		System.out.println("Conectando la cámara de seguridad utilizando WPA3...");

	}

	@Override
	public boolean pendienteActualizacion() {
		long diferencia = new Date().getTime() - fechaActualizacion.getTime();
        long diferenciaSemanas = diferencia / (1000L * 60 * 60 * 24 * 7);
		return diferenciaSemanas >= 2;
	}

	public String toString() {
		return super.toString() + ", Resolución: " + resolucion;
	}

}
