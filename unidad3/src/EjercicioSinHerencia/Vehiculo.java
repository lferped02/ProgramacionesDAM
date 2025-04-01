package EjercicioSinHerencia;

public class Vehiculo {
	String dueno;
	String[] numPuertas;

	public Vehiculo(String dueno, String[] alquiler) {
		this.dueno = dueno;
		this.numPuertas = alquiler;
	}

	public Vehiculo(String dueno2, int numPuertas2) {
		// TODO Auto-generated constructor stub
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public String[] getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(String[] numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Vehiculo [dueno=" + dueno + ", numPuertas=" + numPuertas + "]";
	}

	public float totalGenerado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
