package proyectotbdd_andrescruz_stephaniemartinez;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

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
        jtf_precioVenta = new javax.swing.JTextField();
        jcb_rtnConcesionarioVenta = new javax.swing.JComboBox<>();
        jcb_rtnClienteVenta = new javax.swing.JComboBox<>();
        jcb_vinVenta = new javax.swing.JComboBox<>();
        jdc_fechaVenta = new com.toedter.calendar.JDateChooser();
        jd_eliminarTablas = new javax.swing.JDialog();
        jLabel53 = new javax.swing.JLabel();
        jb_clienteMenuTablas1 = new javax.swing.JButton();
        jb_companiaMenuTablas1 = new javax.swing.JButton();
        jb_concesionarioMenuTablas1 = new javax.swing.JButton();
        jb_plantaMenuTablas1 = new javax.swing.JButton();
        jb_vehiculoMenuTablas1 = new javax.swing.JButton();
        jb_proveedorMenuTablas1 = new javax.swing.JButton();
        jb_salirMenuTablas1 = new javax.swing.JButton();
        jd_ventanaEliminarCliente = new javax.swing.JDialog();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jcb_rtnEliminarCliente = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jtf_rtnClienteEliminar = new javax.swing.JTextField();
        jb_aceptarEliminarCliente = new javax.swing.JButton();
        jb_salirEliminarCliente = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jd_ventanaEliminarCompania = new javax.swing.JDialog();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jcb_idEliminarCompania = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        jtf_idEliminarCompania = new javax.swing.JTextField();
        jb_aceptarEliminarCompania = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jd_ventanaEliminarConcesionario = new javax.swing.JDialog();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jcb_rtnEliminarConcesionario = new javax.swing.JComboBox<>();
        jtf_rtnEliminarConcesionario = new javax.swing.JTextField();
        jb_salirEliminarConcesionario = new javax.swing.JButton();
        jb_aceptarEliminarConcesionario = new javax.swing.JButton();
        jd_ventanaEliminarPlanta = new javax.swing.JDialog();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jcb_idEliminarPlanta = new javax.swing.JComboBox<>();
        jtf_idEliminarPlanta = new javax.swing.JTextField();
        jb_aceptarEliminarPlanta = new javax.swing.JButton();
        jb_salirEliminarPlanta = new javax.swing.JButton();
        jd_ventanaEliminarProveedor = new javax.swing.JDialog();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jcb_idEliminarProveedor = new javax.swing.JComboBox<>();
        jtf_idEliminarProveedor = new javax.swing.JTextField();
        jb_salirEliminarProveedor = new javax.swing.JButton();
        jb_aceptarEliminarProveedor = new javax.swing.JButton();
        jd_ventanaEliminarVehiculo = new javax.swing.JDialog();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jcb_vinEliminarVehiculo = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        jtf_vinEliminarVehiculo = new javax.swing.JTextField();
        jb_aceptarEliminarVehiculo = new javax.swing.JButton();
        jb_salirEliminarVehiculo = new javax.swing.JButton();
        jd_modificarTablas = new javax.swing.JDialog();
        jLabel71 = new javax.swing.JLabel();
        jb_clienteMenuTablas2 = new javax.swing.JButton();
        jb_companiaMenuTablas2 = new javax.swing.JButton();
        jb_concesionarioMenuTablas2 = new javax.swing.JButton();
        jb_plantaMenuTablas2 = new javax.swing.JButton();
        jb_ventaMenuTablas2 = new javax.swing.JButton();
        jb_vehiculoMenuTablas2 = new javax.swing.JButton();
        jb_proveedorMenuTablas2 = new javax.swing.JButton();
        jb_salirMenuTablas2 = new javax.swing.JButton();
        jd_ventanaModificarCliente = new javax.swing.JDialog();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jtf_nombreClienteModificar = new javax.swing.JTextField();
        jtf_telefonoClienteModificar = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jtf_direccionClienteModificar = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jcb_companiaClienteModificar = new javax.swing.JComboBox<>();
        jtf_identidadClienteModificar = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jcb_sexoClienteModificar = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        jtf_ingresoClienteModificar = new javax.swing.JTextField();
        jtf_tipoCompaniaClienteModificar = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jb_guardarClienteModificar = new javax.swing.JButton();
        jb_salirClienteModificar = new javax.swing.JButton();
        jcb_rtnModificarCliente = new javax.swing.JComboBox<>();
        jd_ventanaModificarCompania = new javax.swing.JDialog();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jtf_nombreModificarCompania = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jb_guardarCompaniaModificar = new javax.swing.JButton();
        jb_salirCompaniaModificar = new javax.swing.JButton();
        jcb_idModificarCompania = new javax.swing.JComboBox<>();
        jtf_marcaModificarCompania = new javax.swing.JTextField();
        jd_ventanaModificarConcesionario = new javax.swing.JDialog();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jtf_nombreConcesionarioModificar = new javax.swing.JTextField();
        jtf_ubicacionConcesionarioModificar = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jb_guardarConcesionarioModificar = new javax.swing.JButton();
        jb_salirConcesionarioModificar = new javax.swing.JButton();
        jcb_rtnConcesionarioModificar = new javax.swing.JComboBox<>();
        jd_ventanaModificarPlanta = new javax.swing.JDialog();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jtf_nombrePlantaModificar = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jtf_tipoPlantaModificar = new javax.swing.JTextField();
        jcb_idCompaniaPlantaModificar = new javax.swing.JComboBox<>();
        jLabel100 = new javax.swing.JLabel();
        jb_guardarPlantaModificar = new javax.swing.JButton();
        jb_salirModificarPlanta = new javax.swing.JButton();
        jcb_idPlantaModificar = new javax.swing.JComboBox<>();
        jd_ventanaModificarProveedor = new javax.swing.JDialog();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jtf_nombreProveedorModificar = new javax.swing.JTextField();
        jtf_piezaProveedorModificar = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jb_guardarProveedorModificar = new javax.swing.JButton();
        jb_salirProveedorModificar = new javax.swing.JButton();
        jcb_idProveedorModificar = new javax.swing.JComboBox<>();
        jd_ventanaModificarVehiculo = new javax.swing.JDialog();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jtf_modeloVehiculoModificar = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jtf_carroceriaVehiculoModificar = new javax.swing.JTextField();
        jtf_motorVehiculoModificar = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jtf_transmicionVehiculoModificar = new javax.swing.JTextField();
        jtf_colorVehiculoModificar = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jdc_fechaVehiculoModificar = new com.toedter.calendar.JDateChooser();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jtf_precioVehiculoModificar = new javax.swing.JTextField();
        jcb_idCompaniaVehiculoModificar = new javax.swing.JComboBox<>();
        jLabel114 = new javax.swing.JLabel();
        jb_guardarVehiculoModificar = new javax.swing.JButton();
        jb_salirVehiculoModificar = new javax.swing.JButton();
        jcb_vinVehiculoModificar = new javax.swing.JComboBox<>();
        jd_ventanaModificarVenta = new javax.swing.JDialog();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jcb_rtnConcesionarioVentaModificar = new javax.swing.JComboBox<>();
        jcb_rtnClienteVentaModificar = new javax.swing.JComboBox<>();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jcb_vinVentaModificar = new javax.swing.JComboBox<>();
        jLabel119 = new javax.swing.JLabel();
        jtf_precioVentaModificar = new javax.swing.JTextField();
        jdc_fechaVentaModificar = new com.toedter.calendar.JDateChooser();
        jLabel120 = new javax.swing.JLabel();
        jb_guardarVentaModificar = new javax.swing.JButton();
        jb_salirVentaModificar = new javax.swing.JButton();
        jd_bitacora = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tablaBitacora = new javax.swing.JTable();
        jb_salirBitacora = new javax.swing.JButton();
        jd_menuReportes = new javax.swing.JDialog();
        jLabel121 = new javax.swing.JLabel();
        jb_tendenciasReporte = new javax.swing.JButton();
        jb_transmicionReporte = new javax.swing.JButton();
        jb_marcasReporte = new javax.swing.JButton();
        jb_mejoresMarcasReporte = new javax.swing.JButton();
        jb_ventaReporte = new javax.swing.JButton();
        jb_distribuidoresReporte = new javax.swing.JButton();
        jb_salirReporte = new javax.swing.JButton();
        jd_tendenciasReporteMenu = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_tendenciasReporte = new javax.swing.JTable();
        jb_tendenciaAnioReporte = new javax.swing.JButton();
        jb_tendenciaMesReporte = new javax.swing.JButton();
        jb_tendenciaSemanaReporte = new javax.swing.JButton();
        jb_tendenciaGeneroReporte = new javax.swing.JButton();
        jb_salirTendenciaReporte = new javax.swing.JButton();
        jb_rangoTendenciaReporte = new javax.swing.JButton();
        jd_defectuosaReporte = new javax.swing.JDialog();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jcb_idProveedorReporte = new javax.swing.JComboBox<>();
        jdc_fechaInicioReporte = new com.toedter.calendar.JDateChooser();
        jdc_fechaFinalReporte = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        jt_defectuosoReporte = new javax.swing.JTable();
        jb_aceptarReporte = new javax.swing.JButton();
        jb_salirDefectuoso = new javax.swing.JButton();
        jd_mejoresMarcasReporte = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_mejoresMarcasReportes = new javax.swing.JTable();
        jb_salirMejoresMarcasReportes = new javax.swing.JButton();
        jd_mejoresMarcasUnidadReporte = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_mejoresMarcasUnidadReporte = new javax.swing.JTable();
        jb_salirMejoresMarcasUnidadReporte = new javax.swing.JButton();
        jd_ventaConvertibleReporte = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_ventaConvertibleReporte = new javax.swing.JTable();
        jb_salirVentaConvertible = new javax.swing.JButton();
        jd_distribuidoresReporte = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        jt_distribuidoresReporte = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jd_ventanaDistribuidoresUsuario = new javax.swing.JDialog();
        jLabel70 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_distribuidoresCliente = new javax.swing.JTable();
        jb_salirDistribuidoresCliente = new javax.swing.JButton();
        jd_ventanaProductosUsuario = new javax.swing.JDialog();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_vehiculosCliente = new javax.swing.JTable();
        jb_salirVehiculosCliente = new javax.swing.JButton();
        jd_precioCliente = new javax.swing.JDialog();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jt_precioCliente = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jb_imagenCarroMenuPrincipal = new javax.swing.JLabel();
        jb_distribuidoresMenuPrincipal = new javax.swing.JButton();
        jb_productosMenuPrincipal = new javax.swing.JButton();
        jb_preciosMenuPrincipal = new javax.swing.JButton();
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
        jb_bitacoraMenuOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_bitacoraMenuOpcionesMouseClicked(evt);
            }
        });

        jb_reportesMenuOpciones.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_reportesMenuOpciones.setText("Reportes");
        jb_reportesMenuOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_reportesMenuOpcionesMouseClicked(evt);
            }
        });

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
        jb_eliminarMenuMantemiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarMenuMantemientoMouseClicked(evt);
            }
        });

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
                                .addComponent(jdc_fechaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addComponent(jdc_fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jd_ventanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarVenta)
                    .addComponent(jb_salirVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jd_eliminarTablas.setTitle("Eliminar Tablas");

        jLabel53.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel53.setText("Menú Tablas");

        jb_clienteMenuTablas1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_clienteMenuTablas1.setText("Tabla Cliente");
        jb_clienteMenuTablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_clienteMenuTablas1MouseClicked(evt);
            }
        });

        jb_companiaMenuTablas1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_companiaMenuTablas1.setText("Tabla Compania");
        jb_companiaMenuTablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_companiaMenuTablas1MouseClicked(evt);
            }
        });

        jb_concesionarioMenuTablas1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_concesionarioMenuTablas1.setText("Tabla Concesionario");
        jb_concesionarioMenuTablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_concesionarioMenuTablas1MouseClicked(evt);
            }
        });

        jb_plantaMenuTablas1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_plantaMenuTablas1.setText("Tabla Planta");
        jb_plantaMenuTablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_plantaMenuTablas1MouseClicked(evt);
            }
        });

        jb_vehiculoMenuTablas1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_vehiculoMenuTablas1.setText("Tabla Vehiculo");
        jb_vehiculoMenuTablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_vehiculoMenuTablas1MouseClicked(evt);
            }
        });

        jb_proveedorMenuTablas1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_proveedorMenuTablas1.setText("Tabla Proveedor");
        jb_proveedorMenuTablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_proveedorMenuTablas1MouseClicked(evt);
            }
        });

        jb_salirMenuTablas1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirMenuTablas1.setText("Salir");
        jb_salirMenuTablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMenuTablas1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarTablasLayout = new javax.swing.GroupLayout(jd_eliminarTablas.getContentPane());
        jd_eliminarTablas.getContentPane().setLayout(jd_eliminarTablasLayout);
        jd_eliminarTablasLayout.setHorizontalGroup(
            jd_eliminarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_eliminarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_salirMenuTablas1)
                    .addComponent(jLabel53)
                    .addGroup(jd_eliminarTablasLayout.createSequentialGroup()
                        .addComponent(jb_proveedorMenuTablas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_vehiculoMenuTablas1))
                    .addGroup(jd_eliminarTablasLayout.createSequentialGroup()
                        .addComponent(jb_clienteMenuTablas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_companiaMenuTablas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_concesionarioMenuTablas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_plantaMenuTablas1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_eliminarTablasLayout.setVerticalGroup(
            jd_eliminarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addGap(50, 50, 50)
                .addGroup(jd_eliminarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_clienteMenuTablas1)
                    .addComponent(jb_companiaMenuTablas1)
                    .addComponent(jb_concesionarioMenuTablas1)
                    .addComponent(jb_plantaMenuTablas1))
                .addGap(51, 51, 51)
                .addGroup(jd_eliminarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_proveedorMenuTablas1)
                    .addComponent(jb_vehiculoMenuTablas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jb_salirMenuTablas1)
                .addContainerGap())
        );

        jd_ventanaEliminarCliente.setTitle("Eliminar Cliente");

        jLabel50.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel50.setText("Eliminar Cliente");

        jLabel51.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel51.setText("RTN del Cliente");

        jcb_rtnEliminarCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel52.setText("Escriba el RTN del cliente que desea eliminar");

        jtf_rtnClienteEliminar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jb_aceptarEliminarCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_aceptarEliminarCliente.setText("Aceptar");
        jb_aceptarEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_aceptarEliminarClienteMouseClicked(evt);
            }
        });

        jb_salirEliminarCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirEliminarCliente.setText("Salir");
        jb_salirEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirEliminarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaEliminarClienteLayout = new javax.swing.GroupLayout(jd_ventanaEliminarCliente.getContentPane());
        jd_ventanaEliminarCliente.getContentPane().setLayout(jd_ventanaEliminarClienteLayout);
        jd_ventanaEliminarClienteLayout.setHorizontalGroup(
            jd_ventanaEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarClienteLayout.createSequentialGroup()
                .addGroup(jd_ventanaEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaEliminarClienteLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel50))
                    .addGroup(jd_ventanaEliminarClienteLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel51)
                        .addGap(28, 28, 28)
                        .addComponent(jcb_rtnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ventanaEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_ventanaEliminarClienteLayout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addGroup(jd_ventanaEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jd_ventanaEliminarClienteLayout.createSequentialGroup()
                                    .addComponent(jb_aceptarEliminarCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_salirEliminarCliente))
                                .addComponent(jtf_rtnClienteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_ventanaEliminarClienteLayout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jLabel52))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jd_ventanaEliminarClienteLayout.setVerticalGroup(
            jd_ventanaEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(25, 25, 25)
                .addGroup(jd_ventanaEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jcb_rtnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jLabel52)
                .addGap(18, 18, 18)
                .addComponent(jtf_rtnClienteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jd_ventanaEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_aceptarEliminarCliente)
                    .addComponent(jb_salirEliminarCliente))
                .addGap(30, 30, 30))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jd_ventanaEliminarCompania.setTitle("Eliminar Compañía");

        jLabel54.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel54.setText("Eliminar Compañía");

        jLabel56.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel56.setText("ID de la Compañía");

        jcb_idEliminarCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel57.setText("Ingrese el ID de la Compañía que desea eliminar");

        jtf_idEliminarCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jb_aceptarEliminarCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_aceptarEliminarCompania.setText("Aceptar");
        jb_aceptarEliminarCompania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_aceptarEliminarCompaniaMouseClicked(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton8.setText("Salir");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaEliminarCompaniaLayout = new javax.swing.GroupLayout(jd_ventanaEliminarCompania.getContentPane());
        jd_ventanaEliminarCompania.getContentPane().setLayout(jd_ventanaEliminarCompaniaLayout);
        jd_ventanaEliminarCompaniaLayout.setHorizontalGroup(
            jd_ventanaEliminarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarCompaniaLayout.createSequentialGroup()
                .addGroup(jd_ventanaEliminarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaEliminarCompaniaLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel54))
                    .addGroup(jd_ventanaEliminarCompaniaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jd_ventanaEliminarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addGroup(jd_ventanaEliminarCompaniaLayout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(31, 31, 31)
                                .addComponent(jcb_idEliminarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_ventanaEliminarCompaniaLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jtf_idEliminarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jd_ventanaEliminarCompaniaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jb_aceptarEliminarCompania)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(77, 77, 77))
        );
        jd_ventanaEliminarCompaniaLayout.setVerticalGroup(
            jd_ventanaEliminarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarCompaniaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addGap(32, 32, 32)
                .addGroup(jd_ventanaEliminarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jcb_idEliminarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jtf_idEliminarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jd_ventanaEliminarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_aceptarEliminarCompania)
                    .addComponent(jButton8))
                .addGap(33, 33, 33))
        );

        jLabel55.setText("jLabel55");

        jd_ventanaEliminarConcesionario.setTitle("Eliminar Concesionario");

        jLabel58.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel58.setText("Eliminar Concesionario");

        jLabel59.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel59.setText("RTN del concesionario");

        jLabel60.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel60.setText("Ingrese el RTN del concesionario que desea eliminar");

        jcb_rtnEliminarConcesionario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jtf_rtnEliminarConcesionario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jb_salirEliminarConcesionario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirEliminarConcesionario.setText("Salir");
        jb_salirEliminarConcesionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirEliminarConcesionarioMouseClicked(evt);
            }
        });

        jb_aceptarEliminarConcesionario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_aceptarEliminarConcesionario.setText("Aceptar");
        jb_aceptarEliminarConcesionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_aceptarEliminarConcesionarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaEliminarConcesionarioLayout = new javax.swing.GroupLayout(jd_ventanaEliminarConcesionario.getContentPane());
        jd_ventanaEliminarConcesionario.getContentPane().setLayout(jd_ventanaEliminarConcesionarioLayout);
        jd_ventanaEliminarConcesionarioLayout.setHorizontalGroup(
            jd_ventanaEliminarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                .addGroup(jd_ventanaEliminarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jd_ventanaEliminarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel58))
                            .addComponent(jLabel60)
                            .addGroup(jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(26, 26, 26)
                                .addComponent(jcb_rtnEliminarConcesionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jtf_rtnEliminarConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_salirEliminarConcesionario)
                .addGap(100, 100, 100))
            .addGroup(jd_ventanaEliminarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jb_aceptarEliminarConcesionario)
                    .addContainerGap(223, Short.MAX_VALUE)))
        );
        jd_ventanaEliminarConcesionarioLayout.setVerticalGroup(
            jd_ventanaEliminarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addGap(32, 32, 32)
                .addGroup(jd_ventanaEliminarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jcb_rtnEliminarConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_rtnEliminarConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jb_salirEliminarConcesionario)
                .addGap(34, 34, 34))
            .addGroup(jd_ventanaEliminarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaEliminarConcesionarioLayout.createSequentialGroup()
                    .addContainerGap(242, Short.MAX_VALUE)
                    .addComponent(jb_aceptarEliminarConcesionario)
                    .addGap(33, 33, 33)))
        );

        jd_ventanaEliminarPlanta.setTitle("Eliminar Planta");

        jLabel61.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel61.setText("ID de la Planta");

        jLabel62.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel62.setText("Eliminar Planta");

        jLabel63.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel63.setText("Ingrese el ID de la planta que desea eliminar");

        jcb_idEliminarPlanta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jtf_idEliminarPlanta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jb_aceptarEliminarPlanta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_aceptarEliminarPlanta.setText("Aceptar");
        jb_aceptarEliminarPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_aceptarEliminarPlantaMouseClicked(evt);
            }
        });

        jb_salirEliminarPlanta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirEliminarPlanta.setText("Salir");
        jb_salirEliminarPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirEliminarPlantaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaEliminarPlantaLayout = new javax.swing.GroupLayout(jd_ventanaEliminarPlanta.getContentPane());
        jd_ventanaEliminarPlanta.getContentPane().setLayout(jd_ventanaEliminarPlantaLayout);
        jd_ventanaEliminarPlantaLayout.setHorizontalGroup(
            jd_ventanaEliminarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaEliminarPlantaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtf_idEliminarPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jd_ventanaEliminarPlantaLayout.createSequentialGroup()
                .addGroup(jd_ventanaEliminarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaEliminarPlantaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jd_ventanaEliminarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel63)
                            .addGroup(jd_ventanaEliminarPlantaLayout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_idEliminarPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_ventanaEliminarPlantaLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jb_aceptarEliminarPlanta)
                        .addGap(75, 75, 75)
                        .addComponent(jb_salirEliminarPlanta))
                    .addGroup(jd_ventanaEliminarPlantaLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel62)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jd_ventanaEliminarPlantaLayout.setVerticalGroup(
            jd_ventanaEliminarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarPlantaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addGap(29, 29, 29)
                .addGroup(jd_ventanaEliminarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jcb_idEliminarPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_idEliminarPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jd_ventanaEliminarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_aceptarEliminarPlanta)
                    .addComponent(jb_salirEliminarPlanta))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jd_ventanaEliminarProveedor.setTitle("Eliminar Proveedor");

        jLabel64.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel64.setText("Eliminar Proveedor");

        jLabel65.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel65.setText("ID del Proveedor");

        jLabel66.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel66.setText("Ingrese el ID del proveedor que desea eliminar");

        jcb_idEliminarProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jtf_idEliminarProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jb_salirEliminarProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirEliminarProveedor.setText("Salir");
        jb_salirEliminarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirEliminarProveedorMouseClicked(evt);
            }
        });

        jb_aceptarEliminarProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_aceptarEliminarProveedor.setText("Aceptar");
        jb_aceptarEliminarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_aceptarEliminarProveedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaEliminarProveedorLayout = new javax.swing.GroupLayout(jd_ventanaEliminarProveedor.getContentPane());
        jd_ventanaEliminarProveedor.getContentPane().setLayout(jd_ventanaEliminarProveedorLayout);
        jd_ventanaEliminarProveedorLayout.setHorizontalGroup(
            jd_ventanaEliminarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarProveedorLayout.createSequentialGroup()
                .addGroup(jd_ventanaEliminarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaEliminarProveedorLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jd_ventanaEliminarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel66)
                            .addGroup(jd_ventanaEliminarProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_idEliminarProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jd_ventanaEliminarProveedorLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel64))
                    .addGroup(jd_ventanaEliminarProveedorLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jd_ventanaEliminarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_idEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_ventanaEliminarProveedorLayout.createSequentialGroup()
                                .addComponent(jb_aceptarEliminarProveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_salirEliminarProveedor)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jd_ventanaEliminarProveedorLayout.setVerticalGroup(
            jd_ventanaEliminarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addGap(26, 26, 26)
                .addGroup(jd_ventanaEliminarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jcb_idEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_idEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jd_ventanaEliminarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salirEliminarProveedor)
                    .addComponent(jb_aceptarEliminarProveedor))
                .addGap(43, 43, 43))
        );

        jd_ventanaEliminarVehiculo.setTitle("Eliminar Vehículo");

        jLabel67.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel67.setText("Eliminar Vehículo");

        jLabel68.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel68.setText("VIN");

        jcb_vinEliminarVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel69.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel69.setText("Ingrese el VIN del vehículo que desea eliminar");

        jtf_vinEliminarVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jb_aceptarEliminarVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_aceptarEliminarVehiculo.setText("Aceptar");
        jb_aceptarEliminarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_aceptarEliminarVehiculoMouseClicked(evt);
            }
        });

        jb_salirEliminarVehiculo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirEliminarVehiculo.setText("Salir");
        jb_salirEliminarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirEliminarVehiculoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaEliminarVehiculoLayout = new javax.swing.GroupLayout(jd_ventanaEliminarVehiculo.getContentPane());
        jd_ventanaEliminarVehiculo.getContentPane().setLayout(jd_ventanaEliminarVehiculoLayout);
        jd_ventanaEliminarVehiculoLayout.setHorizontalGroup(
            jd_ventanaEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarVehiculoLayout.createSequentialGroup()
                .addGroup(jd_ventanaEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaEliminarVehiculoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel69))
                    .addGroup(jd_ventanaEliminarVehiculoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jd_ventanaEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_vinEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_ventanaEliminarVehiculoLayout.createSequentialGroup()
                                .addComponent(jb_aceptarEliminarVehiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_salirEliminarVehiculo))))
                    .addGroup(jd_ventanaEliminarVehiculoLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jd_ventanaEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ventanaEliminarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_vinEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel67))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jd_ventanaEliminarVehiculoLayout.setVerticalGroup(
            jd_ventanaEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaEliminarVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67)
                .addGap(26, 26, 26)
                .addGroup(jd_ventanaEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jcb_vinEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_vinEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jd_ventanaEliminarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salirEliminarVehiculo)
                    .addComponent(jb_aceptarEliminarVehiculo))
                .addGap(43, 43, 43))
        );

        jd_modificarTablas.setTitle("Menú Tablas");

        jLabel71.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel71.setText("Menú Tablas");

        jb_clienteMenuTablas2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_clienteMenuTablas2.setText("Tabla Cliente");
        jb_clienteMenuTablas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_clienteMenuTablas2MouseClicked(evt);
            }
        });

        jb_companiaMenuTablas2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_companiaMenuTablas2.setText("Tabla Compania");
        jb_companiaMenuTablas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_companiaMenuTablas2MouseClicked(evt);
            }
        });

        jb_concesionarioMenuTablas2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_concesionarioMenuTablas2.setText("Tabla Concesionario");
        jb_concesionarioMenuTablas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_concesionarioMenuTablas2MouseClicked(evt);
            }
        });

        jb_plantaMenuTablas2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_plantaMenuTablas2.setText("Tabla Planta");
        jb_plantaMenuTablas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_plantaMenuTablas2MouseClicked(evt);
            }
        });

        jb_ventaMenuTablas2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_ventaMenuTablas2.setText("Tabla Venta");
        jb_ventaMenuTablas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ventaMenuTablas2MouseClicked(evt);
            }
        });

        jb_vehiculoMenuTablas2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_vehiculoMenuTablas2.setText("Tabla Vehiculo");
        jb_vehiculoMenuTablas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_vehiculoMenuTablas2MouseClicked(evt);
            }
        });

        jb_proveedorMenuTablas2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_proveedorMenuTablas2.setText("Tabla Proveedor");
        jb_proveedorMenuTablas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_proveedorMenuTablas2MouseClicked(evt);
            }
        });

        jb_salirMenuTablas2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirMenuTablas2.setText("Salir");
        jb_salirMenuTablas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMenuTablas2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarTablasLayout = new javax.swing.GroupLayout(jd_modificarTablas.getContentPane());
        jd_modificarTablas.getContentPane().setLayout(jd_modificarTablasLayout);
        jd_modificarTablasLayout.setHorizontalGroup(
            jd_modificarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_modificarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_salirMenuTablas2)
                    .addComponent(jLabel71)
                    .addGroup(jd_modificarTablasLayout.createSequentialGroup()
                        .addComponent(jb_proveedorMenuTablas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_vehiculoMenuTablas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_ventaMenuTablas2))
                    .addGroup(jd_modificarTablasLayout.createSequentialGroup()
                        .addComponent(jb_clienteMenuTablas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_companiaMenuTablas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_concesionarioMenuTablas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_plantaMenuTablas2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_modificarTablasLayout.setVerticalGroup(
            jd_modificarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71)
                .addGap(50, 50, 50)
                .addGroup(jd_modificarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_clienteMenuTablas2)
                    .addComponent(jb_companiaMenuTablas2)
                    .addComponent(jb_concesionarioMenuTablas2)
                    .addComponent(jb_plantaMenuTablas2))
                .addGap(51, 51, 51)
                .addGroup(jd_modificarTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_proveedorMenuTablas2)
                    .addComponent(jb_vehiculoMenuTablas2)
                    .addComponent(jb_ventaMenuTablas2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jb_salirMenuTablas2)
                .addContainerGap())
        );

        jd_ventanaModificarCliente.setTitle("Modificar Cliente");

        jLabel78.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel78.setText("Tabla Cliente");

        jLabel79.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel79.setText("RTN del Cliente");

        jLabel80.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel80.setText("Nombre del Cliente");

        jtf_telefonoClienteModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel81.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel81.setText("Teléfono");

        jLabel82.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel82.setText("Dirección");

        jLabel83.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel83.setText("¿Es companía?");

        jcb_companiaClienteModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcb_companiaClienteModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jtf_identidadClienteModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel84.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel84.setText("Identidad");

        jLabel85.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel85.setText("Sexo");

        jcb_sexoClienteModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcb_sexoClienteModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jLabel86.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel86.setText("Ingreso Anual");

        jtf_ingresoClienteModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel87.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel87.setText("Tipo Compania");

        jb_guardarClienteModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarClienteModificar.setText("Guardar");
        jb_guardarClienteModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarClienteModificarMouseClicked(evt);
            }
        });

        jb_salirClienteModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirClienteModificar.setText("Salir");
        jb_salirClienteModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirClienteModificarMouseClicked(evt);
            }
        });

        jcb_rtnModificarCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_ventanaModificarClienteLayout = new javax.swing.GroupLayout(jd_ventanaModificarCliente.getContentPane());
        jd_ventanaModificarCliente.getContentPane().setLayout(jd_ventanaModificarClienteLayout);
        jd_ventanaModificarClienteLayout.setHorizontalGroup(
            jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80)
                            .addComponent(jLabel79))
                        .addGap(14, 14, 14)
                        .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78)
                            .addComponent(jcb_rtnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jtf_nombreClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel83)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_companiaClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                        .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaModificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(18, 18, 18))
                            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(16, 16, 16)))
                        .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_telefonoClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_direccionClienteModificar))
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                        .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_tipoCompaniaClienteModificar))
                            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_ingresoClienteModificar))
                            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_sexoClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_identidadClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_guardarClienteModificar)
                .addGap(81, 81, 81)
                .addComponent(jb_salirClienteModificar)
                .addGap(21, 21, 21))
        );
        jd_ventanaModificarClienteLayout.setVerticalGroup(
            jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jcb_rtnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jtf_nombreClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jtf_telefonoClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jtf_direccionClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jcb_companiaClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jtf_identidadClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jcb_sexoClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addComponent(jtf_ingresoClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jtf_tipoCompaniaClienteModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jd_ventanaModificarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarClienteModificar)
                    .addComponent(jb_salirClienteModificar))
                .addContainerGap())
        );

        jd_ventanaModificarCompania.setTitle("Modificar Compañía");

        jLabel88.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel88.setText("Tabla Compañía");

        jLabel89.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel89.setText("ID de la Compañía");

        jtf_nombreModificarCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel90.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel90.setText("Marca");

        jLabel91.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel91.setText("Nombre");

        jb_guardarCompaniaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarCompaniaModificar.setText("Guardar");
        jb_guardarCompaniaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarCompaniaModificarMouseClicked(evt);
            }
        });

        jb_salirCompaniaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirCompaniaModificar.setText("Salir");
        jb_salirCompaniaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirCompaniaModificarMouseClicked(evt);
            }
        });

        jcb_idModificarCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jtf_marcaModificarCompania.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_ventanaModificarCompaniaLayout = new javax.swing.GroupLayout(jd_ventanaModificarCompania.getContentPane());
        jd_ventanaModificarCompania.getContentPane().setLayout(jd_ventanaModificarCompaniaLayout);
        jd_ventanaModificarCompaniaLayout.setHorizontalGroup(
            jd_ventanaModificarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarCompaniaLayout.createSequentialGroup()
                .addGroup(jd_ventanaModificarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaModificarCompaniaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jd_ventanaModificarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ventanaModificarCompaniaLayout.createSequentialGroup()
                                .addComponent(jLabel89)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_idModificarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaModificarCompaniaLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jb_guardarCompaniaModificar)
                                .addGap(88, 88, 88)
                                .addComponent(jb_salirCompaniaModificar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaModificarCompaniaLayout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_marcaModificarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(jd_ventanaModificarCompaniaLayout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_nombreModificarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_ventanaModificarCompaniaLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel88)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jd_ventanaModificarCompaniaLayout.setVerticalGroup(
            jd_ventanaModificarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarCompaniaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jcb_idModificarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jtf_marcaModificarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jtf_nombreModificarCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jd_ventanaModificarCompaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salirCompaniaModificar)
                    .addComponent(jb_guardarCompaniaModificar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jd_ventanaModificarConcesionario.setTitle("Modificar Concesionario");

        jLabel92.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel92.setText("Tabla Concesionario");

        jLabel93.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel93.setText("RTN del Concesionario");

        jLabel94.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel94.setText("Nombre del Concesionario");

        jtf_nombreConcesionarioModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel95.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel95.setText("Ubicación del Concesionario");

        jb_guardarConcesionarioModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarConcesionarioModificar.setText("Guardar");
        jb_guardarConcesionarioModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarConcesionarioModificarMouseClicked(evt);
            }
        });

        jb_salirConcesionarioModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirConcesionarioModificar.setText("Salir");
        jb_salirConcesionarioModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirConcesionarioModificarMouseClicked(evt);
            }
        });

        jcb_rtnConcesionarioModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_ventanaModificarConcesionarioLayout = new javax.swing.GroupLayout(jd_ventanaModificarConcesionario.getContentPane());
        jd_ventanaModificarConcesionario.getContentPane().setLayout(jd_ventanaModificarConcesionarioLayout);
        jd_ventanaModificarConcesionarioLayout.setHorizontalGroup(
            jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarConcesionarioLayout.createSequentialGroup()
                .addGroup(jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaModificarConcesionarioLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jb_guardarConcesionarioModificar)
                        .addGap(66, 66, 66)
                        .addComponent(jb_salirConcesionarioModificar))
                    .addGroup(jd_ventanaModificarConcesionarioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94)
                            .addComponent(jLabel93))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_nombreConcesionarioModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jtf_ubicacionConcesionarioModificar)
                            .addComponent(jcb_rtnConcesionarioModificar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaModificarConcesionarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel92)
                .addGap(118, 118, 118))
        );
        jd_ventanaModificarConcesionarioLayout.setVerticalGroup(
            jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarConcesionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92)
                .addGap(32, 32, 32)
                .addGroup(jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(jcb_rtnConcesionarioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jtf_nombreConcesionarioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jtf_ubicacionConcesionarioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jd_ventanaModificarConcesionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarConcesionarioModificar)
                    .addComponent(jb_salirConcesionarioModificar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jd_ventanaModificarPlanta.setTitle("Modificar Planta");

        jLabel96.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel96.setText("Tabla Planta");

        jLabel97.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel97.setText("ID de la planta");

        jtf_nombrePlantaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel98.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel98.setText("Nombre de la planta");

        jLabel99.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel99.setText("Tipo de Planta");

        jtf_tipoPlantaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel100.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel100.setText("ID de la Compañía ");

        jb_guardarPlantaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarPlantaModificar.setText("Guardar");
        jb_guardarPlantaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarPlantaModificarMouseClicked(evt);
            }
        });

        jb_salirModificarPlanta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirModificarPlanta.setText("Salir");
        jb_salirModificarPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirModificarPlantaMouseClicked(evt);
            }
        });

        jcb_idPlantaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_ventanaModificarPlantaLayout = new javax.swing.GroupLayout(jd_ventanaModificarPlanta.getContentPane());
        jd_ventanaModificarPlanta.getContentPane().setLayout(jd_ventanaModificarPlantaLayout);
        jd_ventanaModificarPlantaLayout.setHorizontalGroup(
            jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarPlantaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_guardarPlantaModificar)
                    .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel98)
                        .addComponent(jLabel97)
                        .addComponent(jLabel99)
                        .addComponent(jLabel100)))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_nombrePlantaModificar)
                    .addComponent(jtf_tipoPlantaModificar)
                    .addComponent(jcb_idCompaniaPlantaModificar, 0, 148, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaModificarPlantaLayout.createSequentialGroup()
                        .addComponent(jb_salirModificarPlanta)
                        .addGap(35, 35, 35))
                    .addComponent(jcb_idPlantaModificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaModificarPlantaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel96)
                .addGap(114, 114, 114))
        );
        jd_ventanaModificarPlantaLayout.setVerticalGroup(
            jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarPlantaLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel96)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaModificarPlantaLayout.createSequentialGroup()
                        .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(jcb_idPlantaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(jtf_nombrePlantaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(jtf_tipoPlantaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100)
                            .addComponent(jcb_idCompaniaPlantaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaModificarPlantaLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jd_ventanaModificarPlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_guardarPlantaModificar)
                            .addComponent(jb_salirModificarPlanta))
                        .addGap(25, 25, 25))))
        );

        jd_ventanaModificarProveedor.setTitle("Modificar Proveedor");

        jLabel101.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel101.setText("Tabla Proveedor");

        jLabel102.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel102.setText("ID del Proveedor");

        jLabel103.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel103.setText("Nombre del Proveedor");

        jtf_nombreProveedorModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jtf_piezaProveedorModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel104.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel104.setText("Pieza ");

        jb_guardarProveedorModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarProveedorModificar.setText("Guardar");
        jb_guardarProveedorModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarProveedorModificarMouseClicked(evt);
            }
        });

        jb_salirProveedorModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirProveedorModificar.setText("Salir");
        jb_salirProveedorModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirProveedorModificarMouseClicked(evt);
            }
        });

        jcb_idProveedorModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_ventanaModificarProveedorLayout = new javax.swing.GroupLayout(jd_ventanaModificarProveedor.getContentPane());
        jd_ventanaModificarProveedor.getContentPane().setLayout(jd_ventanaModificarProveedorLayout);
        jd_ventanaModificarProveedorLayout.setHorizontalGroup(
            jd_ventanaModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarProveedorLayout.createSequentialGroup()
                .addGroup(jd_ventanaModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaModificarProveedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel104))
                    .addGroup(jd_ventanaModificarProveedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ventanaModificarProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_nombreProveedorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaModificarProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel102)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_idProveedorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_ventanaModificarProveedorLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jtf_piezaProveedorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_ventanaModificarProveedorLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jb_guardarProveedorModificar)
                        .addGap(57, 57, 57)
                        .addComponent(jb_salirProveedorModificar)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaModificarProveedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel101)
                .addGap(102, 102, 102))
        );
        jd_ventanaModificarProveedorLayout.setVerticalGroup(
            jd_ventanaModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel101)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jcb_idProveedorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jtf_nombreProveedorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jtf_piezaProveedorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jd_ventanaModificarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salirProveedorModificar)
                    .addComponent(jb_guardarProveedorModificar))
                .addGap(28, 28, 28))
        );

        jd_ventanaModificarVehiculo.setTitle("Modificar Vehículo");

        jLabel105.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel105.setText("Tabla Vehículo");

        jLabel106.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel106.setText("VIN");

        jtf_modeloVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel107.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel107.setText("Modelo del vehículo");

        jLabel108.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel108.setText("Tipo de carrocería");

        jtf_carroceriaVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jtf_motorVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel109.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel109.setText("Tipo de motor");

        jLabel110.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel110.setText("Transmición");

        jtf_transmicionVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel111.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel111.setText("Color");

        jdc_fechaVehiculoModificar.setDateFormatString("yyyy-MM-dd");

        jLabel112.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel112.setText("Fecha de ensamblaje");

        jLabel113.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel113.setText("Precio");

        jtf_precioVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jcb_idCompaniaVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jcb_idCompaniaVehiculoModificar.setMaximumRowCount(30);

        jLabel114.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel114.setText("ID de la compañía");

        jb_guardarVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarVehiculoModificar.setText("Guardar");
        jb_guardarVehiculoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarVehiculoModificarMouseClicked(evt);
            }
        });

        jb_salirVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirVehiculoModificar.setText("Salir");
        jb_salirVehiculoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirVehiculoModificarMouseClicked(evt);
            }
        });

        jcb_vinVehiculoModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_ventanaModificarVehiculoLayout = new javax.swing.GroupLayout(jd_ventanaModificarVehiculo.getContentPane());
        jd_ventanaModificarVehiculo.getContentPane().setLayout(jd_ventanaModificarVehiculoLayout);
        jd_ventanaModificarVehiculoLayout.setHorizontalGroup(
            jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarVehiculoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaModificarVehiculoLayout.createSequentialGroup()
                        .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel107)
                            .addComponent(jLabel106)
                            .addComponent(jLabel108)
                            .addComponent(jLabel109)
                            .addComponent(jLabel111)
                            .addComponent(jLabel112)
                            .addComponent(jLabel113)
                            .addComponent(jLabel114)
                            .addComponent(jLabel110))
                        .addGap(27, 27, 27)
                        .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_modeloVehiculoModificar)
                            .addComponent(jtf_carroceriaVehiculoModificar)
                            .addComponent(jtf_motorVehiculoModificar)
                            .addComponent(jtf_colorVehiculoModificar)
                            .addComponent(jdc_fechaVehiculoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jtf_precioVehiculoModificar)
                            .addComponent(jcb_idCompaniaVehiculoModificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_transmicionVehiculoModificar)
                            .addComponent(jcb_vinVehiculoModificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_ventanaModificarVehiculoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel105)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ventanaModificarVehiculoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_guardarVehiculoModificar)
                .addGap(36, 36, 36)
                .addComponent(jb_salirVehiculoModificar)
                .addGap(89, 89, 89))
        );
        jd_ventanaModificarVehiculoLayout.setVerticalGroup(
            jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jcb_vinVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(jtf_modeloVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jtf_carroceriaVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(jtf_motorVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jtf_transmicionVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jtf_colorVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel112)
                    .addComponent(jdc_fechaVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jtf_precioVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(jcb_idCompaniaVehiculoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_ventanaModificarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarVehiculoModificar)
                    .addComponent(jb_salirVehiculoModificar))
                .addContainerGap())
        );

        jd_ventanaModificarVenta.setTitle("Modificar Venta");

        jLabel115.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel115.setText("RTN del Concesionario");

        jLabel116.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel116.setText("Tabla Venta");

        jcb_rtnConcesionarioVentaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jcb_rtnClienteVentaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel117.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel117.setText("RTN del Cliente");

        jLabel118.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel118.setText("VIN ");

        jcb_vinVentaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel119.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel119.setText("Precio de Venta");

        jtf_precioVentaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabel120.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel120.setText("Fecha de Venta");

        jb_guardarVentaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_guardarVentaModificar.setText("Guardar");
        jb_guardarVentaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarVentaModificarMouseClicked(evt);
            }
        });

        jb_salirVentaModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirVentaModificar.setText("Salir");
        jb_salirVentaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirVentaModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaModificarVentaLayout = new javax.swing.GroupLayout(jd_ventanaModificarVenta.getContentPane());
        jd_ventanaModificarVenta.getContentPane().setLayout(jd_ventanaModificarVentaLayout);
        jd_ventanaModificarVentaLayout.setHorizontalGroup(
            jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                .addGroup(jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                                .addComponent(jLabel117)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_rtnClienteVentaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                                .addComponent(jLabel115)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_rtnConcesionarioVentaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_vinVentaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                                .addComponent(jLabel119)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_precioVentaModificar))
                            .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                                .addComponent(jLabel120)
                                .addGap(18, 18, 18)
                                .addComponent(jdc_fechaVentaModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jb_guardarVentaModificar)
                        .addGap(41, 41, 41)
                        .addComponent(jb_salirVentaModificar))
                    .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel116)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jd_ventanaModificarVentaLayout.setVerticalGroup(
            jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaModificarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel116)
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(jcb_rtnConcesionarioVentaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(jcb_rtnClienteVentaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(jcb_vinVentaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(jtf_precioVentaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel120)
                    .addComponent(jdc_fechaVentaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jd_ventanaModificarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarVentaModificar)
                    .addComponent(jb_salirVentaModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jd_bitacora.setTitle("Bitácora");

        jt_tablaBitacora.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jt_tablaBitacora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "Evento", "Tabla", "Llave Primaria", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_tablaBitacora);

        jb_salirBitacora.setText("Salir");
        jb_salirBitacora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirBitacoraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_bitacoraLayout = new javax.swing.GroupLayout(jd_bitacora.getContentPane());
        jd_bitacora.getContentPane().setLayout(jd_bitacoraLayout);
        jd_bitacoraLayout.setHorizontalGroup(
            jd_bitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
            .addGroup(jd_bitacoraLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jb_salirBitacora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_bitacoraLayout.setVerticalGroup(
            jd_bitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bitacoraLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_salirBitacora)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jd_menuReportes.setTitle("Menú Reportes");

        jLabel121.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel121.setText("Menú Reportes");

        jb_tendenciasReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_tendenciasReporte.setText("Tendencias de ventas");
        jb_tendenciasReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_tendenciasReporteMouseClicked(evt);
            }
        });

        jb_transmicionReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_transmicionReporte.setText("VIN de automóvil con transmición defectuosa");
        jb_transmicionReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_transmicionReporteMouseClicked(evt);
            }
        });

        jb_marcasReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_marcasReporte.setText("Mejores marcas");
        jb_marcasReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_marcasReporteMouseClicked(evt);
            }
        });

        jb_mejoresMarcasReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_mejoresMarcasReporte.setText("Mejores marcas por unidad");
        jb_mejoresMarcasReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_mejoresMarcasReporteMouseClicked(evt);
            }
        });

        jb_ventaReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_ventaReporte.setText("Venta de convertibles");
        jb_ventaReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ventaReporteMouseClicked(evt);
            }
        });

        jb_distribuidoresReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_distribuidoresReporte.setText("Distribuidores");
        jb_distribuidoresReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_distribuidoresReporteMouseClicked(evt);
            }
        });

        jb_salirReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirReporte.setText("Salir");
        jb_salirReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirReporteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_menuReportesLayout = new javax.swing.GroupLayout(jd_menuReportes.getContentPane());
        jd_menuReportes.getContentPane().setLayout(jd_menuReportesLayout);
        jd_menuReportesLayout.setHorizontalGroup(
            jd_menuReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_menuReportesLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jd_menuReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_salirReporte)
                    .addComponent(jb_distribuidoresReporte)
                    .addComponent(jb_ventaReporte)
                    .addComponent(jb_mejoresMarcasReporte)
                    .addComponent(jb_marcasReporte)
                    .addComponent(jb_transmicionReporte)
                    .addComponent(jb_tendenciasReporte)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_menuReportesLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel121)))
                .addGap(67, 67, 67))
        );
        jd_menuReportesLayout.setVerticalGroup(
            jd_menuReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menuReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel121)
                .addGap(33, 33, 33)
                .addComponent(jb_tendenciasReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_transmicionReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_marcasReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_mejoresMarcasReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_ventaReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_distribuidoresReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jb_salirReporte)
                .addContainerGap())
        );

        jd_tendenciasReporteMenu.setTitle("Tendencias de ventas para varias marcas ");

        jt_tendenciasReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_tendenciasReporte);

        jb_tendenciaAnioReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_tendenciaAnioReporte.setText("Año");
        jb_tendenciaAnioReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_tendenciaAnioReporteMouseClicked(evt);
            }
        });

        jb_tendenciaMesReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_tendenciaMesReporte.setText("Mes");
        jb_tendenciaMesReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_tendenciaMesReporteMouseClicked(evt);
            }
        });

        jb_tendenciaSemanaReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_tendenciaSemanaReporte.setText("Semana");
        jb_tendenciaSemanaReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_tendenciaSemanaReporteMouseClicked(evt);
            }
        });

        jb_tendenciaGeneroReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_tendenciaGeneroReporte.setText("Género");
        jb_tendenciaGeneroReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_tendenciaGeneroReporteMouseClicked(evt);
            }
        });

        jb_salirTendenciaReporte.setText("Salir");
        jb_salirTendenciaReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirTendenciaReporteMouseClicked(evt);
            }
        });

        jb_rangoTendenciaReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_rangoTendenciaReporte.setText("Rango de ingresos");
        jb_rangoTendenciaReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_rangoTendenciaReporteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_tendenciasReporteMenuLayout = new javax.swing.GroupLayout(jd_tendenciasReporteMenu.getContentPane());
        jd_tendenciasReporteMenu.getContentPane().setLayout(jd_tendenciasReporteMenuLayout);
        jd_tendenciasReporteMenuLayout.setHorizontalGroup(
            jd_tendenciasReporteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_tendenciasReporteMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_salirTendenciaReporte)
                .addContainerGap())
            .addGroup(jd_tendenciasReporteMenuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jb_tendenciaAnioReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_tendenciaMesReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_tendenciaSemanaReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_tendenciaGeneroReporte)
                .addGap(18, 18, 18)
                .addComponent(jb_rangoTendenciaReporte)
                .addContainerGap(97, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jd_tendenciasReporteMenuLayout.setVerticalGroup(
            jd_tendenciasReporteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_tendenciasReporteMenuLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_tendenciasReporteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_tendenciaAnioReporte)
                    .addComponent(jb_tendenciaMesReporte)
                    .addComponent(jb_tendenciaSemanaReporte)
                    .addComponent(jb_tendenciaGeneroReporte)
                    .addComponent(jb_rangoTendenciaReporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jb_salirTendenciaReporte)
                .addContainerGap())
        );

        jd_defectuosaReporte.setTitle("Transmiciones Defectuosas");

        jLabel122.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel122.setText("Fecha de inicio");

        jLabel123.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel123.setText("ID del proveedor");

        jLabel124.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel124.setText("Fecha final");

        jcb_idProveedorReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jt_defectuosoReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jt_defectuosoReporte);

        jb_aceptarReporte.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_aceptarReporte.setText("Aceptar");
        jb_aceptarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_aceptarReporteMouseClicked(evt);
            }
        });

        jb_salirDefectuoso.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirDefectuoso.setText("Salir");
        jb_salirDefectuoso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirDefectuosoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_defectuosaReporteLayout = new javax.swing.GroupLayout(jd_defectuosaReporte.getContentPane());
        jd_defectuosaReporte.getContentPane().setLayout(jd_defectuosaReporteLayout);
        jd_defectuosaReporteLayout.setHorizontalGroup(
            jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jd_defectuosaReporteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcb_idProveedorReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_defectuosaReporteLayout.createSequentialGroup()
                        .addGroup(jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122)
                            .addComponent(jLabel124))
                        .addGap(18, 18, 18)
                        .addGroup(jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdc_fechaInicioReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jdc_fechaFinalReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_defectuosaReporteLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jb_aceptarReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jb_salirDefectuoso)
                .addGap(79, 79, 79))
            .addGroup(jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_defectuosaReporteLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel123)
                    .addContainerGap(286, Short.MAX_VALUE)))
        );
        jd_defectuosaReporteLayout.setVerticalGroup(
            jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_defectuosaReporteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jcb_idProveedorReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addComponent(jdc_fechaInicioReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124)
                    .addComponent(jdc_fechaFinalReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_salirDefectuoso)
                    .addComponent(jb_aceptarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jd_defectuosaReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_defectuosaReporteLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel123)
                    .addContainerGap(368, Short.MAX_VALUE)))
        );

        jd_mejoresMarcasReporte.setTitle("Mejores Marcas");

        jt_mejoresMarcasReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_mejoresMarcasReportes);

        jb_salirMejoresMarcasReportes.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirMejoresMarcasReportes.setText("Salir");
        jb_salirMejoresMarcasReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMejoresMarcasReportesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_mejoresMarcasReporteLayout = new javax.swing.GroupLayout(jd_mejoresMarcasReporte.getContentPane());
        jd_mejoresMarcasReporte.getContentPane().setLayout(jd_mejoresMarcasReporteLayout);
        jd_mejoresMarcasReporteLayout.setHorizontalGroup(
            jd_mejoresMarcasReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jd_mejoresMarcasReporteLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jb_salirMejoresMarcasReportes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_mejoresMarcasReporteLayout.setVerticalGroup(
            jd_mejoresMarcasReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mejoresMarcasReporteLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jb_salirMejoresMarcasReportes)
                .addContainerGap())
        );

        jd_mejoresMarcasUnidadReporte.setTitle("Mejores Marcas por Unidad");

        jt_mejoresMarcasUnidadReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jt_mejoresMarcasUnidadReporte);

        jb_salirMejoresMarcasUnidadReporte.setText("Salir");
        jb_salirMejoresMarcasUnidadReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMejoresMarcasUnidadReporteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_mejoresMarcasUnidadReporteLayout = new javax.swing.GroupLayout(jd_mejoresMarcasUnidadReporte.getContentPane());
        jd_mejoresMarcasUnidadReporte.getContentPane().setLayout(jd_mejoresMarcasUnidadReporteLayout);
        jd_mejoresMarcasUnidadReporteLayout.setHorizontalGroup(
            jd_mejoresMarcasUnidadReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jd_mejoresMarcasUnidadReporteLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jb_salirMejoresMarcasUnidadReporte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_mejoresMarcasUnidadReporteLayout.setVerticalGroup(
            jd_mejoresMarcasUnidadReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mejoresMarcasUnidadReporteLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jb_salirMejoresMarcasUnidadReporte)
                .addContainerGap())
        );

        jd_ventaConvertibleReporte.setTitle("Venta de Convertibles");

        jt_ventaConvertibleReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane5.setViewportView(jt_ventaConvertibleReporte);

        jb_salirVentaConvertible.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirVentaConvertible.setText("Salir");
        jb_salirVentaConvertible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirVentaConvertibleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventaConvertibleReporteLayout = new javax.swing.GroupLayout(jd_ventaConvertibleReporte.getContentPane());
        jd_ventaConvertibleReporte.getContentPane().setLayout(jd_ventaConvertibleReporteLayout);
        jd_ventaConvertibleReporteLayout.setHorizontalGroup(
            jd_ventaConvertibleReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jd_ventaConvertibleReporteLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jb_salirVentaConvertible)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_ventaConvertibleReporteLayout.setVerticalGroup(
            jd_ventaConvertibleReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventaConvertibleReporteLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jb_salirVentaConvertible)
                .addContainerGap())
        );

        jd_distribuidoresReporte.setTitle("Distribuidores");

        jt_distribuidoresReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jt_distribuidoresReporte);

        jButton7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton7.setText("Salir");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_distribuidoresReporteLayout = new javax.swing.GroupLayout(jd_distribuidoresReporte.getContentPane());
        jd_distribuidoresReporte.getContentPane().setLayout(jd_distribuidoresReporteLayout);
        jd_distribuidoresReporteLayout.setHorizontalGroup(
            jd_distribuidoresReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jd_distribuidoresReporteLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_distribuidoresReporteLayout.setVerticalGroup(
            jd_distribuidoresReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_distribuidoresReporteLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jd_ventanaDistribuidoresUsuario.setTitle("Distribuidores");

        jLabel70.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 102, 204));
        jLabel70.setText("Distribuidores");

        jt_distribuidoresCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jt_distribuidoresCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane8.setViewportView(jt_distribuidoresCliente);

        jb_salirDistribuidoresCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirDistribuidoresCliente.setText("Salir");
        jb_salirDistribuidoresCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirDistribuidoresClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaDistribuidoresUsuarioLayout = new javax.swing.GroupLayout(jd_ventanaDistribuidoresUsuario.getContentPane());
        jd_ventanaDistribuidoresUsuario.getContentPane().setLayout(jd_ventanaDistribuidoresUsuarioLayout);
        jd_ventanaDistribuidoresUsuarioLayout.setHorizontalGroup(
            jd_ventanaDistribuidoresUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaDistribuidoresUsuarioLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jd_ventanaDistribuidoresUsuarioLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jd_ventanaDistribuidoresUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_salirDistribuidoresCliente)
                    .addComponent(jLabel70))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_ventanaDistribuidoresUsuarioLayout.setVerticalGroup(
            jd_ventanaDistribuidoresUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaDistribuidoresUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jb_salirDistribuidoresCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jd_ventanaProductosUsuario.setTitle("Vehículos");

        jLabel72.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 102, 204));
        jLabel72.setText("Vehículos");

        jt_vehiculosCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jt_vehiculosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jt_vehiculosCliente);

        jb_salirVehiculosCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jb_salirVehiculosCliente.setText("Salir");
        jb_salirVehiculosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirVehiculosClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ventanaProductosUsuarioLayout = new javax.swing.GroupLayout(jd_ventanaProductosUsuario.getContentPane());
        jd_ventanaProductosUsuario.getContentPane().setLayout(jd_ventanaProductosUsuarioLayout);
        jd_ventanaProductosUsuarioLayout.setHorizontalGroup(
            jd_ventanaProductosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
            .addGroup(jd_ventanaProductosUsuarioLayout.createSequentialGroup()
                .addGroup(jd_ventanaProductosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ventanaProductosUsuarioLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel72))
                    .addGroup(jd_ventanaProductosUsuarioLayout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jb_salirVehiculosCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_ventanaProductosUsuarioLayout.setVerticalGroup(
            jd_ventanaProductosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ventanaProductosUsuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_salirVehiculosCliente)
                .addGap(17, 17, 17))
        );

        jd_precioCliente.setTitle("Precios");

        jLabel73.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 102, 204));
        jLabel73.setText("Precios");

        jt_precioCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jt_precioCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane10.setViewportView(jt_precioCliente);

        jButton10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton10.setText("Salir");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_precioClienteLayout = new javax.swing.GroupLayout(jd_precioCliente.getContentPane());
        jd_precioCliente.getContentPane().setLayout(jd_precioClienteLayout);
        jd_precioClienteLayout.setHorizontalGroup(
            jd_precioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jd_precioClienteLayout.createSequentialGroup()
                .addGroup(jd_precioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_precioClienteLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jButton10))
                    .addGroup(jd_precioClienteLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel73)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_precioClienteLayout.setVerticalGroup(
            jd_precioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_precioClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(41, 41, 41))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Cliente");

        jb_imagenCarroMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carro final 5.png"))); // NOI18N

        jb_distribuidoresMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Distribuidores otro.png"))); // NOI18N
        jb_distribuidoresMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_distribuidoresMenuPrincipalMouseClicked(evt);
            }
        });

        jb_productosMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos otro.png"))); // NOI18N
        jb_productosMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_productosMenuPrincipalMouseClicked(evt);
            }
        });

        jb_preciosMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Precios final.png"))); // NOI18N
        jb_preciosMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_preciosMenuPrincipalMouseClicked(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_imagenCarroMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_distribuidoresMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_productosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_preciosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
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
                jtf_contrasenaUsuario.setText("");
                jtf_nombreUsuario.setText("");
                //this.setVisible(false);
                jd_ventanaAdmin.setVisible(true);
            } else if (jtf_nombreUsuario.getText().equalsIgnoreCase("servicio de localizacion") && contrasena.equalsIgnoreCase("456")) {
                //Agregar venta para los reportes
            } else if (jtf_nombreUsuario.getText().equalsIgnoreCase("marketing") && contrasena.equalsIgnoreCase("789")) {
                jd_menuReportes.pack();
                jd_menuReportes.setModal(true);
                jd_menuReportes.setLocationRelativeTo(this);
                jd_menuReportes.setVisible(true);
                jd_ventanaLogin.setVisible(false);
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
        jd_modificarTablas.pack();
        jd_modificarTablas.setModal(true);
        jd_modificarTablas.setLocationRelativeTo(this);
        jd_modificarTablas.setVisible(true);
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
            JOptionPane.showMessageDialog(this, "La compañía se ha agregado exitosamente");
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
            db.cargarCBCompania(jcb_idCompaniaPlanta);
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
            db.cargarCBCompania(jcb_idCompaniaVehiculo);
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
        java.util.Date utilDate = jdc_fechaVehiculo.getDate();
        java.sql.Date sDate = convertUtilToSql(utilDate);
        condicion = db.procedimientoInsertarVehiculo(jtf_vinVehiculo.getText(), jtf_modeloVehiculo.getText(), jtf_carroceriaVehiculo.getText(), jtf_motorVehiculo.getText(), jtf_colorVehiculo.getText(),
                jtf_transmicionVehiculo.getText(), sDate, precio, idCompania);
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Hay valores nulos");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El VIN del vehículo ya existe");
        } else if (condicion == 0) {
            JOptionPane.showMessageDialog(this, "El vehículo se ha agregado exitosamente");
        } else if (condicion == 3) {
            JOptionPane.showMessageDialog(this, "El ID de la Compañía no existe");
        }
        jtf_vinVehiculo.setText("");
        jtf_modeloVehiculo.setText("");
        jtf_carroceriaVehiculo.setText("");
        jtf_motorVehiculo.setText("");
        jtf_colorVehiculo.setText("");
        jtf_transmicionVehiculo.setText("");
        jtf_precioVehiculo.setText("");
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
        int condicion = -1;
        float precio = Float.parseFloat(jtf_precioVenta.getText());
        String rtnConcesionario = ((String) jcb_rtnConcesionarioVenta.getSelectedItem());
        String rtnCliente = ((String) jcb_rtnClienteVenta.getSelectedItem());
        String vinVenta = ((String) jcb_vinVenta.getSelectedItem());
        java.util.Date utilDate = jdc_fechaVenta.getDate();
        java.sql.Date sDate = convertUtilToSql(utilDate);
        condicion = db.procedimientoInsertarVenta(rtnConcesionario, rtnCliente, vinVenta, precio, sDate);
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Hay valores nulos");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El VIN del vehículo ya existe");
        } else if (condicion == 0) {
            JOptionPane.showMessageDialog(this, "El vehículo se ha agregado exitosamente");
        } else if (condicion == 3) {
            JOptionPane.showMessageDialog(this, "El ID de la Compañía no existe");
        }
        jtf_precioVenta.setText("");
    }//GEN-LAST:event_jb_guardarVentaMouseClicked

    private void jb_salirEliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirEliminarClienteMouseClicked
        jd_ventanaEliminarCliente.setVisible(false);
    }//GEN-LAST:event_jb_salirEliminarClienteMouseClicked

    private void jb_aceptarEliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_aceptarEliminarClienteMouseClicked
        int condicion = -1;
        if (jtf_rtnClienteEliminar.getText() == null) {
            JOptionPane.showMessageDialog(this, "Ingrese el RTN del cliente que desea eliminar");
        } else {
            condicion = db.procedimientoEliminarCliente(jtf_rtnClienteEliminar.getText());
            if (condicion == 1) {
                JOptionPane.showMessageDialog(this, "La operación se ha realizo exitosamente");
            } else if (condicion == 2) {
                JOptionPane.showMessageDialog(this, "El RTN del cliente no existe");
            }
        }
        jtf_rtnClienteEliminar.setText("");
        try {
            db.cargarCBCliente(jcb_rtnEliminarCliente);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_aceptarEliminarClienteMouseClicked

    private void jb_clienteMenuTablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_clienteMenuTablas1MouseClicked
        try {
            db.cargarCBCliente(jcb_rtnEliminarCliente);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaEliminarCliente.pack();
        jd_ventanaEliminarCliente.setModal(true);
        jd_ventanaEliminarCliente.setLocationRelativeTo(this);
        jd_ventanaEliminarCliente.setVisible(true);
        jd_eliminarTablas.setVisible(false);
    }//GEN-LAST:event_jb_clienteMenuTablas1MouseClicked

    private void jb_companiaMenuTablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_companiaMenuTablas1MouseClicked
        try {
            db.cargarCBCompania(jcb_idEliminarCompania);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaEliminarCompania.pack();
        jd_ventanaEliminarCompania.setModal(true);
        jd_ventanaEliminarCompania.setLocationRelativeTo(this);
        jd_ventanaEliminarCompania.setVisible(true);
        jd_eliminarTablas.setVisible(false);
    }//GEN-LAST:event_jb_companiaMenuTablas1MouseClicked

    private void jb_concesionarioMenuTablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_concesionarioMenuTablas1MouseClicked
        try {
            db.cargarCBConcesionario(jcb_rtnEliminarConcesionario);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaEliminarConcesionario.pack();
        jd_ventanaEliminarConcesionario.setModal(true);
        jd_ventanaEliminarConcesionario.setLocationRelativeTo(this);
        jd_ventanaEliminarConcesionario.setVisible(true);
        jd_eliminarTablas.setVisible(false);
    }//GEN-LAST:event_jb_concesionarioMenuTablas1MouseClicked

    private void jb_plantaMenuTablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_plantaMenuTablas1MouseClicked
        try {
            db.cargarCBPlanta(jcb_idEliminarPlanta);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaEliminarPlanta.pack();
        jd_ventanaEliminarPlanta.setModal(true);
        jd_ventanaEliminarPlanta.setLocationRelativeTo(this);
        jd_ventanaEliminarPlanta.setVisible(true);
        jd_eliminarTablas.setVisible(false);
    }//GEN-LAST:event_jb_plantaMenuTablas1MouseClicked

    private void jb_vehiculoMenuTablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_vehiculoMenuTablas1MouseClicked
        try {
            db.cargarCBVin(jcb_vinEliminarVehiculo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaEliminarVehiculo.pack();
        jd_ventanaEliminarVehiculo.setModal(true);
        jd_ventanaEliminarVehiculo.setLocationRelativeTo(this);
        jd_ventanaEliminarVehiculo.setVisible(true);
        jd_eliminarTablas.setVisible(false);
    }//GEN-LAST:event_jb_vehiculoMenuTablas1MouseClicked

    private void jb_proveedorMenuTablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_proveedorMenuTablas1MouseClicked
        try {
            db.cargarCBProveedor(jcb_idEliminarProveedor);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaEliminarProveedor.pack();
        jd_ventanaEliminarProveedor.setModal(true);
        jd_ventanaEliminarProveedor.setLocationRelativeTo(this);
        jd_ventanaEliminarProveedor.setVisible(true);
        jd_eliminarTablas.setVisible(false);
    }//GEN-LAST:event_jb_proveedorMenuTablas1MouseClicked

    private void jb_salirMenuTablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMenuTablas1MouseClicked
        jd_eliminarTablas.setVisible(false);
    }//GEN-LAST:event_jb_salirMenuTablas1MouseClicked

    private void jb_eliminarMenuMantemientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarMenuMantemientoMouseClicked
        jd_eliminarTablas.pack();
        jd_eliminarTablas.setModal(true);
        jd_eliminarTablas.setLocationRelativeTo(this);
        jd_eliminarTablas.setVisible(true);
        jd_ventanaMenuTabla.setVisible(false);
    }//GEN-LAST:event_jb_eliminarMenuMantemientoMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        jd_ventanaEliminarCompania.setVisible(false);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jb_aceptarEliminarCompaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_aceptarEliminarCompaniaMouseClicked
        int condicion = -1;
        if (jtf_idEliminarCompania.getText() == null) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID de la compañía que desea eliminar");
        } else {
            condicion = db.procedimientoEliminarCompania(jtf_idEliminarCompania.getText());
            if (condicion == 1) {
                JOptionPane.showMessageDialog(this, "La operación se ha realizo exitosamente");
            } else if (condicion == 2) {
                JOptionPane.showMessageDialog(this, "El ID de la compañía no existe");
            }
        }
        jtf_idEliminarCompania.setText("");
        try {
            /*DefaultComboBoxModel modelo = (DefaultComboBoxModel) jcb_idEliminarCompania.getModel();
            jcb_idEliminarCompania.setModel(modelo);*/
            db.cargarCBCompania(jcb_idEliminarCompania);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_aceptarEliminarCompaniaMouseClicked

    private void jb_salirEliminarConcesionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirEliminarConcesionarioMouseClicked
        jd_ventanaEliminarConcesionario.setVisible(false);
    }//GEN-LAST:event_jb_salirEliminarConcesionarioMouseClicked

    private void jb_aceptarEliminarConcesionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_aceptarEliminarConcesionarioMouseClicked
        int condicion = -1;
        if (jtf_rtnEliminarConcesionario.getText() == null) {
            JOptionPane.showMessageDialog(this, "Ingrese el RTN del concesionario que desea eliminar");
        } else {
            condicion = db.procedimientoEliminarConcesionario(jtf_rtnEliminarConcesionario.getText());
            if (condicion == 1) {
                JOptionPane.showMessageDialog(this, "La operación se ha realizo exitosamente");
            } else if (condicion == 2) {
                JOptionPane.showMessageDialog(this, "El RTN del concesionario no existe");
            }
        }
        jtf_rtnEliminarConcesionario.setText("");
        try {
            db.cargarCBConcesionario(jcb_rtnEliminarConcesionario);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_aceptarEliminarConcesionarioMouseClicked

    private void jb_salirEliminarPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirEliminarPlantaMouseClicked
        jd_ventanaEliminarPlanta.setVisible(false);
    }//GEN-LAST:event_jb_salirEliminarPlantaMouseClicked

    private void jb_aceptarEliminarPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_aceptarEliminarPlantaMouseClicked
        int condicion = -1;
        if (jtf_idEliminarPlanta.getText() == null) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID de la planta que desea eliminar");
        } else {
            condicion = db.procedimientoEliminarPlanta(jtf_idEliminarPlanta.getText());
            if (condicion == 1) {
                JOptionPane.showMessageDialog(this, "La operación se ha realizo exitosamente");
            } else if (condicion == 2) {
                JOptionPane.showMessageDialog(this, "El ID de la planta no existe");
            }
        }
        jtf_idEliminarPlanta.setText("");
        try {
            db.cargarCBPlanta(jcb_idCompaniaPlanta);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_aceptarEliminarPlantaMouseClicked

    private void jb_salirEliminarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirEliminarProveedorMouseClicked
        jd_ventanaEliminarProveedor.setVisible(false);
    }//GEN-LAST:event_jb_salirEliminarProveedorMouseClicked

    private void jb_aceptarEliminarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_aceptarEliminarProveedorMouseClicked
        int condicion = -1;
        if (jtf_idEliminarProveedor.getText() == null) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID del proveedor que desea eliminar");
        } else {
            condicion = db.procedimientoEliminarProveedor(jtf_idEliminarProveedor.getText());
            if (condicion == 1) {
                JOptionPane.showMessageDialog(this, "La operación se ha realizo exitosamente");
            } else if (condicion == 2) {
                JOptionPane.showMessageDialog(this, "El ID del proveedor no existe");
            }
        }
        jtf_idEliminarProveedor.setText("");
        try {
            db.cargarCBProveedor(jcb_idEliminarProveedor);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_aceptarEliminarProveedorMouseClicked

    private void jb_aceptarEliminarVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_aceptarEliminarVehiculoMouseClicked
        int condicion = -1;
        if (jtf_vinEliminarVehiculo.getText() == null) {
            JOptionPane.showMessageDialog(this, "Ingrese el VIN del vehículo que desea eliminar");
        } else {
            condicion = db.procedimientoEliminarVehiculo(jtf_vinEliminarVehiculo.getText());
            if (condicion == 1) {
                JOptionPane.showMessageDialog(this, "La operación se ha realizo exitosamente");
            } else if (condicion == 2) {
                JOptionPane.showMessageDialog(this, "El VIN del vehículo no existe");
            }
        }
        jtf_vinEliminarVehiculo.setText("");
        try {
            db.cargarCBVin(jcb_vinEliminarVehiculo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_aceptarEliminarVehiculoMouseClicked

    private void jb_salirEliminarVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirEliminarVehiculoMouseClicked
        jd_ventanaEliminarVehiculo.setVisible(false);
    }//GEN-LAST:event_jb_salirEliminarVehiculoMouseClicked

    private void jb_clienteMenuTablas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_clienteMenuTablas2MouseClicked
        try {
            db.cargarCBCliente(jcb_rtnModificarCliente);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaModificarCliente.pack();
        jd_ventanaModificarCliente.setModal(true);
        jd_ventanaModificarCliente.setLocationRelativeTo(this);
        jd_ventanaModificarCliente.setVisible(true);
        jd_modificarTablas.setVisible(false);
    }//GEN-LAST:event_jb_clienteMenuTablas2MouseClicked

    private void jb_companiaMenuTablas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_companiaMenuTablas2MouseClicked
        try {
            db.cargarCBCompania(jcb_idModificarCompania);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaModificarCompania.pack();
        jd_ventanaModificarCompania.setModal(true);
        jd_ventanaModificarCompania.setLocationRelativeTo(this);
        jd_ventanaModificarCompania.setVisible(true);
        jd_modificarTablas.setVisible(false);
    }//GEN-LAST:event_jb_companiaMenuTablas2MouseClicked

    private void jb_concesionarioMenuTablas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_concesionarioMenuTablas2MouseClicked
        try {
            db.cargarCBConcesionario(jcb_rtnConcesionarioModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaModificarConcesionario.pack();
        jd_ventanaModificarConcesionario.setModal(true);
        jd_ventanaModificarConcesionario.setLocationRelativeTo(this);
        jd_ventanaModificarConcesionario.setVisible(true);
        jd_modificarTablas.setVisible(false);
    }//GEN-LAST:event_jb_concesionarioMenuTablas2MouseClicked

    private void jb_plantaMenuTablas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_plantaMenuTablas2MouseClicked
        try {
            db.cargarCBPlanta(jcb_idPlantaModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            db.cargarCBCompania(jcb_idCompaniaPlantaModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaModificarPlanta.pack();
        jd_ventanaModificarPlanta.setModal(true);
        jd_ventanaModificarPlanta.setLocationRelativeTo(this);
        jd_ventanaModificarPlanta.setVisible(true);
        jd_modificarTablas.setVisible(false);
    }//GEN-LAST:event_jb_plantaMenuTablas2MouseClicked

    private void jb_ventaMenuTablas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ventaMenuTablas2MouseClicked
        try {
            db.cargarCBConcesionario(jcb_rtnConcesionarioVentaModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            db.cargarCBCliente(jcb_rtnClienteVentaModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            db.cargarCBVin(jcb_vinVentaModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaModificarVenta.pack();
        jd_ventanaModificarVenta.setModal(true);
        jd_ventanaModificarVenta.setLocationRelativeTo(this);
        jd_ventanaModificarVenta.setVisible(true);
        jd_modificarTablas.setVisible(false);
    }//GEN-LAST:event_jb_ventaMenuTablas2MouseClicked

    private void jb_vehiculoMenuTablas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_vehiculoMenuTablas2MouseClicked
        try {
            db.cargarCBVin(jcb_vinVehiculoModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            db.cargarCBCompania(jcb_idCompaniaVehiculoModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaModificarVehiculo.pack();
        jd_ventanaModificarVehiculo.setModal(true);
        jd_ventanaModificarVehiculo.setLocationRelativeTo(this);
        jd_ventanaModificarVehiculo.setVisible(true);
        jd_modificarTablas.setVisible(false);
    }//GEN-LAST:event_jb_vehiculoMenuTablas2MouseClicked

    private void jb_proveedorMenuTablas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_proveedorMenuTablas2MouseClicked
        try {
            db.cargarCBProveedor(jcb_idProveedorModificar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaModificarProveedor.pack();
        jd_ventanaModificarProveedor.setModal(true);
        jd_ventanaModificarProveedor.setLocationRelativeTo(this);
        jd_ventanaModificarProveedor.setVisible(true);
        jd_modificarTablas.setVisible(false);

    }//GEN-LAST:event_jb_proveedorMenuTablas2MouseClicked

    private void jb_salirMenuTablas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMenuTablas2MouseClicked
        jd_modificarTablas.setVisible(false);
    }//GEN-LAST:event_jb_salirMenuTablas2MouseClicked

    private void jb_guardarClienteModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarClienteModificarMouseClicked
        int esCompaniaCondicion = -1;
        int condicion = -1;
        int telefono = Integer.parseInt(jtf_telefonoClienteModificar.getText());
        String rtnCliente = ((String) jcb_rtnModificarCliente.getSelectedItem());
        if (jcb_companiaClienteModificar.getSelectedIndex() == 0) {//If que valida que al ser una compañía no ingrese datos de persona
            int tipoCompania = Integer.parseInt(jtf_tipoCompaniaClienteModificar.getText());
            esCompaniaCondicion = 1;
            condicion = db.procedimientoActualizarCliente(rtnCliente, jtf_nombreClienteModificar.getText(), telefono, jtf_direccionClienteModificar.getText(),
                    esCompaniaCondicion, "NULL", "X", 0, tipoCompania);
        } else if (jcb_companiaClienteModificar.getSelectedIndex() == 1) {
            esCompaniaCondicion = 0;
            String sexo;
            if (jcb_sexoClienteModificar.getSelectedIndex() == 0) {
                sexo = "F";
            } else {
                sexo = "M";
            }
            condicion = db.procedimientoActualizarCliente(rtnCliente, jtf_nombreClienteModificar.getText(), telefono, jtf_direccionClienteModificar.getText(),
                    esCompaniaCondicion, jtf_identidadClienteModificar.getText(), sexo, Integer.parseInt(jtf_ingresoClienteModificar.getText()), 0);
            
        }
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "Se ha realizado la operación exitosamente");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El RTN no existe");
        }
        jtf_nombreClienteModificar.setText("");
        jtf_telefonoClienteModificar.setText("");
        jtf_identidadClienteModificar.setText("");
        jtf_ingresoClienteModificar.setText("");
        jtf_tipoCompaniaClienteModificar.setText("");
    }//GEN-LAST:event_jb_guardarClienteModificarMouseClicked

    private void jb_salirClienteModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirClienteModificarMouseClicked
        jd_ventanaModificarCliente.setVisible(false);
    }//GEN-LAST:event_jb_salirClienteModificarMouseClicked

    private void jb_guardarCompaniaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarCompaniaModificarMouseClicked
        int condicion = -1;
        String idCompania = ((String) jcb_idModificarCompania.getSelectedItem());
        condicion = db.procedimientoActualizarCompania(idCompania, jtf_marcaModificarCompania.getText(), jtf_nombreModificarCompania.getText());
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "La compañía se ha modificado exitosamente");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El ID de la compañía no existe");
        }
        jtf_marcaModificarCompania.setText("");
        jtf_nombreModificarCompania.setText("");
    }//GEN-LAST:event_jb_guardarCompaniaModificarMouseClicked

    private void jb_salirCompaniaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirCompaniaModificarMouseClicked
        jd_ventanaModificarCompania.setVisible(false);
    }//GEN-LAST:event_jb_salirCompaniaModificarMouseClicked

    private void jb_guardarConcesionarioModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarConcesionarioModificarMouseClicked
        int condicion = -1;
        String rtnConcesionario = ((String) jcb_rtnConcesionarioModificar.getSelectedItem());
        condicion = db.procedimientoActualizarConcesionario(rtnConcesionario, jtf_nombreConcesionarioModificar.getText(), jtf_ubicacionConcesionarioModificar.getText());
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "El concesionario se ha modificado exitosamente");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El RTN del concesionario no existe");
        }
        jtf_nombreConcesionarioModificar.setText("");
        jtf_ubicacionConcesionarioModificar.setText("");
    }//GEN-LAST:event_jb_guardarConcesionarioModificarMouseClicked

    private void jb_salirConcesionarioModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirConcesionarioModificarMouseClicked
        jd_ventanaModificarConcesionario.setVisible(false);
    }//GEN-LAST:event_jb_salirConcesionarioModificarMouseClicked

    private void jb_guardarPlantaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarPlantaModificarMouseClicked
        int condicion = -1;
        String idCompania = ((String) jcb_idCompaniaPlantaModificar.getSelectedItem());
        String idPlanta = ((String) jcb_idPlantaModificar.getSelectedItem());
        condicion = db.procedimientoActualizarPlanta(idPlanta, jtf_nombrePlantaModificar.getText(), jtf_tipoPlantaModificar.getText(), idCompania);
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "La planta se ha modificado exitosamente");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El ID de la planta no existe");
        }
        jtf_nombrePlantaModificar.setText("");
        jtf_tipoPlantaModificar.setText("");
    }//GEN-LAST:event_jb_guardarPlantaModificarMouseClicked

    private void jb_salirModificarPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirModificarPlantaMouseClicked
        jd_ventanaModificarPlanta.setVisible(false);
    }//GEN-LAST:event_jb_salirModificarPlantaMouseClicked

    private void jb_guardarProveedorModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarProveedorModificarMouseClicked
        int condicion = -1;
        String idProveedor = ((String) jcb_idProveedorModificar.getSelectedItem());
        condicion = db.procedimientoActualizarProveedor(idProveedor, jtf_nombreProveedorModificar.getText(), jtf_piezaProveedorModificar.getText());
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "El proveedor se ha modificado exitosamente");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El ID del proveedor no existe");
        }
        jtf_nombreProveedorModificar.setText("");
        jtf_piezaProveedorModificar.setText("");
    }//GEN-LAST:event_jb_guardarProveedorModificarMouseClicked

    private void jb_salirProveedorModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirProveedorModificarMouseClicked
        jd_ventanaModificarProveedor.setVisible(false);
    }//GEN-LAST:event_jb_salirProveedorModificarMouseClicked

    private void jb_guardarVehiculoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarVehiculoModificarMouseClicked
        int condicion = -1;
        float precio = Float.parseFloat(jtf_precioVehiculoModificar.getText());
        String idCompania = ((String) jcb_idCompaniaVehiculoModificar.getSelectedItem());
        String vinModificar = ((String) jcb_vinVehiculoModificar.getSelectedItem());
        java.util.Date utilDate = jdc_fechaVehiculoModificar.getDate();
        java.sql.Date sDate = convertUtilToSql(utilDate);
        condicion = db.procedimientoActualizarVehiculo(vinModificar, jtf_modeloVehiculoModificar.getText(), jtf_carroceriaVehiculoModificar.getText(), jtf_motorVehiculoModificar.getText(), jtf_colorVehiculoModificar.getText(),
                jtf_transmicionVehiculoModificar.getText(), sDate, precio, idCompania);
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "El vehículo se ha modificado exitosamente");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El VIN del vehículo no existe");
        }
        jtf_modeloVehiculoModificar.setText("");
        jtf_carroceriaVehiculoModificar.setText("");
        jtf_motorVehiculoModificar.setText("");
        jtf_colorVehiculoModificar.setText("");
        jtf_transmicionVehiculoModificar.setText("");
        jtf_precioVehiculoModificar.setText("");
    }//GEN-LAST:event_jb_guardarVehiculoModificarMouseClicked

    private void jb_salirVehiculoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirVehiculoModificarMouseClicked
        jd_ventanaModificarVehiculo.setVisible(false);
    }//GEN-LAST:event_jb_salirVehiculoModificarMouseClicked

    private void jb_guardarVentaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarVentaModificarMouseClicked
        int condicion = -1;
        float precio = Float.parseFloat(jtf_precioVentaModificar.getText());
        String rtnConcesionario = ((String) jcb_rtnConcesionarioVentaModificar.getSelectedItem());
        String rtnCliente = ((String) jcb_rtnClienteVentaModificar.getSelectedItem());
        String vinVenta = ((String) jcb_vinVentaModificar.getSelectedItem());
        java.util.Date utilDate = jdc_fechaVentaModificar.getDate();
        java.sql.Date sDate = convertUtilToSql(utilDate);
        condicion = db.procedimientoActualizarVenta(rtnConcesionario, rtnCliente, vinVenta, precio, sDate);
        if (condicion == 1) {
            JOptionPane.showMessageDialog(this, "La venta ha sido modificada exitosamente");
        } else if (condicion == 2) {
            JOptionPane.showMessageDialog(this, "El RTN del concesionario, o el RTN de la compañía o el VIN del vehículo no existe");
        }
        jtf_precioVentaModificar.setText("");
    }//GEN-LAST:event_jb_guardarVentaModificarMouseClicked

    private void jb_salirVentaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirVentaModificarMouseClicked
        jd_ventanaModificarVenta.setVisible(false);
    }//GEN-LAST:event_jb_salirVentaModificarMouseClicked

    private void jb_bitacoraMenuOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_bitacoraMenuOpcionesMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[6];
            ResultSet rs = db.getTabla("SELECT * FROM tblBitacora ORDER BY fecha DESC, hora DESC LIMIT 20");
            modelo.setColumnIdentifiers(new Object[]{"IP", "Evento", "Tabla", "Llave primaria", "Fecha", "Hora"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                
                modelo.addRow(registros);
            }
            jt_tablaBitacora.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_bitacora.pack();
        jd_bitacora.setModal(true);
        jd_bitacora.setLocationRelativeTo(this);
        jd_bitacora.setVisible(true);
        jd_ventanaAdmin.setVisible(false);
    }//GEN-LAST:event_jb_bitacoraMenuOpcionesMouseClicked

    private void jb_salirBitacoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirBitacoraMouseClicked
        jd_bitacora.setVisible(false);
        jd_ventanaAdmin.setVisible(true);
    }//GEN-LAST:event_jb_salirBitacoraMouseClicked

    private void jb_reportesMenuOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_reportesMenuOpcionesMouseClicked
        jd_menuReportes.pack();
        jd_menuReportes.setModal(true);
        jd_menuReportes.setLocationRelativeTo(this);
        jd_menuReportes.setVisible(true);
        //jd_ventanaAdmin.setVisible(false);
    }//GEN-LAST:event_jb_reportesMenuOpcionesMouseClicked

    private void jb_tendenciasReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_tendenciasReporteMouseClicked
        jd_tendenciasReporteMenu.pack();
        jd_tendenciasReporteMenu.setModal(true);
        jd_tendenciasReporteMenu.setLocationRelativeTo(this);
        jd_tendenciasReporteMenu.setVisible(true);
        //jd_menuReportes.setVisible(false);
    }//GEN-LAST:event_jb_tendenciasReporteMouseClicked

    private void jb_tendenciaAnioReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_tendenciaAnioReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[4];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM tendenciaporMes;");
            modelo.setColumnIdentifiers(new Object[]{"Año", "Marca", "Precio", "Cantidad de autos vendidos"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                modelo.addRow(registros);
            }
            jt_tendenciasReporte.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jb_tendenciaAnioReporteMouseClicked

    private void jb_salirTendenciaReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirTendenciaReporteMouseClicked
        jd_tendenciasReporteMenu.setVisible(false);
        jd_menuReportes.setVisible(true);
    }//GEN-LAST:event_jb_salirTendenciaReporteMouseClicked

    private void jb_tendenciaMesReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_tendenciaMesReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[4];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM tendenciaporMes;");
            modelo.setColumnIdentifiers(new Object[]{"Mes", "Marca", "Precio", "Cantidad de autos vendidos"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                modelo.addRow(registros);
            }
            jt_tendenciasReporte.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_tendenciaMesReporteMouseClicked

    private void jb_tendenciaSemanaReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_tendenciaSemanaReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[5];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM tendenciaporSemana;");
            modelo.setColumnIdentifiers(new Object[]{"Año", "Semana", "Marca", "Precio", "Cantidad de autos vendidos"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                modelo.addRow(registros);
            }
            jt_tendenciasReporte.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_tendenciaSemanaReporteMouseClicked

    private void jb_tendenciaGeneroReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_tendenciaGeneroReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[4];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM tendenciaporGenero;");
            modelo.setColumnIdentifiers(new Object[]{"Sexo", "Marca", "Precio", "Cantidad de autos vendidos"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(3);
                modelo.addRow(registros);
            }
            jt_tendenciasReporte.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_tendenciaGeneroReporteMouseClicked

    private void jb_rangoTendenciaReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_rangoTendenciaReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[3];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM tendenciaporRangoIngreso;");
            modelo.setColumnIdentifiers(new Object[]{"Marca", "Ingreso", "Cantidad de autos vendidos"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                modelo.addRow(registros);
            }
            jt_tendenciasReporte.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_rangoTendenciaReporteMouseClicked

    private void jb_marcasReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_marcasReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[2];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM topdosmarcasprecio;");
            modelo.setColumnIdentifiers(new Object[]{"Marca", "Ventas"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                modelo.addRow(registros);
            }
            jt_mejoresMarcasReportes.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_mejoresMarcasReporte.pack();
        jd_mejoresMarcasReporte.setModal(true);
        jd_mejoresMarcasReporte.setLocationRelativeTo(this);
        jd_mejoresMarcasReporte.setVisible(true);
        //jd_menuReportes.setVisible(false);
    }//GEN-LAST:event_jb_marcasReporteMouseClicked

    private void jb_salirMejoresMarcasReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMejoresMarcasReportesMouseClicked
        jd_mejoresMarcasReporte.setVisible(false);
        jd_menuReportes.setVisible(true);
    }//GEN-LAST:event_jb_salirMejoresMarcasReportesMouseClicked

    private void jb_salirReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirReporteMouseClicked
        jd_menuReportes.setVisible(false);
        jd_ventanaAdmin.setVisible(true);
    }//GEN-LAST:event_jb_salirReporteMouseClicked

    private void jb_mejoresMarcasReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_mejoresMarcasReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[2];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM topdosmarcasunidad;");
            modelo.setColumnIdentifiers(new Object[]{"Marca", "Ventas"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                modelo.addRow(registros);
            }
            jt_mejoresMarcasUnidadReporte.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_mejoresMarcasUnidadReporte.pack();
        jd_mejoresMarcasUnidadReporte.setModal(true);
        jd_mejoresMarcasUnidadReporte.setLocationRelativeTo(this);
        jd_mejoresMarcasUnidadReporte.setVisible(true);
        //jd_menuReportes.setVisible(false);
    }//GEN-LAST:event_jb_mejoresMarcasReporteMouseClicked

    private void jb_salirMejoresMarcasUnidadReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMejoresMarcasUnidadReporteMouseClicked
        jd_mejoresMarcasUnidadReporte.setVisible(false);
    }//GEN-LAST:event_jb_salirMejoresMarcasUnidadReporteMouseClicked

    private void jb_ventaReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ventaReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[2];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM mesesconvertible;");
            modelo.setColumnIdentifiers(new Object[]{"Mes", "Cantidad"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                modelo.addRow(registros);
            }
            jt_ventaConvertibleReporte.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventaConvertibleReporte.pack();
        jd_ventaConvertibleReporte.setModal(true);
        jd_ventaConvertibleReporte.setLocationRelativeTo(this);
        jd_ventaConvertibleReporte.setVisible(true);
    }//GEN-LAST:event_jb_ventaReporteMouseClicked

    private void jb_salirVentaConvertibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirVentaConvertibleMouseClicked
        jd_ventaConvertibleReporte.setVisible(false);
    }//GEN-LAST:event_jb_salirVentaConvertibleMouseClicked

    private void jb_distribuidoresReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_distribuidoresReporteMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[2];
            ResultSet rs = db.getTabla("SELECT *\n"
                    + "FROM vehiculoeninventario;");
            modelo.setColumnIdentifiers(new Object[]{"Nombre del concesionario", "Fecha de Ensamble"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                modelo.addRow(registros);
            }
            jt_distribuidoresReporte.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_distribuidoresReporte.pack();
        jd_distribuidoresReporte.setModal(true);
        jd_distribuidoresReporte.setLocationRelativeTo(this);
        jd_distribuidoresReporte.setVisible(true);
    }//GEN-LAST:event_jb_distribuidoresReporteMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jd_distribuidoresReporte.setVisible(false);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jb_salirDefectuosoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirDefectuosoMouseClicked
        jd_defectuosaReporte.setVisible(false);
    }//GEN-LAST:event_jb_salirDefectuosoMouseClicked

    private void jb_transmicionReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_transmicionReporteMouseClicked
        try {
            db.cargarCBProveedor(jcb_idProveedorReporte);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_defectuosaReporte.pack();
        jd_defectuosaReporte.setModal(true);
        jd_defectuosaReporte.setLocationRelativeTo(this);
        jd_defectuosaReporte.setVisible(true);
    }//GEN-LAST:event_jb_transmicionReporteMouseClicked

    private void jb_aceptarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_aceptarReporteMouseClicked
        String idProveedor = ((String) jcb_idProveedorReporte.getSelectedItem());
        java.util.Date utilDate = jdc_fechaInicioReporte.getDate();
        java.sql.Date sInicioDate = convertUtilToSql(utilDate);
        java.util.Date utilDate2 = jdc_fechaFinalReporte.getDate();
        java.sql.Date sFinalDate = convertUtilToSql(utilDate2);
        db.defectuoso(idProveedor, sInicioDate, sFinalDate, jt_defectuosoReporte);
    }//GEN-LAST:event_jb_aceptarReporteMouseClicked

    private void jb_distribuidoresMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_distribuidoresMenuPrincipalMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[2];
            ResultSet rs = db.getTabla("SELECT nombreConc, ubicacionConc FROM tblConcesionario;");
            modelo.setColumnIdentifiers(new Object[]{"Nombre del concesionario", "Ubicación"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                modelo.addRow(registros);
            }
            jt_distribuidoresCliente.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaDistribuidoresUsuario.pack();
        jd_ventanaDistribuidoresUsuario.setModal(true);
        jd_ventanaDistribuidoresUsuario.setLocationRelativeTo(this);
        jd_ventanaDistribuidoresUsuario.setVisible(true);
    }//GEN-LAST:event_jb_distribuidoresMenuPrincipalMouseClicked

    private void jb_salirDistribuidoresClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirDistribuidoresClienteMouseClicked
        jd_ventanaDistribuidoresUsuario.setVisible(false);
    }//GEN-LAST:event_jb_salirDistribuidoresClienteMouseClicked

    private void jb_productosMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_productosMenuPrincipalMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[7];
            ResultSet rs = db.getTabla("SELECT modeloVehi, tipoCarroceriaVehi, tipoMotorVehi, colorVehi, transmisionVehi, fechaEnsambleVehi, precioVehi FROM tblVehiculo;");
            modelo.setColumnIdentifiers(new Object[]{"Modelo del vehículo", "Tipo de carrocería", "Tipo de motor", "Color", "Transmisión", "Fecha de ensamble", "Precio"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                modelo.addRow(registros);
            }
            jt_vehiculosCliente.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_ventanaProductosUsuario.pack();
        jd_ventanaProductosUsuario.setModal(true);
        jd_ventanaProductosUsuario.setLocationRelativeTo(this);
        jd_ventanaProductosUsuario.setVisible(true);
    }//GEN-LAST:event_jb_productosMenuPrincipalMouseClicked

    private void jb_salirVehiculosClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirVehiculosClienteMouseClicked
        jd_ventanaProductosUsuario.setVisible(false);
    }//GEN-LAST:event_jb_salirVehiculosClienteMouseClicked

    private void jb_preciosMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_preciosMenuPrincipalMouseClicked
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String[] registros = new String[2];
            ResultSet rs = db.getTabla("SELECT modeloVehi, precioVehi FROM tblVehiculo;");
            modelo.setColumnIdentifiers(new Object[]{"Modelo del vehículo", "Precio"});
            while (rs.next()) {
                //se añaden los resultados a la tabla
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                modelo.addRow(registros);
            }
            jt_precioCliente.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jd_precioCliente.pack();
        jd_precioCliente.setModal(true);
        jd_precioCliente.setLocationRelativeTo(this);
        jd_precioCliente.setVisible(true);
    }//GEN-LAST:event_jb_preciosMenuPrincipalMouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        jd_precioCliente.setVisible(false);     
    }//GEN-LAST:event_jButton10MouseClicked
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jb_aceptarEliminarCliente;
    private javax.swing.JButton jb_aceptarEliminarCompania;
    private javax.swing.JButton jb_aceptarEliminarConcesionario;
    private javax.swing.JButton jb_aceptarEliminarPlanta;
    private javax.swing.JButton jb_aceptarEliminarProveedor;
    private javax.swing.JButton jb_aceptarEliminarVehiculo;
    private javax.swing.JButton jb_aceptarReporte;
    private javax.swing.JButton jb_bitacoraMenuOpciones;
    private javax.swing.JButton jb_clienteMenuTablas;
    private javax.swing.JButton jb_clienteMenuTablas1;
    private javax.swing.JButton jb_clienteMenuTablas2;
    private javax.swing.JButton jb_companiaMenuTablas;
    private javax.swing.JButton jb_companiaMenuTablas1;
    private javax.swing.JButton jb_companiaMenuTablas2;
    private javax.swing.JButton jb_concesionarioMenuTablas;
    private javax.swing.JButton jb_concesionarioMenuTablas1;
    private javax.swing.JButton jb_concesionarioMenuTablas2;
    private javax.swing.JButton jb_crearMenuMantenimiento;
    private javax.swing.JButton jb_distribuidoresMenuPrincipal;
    private javax.swing.JButton jb_distribuidoresReporte;
    private javax.swing.JButton jb_eliminarMenuMantemiento;
    private javax.swing.JButton jb_guardarClienteModificar;
    private javax.swing.JButton jb_guardarCompania;
    private javax.swing.JButton jb_guardarCompaniaModificar;
    private javax.swing.JButton jb_guardarConcesionario;
    private javax.swing.JButton jb_guardarConcesionarioModificar;
    private javax.swing.JButton jb_guardarPlantaModificar;
    private javax.swing.JButton jb_guardarProveedor;
    private javax.swing.JButton jb_guardarProveedorModificar;
    private javax.swing.JButton jb_guardarTablaCliente;
    private javax.swing.JButton jb_guardarVehiculo;
    private javax.swing.JButton jb_guardarVehiculoModificar;
    private javax.swing.JButton jb_guardarVenta;
    private javax.swing.JButton jb_guardarVentaModificar;
    private javax.swing.JLabel jb_imagenCarroMenuPrincipal;
    private javax.swing.JButton jb_ingresarMenuPrincipal;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_mantenimientoMenuOpciones;
    private javax.swing.JButton jb_marcasReporte;
    private javax.swing.JButton jb_mejoresMarcasReporte;
    private javax.swing.JButton jb_modificarMenuMantenimiento;
    private javax.swing.JButton jb_plantaMenuTablas;
    private javax.swing.JButton jb_plantaMenuTablas1;
    private javax.swing.JButton jb_plantaMenuTablas2;
    private javax.swing.JButton jb_preciosMenuPrincipal;
    private javax.swing.JButton jb_productosMenuPrincipal;
    private javax.swing.JButton jb_proveedorMenuTablas;
    private javax.swing.JButton jb_proveedorMenuTablas1;
    private javax.swing.JButton jb_proveedorMenuTablas2;
    private javax.swing.JButton jb_rangoTendenciaReporte;
    private javax.swing.JButton jb_reportesMenuOpciones;
    private javax.swing.JButton jb_salirBitacora;
    private javax.swing.JButton jb_salirClienteModificar;
    private javax.swing.JButton jb_salirCompania;
    private javax.swing.JButton jb_salirCompaniaModificar;
    private javax.swing.JButton jb_salirConcesionarioModificar;
    private javax.swing.JButton jb_salirDefectuoso;
    private javax.swing.JButton jb_salirDistribuidoresCliente;
    private javax.swing.JButton jb_salirEliminarCliente;
    private javax.swing.JButton jb_salirEliminarConcesionario;
    private javax.swing.JButton jb_salirEliminarPlanta;
    private javax.swing.JButton jb_salirEliminarProveedor;
    private javax.swing.JButton jb_salirEliminarVehiculo;
    private javax.swing.JButton jb_salirLogin;
    private javax.swing.JButton jb_salirMejoresMarcasReportes;
    private javax.swing.JButton jb_salirMejoresMarcasUnidadReporte;
    private javax.swing.JButton jb_salirMenuMantenimiento;
    private javax.swing.JButton jb_salirMenuOpciones;
    private javax.swing.JButton jb_salirMenuTablas;
    private javax.swing.JButton jb_salirMenuTablas1;
    private javax.swing.JButton jb_salirMenuTablas2;
    private javax.swing.JButton jb_salirModificarPlanta;
    private javax.swing.JButton jb_salirProveedor;
    private javax.swing.JButton jb_salirProveedorModificar;
    private javax.swing.JButton jb_salirReporte;
    private javax.swing.JButton jb_salirTendenciaReporte;
    private javax.swing.JButton jb_salirVehiculo;
    private javax.swing.JButton jb_salirVehiculoModificar;
    private javax.swing.JButton jb_salirVehiculosCliente;
    private javax.swing.JButton jb_salirVenta;
    private javax.swing.JButton jb_salirVentaConvertible;
    private javax.swing.JButton jb_salirVentaModificar;
    private javax.swing.JButton jb_tendenciaAnioReporte;
    private javax.swing.JButton jb_tendenciaGeneroReporte;
    private javax.swing.JButton jb_tendenciaMesReporte;
    private javax.swing.JButton jb_tendenciaSemanaReporte;
    private javax.swing.JButton jb_tendenciasReporte;
    private javax.swing.JButton jb_transmicionReporte;
    private javax.swing.JButton jb_vehiculoMenuTablas;
    private javax.swing.JButton jb_vehiculoMenuTablas1;
    private javax.swing.JButton jb_vehiculoMenuTablas2;
    private javax.swing.JButton jb_ventaMenuTablas;
    private javax.swing.JButton jb_ventaMenuTablas2;
    private javax.swing.JButton jb_ventaReporte;
    private javax.swing.JComboBox<String> jcb_companiaCliente;
    private javax.swing.JComboBox<String> jcb_companiaClienteModificar;
    private javax.swing.JComboBox<String> jcb_idCompaniaPlanta;
    private javax.swing.JComboBox<String> jcb_idCompaniaPlantaModificar;
    private javax.swing.JComboBox<String> jcb_idCompaniaVehiculo;
    private javax.swing.JComboBox<String> jcb_idCompaniaVehiculoModificar;
    private javax.swing.JComboBox<String> jcb_idEliminarCompania;
    private javax.swing.JComboBox<String> jcb_idEliminarPlanta;
    private javax.swing.JComboBox<String> jcb_idEliminarProveedor;
    private javax.swing.JComboBox<String> jcb_idModificarCompania;
    private javax.swing.JComboBox<String> jcb_idPlantaModificar;
    private javax.swing.JComboBox<String> jcb_idProveedorModificar;
    private javax.swing.JComboBox<String> jcb_idProveedorReporte;
    private javax.swing.JComboBox<String> jcb_rtnClienteVenta;
    private javax.swing.JComboBox<String> jcb_rtnClienteVentaModificar;
    private javax.swing.JComboBox<String> jcb_rtnConcesionarioModificar;
    private javax.swing.JComboBox<String> jcb_rtnConcesionarioVenta;
    private javax.swing.JComboBox<String> jcb_rtnConcesionarioVentaModificar;
    private javax.swing.JComboBox<String> jcb_rtnEliminarCliente;
    private javax.swing.JComboBox<String> jcb_rtnEliminarConcesionario;
    private javax.swing.JComboBox<String> jcb_rtnModificarCliente;
    private javax.swing.JComboBox<String> jcb_sexoCliente;
    private javax.swing.JComboBox<String> jcb_sexoClienteModificar;
    private javax.swing.JComboBox<String> jcb_vinEliminarVehiculo;
    private javax.swing.JComboBox<String> jcb_vinVehiculoModificar;
    private javax.swing.JComboBox<String> jcb_vinVenta;
    private javax.swing.JComboBox<String> jcb_vinVentaModificar;
    private javax.swing.JDialog jd_bitacora;
    private javax.swing.JDialog jd_defectuosaReporte;
    private javax.swing.JDialog jd_distribuidoresReporte;
    private javax.swing.JDialog jd_eliminarTablas;
    private javax.swing.JDialog jd_mejoresMarcasReporte;
    private javax.swing.JDialog jd_mejoresMarcasUnidadReporte;
    private javax.swing.JDialog jd_menuReportes;
    private javax.swing.JDialog jd_modificarTablas;
    private javax.swing.JDialog jd_precioCliente;
    private javax.swing.JDialog jd_tendenciasReporteMenu;
    private javax.swing.JDialog jd_ventaConvertibleReporte;
    private javax.swing.JDialog jd_ventanaAdmin;
    private javax.swing.JDialog jd_ventanaCliente;
    private javax.swing.JDialog jd_ventanaCompania;
    private javax.swing.JDialog jd_ventanaConcesionario;
    private javax.swing.JDialog jd_ventanaDistribuidoresUsuario;
    private javax.swing.JDialog jd_ventanaEliminarCliente;
    private javax.swing.JDialog jd_ventanaEliminarCompania;
    private javax.swing.JDialog jd_ventanaEliminarConcesionario;
    private javax.swing.JDialog jd_ventanaEliminarPlanta;
    private javax.swing.JDialog jd_ventanaEliminarProveedor;
    private javax.swing.JDialog jd_ventanaEliminarVehiculo;
    private javax.swing.JDialog jd_ventanaLogin;
    private javax.swing.JDialog jd_ventanaMenuMantenimiento;
    private javax.swing.JDialog jd_ventanaMenuTabla;
    private javax.swing.JDialog jd_ventanaModificarCliente;
    private javax.swing.JDialog jd_ventanaModificarCompania;
    private javax.swing.JDialog jd_ventanaModificarConcesionario;
    private javax.swing.JDialog jd_ventanaModificarPlanta;
    private javax.swing.JDialog jd_ventanaModificarProveedor;
    private javax.swing.JDialog jd_ventanaModificarVehiculo;
    private javax.swing.JDialog jd_ventanaModificarVenta;
    private javax.swing.JDialog jd_ventanaPlanta;
    private javax.swing.JDialog jd_ventanaProductosUsuario;
    private javax.swing.JDialog jd_ventanaProveedor;
    private javax.swing.JDialog jd_ventanaVehiculo;
    private javax.swing.JDialog jd_ventanaVenta;
    private com.toedter.calendar.JDateChooser jdc_fechaFinalReporte;
    private com.toedter.calendar.JDateChooser jdc_fechaInicioReporte;
    private com.toedter.calendar.JDateChooser jdc_fechaVehiculo;
    private com.toedter.calendar.JDateChooser jdc_fechaVehiculoModificar;
    private com.toedter.calendar.JDateChooser jdc_fechaVenta;
    private com.toedter.calendar.JDateChooser jdc_fechaVentaModificar;
    private javax.swing.JTable jt_defectuosoReporte;
    private javax.swing.JTable jt_distribuidoresCliente;
    private javax.swing.JTable jt_distribuidoresReporte;
    private javax.swing.JTable jt_mejoresMarcasReportes;
    private javax.swing.JTable jt_mejoresMarcasUnidadReporte;
    private javax.swing.JTable jt_precioCliente;
    private javax.swing.JTable jt_tablaBitacora;
    private javax.swing.JTable jt_tendenciasReporte;
    private javax.swing.JTable jt_vehiculosCliente;
    private javax.swing.JTable jt_ventaConvertibleReporte;
    private javax.swing.JTextField jtf_carroceriaVehiculo;
    private javax.swing.JTextField jtf_carroceriaVehiculoModificar;
    private javax.swing.JTextField jtf_colorVehiculo;
    private javax.swing.JTextField jtf_colorVehiculoModificar;
    private javax.swing.JPasswordField jtf_contrasenaUsuario;
    private javax.swing.JTextField jtf_direccionCliente;
    private javax.swing.JTextField jtf_direccionClienteModificar;
    private javax.swing.JTextField jtf_idCompania;
    private javax.swing.JTextField jtf_idEliminarCompania;
    private javax.swing.JTextField jtf_idEliminarPlanta;
    private javax.swing.JTextField jtf_idEliminarProveedor;
    private javax.swing.JTextField jtf_idPlanta;
    private javax.swing.JTextField jtf_idProveedor;
    private javax.swing.JTextField jtf_identidadCliente;
    private javax.swing.JTextField jtf_identidadClienteModificar;
    private javax.swing.JTextField jtf_ingresoCliente;
    private javax.swing.JTextField jtf_ingresoClienteModificar;
    private javax.swing.JTextField jtf_marcaCompania;
    private javax.swing.JTextField jtf_marcaModificarCompania;
    private javax.swing.JTextField jtf_modeloVehiculo;
    private javax.swing.JTextField jtf_modeloVehiculoModificar;
    private javax.swing.JTextField jtf_motorVehiculo;
    private javax.swing.JTextField jtf_motorVehiculoModificar;
    private javax.swing.JTextField jtf_nombreCliente;
    private javax.swing.JTextField jtf_nombreClienteModificar;
    private javax.swing.JTextField jtf_nombreCompania;
    private javax.swing.JTextField jtf_nombreConcesionario;
    private javax.swing.JTextField jtf_nombreConcesionarioModificar;
    private javax.swing.JTextField jtf_nombreModificarCompania;
    private javax.swing.JTextField jtf_nombrePlanta;
    private javax.swing.JTextField jtf_nombrePlantaModificar;
    private javax.swing.JTextField jtf_nombreProveedor;
    private javax.swing.JTextField jtf_nombreProveedorModificar;
    private javax.swing.JTextField jtf_nombreUsuario;
    private javax.swing.JTextField jtf_piezaProveedor;
    private javax.swing.JTextField jtf_piezaProveedorModificar;
    private javax.swing.JTextField jtf_precioVehiculo;
    private javax.swing.JTextField jtf_precioVehiculoModificar;
    private javax.swing.JTextField jtf_precioVenta;
    private javax.swing.JTextField jtf_precioVentaModificar;
    private javax.swing.JTextField jtf_rtnCliente;
    private javax.swing.JTextField jtf_rtnClienteEliminar;
    private javax.swing.JTextField jtf_rtnConcesionario;
    private javax.swing.JTextField jtf_rtnEliminarConcesionario;
    private javax.swing.JTextField jtf_telefonoCliente;
    private javax.swing.JTextField jtf_telefonoClienteModificar;
    private javax.swing.JTextField jtf_tipoCompaniaCliente;
    private javax.swing.JTextField jtf_tipoCompaniaClienteModificar;
    private javax.swing.JTextField jtf_tipoPlanta;
    private javax.swing.JTextField jtf_tipoPlantaModificar;
    private javax.swing.JTextField jtf_transmicionVehiculo;
    private javax.swing.JTextField jtf_transmicionVehiculoModificar;
    private javax.swing.JTextField jtf_ubicacionConcesionario;
    private javax.swing.JTextField jtf_ubicacionConcesionarioModificar;
    private javax.swing.JTextField jtf_vinEliminarVehiculo;
    private javax.swing.JTextField jtf_vinVehiculo;
    // End of variables declaration//GEN-END:variables
}
