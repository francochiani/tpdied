package tablas;


public class Producto {
	
	private int id_producto;
	private String nombre;
	private String descripcion;
	private double precio_unitario;
	private double peso_kg;
	
	//Getters, Setters y Constructor
	public Producto(int id_producto, String nombre, String descripcion, double precio_unitario, double peso_kg) {
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio_unitario = precio_unitario;
		this.peso_kg = peso_kg;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
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
	public double getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	public double getPeso_kg() {
		return peso_kg;
	}
	public void setPeso_kg(double peso_kg) {
		this.peso_kg = peso_kg;
	}
	
	
}
