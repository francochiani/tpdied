package tablas;

public class Ruta {

	private int id_ruta;
	private int sucursal_origen;
	private int sucursal_destino;
	private int tiempo_de_transito;
	private float capacidad_maxima;
	private String estado_ruta;
	private String color;
	
	//Getters, Setters y Constructor
	
	public Ruta(int id_ruta, int sucursal_origen, int sucursal_destino, int tiempo_de_transito, float capacidad_maxima,
			String estado_ruta, String color) {
		this.id_ruta = id_ruta;
		this.sucursal_origen = sucursal_origen;
		this.sucursal_destino = sucursal_destino;
		this.tiempo_de_transito = tiempo_de_transito;
		this.capacidad_maxima = capacidad_maxima;
		this.estado_ruta = estado_ruta;
		this.color = color;
	}


	public int getId_ruta() {
		return id_ruta;
	}


	public void setId_ruta(int id_ruta) {
		this.id_ruta = id_ruta;
	}


	public int getSucursal_origen() {
		return sucursal_origen;
	}


	public void setSucursal_origen(int sucursal_origen) {
		this.sucursal_origen = sucursal_origen;
	}


	public int getSucursal_destino() {
		return sucursal_destino;
	}


	public void setSucursal_destino(int sucursal_destino) {
		this.sucursal_destino = sucursal_destino;
	}


	public int getTiempo_de_transito() {
		return tiempo_de_transito;
	}


	public void setTiempo_de_transito(int tiempo_de_transito) {
		this.tiempo_de_transito = tiempo_de_transito;
	}


	public float getCapacidad_maxima() {
		return capacidad_maxima;
	}


	public void setCapacidad_maxima(float capacidad_maxima) {
		this.capacidad_maxima = capacidad_maxima;
	}


	public String getEstado_ruta() {
		return estado_ruta;
	}


	public void setEstado_ruta(String estado_ruta) {
		this.estado_ruta = estado_ruta;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
}

