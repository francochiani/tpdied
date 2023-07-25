package tablas;

public class SucursalProducto {

	private int id_sucursal;
	private int id_producto;
	private int stock;

	
	//Getters, Setters y Constructor
	public SucursalProducto(int id_sucursal, int id_producto, int stock) {
		this.id_sucursal = id_sucursal;
		this.id_producto = id_producto;
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	
}