package proyectoFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private final String user = "cprmrsjt2eg6a10hx5y5"; //Paso el nombre de usuario de la bd
    private final String password = "pscale_pw_2ATnMJFe7I5plhjJUSk7AssY98wrChXOUcWSWSuuNCL"; //Paso contraseña de la bd
    private final String url = "jdbc:mysql://us-east.connect.psdb.cloud/empleados"; //Paso dirección de la bd
    private Connection con = null;
    
 
    
    public Connection getConexion(){ //Realizo la conexión
        
        try { //Encierro en un try/catch para contener errores en caso de que no pueda conectarse. Intenta conectarse try y si no puede
              // da un mensaje de error en el catch  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            //System.out.println("La conexión se realizó exitosamente");
                        
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            System.out.println("La conexión a la base de datos no pudo realizarse");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public void disconnect() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void main(String[] args) {
        
        Conexion connection = new Conexion();
        connection.getConexion();
    }
}
