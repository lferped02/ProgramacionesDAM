package ModeloTiendaAnimales;

import java.time.LocalDate;

public abstract class Mascota {
	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNacimiento;

	protected Mascota(String nombre, int edad, LocalDate fechaNacimiento) {
		super();
		this.setNombre(nombre);
		this.edad = edad;
		this.estado = "vivo";
		this.fechaNacimiento = fechaNacimiento;
	}

	public abstract boolean habla();

	public abstract String muestra();

	public void cumpleaños() {
		this.edad++;
	}

	public void morir() {
		this.estado = "Muerto";
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + getNombre() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		this.getClass().getName();// Devuelve el paquete
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Mascota mascota = (Mascota) obj;
		return getNombre().equals(mascota.getNombre()) && edad == mascota.edad
				&& this.getClass().equals(mascota.getClass());
	}

	public String informacionCompleta() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public void setVuela(boolean vuela) {
		// TODO Auto-generated method stub
		
	}

}
