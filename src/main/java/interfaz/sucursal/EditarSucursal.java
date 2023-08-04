package interfaz.sucursal;

import java.sql.*;
import interfaz.mensajes.Mensajes;
import javax.swing.*;
import javax.swing.table.*;

public class EditarSucursal extends javax.swing.JInternalFrame {

    final private Connection enlace;

    public EditarSucursal(Connection e) {
        initComponents();
        this.enlace = e;
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSucursales = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoApertura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoCierre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Editar Sucursal");

        tablaSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Horario de apertura", "Horario de cierre", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSucursales.getTableHeader().setReorderingAllowed(false);
        tablaSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSucursalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSucursales);
        if (tablaSucursales.getColumnModel().getColumnCount() > 0) {
            tablaSucursales.getColumnModel().getColumn(0).setResizable(false);
            tablaSucursales.getColumnModel().getColumn(1).setResizable(false);
            tablaSucursales.getColumnModel().getColumn(2).setResizable(false);
            tablaSucursales.getColumnModel().getColumn(3).setResizable(false);
            tablaSucursales.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sucursal"));

        jLabel1.setText("Id:");

        campoId.setEnabled(false);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Horario de apertura:");

        jLabel4.setText("Horario de cierre:");

        jLabel5.setText("Estado: ");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operativa", "No operativa" }));
        comboEstado.setToolTipText("");

        btnModificar.setText("Modificar datos");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoId)
                            .addComponent(campoNombre)
                            .addComponent(campoApertura)
                            .addComponent(campoCierre)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSucursalesMouseClicked
        this.seleccionarSucursal(tablaSucursales, campoId, campoNombre, campoApertura, campoCierre, comboEstado);
    }//GEN-LAST:event_tablaSucursalesMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        this.modificarSucursal(campoId, campoNombre, campoApertura, campoCierre, comboEstado);
    }//GEN-LAST:event_btnModificarMouseClicked

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

    public void seleccionarSucursal(JTable tablaSucursales, JTextField campoId, JTextField campoNombre,
            JTextField campoApertura, JTextField campoCierre, JComboBox<String> comboEstado) {
        Mensajes informacion = new Mensajes();
        try {
            int fila = tablaSucursales.getSelectedRow();
            if (fila >= 0) {
                campoId.setText(tablaSucursales.getValueAt(fila, 0).toString());
                campoNombre.setText(tablaSucursales.getValueAt(fila, 1).toString());
                campoApertura.setText(tablaSucursales.getValueAt(fila, 2).toString());
                campoCierre.setText(tablaSucursales.getValueAt(fila, 3).toString());
                comboEstado.setSelectedItem(tablaSucursales.getValueAt(fila, 4));
            }
        } catch (Exception e) {
            informacion.mensajeError("No se pudo realizar la búsqueda." + System.getProperty("line.separator") + e.getMessage());
        }
    }

    public void modificarSucursal(JTextField campoId, JTextField campoNombre,
            JTextField campoApertura, JTextField campoCierre, JComboBox<String> comboEstado) {
        Mensajes informacion = new Mensajes();
        String sql = "UPDATE sucursal SET nombre= ?, horario_apertura= ?, horario_cierre= ?, estado_sucursal=? WHERE id_sucursal = ?";

        try {
            CallableStatement cs = this.enlace.prepareCall(sql);
            cs.setString(1, campoNombre.getText());
            cs.setString(2, campoApertura.getText());
            cs.setString(3, campoCierre.getText());
            cs.setString(4, comboEstado.getSelectedItem().toString());
            cs.setInt(5, Integer.parseInt(campoId.getText()));
            cs.execute();

            this.actualizarTabla();

        } catch (Exception e) {
            informacion.mensajeError("No se pudo realizar la actualizacion." + System.getProperty("line.separator") + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField campoApertura;
    private javax.swing.JTextField campoCierre;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSucursales;
    // End of variables declaration//GEN-END:variables
}
