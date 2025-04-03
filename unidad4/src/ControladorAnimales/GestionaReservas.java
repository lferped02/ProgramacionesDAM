package ControladorAnimales;

import java.util.Collections;
import java.util.List;

import ModeloAnimales.Animal;
import RepositorioAnimales.ReservaAnimal;

public class GestionaReservas {
	public static void main(String[] args) {
		ReservaAnimal reserva = new ReservaAnimal("Reserva Natural", "Selva Amazónica", 2000000);

		Animal leon = new Animal(1, "Leon");
		Animal elefante = new Animal(2, "Elefante");
		Animal pavoReal = new Animal(3, "Pavo Real");

		reserva.agregarAnimal(leon);
		reserva.agregarAnimal(elefante);
		reserva.agregarAnimal(pavoReal);
		reserva.mostrarAnimales();

		reserva.fromSetToList();

		// Sin ordenar
		List<Animal> listaAnimal = reserva.fromSetToList();
		System.out.println(listaAnimal);
		// Ordenar
		Collections.sort(listaAnimal);
		System.out.println(listaAnimal);

		listaAnimal.add(pavoReal);
		System.out.println(listaAnimal);

		reserva.agregarAnimal(leon);
		System.out.println(listaAnimal);

	}

}
