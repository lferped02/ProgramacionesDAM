package ModeloAnimales;

import java.util.Comparator;

public class AnimalPorNombreYFechaNacimiento implements Comparator<Animal> {
	
	@Override
	public int compare(Animal animal1, Animal aniaml2) {
		Animal animal2 = null;
		int comparacionNombre = animal1.getNombre().compareTo(animal2.getNombre());
		if (comparacionNombre != 0) {
			return comparacionNombre;
		}
		return animal1.getFechaNacimiento().compareTo(animal2.getFechaNacimiento());
	}

}
