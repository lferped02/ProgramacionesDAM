package ModeloTiendaAnimales;

import java.time.LocalDate;

public class Gato extends Mascota {
	private String color;
	private boolean peloLargo;

	public Gato(String nombre, int edad, LocalDate fechaNacimiento) {
		super(nombre, edad, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return null;
	}

}
