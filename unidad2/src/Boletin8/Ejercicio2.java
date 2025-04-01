package Boletin8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numeroArboles = sc.nextInt();
		char [] tipos = new char [numeroArboles];
		double []diametros=new double [numeroArboles];
		double []alturas = new double [numeroArboles];
		int []edades =new int [numeroArboles];
		Ejercicio2 datos =new Ejercicio2();
		int numeroArbolesTipoB =datos.cargaDatos1 (tipos, diametros, alturas, edades);
		System.out.println(Arrays.toString(diametros));
		double mediaAltura=datos.calculaMediaAltura (alturas);
		System.out.println("Media alturas:"+mediaAltura);
	}
	private double calculaMediaAltura(double[] alturas) {
		// TODO Auto-generated method stub
		return 0;
	}
	double cladculaAlturaMaxima (double[]alturas) {
		double maximo = 0;
		for (int i =0; i< alturas.length;i++) {
			if (maximo < alturas[i]) {
				maximo = alturas[i];
		}
		return maximo;
	}
	boolean existeMas30Metros (double[ alturas]) {
		boolean existeb =false;
		int i = 0;
		while (i< alturas.length &&!existen) {
			if(altura [i] >30) {
			}
			existen = true;
		}
		i = i+1;
	}
	return existen;
}
		
		int cargaDatos1 (char[] tipos, double[] diametros, double[] alturas, int []Edades) {
				int numeroTipoB=0;
				Scanner sc= new Scanner (System.in);
				for (int i=0; i< tipos.length;i++) {
				System.out.println ("Tipo de árbol: A? B?");
				tipos [i] sc.next().toUpperCase();
				System.out.println ("Diametro");
				diametros [i] sc.next().toUpperCase();
				System.out.println ("Altura");
				alturas [i] sc.next().toUpperCase();
				if (tipos [i]equals ("B")) {
					System.out.println ("Edad");
					edades [i] sc.nextInt();
					numero
				}
				}
		}

	

	private int cargaDatos(char[] tipos, double[] diametros, double[] alturas, int[] edades) {
		// TODO Auto-generated method stub
		return 0;

	}

}
