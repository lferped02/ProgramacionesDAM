package ControladorContacto;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ModeloContacto.AgendaMapa;
import ModeloContacto.Contacto;

public class GestionaAgendaConMapa {

	public static void main(String[] args) {
		Contacto contacto = new Contacto("Pepe", "López", "+34 645 213 879");
		Contacto contacto2 = new Contacto("Manuel", "Garcia", "+34 652 325 145");
		Contacto contacto3 = new Contacto("Maria", "Arez", "+34 693 258 147");
		AgendaMapa a = new AgendaMapa();
		/* Map<String, Contacto> agenda= a.getAgenda(); */
		a.getAgenda().put("123456789", contacto);
		a.getAgenda().put("987654321", contacto2);
		a.getAgenda().put("012345678", contacto3);
		a.getAgenda().put("012345678", contacto);

		System.out.println(a.getAgenda().size());
		System.out.println(a.getAgenda().toString());
		System.out.println(a.getAgenda().get("987654321"));
		System.out.println(a.getAgenda().keySet());
		System.out.println(a.getAgenda().values());

		Set<Map.Entry<String, Contacto>> entradas = a.entrySet();
		Entry<String, Contacto> elemento;
		Iterator it = entradas.iterator();

		while (it.hasNext()) {
			elemento = (Entry<String, Contacto>) it.next();
			elemento.getKey();
			elemento.getValue();
		}

		/*
		 * System.out.println(a.getAgenda().get("987654321"));
		 * System.out.println(a.getAgenda().keySet());
		 */
	}

}
