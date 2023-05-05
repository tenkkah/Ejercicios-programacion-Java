
package examen3ev;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ej1 {

   
    public static void main(String[] args) {
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3336/Futbol";
            String user = "root";
            String password = "";
            Connection con = (Connection) DriverManager.getConnection(url, user, password);
            
            Statement st=con.createStatement();
             String cadena="create table Estadisticas("
                + "CodEquipo varchar(4),"
                + "PGanados int,"
                + "PPerdidos int,"
                + "PEmpatados int,"
                + "GolFav int,"
                + "GolCont int,"
                + "Puntos int"
                + "primary key(CodEquipo))";
             cadena="select * from partidos inner join estadisticas on ";
             
        
        st.execute(cadena); 
            ResultSet rs = null;
            
            while(rs.next()){
                
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println(e);            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    }
    

