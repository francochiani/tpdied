package clases;

import enums.Estado;

public class Puerto extends Sucursal {

    //Constructor
    public Puerto(int id_sucursal, String horario_apertura, String horario_cierre, Estado estado_sucursal) {
        super(id_sucursal, "Puerto", horario_apertura, horario_cierre, estado_sucursal);
    }
;
}
