package tablas;

public class Sucursal {
	
	private int id_sucursal;
	private String nombre;
	private String horario_apertura;
	private String horario_cierre;
	private String estado_sucursal;
	
	//Getters, Setters y Constructor
	
	public Sucursal(int id_sucursal, String nombre, String horario_apertura, String horario_cierre,
			String estado_sucursal) {
		this.id_sucursal = id_sucursal;
		this.nombre = nombre;
		this.horario_apertura = horario_apertura;
		this.horario_cierre = horario_cierre;
		this.estado_sucursal = estado_sucursal;
	}
	
	public int getId_sucursal() {
		return id_sucursal;
	}
	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHorario_apertura() {
		return horario_apertura;
	}
	public void setHorario_apertura(String horario_apertura) {
		this.horario_apertura = horario_apertura;
	}
	public String getHorario_cierre() {
		return horario_cierre;
	}
	public void setHorario_cierre(String horario_cierre) {
		this.horario_cierre = horario_cierre;
	}
	public String getEstado_sucursal() {
		return estado_sucursal;
	}
	public void setEstado_sucursal(String estado_sucursal) {
		this.estado_sucursal = estado_sucursal;
	}
	
	
}

