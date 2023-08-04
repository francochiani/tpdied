package interfaz;

import com.formdev.flatlaf.FlatDarkLaf;
import interfaz.sucursal.*;
import conexionPGSQL.*;
import java.sql.Connection;
//import com.formdev.flatlaf.FlatLightLaf;

public class Main extends javax.swing.JFrame {
        final private Connection connect;
    public Main() {
        Conexion objetoConexion = new Conexion();
        this.connect = objetoConexion.establecerConexion();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        opBuscarSucursal = new javax.swing.JMenuItem();
        opAniadirSucursal = new javax.swing.JMenuItem();
        opEditarSucursal = new javax.swing.JMenuItem();
        opEliminarSucursal = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        MenuPrincipal.setText("Sucursales");

        opBuscarSucursal.setText("Buscar");
        opBuscarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBuscarSucursalActionPerformed(evt);
            }
        });
        MenuPrincipal.add(opBuscarSucursal);

        opAniadirSucursal.setText("Añadir");
        opAniadirSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAniadirSucursalActionPerformed(evt);
            }
        });
        MenuPrincipal.add(opAniadirSucursal);

        opEditarSucursal.setText("Editar");
        opEditarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEditarSucursalActionPerformed(evt);
            }
        });
        MenuPrincipal.add(opEditarSucursal);

        opEliminarSucursal.setText("Eliminar");
        opEliminarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEliminarSucursalActionPerformed(evt);
            }
        });
        MenuPrincipal.add(opEliminarSucursal);
        MenuPrincipal.add(jSeparator2);

        jMenuItem9.setText("Flujo máximo");
        MenuPrincipal.add(jMenuItem9);

        jMenuItem10.setText("Page rank");
        MenuPrincipal.add(jMenuItem10);

        jMenuBar1.add(MenuPrincipal);

        jMenu2.setText("Caminos");

        jMenuItem1.setText("Buscar");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Añadir");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Editar");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Eliminar");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Productos");

        jMenuItem5.setText("Buscar");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Agregar");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Editar");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Eliminar");
        jMenu3.add(jMenuItem8);
        jMenu3.add(jSeparator1);

        jMenu4.setText("Sucursales");
        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Órdenes de provisión");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opBuscarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBuscarSucursalActionPerformed
        BuscarSucursal ventana = new BuscarSucursal(connect);
        escritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_opBuscarSucursalActionPerformed

    private void opAniadirSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAniadirSucursalActionPerformed
        NuevaSucursal ventana = new NuevaSucursal(connect);
        escritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_opAniadirSucursalActionPerformed

    private void opEditarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEditarSucursalActionPerformed
        EditarSucursal ventana = new EditarSucursal(connect);
        escritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_opEditarSucursalActionPerformed

    private void opEliminarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEliminarSucursalActionPerformed
        EliminarSucursal ventana = new EliminarSucursal(connect);
        escritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_opEliminarSucursalActionPerformed

    public static void main(String args[]) {
        
        /*Look and feel FlatLaf, mas moderno. Se puede elegir entre claro y oscuro*/
        //FlatLightLaf.setup();
        FlatDarkLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem opAniadirSucursal;
    private javax.swing.JMenuItem opBuscarSucursal;
    private javax.swing.JMenuItem opEditarSucursal;
    private javax.swing.JMenuItem opEliminarSucursal;
    // End of variables declaration//GEN-END:variables
}
