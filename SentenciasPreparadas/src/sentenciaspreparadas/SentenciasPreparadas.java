
package sentenciaspreparadas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SentenciasPreparadas {
    public static void main(String[] args) {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           String url="jdbc:mysql://localhost/Colegio";
           String user="root";
           String password="";
           
            Connection con=DriverManager.getConnection(url, user, password);
       
            String cadena="isert into Alumno values()";
            PreparedStatement ps1=con.prepareStatement(cadena);
            cadena="update Alumnos set nota=nota+? where id=?";
            PreparedStatement ps2=con.prepareStatement(cadena);
            cadena="delete Alumnos where id=?";
            PreparedStatement ps3=con.prepareStatement(cadena);
       }catch(ClassNotFoundException ex){
           System.out.println(ex);
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
