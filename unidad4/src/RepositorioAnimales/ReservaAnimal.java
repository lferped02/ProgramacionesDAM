package RepositorioAnimales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ModeloAnimales.Animal;

public class ReservaAnimal {
	private String nombre;
	private String lugar;
	private double presupuestoAnual;
	private List<Animal> animales;

	public ReservaAnimal(String nombre, String lugar, double presupuestoAnual) {
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuestoAnual = presupuestoAnual;
		this.animales = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public double getPresupuestoAnual() {
		return presupuestoAnual;
	}

	public void setPresupuestoAnual(double presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}

	public List<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}

	public boolean agregarAnimal(Animal animal) {
		for (Animal animal1 : animales) {
			if (animal1.getIdentificador() == animal1.getIdentificador()) {
				return false;
			}
		}
		animales.add(animal);
		Collections.sort(animales);
		return true;
	}

	public void mostrarAnimales() {
		for (Animal animal : animales) {
			System.out.println(animal);
		}
	}

	public List<Animal> fromSetToList() {
		List<Animal> listaAnimales = new ArrayList<Animal>();
		for (Animal animal : listaAnimales) {
			listaAnimales.add(animal);
		}

		return listaAnimales;

	}

}
