package ejerciciosbbddyficheros;

import com.mysql.jdbc.Connection;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjerciciosBBDDyFicheros {  
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/Tienda";
            String user="root";
            String password="";
            
            Connection con= (Connection) DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            String cadena="delete from Productos where codproducto=?";
            PreparedStatement ps1=con.prepareStatement(cadena);
            cadena="insert into Productos values(?,?,?,?,?)";
            PreparedStatement ps2=con.prepareStatement(cadena);
            cadena="update Productos set preciounitario=preciounitario+preciounitario*?/100 "
                    + "where codproducto=?";
            PreparedStatement ps3=con.prepareStatement(cadena);
            cadena="select * from Productos where codproducto=?";
            PreparedStatement ps4=con.prepareStatement(cadena);
            
            ResultSet rs;
            
            File f=new File("datos2.dat");
            FileInputStream fis=new FileInputStream(f); //Leer el fichero
            DataInputStream dis=new DataInputStream(fis);
            
            String operacion,cp="",nom,lp;
            int pu,stk,p;
            
            try{
                while(true){
                    operacion=dis.readUTF(); //Lee la operacion
                    if(operacion.equalsIgnoreCase("B")){//Las cadenas se comparan con el equals
                        cp=dis.readUTF();
                    ps1.setString(1, cp);
                    if(ps1.executeUpdate()==0)
                    System.out.println("El producto a borrar no existe");
                    else System.out.println("Producto eliminado");
                }else if(operacion.equalsIgnoreCase("A")){
                    cp=dis.readUTF();
                    nom=dis.readUTF(); //Se leen los datos del fichero y se van a insertar en la tabla
                    lp=dis.readUTF();
                    pu=dis.readInt();
                    stk=dis.readInt();
                    ps4.setString(1, cp);
                    rs=ps4.executeQuery(); 
                    if(rs.next()) //
                        System.out.println("No se puede dar de alta pues ya existe ese Producto");
                    else
                        ps2.setString(1, cp);
                        ps2.setString(2, nom);
                        ps2.setString(3, lp);
                        ps2.setInt(4, pu);
                        ps2.setInt(5, stk);
                        ps2.executeUpdate();
                }else{
                       cp=dis.readUTF();
                        p=dis.readInt();
                        ps3.setInt(1, p);
                        ps3.setString(2, cp);
                        if(ps3.executeUpdate()==0)
                            System.out.println("No se puede dar de alta pues ese producto ya existe");
                        else System.out.println("Precio actualizado");
                        }     
                }             
            }catch(EOFException ex){} //Los datos dentro del fichero para controlar los datos 
                           
            dis.close();
            fis.close();
            
            cadena="select codproducto,sum(unidadesvendidas) from ventas"
                    + " group by codproducto";
            
            rs=st.executeQuery(cadena);
            while(rs.next()){
                
            }
            //INFORME FINAL
                       
            ps1.close();
            ps2.close();
            ps3.close();
            con.close();
            
            
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
