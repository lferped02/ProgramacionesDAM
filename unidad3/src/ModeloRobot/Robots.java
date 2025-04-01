package ModeloRobot;

import Enum.Estado;

public abstract class Robots {
	private int id;
	private String modelo;
	private int bateriaNumerico;
	private static int contador;
	Estado estado;
	protected String combustible;
	private String descripcion;

	public abstract boolean recargar();

	public abstract String ejecutaTarea();

	public Robots(String modelo, int bateriaNumerico, Estado estado) {
		super();
		this.modelo = modelo;
		this.bateriaNumerico = bateriaNumerico;
		contador = contador + 1;
		this.estado = estado;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateriaNumerico() {
		return bateriaNumerico;
	}

	public void setBateriaNumerico(int bateriaNumerico) {
		if (bateriaNumerico > 10) {
			System.out.println("Ttiene bateria");
		} else {
			System.out.println("No tiene Bateria");
		}
		this.bateriaNumerico = bateriaNumerico;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Robots.contador = contador;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {

		this.estado = estado;
	}

	public void ejecutarTarea(String Tarea) {

	}

	@Override
	public String toString() {
		return "Robots [id=" + id + ", modelo=" + modelo + ", bateriaNumerico=" + bateriaNumerico + ", estado=" + estado
				+ "]";

	}

	public String ejecutarTarea() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean recargar(Estado estado) {
		// TODO Auto-generated method stub
		return false;
	}

}
