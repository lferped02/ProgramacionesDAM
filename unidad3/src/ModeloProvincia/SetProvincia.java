package ModeloProvincia;

import java.util.HashSet;
import java.util.Set;

public class SetProvincia {

	public static void main(String[] args) {
		Provincia cadiz = new Provincia("Cadiz", 1240000);
		Provincia sevilla = new Provincia("Sevilla", 1950000);
		Provincia huelva = new Provincia("Huelva", 5240000);

		Set<Provincia> provincia = new HashSet<Provincia>();
		System.out.println(provincia.add(cadiz));
		System.out.println(provincia.add(sevilla));
		System.out.println(provincia.add(huelva));

		for (Provincia provincia1 : provincia) {
			System.out.println(provincia1);
		}

	}

}
