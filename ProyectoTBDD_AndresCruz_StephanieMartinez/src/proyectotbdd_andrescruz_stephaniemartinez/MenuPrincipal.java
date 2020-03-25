package proyectotbdd_andrescruz_stephaniemartinez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MenuPrincipal extends javax.swing.JFrame {

    Connection conexion;
    Statement stm;

    public MenuPrincipal() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        BaseDeDatos bd = new BaseDeDatos();
        //jd_ventanaAdmin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //ventana.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_ventanaLogin = new javax.swing.JDialog();
        jtf_nombreUsuario = new javax.swing.JTextField();
        jtf_contrasenaUsuario = new javax.swing.JPasswordField();
        jb_salirLogin = new javax.swing.JButton();
        jb_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jd_ventanaAdmin = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jb_mantenimientoMenuOpciones = new javax.swing.JButton();
        jb_bitacoraMenuOpciones = new javax.swing.JButton();
        jb_reportesMenuOpciones = new javax.swing.JButton();
        jb_salirMenuOpciones = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jd_ventanaMenuMantenimiento = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jb_crearMenuMantenimiento = new javax.swing.JButton();
        jb_modificarMenuMantenimiento = new javax.swing.JButton();
        jb_eliminarMenuMantemiento = new javax.swing.JButton();
        jb_salirMenuMantenimiento = new javax.swing.JButton();
        jd_ventanaCrear = new javax.swing.JDialog();
        jb_imagenCarroMenuPrincipal = new javax.swing.JLabel();
        jb_distribuidoresMenuPrincipal = new javax.swing.JButton();
        jb_productosMenuPrincipal = new javax.swing.JButton();
        jb_preciosMenuPrincipal = new javax.swing.JButton();
        jb_inventarioMenuPrincipal = new javax.swing.JButton();
        jb_ingresarMenuPrincipal = new javax.swing.JButton();

        jd_ventanaLogin.setTitle("Acceso al Sistema");
        jd_ventanaLogin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_nombreUsuario.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jtf_nombreUsuario.setText("Nombre del usuario");
        jtf_nombreUsuario.setToolTipText("");
        jd_ventanaLogin.getContentPane().add(jtf_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 240, 40));
        jd_ventanaLogin.getContentPane().add(jtf_contrasenaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 240, 40));

        jb_salirLogin.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb_salirLogin.setText("SALIR");
        jb_salirLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirLoginMouseClicked(evt);
            }
        });
        jd_ventanaLogin.getContentPane().add(jb_salirLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 100, 40));

        jb_login.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb_login.setText("LOGIN");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });
        jd_ventanaLogin.getContentPane().add(jb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login 2.png"))); // NOI18N
        jd_ventanaLogin.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, 470));

        jd_ventanaAdmin.setTitle("Menú de opciones");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Menú de Opciones");

        jb_mantenimientoMenuOpciones.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_mantenimientoMenuOpciones.setText("Mantenimiento de tablas base");
        jb_mantenimientoMenuOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_mantenimientoMenuOpcionesMouseClicked(evt);
            }
        });

        jb_bitacoraMenuOpciones.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_bitacoraMenuOpciones.setText("Bitácora");

        jb_reportesMenuOpciones.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_reportesMenuOpciones.setText("Reportes");

        jb_salirMenuOpciones.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirMenuOpciones.setText("Salir");
        jb_salirMenuOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMenuOpcionesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaAdminLayout = new javax.swing.GroupLayout(jd_ventanaAdmin.getContentPane());
        jd_ventanaAdmin.getContentPane().setLayout(jd_ventanaAdminLayout);
        jd_ventanaAdminLayout.setHorizontalGroup(
            jd_ventanaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaAdminLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jd_ventanaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_salirMenuOpciones)
                    .addComponent(jb_mantenimientoMenuOpciones)
                    .addComponent(jb_bitacoraMenuOpciones)
                    .addComponent(jb_reportesMenuOpciones)
                    .addComponent(jLabel1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jd_ventanaAdminLayout.setVerticalGroup(
            jd_ventanaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jb_mantenimientoMenuOpciones)
                .addGap(36, 36, 36)
                .addComponent(jb_bitacoraMenuOpciones)
                .addGap(45, 45, 45)
                .addComponent(jb_reportesMenuOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jb_salirMenuOpciones)
                .addContainerGap())
        );

        jButton1.setText("jButton1");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Menú Mantenimiento");

        jb_crearMenuMantenimiento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jb_crearMenuMantenimiento.setText("Crear");
        jb_crearMenuMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearMenuMantenimientoMouseClicked(evt);
            }
        });

        jb_modificarMenuMantenimiento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jb_modificarMenuMantenimiento.setText("Modificar");

        jb_eliminarMenuMantemiento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jb_eliminarMenuMantemiento.setText("Eliminar");

        jb_salirMenuMantenimiento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jb_salirMenuMantenimiento.setText("Salir");
        jb_salirMenuMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMenuMantenimientoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaMenuMantenimientoLayout = new javax.swing.GroupLayout(jd_ventanaMenuMantenimiento.getContentPane());
        jd_ventanaMenuMantenimiento.getContentPane().setLayout(jd_ventanaMenuMantenimientoLayout);
        jd_ventanaMenuMantenimientoLayout.setHorizontalGroup(
            jd_ventanaMenuMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaMenuMantenimientoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jd_ventanaMenuMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_salirMenuMantenimiento)
                    .addComponent(jb_crearMenuMantenimiento)
                    .addComponent(jb_modificarMenuMantenimiento)
                    .addComponent(jb_eliminarMenuMantemiento)
                    .addComponent(jLabel3))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jd_ventanaMenuMantenimientoLayout.setVerticalGroup(
            jd_ventanaMenuMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaMenuMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jb_crearMenuMantenimiento)
                .addGap(49, 49, 49)
                .addComponent(jb_modificarMenuMantenimiento)
                .addGap(49, 49, 49)
                .addComponent(jb_eliminarMenuMantemiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jb_salirMenuMantenimiento)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jd_ventanaCrearLayout = new javax.swing.GroupLayout(jd_ventanaCrear.getContentPane());
        jd_ventanaCrear.getContentPane().setLayout(jd_ventanaCrearLayout);
        jd_ventanaCrearLayout.setHorizontalGroup(
            jd_ventanaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_ventanaCrearLayout.setVerticalGroup(
            jd_ventanaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Cliente");

        jb_imagenCarroMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carro final 5.png"))); // NOI18N

        jb_distribuidoresMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Distribuidores otro.png"))); // NOI18N

        jb_productosMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos otro.png"))); // NOI18N

        jb_preciosMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Precios final.png"))); // NOI18N

        jb_inventarioMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario otro.png"))); // NOI18N

        jb_ingresarMenuPrincipal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jb_ingresarMenuPrincipal.setText("Ingresar");
        jb_ingresarMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ingresarMenuPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_productosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_preciosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_inventarioMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jb_distribuidoresMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jb_imagenCarroMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jb_ingresarMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jb_ingresarMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_imagenCarroMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_distribuidoresMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_productosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_preciosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_inventarioMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarEspacio() {
        boolean condicion = false;
        String contrasenaValidar = new String(jtf_contrasenaUsuario.getPassword());
        if (jtf_nombreUsuario.getText().isEmpty() || jtf_nombreUsuario.getText().equalsIgnoreCase("Nombre del usuario") || contrasenaValidar.isEmpty()) {
            condicion = true;
        }
        return condicion;
    }

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
        boolean condicion = false;
        condicion = validarEspacio();
        if (condicion) {
            JOptionPane.showMessageDialog(this, "Los campos no pueden quedar vacíos");
        } else {
            String contrasena = new String(jtf_contrasenaUsuario.getPassword());
            if (jtf_nombreUsuario.getText().equalsIgnoreCase("admin") && contrasena.equalsIgnoreCase("123")) {
                jd_ventanaAdmin.pack();
                jd_ventanaAdmin.setModal(true);
                jd_ventanaAdmin.setLocationRelativeTo(this);
                jd_ventanaLogin.setVisible(false);
                //this.setVisible(false);
                jd_ventanaAdmin.setVisible(true);
            } else if (jtf_nombreUsuario.getText().equalsIgnoreCase("servicio de localizacion") && contrasena.equalsIgnoreCase("456")) {
                //Agregar venta para los reportes
            } else if (jtf_nombreUsuario.getText().equalsIgnoreCase("marketing") && contrasena.equalsIgnoreCase("789")) {
                //agregar ventana para marketing
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o constraseña incorrecto");
            }
        }
    }//GEN-LAST:event_jb_loginMouseClicked

    private void jb_salirLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirLoginMouseClicked
        jd_ventanaLogin.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jb_salirLoginMouseClicked

    private void jb_mantenimientoMenuOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_mantenimientoMenuOpcionesMouseClicked
        jd_ventanaMenuMantenimiento.pack();
        jd_ventanaMenuMantenimiento.setModal(true);
        jd_ventanaMenuMantenimiento.setLocationRelativeTo(this);
        jd_ventanaMenuMantenimiento.setVisible(true);
        jd_ventanaAdmin.setVisible(false);
    }//GEN-LAST:event_jb_mantenimientoMenuOpcionesMouseClicked

    private void jb_ingresarMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ingresarMenuPrincipalMouseClicked
        jd_ventanaLogin.pack();
        jd_ventanaLogin.setModal(true);
        jd_ventanaLogin.setLocationRelativeTo(this);
        jd_ventanaLogin.setVisible(true);
    }//GEN-LAST:event_jb_ingresarMenuPrincipalMouseClicked

    private void jb_salirMenuMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMenuMantenimientoMouseClicked
        jd_ventanaMenuMantenimiento.setVisible(false);
    }//GEN-LAST:event_jb_salirMenuMantenimientoMouseClicked

    private void jb_salirMenuOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMenuOpcionesMouseClicked
        jd_ventanaAdmin.setVisible(false);
    }//GEN-LAST:event_jb_salirMenuOpcionesMouseClicked

    private void jb_crearMenuMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearMenuMantenimientoMouseClicked
        jd_ventanaCrear.pack();
        jd_ventanaCrear.setModal(true);
        jd_ventanaCrear.setLocationRelativeTo(this);
        jd_ventanaCrear.setVisible(true);
        jd_ventanaMenuMantenimiento.setVisible(false);
    }//GEN-LAST:event_jb_crearMenuMantenimientoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuPrincipal().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb_bitacoraMenuOpciones;
    private javax.swing.JButton jb_crearMenuMantenimiento;
    private javax.swing.JButton jb_distribuidoresMenuPrincipal;
    private javax.swing.JButton jb_eliminarMenuMantemiento;
    private javax.swing.JLabel jb_imagenCarroMenuPrincipal;
    private javax.swing.JButton jb_ingresarMenuPrincipal;
    private javax.swing.JButton jb_inventarioMenuPrincipal;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_mantenimientoMenuOpciones;
    private javax.swing.JButton jb_modificarMenuMantenimiento;
    private javax.swing.JButton jb_preciosMenuPrincipal;
    private javax.swing.JButton jb_productosMenuPrincipal;
    private javax.swing.JButton jb_reportesMenuOpciones;
    private javax.swing.JButton jb_salirLogin;
    private javax.swing.JButton jb_salirMenuMantenimiento;
    private javax.swing.JButton jb_salirMenuOpciones;
    private javax.swing.JDialog jd_ventanaAdmin;
    private javax.swing.JDialog jd_ventanaCrear;
    private javax.swing.JDialog jd_ventanaLogin;
    private javax.swing.JDialog jd_ventanaMenuMantenimiento;
    private javax.swing.JPasswordField jtf_contrasenaUsuario;
    private javax.swing.JTextField jtf_nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
