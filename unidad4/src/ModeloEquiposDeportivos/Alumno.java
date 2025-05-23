package ModeloEquiposDeportivos;

public class Alumno {
	private String nombre;
	private String dni;

	public Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Alumno: " + nombre + ", DNI: " + dni;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Alumno alumno = (Alumno) obj;
		return dni.equals(alumno.dni);
	}

	@Override
	public int hashCode() {
		return dni.hashCode();
	}

	public static boolean add(Alumno alumno) {
		// TODO Auto-generated method stub
		return false;
	}
	// public int CompareTo() {
	// int nombre = this.nombre.compareTo(Alumno.);
	// return nombre;

//	}

}
