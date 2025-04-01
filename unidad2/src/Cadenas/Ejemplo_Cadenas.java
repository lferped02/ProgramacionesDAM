package Cadenas;

public class Ejemplo_Cadenas {
	public static void main(String[] args) {
		Character caracter = 'a';
		String cadena = "hola";
		String cadena2 = "HOLA";
		System.out.println(cadena.equals(cadena2));
		System.out.println(cadena.equalsIgnoreCase(cadena2));
		// c = cadena.charAt(2);
		String cadena1 = "ADIOS";
		cadena = cadena.concat(cadena1);
		String[] palabras = cadena.split(" ");
		for (String palabra : palabras)
			System.out.println(palabra);
		System.out.println(cadena);
		int posicion = cadena.indexOf("O");
		String cadena3 = cadena.substring(posicion);
	}

}
