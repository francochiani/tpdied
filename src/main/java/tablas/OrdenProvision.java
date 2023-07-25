package tablas;

import java.sql.Date;

public class OrdenProvision {
	
	private int id_orden;
	private Date fecha_orden;
	private int sucursal_destino;
	private int tiempo_max_horas;
	private int id_sucursal;
	
	//Getters, Setters y Constructor
	
	public OrdenProvision(int id_orden, Date fecha_orden, int sucursal_destino, int tiempo_max_horas,
			int id_sucursal) {
		this.id_orden = id_orden;
		this.fecha_orden = fecha_orden;
		this.sucursal_destino = sucursal_destino;
		this.tiempo_max_horas = tiempo_max_horas;
		this.id_sucursal = id_sucursal;
	}

	public int getId_orden() {
		return id_orden;
	}

	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}

	public Date getFecha_orden() {
		return fecha_orden;
	}

	public void setFecha_orden(Date fecha_orden) {
		this.fecha_orden = fecha_orden;
	}

	public int getSucursal_destino() {
		return sucursal_destino;
	}

	public void setSucursal_destino(int sucursal_destino) {
		this.sucursal_destino = sucursal_destino;
	}

	public int getTiempo_max_horas() {
		return tiempo_max_horas;
	}

	public void setTiempo_max_horas(int tiempo_max_horas) {
		this.tiempo_max_horas = tiempo_max_horas;
	}

	public int getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}
	
	
}
