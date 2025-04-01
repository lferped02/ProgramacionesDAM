package ModeloRobot;

import Enum.Estado;

public class RobotsPintor extends Robots {

	public RobotsPintor(String modelo, int bateriaNumerico, Estado estado) {
		super(modelo, bateriaNumerico, estado);
	}

	@Override
	public boolean recargar() {
		System.out.println("Recargando por electricidad");
		return true;
	}

	@Override
	public String ejecutaTarea() {
		String tarea = "Aplica pintura a los vehículos de manera uniforme";
		return tarea;
	}

}
