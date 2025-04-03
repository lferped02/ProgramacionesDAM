package ModeloAnimales;

import java.time.LocalDate;
import java.util.Objects;

import Enum.*;

public class Animal implements Comparable<Animal> {
	private int identificador;
	private String nombre;
	private String especie;
	private int edad;
	private ClasificacionComida clasificacionComida;
	private LocalDate fechaNacimiento;
	private double peso;
	private Medio medio;
	private ClasificacionGestacion clasificacionGestacion;

	public Animal(int identificador, String nombre, String especie, int edad, ClasificacionComida clasificacionComida,
			LocalDate fechaNacimiento, double peso, Medio medio, ClasificacionGestacion clasificacionGestacion) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.clasificacionComida = clasificacionComida;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.medio = medio;
		this.clasificacionGestacion = clasificacionGestacion;

	}

	public Animal(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int compareTo(Animal animal) {
		int resultadoComparar = this.nombre.compareTo(animal.getNombre());
		return resultadoComparar;
	}

	@Override
	public String toString() {
		return "Animal [identificador=" + identificador + ", nombre=" + nombre + "]";
	}

	public Animal getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	public Animal getMedio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clasificacionComida, clasificacionGestacion, edad, especie, fechaNacimiento, identificador,
				medio, nombre, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return clasificacionComida == other.clasificacionComida
				&& clasificacionGestacion == other.clasificacionGestacion && edad == other.edad
				&& Objects.equals(especie, other.especie) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& identificador == other.identificador && medio == other.medio && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}

}
