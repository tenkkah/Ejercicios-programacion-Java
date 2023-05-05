
package BBDDYFICHEROS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Ej1 {
    public static void main(String[] args) {
        try{
         Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://localhost:3308/Comercio";
         String user="root";
         String password="";
         Connection con=DriverManager.getConnection(url, user, password);
         
         
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
