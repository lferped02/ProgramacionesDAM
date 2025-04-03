package ModeloAnimales;

import java.util.Comparator;

public class AnimalPorMedioYNombre implements Comparator<Animal> {
	@Override
	public int compare(Animal animal1, Animal animal2) {
		int comparacionMedio = animal1.getMedio().compareTo(animal2.getMedio());
		if (comparacionMedio != 0) {
			return comparacionMedio;
		}
		return animal1.getNombre().compareTo(animal2.getNombre());
	}
}
