package Prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fernández_pokedex {

	// Imprimir el menú.
	public static int imprimeMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Capturar Pokemón");
		System.out.println("2.Realizar la batalla");
		System.out.println("3. Mostrar Pokédex");
		System.out.println("4. Finalizar");
		System.out.print("Elige una opción: ");
		return scanner.nextInt();
	}

	// Vamos a capturar los Pokemon y poniendole el nombre del pokemon
	String capturarPokemon(String pokemon) {
		System.out.println("Dime el nombre del pokémon:");
		return pokemon;
	}

	// Vamos a ver el nuúmero inicial.
	int nivelInicial() {
		int nivelInicial = 1;
		return nivelInicial;
	}

	// Tiene que tener máximo 15 pokemon.
	int pokemonCapturado() {
		int pokemons = 15;
		return pokemons;
	}

	// Ahora vamos a realizar la batalla de pokemon.
	String realizarBatalla(boolean pokemon) {
		if (pokemon) {
			System.out.println("Gana la batalla y sube de nivel");
		} else if (pokemon) {
			System.out.println("Empate, no paso nada");
		} else {
			System.out.println("Pierde el combate");
			return realizarBatalla(false);
		}
		return null;
	}
	//

	//
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List pokemon = new ArrayList();
		int opcion = 0;
		int numeroVecesJugado = 0;
		while (opcion != 3) {
			opcion = imprimeMenu();

		}

	}

}
