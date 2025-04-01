package ControladorEquipoDeportivos;
import ModeloEquiposDeportivos.Alumno;
import ModeloEquiposDeportivos.DeportivosException;
import ModeloEquiposDeportivos.Equipo;

public class GestionaBibliotecaLibros {
	public static void main(String[] args) {
		try {
			Alumno alumno = new Alumno("Elena", "12345678A");
			Alumno alumno2 = new Alumno("Pedro", "23456789B");
			Alumno alumno3 = new Alumno("Sergio", "34567890C");
			Alumno alumno4 = new Alumno("Ana", "98765432D");

			Equipo equipo = new Equipo("Equipo A");
			Equipo equipo2 = new Equipo("Equipo B");

			equipo.añadirAlumno(alumno);
			equipo.añadirAlumno(alumno2);
			equipo2.añadirAlumno(alumno3);
			equipo2.añadirAlumno(alumno2);

			System.out.println("Alumnos de " + equipo.nombre + ":");
			equipo.mostrarAlumnos();

			System.out.println("Alumnos de " + equipo2.nombre + ":");
			equipo2.mostrarAlumnos();

		} catch (DeportivosException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
