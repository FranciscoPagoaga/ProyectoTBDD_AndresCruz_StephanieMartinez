package proyectotbdd_andrescruz_stephaniemartinez;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MenuPrincipal extends javax.swing.JFrame {

    Connection conexion;
    Statement stm;
    int condicionCrearModificar = 0;
    BaseDeDatos db = new BaseDeDatos();

    public MenuPrincipal() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jd_ventanaMenuTabla = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jb_clienteMenuTablas = new javax.swing.JButton();
        jb_companiaMenuTablas = new javax.swing.JButton();
        jb_concesionarioMenuTablas = new javax.swing.JButton();
        jb_plantaMenuTablas = new javax.swing.JButton();
        jb_proveedorMenuTablas = new javax.swing.JButton();
        jb_vehiculoMenuTablas = new javax.swing.JButton();
        jb_ventaMenuTablas = new javax.swing.JButton();
        jb_salirMenuTablas = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jd_ventanaCliente = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_rtnCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_nombreCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtf_telefonoCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_direccionCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcb_companiaCliente = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jtf_identidadCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jcb_sexoCliente = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jtf_ingresoCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtf_tipoCompaniaCliente = new javax.swing.JTextField();
        jb_guardarTablaCliente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jd_ventanaCompania = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtf_idCompania = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtf_marcaCompania = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtf_nombreCompania = new javax.swing.JTextField();
        jb_guardarCompania = new javax.swing.JButton();
        jb_salirCompania = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jd_ventanaConcesionario = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtf_rtnConcesionario = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jtf_nombreConcesionario = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jtf_ubicacionConcesionario = new javax.swing.JTextField();
        jb_guardarConcesionario = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jd_ventanaPlanta = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jtf_idPlanta = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtf_nombrePlanta = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jtf_tipoPlanta = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jcb_idCompaniaPlanta = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jd_ventanaProveedor = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jtf_idProveedor = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jtf_nombreProveedor = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jtf_piezaProveedor = new javax.swing.JTextField();
        jb_guardarProveedor = new javax.swing.JButton();
        jb_salirProveedor = new javax.swing.JButton();
        jd_ventanaVehiculo = new javax.swing.JDialog();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jtf_vinVehiculo = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jtf_modeloVehiculo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jtf_carroceriaVehiculo = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jtf_motorVehiculo = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jtf_colorVehiculo = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jdc_fechaVehiculo = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jtf_precioVehiculo = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jcb_idCompaniaVehiculo = new javax.swing.JComboBox<>();
        jb_guardarVehiculo = new javax.swing.JButton();
        jb_salirVehiculo = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jtf_transmicionVehiculo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jd_ventanaVenta = new javax.swing.JDialog();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jb_guardarVenta = new javax.swing.JButton();
        jb_salirVenta = new javax.swing.JButton();
        jtf_fechaVenta = new javax.swing.JTextField();
        jtf_precioVenta = new javax.swing.JTextField();
        jcb_rtnConcesionarioVenta = new javax.swing.JComboBox<>();
        jcb_rtnClienteVenta = new javax.swing.JComboBox<>();
        jcb_vinVenta = new javax.swing.JComboBox<>();
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

        jd_ventanaMenuMantenimiento.setTitle("Menú de Mantenimiento de Tablas");

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
        jb_modificarMenuMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarMenuMantenimientoMouseClicked(evt);
            }
        });

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

        jd_ventanaMenuTabla.setTitle("Menú Tablas");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Menú Tablas");

        jb_clienteMenuTablas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_clienteMenuTablas.setText("Tabla Cliente");
        jb_clienteMenuTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_clienteMenuTablasMouseClicked(evt);
            }
        });

        jb_companiaMenuTablas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_companiaMenuTablas.setText("Tabla Compania");
        jb_companiaMenuTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_companiaMenuTablasMouseClicked(evt);
            }
        });

        jb_concesionarioMenuTablas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_concesionarioMenuTablas.setText("Tabla Concesionario");
        jb_concesionarioMenuTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_concesionarioMenuTablasMouseClicked(evt);
            }
        });

        jb_plantaMenuTablas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_plantaMenuTablas.setText("Tabla Planta");
        jb_plantaMenuTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_plantaMenuTablasMouseClicked(evt);
            }
        });

        jb_proveedorMenuTablas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_proveedorMenuTablas.setText("Tabla Proveedor");
        jb_proveedorMenuTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_proveedorMenuTablasMouseClicked(evt);
            }
        });

        jb_vehiculoMenuTablas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_vehiculoMenuTablas.setText("Tabla Vehiculo");
        jb_vehiculoMenuTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_vehiculoMenuTablasMouseClicked(evt);
            }
        });

        jb_ventaMenuTablas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_ventaMenuTablas.setText("Tabla Venta");
        jb_ventaMenuTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ventaMenuTablasMouseClicked(evt);
            }
        });

        jb_salirMenuTablas.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirMenuTablas.setText("Salir");
        jb_salirMenuTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMenuTablasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaMenuTablaLayout = new javax.swing.GroupLayout(jd_ventanaMenuTabla.getContentPane());
        jd_ventanaMenuTabla.getContentPane().setLayout(jd_ventanaMenuTablaLayout);
        jd_ventanaMenuTablaLayout.setHorizontalGroup(
            jd_ventanaMenuTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaMenuTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ventanaMenuTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_salirMenuTablas)
                    .addComponent(jLabel4)
                    .addGroup(jd_ventanaMenuTablaLayout.createSequentialGroup()
                        .addComponent(jb_proveedorMenuTablas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_vehiculoMenuTablas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_ventaMenuTablas))
                    .addGroup(jd_ventanaMenuTablaLayout.createSequentialGroup()
                        .addComponent(jb_clienteMenuTablas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_companiaMenuTablas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_concesionarioMenuTablas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_plantaMenuTablas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_ventanaMenuTablaLayout.setVerticalGroup(
            jd_ventanaMenuTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaMenuTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(jd_ventanaMenuTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_clienteMenuTablas)
                    .addComponent(jb_companiaMenuTablas)
                    .addComponent(jb_concesionarioMenuTablas)
                    .addComponent(jb_plantaMenuTablas))
                .addGap(51, 51, 51)
                .addGroup(jd_ventanaMenuTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_proveedorMenuTablas)
                    .addComponent(jb_vehiculoMenuTablas)
                    .addComponent(jb_ventaMenuTablas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jb_salirMenuTablas)
                .addContainerGap())
        );

        jButton9.setText("jButton9");

        jd_ventanaCliente.setTitle("Tabla Cliente");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Tabla Cliente");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("RTN del Cliente");

        jtf_rtnCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Nombre del Cliente");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Teléfono");

        jtf_telefonoCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Dirección");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setText("¿Es companía?");

        jcb_companiaCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcb_companiaCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel12.setText("Identidad");

        jtf_identidadCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setText("Sexo");

        jcb_sexoCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcb_sexoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel14.setText("Ingreso Anual");

        jtf_ingresoCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel15.setText("Tipo Compania");

        jb_guardarTablaCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarTablaCliente.setText("Guardar");
        jb_guardarTablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarTablaClienteMouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaClienteLayout = new javax.swing.GroupLayout(jd_ventanaCliente.getContentPane());
        jd_ventanaCliente.getContentPane().setLayout(jd_ventanaClienteLayout);
        jd_ventanaClienteLayout.setHorizontalGroup(
            jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jtf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jtf_rtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_companiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                        .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaClienteLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
                            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(16, 16, 16)))
                        .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_direccionCliente))
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                        .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_tipoCompaniaCliente))
                            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_ingresoCliente))
                            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_sexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_identidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_guardarTablaCliente)
                .addGap(81, 81, 81)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );
        jd_ventanaClienteLayout.setVerticalGroup(
            jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_rtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_direccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcb_companiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtf_identidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jcb_sexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jtf_ingresoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtf_tipoCompaniaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jd_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarTablaCliente)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jLabel5.setText("jLabel5");

        jd_ventanaCompania.setTitle("Tabla Compañía");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel16.setText("Tabla Compañía");

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel17.setText("ID de la Compañía");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel18.setText("Marca");

        jtf_marcaCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel19.setText("Nombre");

        jtf_nombreCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jb_guardarCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarCompania.setText("Guardar");
        jb_guardarCompania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarCompaniaMouseClicked(evt);
            }
        });

        jb_salirCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirCompania.setText("Salir");
        jb_salirCompania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirCompaniaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaCompaniaLayout = new javax.swing.GroupLayout(jd_ventanaCompania.getContentPane());
        jd_ventanaCompania.getContentPane().setLayout(jd_ventanaCompaniaLayout);
        jd_ventanaCompaniaLayout.setHorizontalGroup(
            jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaCompaniaLayout.createSequentialGroup()
                .addGroup(jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaCompaniaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ventanaCompaniaLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_idCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaCompaniaLayout.createSequentialGroup()
                                .addGroup(jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_ventanaCompaniaLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtf_nombreCompania))
                                    .addGroup(jd_ventanaCompaniaLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jb_guardarCompania)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_salirCompania))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaCompaniaLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(28, 28, 28)
                                .addComponent(jtf_marcaCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))))
                    .addGroup(jd_ventanaCompaniaLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel16)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jd_ventanaCompaniaLayout.setVerticalGroup(
            jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaCompaniaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtf_idCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtf_marcaCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtf_nombreCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jd_ventanaCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salirCompania)
                    .addComponent(jb_guardarCompania))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton3.setText("jButton3");

        jd_ventanaConcesionario.setTitle("Tabla Concesionario");

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel20.setText("Tabla Concesionario");

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel21.setText("RTN del Concesionario");

        jtf_rtnConcesionario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel22.setText("Nombre del Concesionario");

        jtf_nombreConcesionario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel23.setText("Ubicación del Concesionario");

        jb_guardarConcesionario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarConcesionario.setText("Guardar");
        jb_guardarConcesionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarConcesionarioMouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaConcesionarioLayout = new javax.swing.GroupLayout(jd_ventanaConcesionario.getContentPane());
        jd_ventanaConcesionario.getContentPane().setLayout(jd_ventanaConcesionarioLayout);
        jd_ventanaConcesionarioLayout.setHorizontalGroup(
            jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaConcesionarioLayout.createSequentialGroup()
                .addGroup(jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaConcesionarioLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jb_guardarConcesionario)
                        .addGap(66, 66, 66)
                        .addComponent(jButton4))
                    .addGroup(jd_ventanaConcesionarioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_rtnConcesionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jtf_nombreConcesionario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_ubicacionConcesionario))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaConcesionarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(118, 118, 118))
        );
        jd_ventanaConcesionarioLayout.setVerticalGroup(
            jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaConcesionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(32, 32, 32)
                .addGroup(jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jtf_rtnConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jtf_nombreConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jtf_ubicacionConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jd_ventanaConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarConcesionario)
                    .addComponent(jButton4))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jd_ventanaPlanta.setTitle("Tabla Planta");

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel24.setText("Tabla Planta");

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel25.setText("ID de la planta");

        jtf_idPlanta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel26.setText("Nombre de la planta");

        jtf_nombrePlanta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel27.setText("Tipo de Planta");

        jtf_tipoPlanta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel28.setText("ID de la Compañía ");

        jButton5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton5.setText("Guardar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton6.setText("Salir");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaPlantaLayout = new javax.swing.GroupLayout(jd_ventanaPlanta.getContentPane());
        jd_ventanaPlanta.getContentPane().setLayout(jd_ventanaPlantaLayout);
        jd_ventanaPlantaLayout.setHorizontalGroup(
            jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaPlantaLayout.createSequentialGroup()
                .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_ventanaPlantaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_ventanaPlantaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtf_idPlanta)
                                .addComponent(jtf_nombrePlanta)
                                .addComponent(jtf_tipoPlanta)
                                .addComponent(jcb_idCompaniaPlanta, 0, 148, Short.MAX_VALUE)))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jd_ventanaPlantaLayout.setVerticalGroup(
            jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaPlantaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaPlantaLayout.createSequentialGroup()
                        .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jtf_idPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jtf_nombrePlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jtf_tipoPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jcb_idCompaniaPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaPlantaLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jd_ventanaPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(25, 25, 25))))
        );

        jd_ventanaProveedor.setTitle("Tabla Proveedor");

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel29.setText("Tabla Proveedor");

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel30.setText("ID del Proveedor");

        jtf_idProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel31.setText("Nombre del Proveedor");

        jtf_nombreProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel32.setText("Pieza ");

        jtf_piezaProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jb_guardarProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarProveedor.setText("Guardar");
        jb_guardarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarProveedorMouseClicked(evt);
            }
        });

        jb_salirProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirProveedor.setText("Salir");
        jb_salirProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirProveedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaProveedorLayout = new javax.swing.GroupLayout(jd_ventanaProveedor.getContentPane());
        jd_ventanaProveedor.getContentPane().setLayout(jd_ventanaProveedorLayout);
        jd_ventanaProveedorLayout.setHorizontalGroup(
            jd_ventanaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaProveedorLayout.createSequentialGroup()
                .addGroup(jd_ventanaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaProveedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32))
                    .addGroup(jd_ventanaProveedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_ventanaProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_nombreProveedor))
                            .addGroup(jd_ventanaProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_idProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_ventanaProveedorLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jtf_piezaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ventanaProveedorLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jb_guardarProveedor)
                        .addGap(56, 56, 56)
                        .addComponent(jb_salirProveedor)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaProveedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(102, 102, 102))
        );
        jd_ventanaProveedorLayout.setVerticalGroup(
            jd_ventanaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jtf_idProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jtf_nombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jtf_piezaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jd_ventanaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_guardarProveedor)
                    .addComponent(jb_salirProveedor))
                .addGap(28, 28, 28))
        );

        jLabel33.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel33.setText("Tabla Vehículo");

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel35.setText("VIN");

        jtf_vinVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel36.setText("Modelo del vehículo");

        jtf_modeloVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel37.setText("Tipo de carrocería");

        jtf_carroceriaVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel38.setText("Tipo de motor");

        jtf_motorVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel39.setText("Color");

        jLabel40.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel40.setText("Fecha de ensamblaje");

        jdc_fechaVehiculo.setDateFormatString("yyyy-MM-dd");

        jLabel41.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel41.setText("Precio");

        jtf_precioVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel42.setText("ID de la compañía");

        jcb_idCompaniaVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcb_idCompaniaVehiculo.setMaximumRowCount(30);

        jb_guardarVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarVehiculo.setText("Guardar");
        jb_guardarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarVehiculoMouseClicked(evt);
            }
        });

        jb_salirVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirVehiculo.setText("Salir");
        jb_salirVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirVehiculoMouseClicked(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel43.setText("Transmición");

        jtf_transmicionVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_ventanaVehiculoLayout = new javax.swing.GroupLayout(jd_ventanaVehiculo.getContentPane());
        jd_ventanaVehiculo.getContentPane().setLayout(jd_ventanaVehiculoLayout);
        jd_ventanaVehiculoLayout.setHorizontalGroup(
            jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaVehiculoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaVehiculoLayout.createSequentialGroup()
                        .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(27, 27, 27)
                        .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_vinVehiculo)
                            .addComponent(jtf_modeloVehiculo)
                            .addComponent(jtf_carroceriaVehiculo)
                            .addComponent(jtf_motorVehiculo)
                            .addComponent(jtf_colorVehiculo)
                            .addComponent(jdc_fechaVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jtf_precioVehiculo)
                            .addComponent(jcb_idCompaniaVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_transmicionVehiculo)))
                    .addGroup(jd_ventanaVehiculoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel33)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaVehiculoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_guardarVehiculo)
                .addGap(36, 36, 36)
                .addComponent(jb_salirVehiculo)
                .addGap(89, 89, 89))
        );
        jd_ventanaVehiculoLayout.setVerticalGroup(
            jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jtf_vinVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jtf_modeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jtf_carroceriaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jtf_motorVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jtf_transmicionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_colorVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addComponent(jdc_fechaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jtf_precioVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jcb_idCompaniaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_ventanaVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarVehiculo)
                    .addComponent(jb_salirVehiculo))
                .addContainerGap())
        );

        jLabel34.setText("jLabel34");

        jLabel44.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel44.setText("Tabla Venta");

        jLabel45.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel45.setText("RTN del Concesionario");

        jLabel46.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel46.setText("RTN del Cliente");

        jLabel47.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel47.setText("VIN ");

        jLabel48.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel48.setText("Precio de Venta");

        jLabel49.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel49.setText("Fecha de Venta");

        jb_guardarVenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarVenta.setText("Guardar");
        jb_guardarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarVentaMouseClicked(evt);
            }
        });

        jb_salirVenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirVenta.setText("Salir");
        jb_salirVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirVentaMouseClicked(evt);
            }
        });

        jtf_fechaVenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jtf_precioVenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jcb_rtnConcesionarioVenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jcb_rtnClienteVenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jcb_vinVenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_ventanaVentaLayout = new javax.swing.GroupLayout(jd_ventanaVenta.getContentPane());
        jd_ventanaVenta.getContentPane().setLayout(jd_ventanaVentaLayout);
        jd_ventanaVentaLayout.setHorizontalGroup(
            jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_rtnClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_rtnConcesionarioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_vinVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_precioVenta))
                            .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_fechaVenta))))
                    .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jb_guardarVenta)
                        .addGap(41, 41, 41)
                        .addComponent(jb_salirVenta))
                    .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel44)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jd_ventanaVentaLayout.setVerticalGroup(
            jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jcb_rtnConcesionarioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jcb_rtnClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jcb_vinVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jtf_precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jtf_fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarVenta)
                    .addComponent(jb_salirVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jd_ventanaMenuTabla.pack();
        jd_ventanaMenuTabla.setModal(true);
        jd_ventanaMenuTabla.setLocationRelativeTo(this);
        jd_ventanaMenuTabla.setVisible(true);
        jd_ventanaMenuMantenimiento.setVisible(false);
    }//GEN-LAST:event_jb_crearMenuMantenimientoMouseClicked

    private void jb_modificarMenuMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarMenuMantenimientoMouseClicked
        jd_ventanaMenuTabla.pack();
        jd_ventanaMenuTabla.setModal(true);
        jd_ventanaMenuTabla.setLocationRelativeTo(this);
        jd_ventanaMenuTabla.setVisible(true);
        jd_ventanaMenuMantenimiento.setVisible(false);
    }//GEN-LAST:event_jb_modificarMenuMantenimientoMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jd_ventanaCliente.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jb_guardarTablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarTablaClienteMouseClicked
        int esCompaniaCondicion = -1;
        int condicion = -1;
        int telefono = Integer.parseInt(jtf_telefonoCliente.getText());
        if (jcb_companiaCliente.getSelectedIndex() == 0) {//If que valida que al ser una compañía no ingrese datos de persona
            int tipoCompania = Integer.parseInt(jtf_tipoCompaniaCliente.getText());
            esCompaniaCondicion = 1;
            try {
                condicion = db.procedimientoInsertarCliente(jtf_rtnCliente.getText(), jtf_nombreCliente.getText(), telefono, jtf_direccionCliente.getText(),
                        esCompaniaCondicion, "NULL", "X", 0, tipoCompania);
            } catch (SQLException ex) {
                Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (jcb_companiaCliente.getSelectedIndex() == 1) {
            esCompaniaCondicion = 0;
            String sexo;
            if (jcb_sexoCliente.getSelectedIndex() == 0) {
                sexo = "F";
            } else {
                sexo = "M";
            }
            try {
                condicion = db.procedimientoInsertarCliente(jtf_rtnCliente.getText(), jtf_nombreCliente.getText(), telefono, jtf_direccionCliente.getText(),
                        esCompaniaCondicion, jtf_identidadCliente.getText(), sexo, Integer.parseInt(jtf_ingresoCliente.getText()), 0);
            } catch (SQLException ex) {
                Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Hay valores nulos");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El RTN ya existe");
        } else if (condicion == 0) {
            JOptionPane.showMessageDialog(this, "El cliente se ha agregado exitosamente");
        }
        limpiarEspaciosTablaCliente();
    }//GEN-LAST:event_jb_guardarTablaClienteMouseClicked

    private void jb_salirMenuTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMenuTablasMouseClicked
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_salirMenuTablasMouseClicked

    private void jb_clienteMenuTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_clienteMenuTablasMouseClicked
        jd_ventanaCliente.pack();
        jd_ventanaCliente.setModal(true);
        jd_ventanaCliente.setLocationRelativeTo(this);
        jd_ventanaCliente.setVisible(true);
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_clienteMenuTablasMouseClicked

    private void jb_companiaMenuTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_companiaMenuTablasMouseClicked
        jd_ventanaCompania.pack();
        jd_ventanaCompania.setModal(true);
        jd_ventanaCompania.setLocationRelativeTo(this);
        jd_ventanaCompania.setVisible(true);
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_companiaMenuTablasMouseClicked

    private void jb_salirCompaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirCompaniaMouseClicked
        jd_ventanaCompania.setVisible(false);
    }//GEN-LAST:event_jb_salirCompaniaMouseClicked

    private void jb_guardarCompaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarCompaniaMouseClicked
        int condicion = -1;
        condicion = db.procedimientoInsertarCompania(jtf_idCompania.getText(), jtf_marcaCompania.getText(), jtf_nombreCompania.getText());
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Hay valores nulos");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El ID de la compañía ya existe");
        } else if (condicion == 0) {
            JOptionPane.showMessageDialog(this, "El cliente se ha agregado exitosamente");
        }
        jtf_idCompania.setText("");
        jtf_marcaCompania.setText("");
        jtf_nombreCompania.setText("");
    }//GEN-LAST:event_jb_guardarCompaniaMouseClicked

    private void jb_concesionarioMenuTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_concesionarioMenuTablasMouseClicked
        jd_ventanaConcesionario.pack();
        jd_ventanaConcesionario.setModal(true);
        jd_ventanaConcesionario.setLocationRelativeTo(this);
        jd_ventanaConcesionario.setVisible(true);
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_concesionarioMenuTablasMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jd_ventanaConcesionario.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jb_guardarConcesionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarConcesionarioMouseClicked
        int condicion = -1;
        condicion = db.procedimientoInsertarConcesionario(jtf_rtnConcesionario.getText(), jtf_nombreConcesionario.getText(), jtf_ubicacionConcesionario.getText());
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Hay valores nulos");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El RTN del concesionario ya existe");
        } else if (condicion == 0) {
            JOptionPane.showMessageDialog(this, "El concesionario se ha agregado exitosamente");
        }
        jtf_rtnConcesionario.setText("");
        jtf_nombreConcesionario.setText("");
        jtf_ubicacionConcesionario.setText("");
    }//GEN-LAST:event_jb_guardarConcesionarioMouseClicked

    private void jb_plantaMenuTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_plantaMenuTablasMouseClicked
        try {
            db.cargarCB(jcb_idCompaniaPlanta);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaPlanta.pack();
        jd_ventanaPlanta.setModal(true);
        jd_ventanaPlanta.setLocationRelativeTo(this);
        jd_ventanaPlanta.setVisible(true);
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_plantaMenuTablasMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        jd_ventanaPlanta.setVisible(false);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        int condicion = -1;
        String idCompania = ((String) jcb_idCompaniaPlanta.getSelectedItem());
        condicion = db.procedimientoInsertarPlanta(jtf_idPlanta.getText(), jtf_nombrePlanta.getText(), jtf_tipoPlanta.getText(), idCompania);
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Hay valores nulos");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El ID de la planta ya existe");
        } else if (condicion == 0) {
            JOptionPane.showMessageDialog(this, "La planta se ha agregado exitosamente");
        } else if (condicion == 3) {
            JOptionPane.showMessageDialog(this, "El ID de la Compañía no existe");
        }
        jtf_idPlanta.setText("");
        jtf_nombrePlanta.setText("");
        jtf_tipoPlanta.setText("");
    }//GEN-LAST:event_jButton5MouseClicked

    private void jb_proveedorMenuTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_proveedorMenuTablasMouseClicked
        jd_ventanaProveedor.pack();
        jd_ventanaProveedor.setModal(true);
        jd_ventanaProveedor.setLocationRelativeTo(this);
        jd_ventanaProveedor.setVisible(true);
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_proveedorMenuTablasMouseClicked

    private void jb_salirProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirProveedorMouseClicked
        jd_ventanaProveedor.setVisible(false);
    }//GEN-LAST:event_jb_salirProveedorMouseClicked

    private void jb_guardarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarProveedorMouseClicked
        int condicion = -1;
        condicion = db.procedimientoInsertarProveedor(jtf_idProveedor.getText(), jtf_nombreProveedor.getText(), jtf_piezaProveedor.getText());
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Hay valores nulos");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El ID del proveedor ya existe");
        } else if (condicion == 0) {
            JOptionPane.showMessageDialog(this, "El proveedor se ha agregado exitosamente");
        }
        jtf_idProveedor.setText("");
        jtf_nombreProveedor.setText("");
        jtf_piezaProveedor.setText("");
    }//GEN-LAST:event_jb_guardarProveedorMouseClicked

    private void jb_vehiculoMenuTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_vehiculoMenuTablasMouseClicked
        try {
            db.cargarCB(jcb_idCompaniaVehiculo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaVehiculo.pack();
        jd_ventanaVehiculo.setModal(true);
        jd_ventanaVehiculo.setLocationRelativeTo(this);
        jd_ventanaVehiculo.setVisible(true);
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_vehiculoMenuTablasMouseClicked

    private void jb_salirVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirVehiculoMouseClicked
        jd_ventanaVehiculo.setVisible(false);
    }//GEN-LAST:event_jb_salirVehiculoMouseClicked

    private void jb_guardarVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarVehiculoMouseClicked
        int condicion = -1;
        float precio = Float.parseFloat(jtf_precioVehiculo.getText());
        String idCompania = ((String) jcb_idCompaniaVehiculo.getSelectedItem());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //String fechaComoCadena = sdf.format();
        //System.out.println(fechaComoCadena);
        Date fecha = (Date) jdc_fechaVehiculo.getDate();
        condicion = db.procedimientoInsertarVehiculo(jtf_vinVehiculo.getText(), jtf_modeloVehiculo.getText(), jtf_carroceriaVehiculo.getText(), jtf_motorVehiculo.getText(), jtf_colorVehiculo.getText(),
                jtf_transmicionVehiculo.getText(), fecha, precio, idCompania);
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Hay valores nulos");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El VIN del vehículo ya existe");
        } else if (condicion == 0) {
            JOptionPane.showMessageDialog(this, "El vehículo se ha agregado exitosamente");
        } else if (condicion == 3) {
            JOptionPane.showMessageDialog(this, "El ID de la Compañía no existe");
        }
    }//GEN-LAST:event_jb_guardarVehiculoMouseClicked

    private void jb_ventaMenuTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ventaMenuTablasMouseClicked
        try {
            db.cargarCBConcesionario(jcb_rtnConcesionarioVenta);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            db.cargarCBCliente(jcb_rtnClienteVenta);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            db.cargarCBVin(jcb_vinVenta);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaVenta.pack();
        jd_ventanaVenta.setModal(true);
        jd_ventanaVenta.setLocationRelativeTo(this);
        jd_ventanaVenta.setVisible(true);
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_ventaMenuTablasMouseClicked

    private void jb_salirVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirVentaMouseClicked
        jd_ventanaVenta.setVisible(false);
    }//GEN-LAST:event_jb_salirVentaMouseClicked

    private void jb_guardarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarVentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarVentaMouseClicked

    public void limpiarEspaciosTablaCliente() {
        jtf_rtnCliente.setText("");
        jtf_nombreCliente.setText("");
        jtf_telefonoCliente.setText("");
        jtf_direccionCliente.setText("");
        jtf_tipoCompaniaCliente.setText("");
        jtf_identidadCliente.setText("");
        jcb_sexoCliente.setSelectedIndex(0);
        jtf_ingresoCliente.setText("");
        jtf_tipoCompaniaCliente.setText("");
    }

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_bitacoraMenuOpciones;
    private javax.swing.JButton jb_clienteMenuTablas;
    private javax.swing.JButton jb_companiaMenuTablas;
    private javax.swing.JButton jb_concesionarioMenuTablas;
    private javax.swing.JButton jb_crearMenuMantenimiento;
    private javax.swing.JButton jb_distribuidoresMenuPrincipal;
    private javax.swing.JButton jb_eliminarMenuMantemiento;
    private javax.swing.JButton jb_guardarCompania;
    private javax.swing.JButton jb_guardarConcesionario;
    private javax.swing.JButton jb_guardarProveedor;
    private javax.swing.JButton jb_guardarTablaCliente;
    private javax.swing.JButton jb_guardarVehiculo;
    private javax.swing.JButton jb_guardarVenta;
    private javax.swing.JLabel jb_imagenCarroMenuPrincipal;
    private javax.swing.JButton jb_ingresarMenuPrincipal;
    private javax.swing.JButton jb_inventarioMenuPrincipal;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_mantenimientoMenuOpciones;
    private javax.swing.JButton jb_modificarMenuMantenimiento;
    private javax.swing.JButton jb_plantaMenuTablas;
    private javax.swing.JButton jb_preciosMenuPrincipal;
    private javax.swing.JButton jb_productosMenuPrincipal;
    private javax.swing.JButton jb_proveedorMenuTablas;
    private javax.swing.JButton jb_reportesMenuOpciones;
    private javax.swing.JButton jb_salirCompania;
    private javax.swing.JButton jb_salirLogin;
    private javax.swing.JButton jb_salirMenuMantenimiento;
    private javax.swing.JButton jb_salirMenuOpciones;
    private javax.swing.JButton jb_salirMenuTablas;
    private javax.swing.JButton jb_salirProveedor;
    private javax.swing.JButton jb_salirVehiculo;
    private javax.swing.JButton jb_salirVenta;
    private javax.swing.JButton jb_vehiculoMenuTablas;
    private javax.swing.JButton jb_ventaMenuTablas;
    private javax.swing.JComboBox<String> jcb_companiaCliente;
    private javax.swing.JComboBox<String> jcb_idCompaniaPlanta;
    private javax.swing.JComboBox<String> jcb_idCompaniaVehiculo;
    private javax.swing.JComboBox<String> jcb_rtnClienteVenta;
    private javax.swing.JComboBox<String> jcb_rtnConcesionarioVenta;
    private javax.swing.JComboBox<String> jcb_sexoCliente;
    private javax.swing.JComboBox<String> jcb_vinVenta;
    private javax.swing.JDialog jd_ventanaAdmin;
    private javax.swing.JDialog jd_ventanaCliente;
    private javax.swing.JDialog jd_ventanaCompania;
    private javax.swing.JDialog jd_ventanaConcesionario;
    private javax.swing.JDialog jd_ventanaLogin;
    private javax.swing.JDialog jd_ventanaMenuMantenimiento;
    private javax.swing.JDialog jd_ventanaMenuTabla;
    private javax.swing.JDialog jd_ventanaPlanta;
    private javax.swing.JDialog jd_ventanaProveedor;
    private javax.swing.JDialog jd_ventanaVehiculo;
    private javax.swing.JDialog jd_ventanaVenta;
    private com.toedter.calendar.JDateChooser jdc_fechaVehiculo;
    private javax.swing.JTextField jtf_carroceriaVehiculo;
    private javax.swing.JTextField jtf_colorVehiculo;
    private javax.swing.JPasswordField jtf_contrasenaUsuario;
    private javax.swing.JTextField jtf_direccionCliente;
    private javax.swing.JTextField jtf_fechaVenta;
    private javax.swing.JTextField jtf_idCompania;
    private javax.swing.JTextField jtf_idPlanta;
    private javax.swing.JTextField jtf_idProveedor;
    private javax.swing.JTextField jtf_identidadCliente;
    private javax.swing.JTextField jtf_ingresoCliente;
    private javax.swing.JTextField jtf_marcaCompania;
    private javax.swing.JTextField jtf_modeloVehiculo;
    private javax.swing.JTextField jtf_motorVehiculo;
    private javax.swing.JTextField jtf_nombreCliente;
    private javax.swing.JTextField jtf_nombreCompania;
    private javax.swing.JTextField jtf_nombreConcesionario;
    private javax.swing.JTextField jtf_nombrePlanta;
    private javax.swing.JTextField jtf_nombreProveedor;
    private javax.swing.JTextField jtf_nombreUsuario;
    private javax.swing.JTextField jtf_piezaProveedor;
    private javax.swing.JTextField jtf_precioVehiculo;
    private javax.swing.JTextField jtf_precioVenta;
    private javax.swing.JTextField jtf_rtnCliente;
    private javax.swing.JTextField jtf_rtnConcesionario;
    private javax.swing.JTextField jtf_telefonoCliente;
    private javax.swing.JTextField jtf_tipoCompaniaCliente;
    private javax.swing.JTextField jtf_tipoPlanta;
    private javax.swing.JTextField jtf_transmicionVehiculo;
    private javax.swing.JTextField jtf_ubicacionConcesionario;
    private javax.swing.JTextField jtf_vinVehiculo;
    // End of variables declaration//GEN-END:variables
}
