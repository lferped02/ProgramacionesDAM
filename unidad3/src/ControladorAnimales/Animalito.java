package ControladorAnimales;

import ModeloAnimal.SerVivo;

public class Animalito extends SerVivo{
	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean seDesplaza() {
		// TODO Auto-generated method stub
		return false;
	}

	public void comer() {
		System.out.println("Come");

	}

	public void respirar() {
		System.out.println("Respira");

	}


}
