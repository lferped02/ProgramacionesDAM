package ControladorRobot;

import java.time.LocalDate;
import java.util.Date;

import ModeloRobot.DispositivoWifi;

public class SensorTemperatura extends DispositivoWifi {
	private double temperatura;

	public SensorTemperatura(String mac, String estado, LocalDate fechaActualizacion) {
		super(mac, estado, fechaActualizacion);
		this.temperatura = temperatura;
	}

	@Override
	public void conectarInternet() {
		System.out.println("Conectando el sensor de temperatura utilizando WPA...");
	}

	@Override
	public boolean pendienteActualizacion(){
		long diferencia = new Date().getTime() - fechaActualizacion.getTime();
        long diferenciaMeses = diferencia / (1000L * 60 * 60 * 24 * 30);
        return diferenciaMeses >= 3;
	}

	public String toString() {
		return super.toString() + ", Temperatura: " + temperatura + "°C";

	}

}
