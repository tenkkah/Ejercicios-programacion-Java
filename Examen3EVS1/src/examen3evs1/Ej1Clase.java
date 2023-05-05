
package examen3evs1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Ej1Clase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3308/Futbol";
            String user="root";
            String password="";
            Connection con=DriverManager.getConnection(url, user, password);
            
            String cadena="insert into Equipos values(?,?,?)";
            PreparedStatement ps1=con.prepareStatement(cadena);
            cadena="insert into Estadisticas values(?,?,?,?,?,?,?)";
            PreparedStatement ps2=con.prepareStatement(cadena);
            cadena="delete from Estadisticas where CodEquipo=?";
            PreparedStatement ps3=con.prepareStatement(cadena);  
            cadena="select * from Equipos where CodEquipo=?";
            PreparedStatement ps4=con.prepareStatement(cadena); 
            cadena="update Estadisticas set PGanados=?, PPerdidos=?,PEmpatados=?, GolFav=?, GolCont=?, Puntos=? where CodEquipo=?";
            PreparedStatement ps5=con.prepareStatement(cadena);          
            cadena="select * from Estadisticas where CodEquipo=?";
            PreparedStatement ps6=con.prepareStatement(cadena);
            
            ResultSet rs;
           
            
            File f = new File("futbol.bin");
            File f2 = new File("clasificacion.txt");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            
            try{
                String op,cod;
                int g,p,e;
                
                while(true){
                    op=dis.readUTF();
                    cod=dis.readUTF();
                    g=dis.readInt();
                    p=dis.readInt();
                    e=dis.readInt();
                    
                    System.out.println(op+" "+cod+" "+g+" "+p+" "+e);
                    
                    //VAMOS  A IR LEYENDO EL FICHERO Y HACIENDO LAS OPERACIONES
                    ps6.setString(1, cod);
                    rs=ps6.executeQuery();
                    if(rs.next()){ //Porque es un fichero de texto 
                        if(op.equalsIgnoreCase("A")) //Equals porque es cadena
                            System.out.println("Ya existe, no se puede darstem.out.println(\"Ya existe, n de alta");
                        else
                            if(op.equalsIgnoreCase("A")){
                            ps3.setString(1, cod);
                            ps3.executeUpdate();
                            ps4.setString(1, cod);
                            ps4.executeUpdate();
                        }else{
                            g=g+rs.getInt(2);
                            p=p+rs.getInt(3);
                            e=e+rs.getInt(4);
                            int pt=3*g+e;
                            int gf=rs.getInt(5)+2;
                            int gc=rs.getInt(6)+2;
                            ps5.setInt(1, g);
                            ps5.setInt(2, p);
                            ps5.setInt(3, 3);
                            ps5.setInt(4, gf);
                            ps5.setInt(5, gc);
                            ps5.setInt(6, pt);
                            ps5.executeUpdate();
                        }
                    
                    }else{
                        if(op.equalsIgnoreCase("A"))
                            System.out.println("Voy a darle de alta");
                        
                    }
                    
                }
            }catch(EOFException ex){}
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
