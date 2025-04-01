package ModeloRobot;

import java.util.Objects;

import Enum.Estado;

public class RobotsSoldador extends Robots {
	private double temperatura;
	private String especificacion;

	public RobotsSoldador(String modelo, int bateriaNumerico, Estado estado) {
		super(modelo, bateriaNumerico, estado);
		this.temperatura = temperatura;
		this.especificacion = especificacion;
	}

	@Override
	public String ejecutarTarea() {
		return null;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	public String ejecutaTarea() {
		return toString();
	}

	public boolean recargar() {
		boolean recargo = false;
		if (estado == estado.APAGADO && this.combustible.equalsIgnoreCase("Electricidad")) {
			System.out.println("Recargando por electricidad");
			recargo = true;
		} else {
			System.out.println("Estoy encendido y no puedo recargar");
		}
		return false;

	}

	@Override
	public String toString() {
		return "RobotsSoldador [temperatura=" + temperatura + ", especificacion=" + especificacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(especificacion, temperatura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RobotsSoldador other = (RobotsSoldador) obj;
		return Objects.equals(especificacion, other.especificacion)
				&& Double.doubleToLongBits(temperatura) == Double.doubleToLongBits(other.temperatura);
	}

}
