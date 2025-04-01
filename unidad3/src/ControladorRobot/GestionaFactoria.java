package ControladorRobot;

import ModeloRobot.CamaraSeguridad;
import ModeloRobot.RobotsEnsamblador;
import ModeloRobot.RobotsPintor;

public class GestionaFactoria {

	public static void main(String[] args) {
		// Robots
		GestionaFactoria gestion = new GestionaFactoria();
		RobotsEnsamblador soldador = new RobotsEnsamblador(null, 0, null);
		RobotsPintor pintor = new RobotsPintor(null, 0, null);
		RobotsEnsamblador ensamblador = new RobotsEnsamblador(null, 0, null);
		gestion.guardarRobot(soldador);
		gestion.guardarRobot(pintor);
		gestion.guardarRobot(ensamblador);

		// Dispositivo
		SensorTemperatura sensor = new SensorTemperatura("00:14:22:01:23:45", "ON_SINWIFI", new Date(), 22.5);
		CamaraSeguridad camara = new CamaraSeguridad("00:14:22:01:23:46", "OFF", new Date(), "1920x1080");
		PuertaAutomatica puerta = new PuertaAutomatica("00:14:22:01:23:47", "ON_SINWIFI", new Date(), true);

		gestion.guardarDispositivoWifi(sensor);
		gestion.guardarDispositivoWifi(camara);
		gestion.guardarDispositivoWifi(puerta);

		gestion.mostrarInventario();

	}

}