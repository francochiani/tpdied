package interfaz.mensajes;

import javax.swing.JOptionPane;

public class Mensajes {

    public void mensajeInformativo(String mensaje){
    JOptionPane.showMessageDialog(null, mensaje, "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mensajeError(String mensaje){
    JOptionPane.showMessageDialog(null, mensaje, "Mensaje de error", JOptionPane.ERROR_MESSAGE);
    }
}
