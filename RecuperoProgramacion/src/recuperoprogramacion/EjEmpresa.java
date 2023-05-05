
package recuperoprogramacion;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EjEmpresa {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://localhost:3308/Empresa";
         String user="root";
         String password="";
         Connection con=DriverManager.getConnection(url, user, password);
         
         File f=new File("datos.dat");
         FileInputStream fis=new FileInputStream(f);
         DataInputStream dis=new DataInputStream(fis);
         
         Statement st=con.createStatement();
         String cadena="insert into Empleado values(?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(cadena);
         cadena="de";
         
         
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }
            
    }
    
}
