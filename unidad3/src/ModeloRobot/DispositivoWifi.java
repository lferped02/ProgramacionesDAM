package ModeloRobot;

import java.time.LocalDate;
import java.util.Date;

public abstract class DispositivoWifi {
	private String mac;
	private String estado;
	protected LocalDate fechaActualizacion;

	public DispositivoWifi(String mac, String estado, LocalDate fechaActualizacion) {
		super();
		this.mac = mac;
		this.estado = estado;
		this.fechaActualizacion = fechaActualizacion;
	}

	public abstract void conectarInternet();

	protected String getMac() {
		return mac;
	}

	protected void setMac(String mac) {
		this.mac = mac;
	}

	public boolean pendienteActualizacion() {
		long diferencia = new Date().getTime() - fechaActualizacion.getTime();
		long diferenciaMeses = diferencia / (1000L * 60 * 60 * 24 * 30);
		return diferenciaMeses >= 1;
	}

	public void apagar() {
		estado = "OFF";
		System.out.println("Dispositivo apagado. Estado: " + estado);
	}

	public String toString() {
		return " MAC: " + mac + ", Estado: " + estado + ", Fecha actualización: " + fechaActualizacion;
	}

}
