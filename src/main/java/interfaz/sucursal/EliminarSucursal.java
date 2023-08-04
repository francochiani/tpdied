package interfaz.sucursal;

import java.sql.*;
import interfaz.mensajes.Mensajes;
import javax.swing.*;
import javax.swing.table.*;

public class EliminarSucursal extends javax.swing.JInternalFrame {

    final private Connection enlace;

    public EliminarSucursal(Connection e) {
        initComponents();
        this.enlace = e;
        this.actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSucursales = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Eliminar Sucursal");

        tablaSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaSucursales);

        btnEliminar.setText("Eliminar sucursal");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int fila = tablaSucursales.getSelectedRow();
        Object[] options = {"Aceptar",
            "Cancelar"};

        int n = JOptionPane.showOptionDialog(null,
                "¿Está seguro de eliminar la sucursal "+ tablaSucursales.getValueAt(fila, 1).toString() + " ?",
                "Mensaje de confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, //do not use a custom Icon
                options, //the titles of buttons
                options[1]); //default button title

        if (n == 0) {
            this.eliminarSucursal(Integer.parseInt(tablaSucursales.getValueAt(fila, 0).toString()));
            
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void actualizarTabla() {
        Mensajes informacion = new Mensajes();
        String sql = "SELECT * FROM sucursal";

        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<>(modelo);
        modelo.addColumn("Id sucursal");
        modelo.addColumn("Nombre");
        modelo.addColumn("Horario de apertura");
        modelo.addColumn("Horario de cierre");
        modelo.addColumn("Estado");
        String[] datos = new String[5];

        try {
            Statement st = enlace.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            tablaSucursales.setModel(modelo);
            tablaSucursales.setRowSorter(elQueOrdena);
        } catch (Exception e) {
            informacion.mensajeError("No se pudo realizar la búsqueda." + System.getProperty("line.separator") + e.getMessage());
        }
    }

    public void eliminarSucursal(int campoId) {
        Mensajes informacion = new Mensajes();
        String sql = "DELETE FROM sucursal WHERE id_sucursal=?";
        
        try {
            CallableStatement cs = this.enlace.prepareCall(sql);
            cs.setInt(1, campoId);
            cs.execute();

            this.actualizarTabla();

        } catch (Exception e) {
            informacion.mensajeError("No se pudo eliminar la sucursal." + System.getProperty("line.separator") + e.getMessage());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSucursales;
    // End of variables declaration//GEN-END:variables
}
