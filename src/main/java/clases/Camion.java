package clases;

public class Camion {

    private int id_camion;
    private float capacidad;
    private int sucursal_pertenece; // revisar si no tiene que ser un string o un objeto sucursal

    // Getter, Setter, Constructor
    public float getCapacidad() {
        return capacidad;
    }

    public Camion(int id_camion, float capacidad, int sucursal_pertenece) {
        this.id_camion = id_camion;
        this.capacidad = capacidad;
        this.sucursal_pertenece = sucursal_pertenece;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public int getId_camion() {
        return id_camion;
    }

    public void setId_camion(int id_camion) {
        this.id_camion = id_camion;
    }

    public int getSucursal_pertenece() {
        return sucursal_pertenece;
    }

    public void setSucursal_pertenece(int sucursal_pertenece) {
        this.sucursal_pertenece = sucursal_pertenece;
    }

}
