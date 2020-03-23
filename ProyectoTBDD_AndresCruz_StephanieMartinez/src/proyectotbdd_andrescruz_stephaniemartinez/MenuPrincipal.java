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
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            DriverManager.getConnection("jdbc:mariadb://database-1.cp26b5jxlstx.us-east-1.rds.amazonaws.com:3307/DBCompany?user=admin&password=password1");
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //jd_ventanaAdmin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //ventana.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jtf_nombreUsuario = new javax.swing.JTextField();
        jtf_contrasenaUsuario = new javax.swing.JPasswordField();
        jb_salirLogin = new javax.swing.JButton();
        jb_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jd_ventanaAdmin = new javax.swing.JDialog();
        jb_imagenCarroMenuPrincipal = new javax.swing.JLabel();
        jb_distribuidoresMenuPrincipal = new javax.swing.JButton();
        jb_productosMenuPrincipal = new javax.swing.JButton();
        jb_preciosMenuPrincipal = new javax.swing.JButton();
        jb_inventarioMenuPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jb_ingresarMenuPrincipal = new javax.swing.JButton();

        jd_login.setTitle("Acceso al Sistema");
        jd_login.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_nombreUsuario.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jtf_nombreUsuario.setText("Nombre del usuario");
        jtf_nombreUsuario.setToolTipText("");
        jd_login.getContentPane().add(jtf_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 240, 40));
        jd_login.getContentPane().add(jtf_contrasenaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 240, 40));

        jb_salirLogin.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb_salirLogin.setText("SALIR");
        jb_salirLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirLoginMouseClicked(evt);
            }
        });
        jd_login.getContentPane().add(jb_salirLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 100, 40));

        jb_login.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb_login.setText("LOGIN");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });
        jd_login.getContentPane().add(jb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login 2.png"))); // NOI18N
        jd_login.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, 470));

        javax.swing.GroupLayout jd_ventanaAdminLayout = new javax.swing.GroupLayout(jd_ventanaAdmin.getContentPane());
        jd_ventanaAdmin.getContentPane().setLayout(jd_ventanaAdminLayout);
        jd_ventanaAdminLayout.setHorizontalGroup(
            jd_ventanaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        jd_ventanaAdminLayout.setVerticalGroup(
            jd_ventanaAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Cliente");

        jb_imagenCarroMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carro final 5.png"))); // NOI18N

        jb_distribuidoresMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Distribuidores otro.png"))); // NOI18N

        jb_productosMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos otro.png"))); // NOI18N

        jb_preciosMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Precios final.png"))); // NOI18N

        jb_inventarioMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario otro.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("SLOGAN O ESLOGAN");

        jToolBar1.setRollover(true);

        jb_ingresarMenuPrincipal.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jb_ingresarMenuPrincipal.setText("Ingresar");
        jb_ingresarMenuPrincipal.setFocusable(false);
        jb_ingresarMenuPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_ingresarMenuPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_ingresarMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ingresarMenuPrincipalActionPerformed(evt);
            }
        });
        jToolBar1.add(jb_ingresarMenuPrincipal);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(211, 211, 211))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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


    private void jb_ingresarMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ingresarMenuPrincipalActionPerformed
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
        //Agregar algo para que se cierre el menu principal y se puede cerrar todo el programa
    }//GEN-LAST:event_jb_ingresarMenuPrincipalActionPerformed

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
                jd_login.setVisible(false);
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
        jd_login.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jb_salirLoginMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jb_distribuidoresMenuPrincipal;
    private javax.swing.JLabel jb_imagenCarroMenuPrincipal;
    private javax.swing.JButton jb_ingresarMenuPrincipal;
    private javax.swing.JButton jb_inventarioMenuPrincipal;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_preciosMenuPrincipal;
    private javax.swing.JButton jb_productosMenuPrincipal;
    private javax.swing.JButton jb_salirLogin;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_ventanaAdmin;
    private javax.swing.JPasswordField jtf_contrasenaUsuario;
    private javax.swing.JTextField jtf_nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
