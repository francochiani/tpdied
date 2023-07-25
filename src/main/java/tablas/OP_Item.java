package tablas;

public class OP_Item {
	
	private int id_item;
	private int id_orden;
	private int id_producto;
	private int cantidad;
	
	//Getters, Setters y Constructor
	
	public OP_Item(int id_item, int id_orden, int id_producto, int cantidad) {
		this.id_item = id_item;
		this.id_orden = id_orden;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
	}


	public int getId_item() {
		return id_item;
	}


	public void setId_item(int id_item) {
		this.id_item = id_item;
	}


	public int getId_orden() {
		return id_orden;
	}


	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}


	public int getId_producto() {
		return id_producto;
	}


	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
