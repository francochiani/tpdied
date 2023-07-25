package clases;

import enums.Estado;

public class Centro extends Sucursal {
    
    //Constructor
    public Centro(int id_sucursal, String horario_apertura, String horario_cierre, Estado estado_sucursal) {
        super(id_sucursal, "Centro", horario_apertura, horario_cierre, estado_sucursal);
    }
;
}
