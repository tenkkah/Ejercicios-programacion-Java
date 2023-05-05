
package bbddyserializable;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class BBDDYSerializable {
    public static void main(String[] args) {
        try{
            File f=new File("productos.dat");
            Producto p;
            ArrayList<Producto> lista=new ArrayList<Producto>();
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/Almacen";
            String user="root";
            String password="";
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            String cadena="update productos set stock=stock-? where codproducto=?";
            PreparedStatement ps=con.prepareStatement(cadena);
            ResultSet rs;
            cadena="select codproducto,num(unidadesvendidas) from ventas group by codproducto";
            rs=st.executeQuery(cadena);
            
            while(rs.next()){
                ps.setInt(1, rs.getInt(2));
                ps.setString(2, rs.getString(1));
                ps.executeUpdate();
            }
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            
            rs=st.executeQuery("select * from productos");
            while(rs.next()){
                p=new Producto(Integer.parseInt(rs.getString(1)),rs.getString(2),rs.getInt(4),rs.getInt(5));
                oos.writeObject(p);
            }
            oos.close();
            fos.close();
            
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            try{
                while(true){
                    p=(Producto)ois.readObject();
                    lista.add(p);
                    System.out.println(p.toString());
                }
            }catch(EOFException ex){}
            
            ois.close();
            fis.close();
            
        }catch(IOException ex){
            System.out.println(ex);
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
