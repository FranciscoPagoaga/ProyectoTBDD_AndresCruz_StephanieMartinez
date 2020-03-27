package proyectotbdd_andrescruz_stephaniemartinez;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BaseDeDatos {

    private Connection conexion;
    private CallableStatement sp = null;
    Statement stm;

    public BaseDeDatos() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mariadb://database-1.cp26b5jxlstx.us-east-1.rds.amazonaws.com:3307/DBCompany?user=admin&password=password1");
            /*stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery("select * from Prueba");
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
            }*/
            //Statement stmt= conexion.createStatement();
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int procedimientoInsertarCliente(String rtnCliente, String nombreCliente, int telefonoCliente, String direccionCliente, int esCompCliente, String idCliente, String sexoCliente, float ingresoAnualCliente, int tipoCompaniaCliente) throws SQLException {
        int resultado = -1;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAICliente (?,?,?,?,?,?,?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnCliente);
            sp.setString(3, nombreCliente);
            sp.setInt(4, telefonoCliente);
            sp.setString(5, direccionCliente);
            sp.setInt(6, esCompCliente);
            sp.setString(7, idCliente);
            sp.setString(8, sexoCliente);
            sp.setFloat(9, ingresoAnualCliente);
            sp.setInt(10, tipoCompaniaCliente);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Cliente

    public int procedimientoInsertarCompania(String idCompania, String marcaCompania, String nombreCompania) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAICompania(?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idCompania);
            sp.setString(3, marcaCompania);
            sp.setString(4, nombreCompania);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Compania

    public int procedimientoInsertarConcesionario(String rtnConcesionario, String nombreConcesionario, String ubicacionConcesionario) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAIConcesionario(?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnConcesionario);
            sp.setString(3, nombreConcesionario);
            sp.setString(4, ubicacionConcesionario);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Concesionario

    public int procedimientoInsertarPlanta(String idPlanta, String nombrePlanta, String tipoPlanta, String idCompaniaPlanta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAIPlanta (?,?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idPlanta);
            sp.setString(3, nombrePlanta);
            sp.setString(4, tipoPlanta);
            sp.setString(5, idCompaniaPlanta);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println("Aqui");
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Planta

    public int procedimientoInsertarProveedor(String idProveedor, String nombreProveedor, String piezaProveedor) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAIProveedor(?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idProveedor);
            sp.setString(3, nombreProveedor);
            sp.setString(4, piezaProveedor);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Proveedor

    public int procedimientoInsertarVehiculo(String vinVehiculo, String modeloVehiculo, String tipoCarroceria, String tipoMotor, String colorVehiculo,
            String transmisionVehiculo, Date fechaEnsamblaje, float precioVehiculo, String idCompaniaVehiculo) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAIVehiculo(?,?,?,?,?,?,?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, vinVehiculo);
            sp.setString(3, modeloVehiculo);
            sp.setString(4, tipoCarroceria);
            sp.setString(5, tipoMotor);
            sp.setString(6, colorVehiculo);
            sp.setString(7, transmisionVehiculo);
            sp.setDate(8, fechaEnsamblaje);
            sp.setFloat(9, precioVehiculo);
            sp.setString(10, idCompaniaVehiculo);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Vehiculo

    public int procedimientoInsertarVenta(String rtnConcesionarioVenta, String rtnClienteVenta, String vinVenta, float precioVenta, Date fechaVenta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAIVenta(?,?,?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnConcesionarioVenta);
            sp.setString(3, rtnClienteVenta);
            sp.setString(4, vinVenta);
            sp.setFloat(5, precioVenta);
            sp.setDate(6, fechaVenta);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Venta

    public int procedimientoEliminarCliente(String rtnCliente) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PADCliente(?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnCliente);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Cliente

    public int procedimientoEliminarCompania(String idCompania) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PADCompania(?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idCompania);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Compania

    public int procedimientoEliminarConcesionario(String rtnConcesionario) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PADConcesionario(?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnConcesionario);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Concesionario

    public int procedimientoEliminarPlanta(String idPlanta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PADPlanta(?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idPlanta);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Planta

    public int procedimientoEliminarProveedor(String idProveedor) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PADProveedor(?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idProveedor);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Proveedor

    public int procedimientoEliminarVehiculo(String vinVehiculo) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PADVehiculo(?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, vinVehiculo);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Vehiculo

    public int procedimientoEliminarVenta(String rtnConcesionario, String rtnClienteVenta, String vinVenta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PADVenta(?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnConcesionario);
            sp.setString(3, rtnClienteVenta);
            sp.setString(4, vinVenta);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Venta

    public int procedimientoActualizarCliente(String rtnCliente, String nombreCliente, int telefonoCliente, String direccionCliente, int esCompCliente, String idCliente, String sexoCliente, float ingresoAnualCliente, int tipoCompaniaCliente) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAUCliente(?,?,?,?,?,?,?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnCliente);
            sp.setString(3, nombreCliente);
            sp.setInt(4, telefonoCliente);
            sp.setString(5, direccionCliente);
            sp.setInt(6, esCompCliente);
            sp.setString(7, idCliente);
            sp.setString(8, sexoCliente);
            sp.setFloat(9, ingresoAnualCliente);
            sp.setInt(10, tipoCompaniaCliente);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Cliente

    public int procedimientoActualizarCompania(String idCompania, String marcaCompania, String nombreCompania) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAUCompania(?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idCompania);
            sp.setString(3, marcaCompania);
            sp.setString(4, nombreCompania);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Compania

    public int procedimientoActualizarConcesionario(String rtnConcesionario, String nombreConcesionario, String ubicacionConcesionario) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAUConcesionario(?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnConcesionario);
            sp.setString(3, nombreConcesionario);
            sp.setString(4, ubicacionConcesionario);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Concesionario

    public int procedimientoActualizarPlanta(String idPlanta, String nombrePlanta, String tipoPlanta, String idCompania) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAUPlanta(?,?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idPlanta);
            sp.setString(3, nombrePlanta);
            sp.setString(4, tipoPlanta);
            sp.setString(5, idCompania);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Planta

    public int procedimientoActualizarProveedor(String idProveedor, String nombreProveedor, String piezaProveedor) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAUProveedor(?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, idProveedor);
            sp.setString(3, nombreProveedor);
            sp.setString(4, piezaProveedor);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Proveedor

    public int procedimientoActualizarVehiculo(String vinVehiculo, String modeloVehiculo, String tipoCarroceria, String tipoMotor, String colorVehiculo,
            String transmisionVehiculo, Date fechaEnsamblaje, float precioVehiculo, String idCompaniaVehiculo) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAUVehiclo(?,?,?,?,?,?,?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, vinVehiculo);
            sp.setString(3, modeloVehiculo);
            sp.setString(4, tipoCarroceria);
            sp.setString(5, tipoMotor);
            sp.setString(6, colorVehiculo);
            sp.setString(7, transmisionVehiculo);
            sp.setDate(8, fechaEnsamblaje);
            sp.setFloat(9, precioVehiculo);
            sp.setString(10, idCompaniaVehiculo);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Vehiculo

    public int procedimientoActualizarVenta(String rtnConcesionarioVenta, String rtnClienteVenta, String vinVenta, float precioVenta, Date fechaVenta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{ ? = call PAUVenta(?,?,?,?,?) }");
            //se cargan los parametros de entrada
            sp.registerOutParameter(1, Types.INTEGER);
            sp.setString(2, rtnConcesionarioVenta);
            sp.setString(3, rtnClienteVenta);
            sp.setString(4, vinVenta);
            sp.setDate(5, fechaVenta);
            sp.setFloat(6, precioVenta);
            // Se ejecuta el procedimiento almacenado
            sp.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = sp.getInt(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Venta

    public void cargarCBCompania(JComboBox idCompania) throws SQLException {
        stm = conexion.createStatement();
        ResultSet rs = stm.executeQuery("select * from tblCompania");
        while (rs.next()) {
            idCompania.addItem(rs.getString("idComp"));
        }
    }

    public void cargarCBConcesionario(JComboBox rtnConcesionarioVenta) throws SQLException {
        stm = conexion.createStatement();
        ResultSet rs = stm.executeQuery("select * from tblConcesionario");
        while (rs.next()) {
            rtnConcesionarioVenta.addItem(rs.getString("rtnConc"));
        }
    }

    public void cargarCBCliente(JComboBox rtnClienteVenta) throws SQLException {
        stm = conexion.createStatement();
        ResultSet rs = stm.executeQuery("select * from tblCliente");
        while (rs.next()) {
            rtnClienteVenta.addItem(rs.getString("rtnClie"));
        }
    }

    public void cargarCBVin(JComboBox vinVenta) throws SQLException {
        stm = conexion.createStatement();
        ResultSet rs = stm.executeQuery("select * from tblVehiculo");
        while (rs.next()) {
            vinVenta.addItem(rs.getString("vin"));
        }
    }

    public void cargarCBPlanta(JComboBox idPlanta) throws SQLException {
        stm = conexion.createStatement();
        ResultSet rs = stm.executeQuery("select * from tblPlanta");
        while (rs.next()) {
            idPlanta.addItem(rs.getString("idPlan"));
        }
    }

    public void cargarCBProveedor(JComboBox idProveedor) throws SQLException {
        stm = conexion.createStatement();
        ResultSet rs = stm.executeQuery("select * from tblProveedor");
        while (rs.next()) {
            idProveedor.addItem(rs.getString("idProv"));
        }
    }

    public ResultSet getTabla(String consulta) throws SQLException {
        ResultSet datos = null;
        try {
            stm = conexion.createStatement();
            datos = stm.executeQuery(consulta);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return datos;
    }

    public void defectuoso(String idProveedor, Date fechaInicio, Date fechaFinal, JTable tabla) {
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            sp = conexion.prepareCall("{call PDefectuoso(?,?,?) }");
            //se cargan los parametros de entrada
            sp.setString(1, idProveedor);
            sp.setDate(2, fechaInicio);
            sp.setDate(3, fechaFinal);
            // Se ejecuta el procedimiento almacenado
            ResultSet rs;
            rs = sp.executeQuery();
            DefaultTableModel modelo = new DefaultTableModel();
            try {
                String[] registros = new String[2];
                modelo.setColumnIdentifiers(new Object[]{"VIN", "RTN del Cliente", "Nombre del Cliente"});
                while (rs.next()) {
                    //se añaden los resultados a la tabla
                    registros[0] = sp.getString(1);
                    registros[1] = sp.getString(2);
                    modelo.addRow(registros);
                }
                tabla.setModel(modelo);
            } catch (SQLException ex) {
                Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
