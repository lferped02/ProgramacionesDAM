package ModeloProducto;

public class Producto {
	int id;
	String nombre;
	String descripcion;
	int precio_venta;

	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param precio_venta
	 * @param iva
	 */
	public Producto(int id, String nombre, String descripcion, int precio_venta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio_venta = precio_venta;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}

	int precioNeto() {

		return this.precio_venta;
	}

}
