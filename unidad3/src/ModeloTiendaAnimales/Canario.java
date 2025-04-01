package ModeloTiendaAnimales;

import java.time.LocalDate;

public class Canario extends Aves {
	private String color;

	public Canario(String nombre, int edad, LocalDate fechaNacimiento, String pico, boolean vuela, String color) {
		super();
		this.color = color;
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return this.vuela ? "Estoy volando" : "No puedo volar";
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String muestra() {
		return "Canario [color=" + color + ", muestra()=" + muestra() + "]";
	}

	public String canta() {
		return "La la la... Estoy cantando";

	}

}
