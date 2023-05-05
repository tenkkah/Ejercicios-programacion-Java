
package examen3ev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Ej2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Tienda";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            
            
            
            
            
        } catch (ClassNotFoundException e) {
            System.out.println(e);            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    }
 


