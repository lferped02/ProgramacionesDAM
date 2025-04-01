package Cadenas;

public class Metodo_string {

	public static void main(String[] args) {
		String cadena1 = "HOLA";
		String cadena2 = cadena1 + "Y ADIOS";

		String cadena4 = "Hola";
		String cadena5 = cadena1 + " y adiós";
		String cadena6 = cadena1.concat(", buenos días");
		System.out.printf("cadena1: %s %n", cadena4);
		System.out.println("cadena1:" + cadena4);
		System.out.printf("cadena2: %s %n", cadena5);
		System.out.printf("cadena3: %s %n", cadena6);

		String cadena = "Hello planet earth, a great planet.";
		System.out.println(cadena.indexOf("planet"));
		System.out.println(cadena.lastIndexOf("planet"));
		System.out.println(cadena.indexOf("e", 5));
		System.out.println(cadena.lastIndexOf("e", 5));

		String cadena7 = "Hello planet earth, a great planet.";
		String cadena8 = cadena7.replace("et", "ET");
		String cadena9 = cadena7.replaceAll("et", "ET");
		System.out.println(cadena7);
		System.out.println(cadena8);
		System.out.println(cadena9);

	}

}
