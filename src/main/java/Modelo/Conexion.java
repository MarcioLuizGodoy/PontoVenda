
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection con;
    
    private String user = "root";
    private String myBD = "jdbc:mariadb://localhost:3306/SistemaVentas";
    private String password = "godoy";
    
    public Connection getConnection(){
        try {
        
            con = DriverManager.getConnection(myBD, user,password);
            System.out.println("Sucesso ao conectar");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
        }
        
    
    

}
