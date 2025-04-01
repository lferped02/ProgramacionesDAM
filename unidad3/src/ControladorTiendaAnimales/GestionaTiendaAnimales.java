package ControladorTiendaAnimales;

import java.util.Arrays;

import ModeloTiendaAnimales.Gato;
import ModeloTiendaAnimales.Mascota;

public class GestionaTiendaAnimales {

	public static void main(String[] args) {
		int contador = 0;

		Gato gatito = new Gato(null, contador, null);
		System.out.println(gatito.equals(gatito));

		Mascota[] animales = new Mascota[10];
		animales[contador] = gatito;
		contador += 1;
		System.out.println(Arrays.toString(animales));

	}

}
