package Condicional;

public class EjemploControlAnidadas {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;

		for (i = 1; i <= 3; i++)
			;
		System.out.println("El bucle externo,i=" + i);

		while (j <= i) {
			System.out.println("El bucle interno, j=" + j);
			j++;
		}

	}

}
