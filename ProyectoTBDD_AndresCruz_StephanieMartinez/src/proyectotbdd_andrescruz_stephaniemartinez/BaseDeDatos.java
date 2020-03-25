package proyectotbdd_andrescruz_stephaniemartinez;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos {

    private Connection coneccion = null;
    private CallableStatement procedimiento;

    public BaseDeDatos() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            DriverManager.getConnection("jdbc:mariadb://database-1.cp26b5jxlstx.us-east-1.rds.amazonaws.com:3307/DBCompany?user=admin&password=password1");
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int procedimientoInsertarCliente(String rtnCliente, String nombreCliente, int telefonoCliente, String direccionCliente, int esCompCliente, String idCliente, String sexoCliente, float ingresoAnualCliente, int tipoCompaniaCliente) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAICliente(?,?,?,?,?,?,?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("rtnCliente", rtnCliente);
            procedimiento.setString("nombreCliente", nombreCliente);
            procedimiento.setInt("telefonoCliente", telefonoCliente);
            procedimiento.setString("direccionCliente", direccionCliente);
            procedimiento.setInt("esCompCliente", esCompCliente);
            procedimiento.setString("idCliente", idCliente);
            procedimiento.setString("sexoCliente", sexoCliente);
            procedimiento.setFloat("ingresoAnualCliente", ingresoAnualCliente);
            procedimiento.setInt("tipoCompaniaCliente", tipoCompaniaCliente);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Cliente

    public int procedimientoInsertarCompania(String idCompania, String marcaCompania, String nombreCompania) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAICompania(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idCompania", idCompania);
            procedimiento.setString("marcaCompania", marcaCompania);
            procedimiento.setString("nombreCompania", nombreCompania);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Compania

    public int procedimientoInsertarConcesionario(String rtnConcesionario, String nombreConcesionario, String ubicacionConcesionario) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAIConcesionario(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("rtnConcesionario", rtnConcesionario);
            procedimiento.setString("nombreConcesionario", nombreConcesionario);
            procedimiento.setString("ubicacionConcesionario", ubicacionConcesionario);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Concesionario

    public int procedimientoInsertarPlanta(String idPlanta, String nombrePlanta, String tipoPlanta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAIPlanta(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idPlanta", idPlanta);
            procedimiento.setString("nombrePlanta", nombrePlanta);
            procedimiento.setString("tipoPlanta", tipoPlanta);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Planta

    public int procedimientoInsertarProveedor(String idProveedor, String nombreProveedor, String piezaProveedor) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAIProveedor(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idProveedor", idProveedor);
            procedimiento.setString("nombreProveedor", nombreProveedor);
            procedimiento.setString("piezaProveedor", piezaProveedor);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
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
            procedimiento = coneccion.prepareCall(" CALL PAIVehiculo(?,?,?,?,?,?,?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("vinVehiculo", vinVehiculo);
            procedimiento.setString("modeloVehiculo", modeloVehiculo);
            procedimiento.setString("tipoCarroceria", tipoCarroceria);
            procedimiento.setString("tipoMotor", tipoMotor);
            procedimiento.setString("colorVehiculo", colorVehiculo);
            procedimiento.setString("transmisionVehiculo", transmisionVehiculo);
            procedimiento.setDate("fechaEnsamblaje", fechaEnsamblaje);
            procedimiento.setFloat("precioVehiculo", precioVehiculo);
            procedimiento.setString("idCompaniaVehiculo", idCompaniaVehiculo);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Vehiculo

    public int procedimientoInsertarVenta(String rtnConcesionarioVenta, String rtnClienteVenta, String vinVenta, String tipoMotor, String colorVehiculo, String transmisionVehiculo, Date fechaVenta, float precioVenta, String idCompaniaVehiculo) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAIVenta(?,?,?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("rtnConcesionarioVenta", rtnConcesionarioVenta);
            procedimiento.setString("rtnClienteVenta", rtnClienteVenta);
            procedimiento.setString("vinVenta", vinVenta);
            procedimiento.setDate("fechaVenta", fechaVenta);
            procedimiento.setFloat("precioVenta", precioVenta);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de insert en la tabla Venta

    public int procedimientoEliminarCliente(String rtnCliente) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PADCliente(?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idCompania", rtnCliente);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Cliente

    public int procedimientoEliminarCompania(String idCompania) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PADCompania(?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idCompania", idCompania);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Compania

    public int procedimientoEliminarConcesionario(String rtnConcesionario) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PADConcesionario(?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("rtnConcesionario", rtnConcesionario);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Concesionario

    public int procedimientoEliminarPlanta(String idPlanta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PADPlanta(?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idPlanta", idPlanta);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Planta

    public int procedimientoEliminarProveedor(String idProveedor) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PADProveedor(?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idProveedor", idProveedor);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Proveedor

    public int procedimientoEliminarVehiculo(String vinVehiculo) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PADVehiculo(?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("vinVehiculo", vinVehiculo);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Vehiculo

    public int procedimientoEliminarVenta(String rtnConcesionario, String rtnClienteVenta, String vinVenta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PADVenta(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("rtnConcesionario", rtnConcesionario);
            procedimiento.setString("rtnClienteVenta", rtnClienteVenta);
            procedimiento.setString("vinVenta", vinVenta);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de delete en la tabla Venta

    public int procedimientoActualizarCliente(String rtnCliente, String nombreCliente, int telefonoCliente, String direccionCliente, int esCompCliente, String idCliente, String sexoCliente, float ingresoAnualCliente, int tipoCompaniaCliente) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAUCliente(?,?,?,?,?,?,?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("rtnCliente", rtnCliente);
            procedimiento.setString("nombreCliente", nombreCliente);
            procedimiento.setInt("telefonoCliente", telefonoCliente);
            procedimiento.setString("direccionCliente", direccionCliente);
            procedimiento.setInt("esCompCliente", esCompCliente);
            procedimiento.setString("idCliente", idCliente);
            procedimiento.setString("sexoCliente", sexoCliente);
            procedimiento.setFloat("ingresoAnualCliente", ingresoAnualCliente);
            procedimiento.setInt("tipoCompaniaCliente", tipoCompaniaCliente);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Cliente

    public int procedimientoActualizarCompania(String idCompania, String marcaCompania, String nombreCompania) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAUCompania(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idCompania", idCompania);
            procedimiento.setString("marcaCompania", marcaCompania);
            procedimiento.setString("nombreCompania", nombreCompania);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Compania
    
    public int procedimientoActualizarConcesionario(String rtnConcesionario, String nombreConcesionario, String ubicacionConcesionario) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAUConcesionario(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("rtnConcesionario", rtnConcesionario);
            procedimiento.setString("nombreConcesionario", nombreConcesionario);
            procedimiento.setString("ubicacionConcesionario", ubicacionConcesionario);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Concesionario
    
    public int procedimientoActualizarPlanta(String idPlanta, String nombrePlanta, String tipoPlanta) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAUPlanta(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idPlanta", idPlanta);
            procedimiento.setString("nombrePlanta", nombrePlanta);
            procedimiento.setString("tipoPlanta", tipoPlanta);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Planta
    
    public int procedimientoActualizarProveedor(String idProveedor, String nombreProveedor, String piezaProveedor) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAUProveedor(?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("idProveedor", idProveedor);
            procedimiento.setString("nombreProveedor", nombreProveedor);
            procedimiento.setString("piezaProveedor", piezaProveedor);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Proveedor
    
    public int procedimientoActualizarVehiculo(String vinVehiculo, String modeloVehiculo, String tipoCarroceria, String tipoMotor, String colorVehiculo,
            String transmisionVehiculo, Date fechaEnsamblaje, float precioVehiculo) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAIVehiculo(?,?,?,?,?,?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("vinVehiculo", vinVehiculo);
            procedimiento.setString("modeloVehiculo", modeloVehiculo);
            procedimiento.setString("tipoCarroceria", tipoCarroceria);
            procedimiento.setString("tipoMotor", tipoMotor);
            procedimiento.setString("colorVehiculo", colorVehiculo);
            procedimiento.setString("transmisionVehiculo", transmisionVehiculo);
            procedimiento.setDate("fechaEnsamblaje", fechaEnsamblaje);
            procedimiento.setFloat("precioVehiculo", precioVehiculo);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Vehiculo
    
    public int procedimientoActualizarVenta(String rtnConcesionarioVenta, String rtnClienteVenta, String vinVenta, String tipoMotor, String colorVehiculo, String transmisionVehiculo, Date fechaVenta, float precioVenta, String idCompaniaVehiculo) {
        int resultado = 0;
        try {
            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
            procedimiento = coneccion.prepareCall(" CALL PAUVenta(?,?,?,?,?) ");
            //se cargan los parametros de entrada
            procedimiento.setString("rtnConcesionarioVenta", rtnConcesionarioVenta);
            procedimiento.setString("rtnClienteVenta", rtnClienteVenta);
            procedimiento.setString("vinVenta", vinVenta);
            procedimiento.setDate("fechaVenta", fechaVenta);
            procedimiento.setFloat("precioVenta", precioVenta);
            // Se ejecuta el procedimiento almacenado
            procedimiento.execute();
            // devuelve el valor del parametro de salida del procedimiento
            resultado = procedimiento.getInt("condicion");
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }//Fin del método de update en la tabla Venta
}
