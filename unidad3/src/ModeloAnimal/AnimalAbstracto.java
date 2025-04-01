package ModeloAnimal;

public abstract class AnimalAbstracto {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String getSonidoQueEmite();

	public abstract String getAlimento();

}
