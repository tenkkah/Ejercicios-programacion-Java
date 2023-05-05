
package examen3evs1;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej2Lorenzo {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3308/futbol";
            String user="root";
            String password="";
            Connection con=DriverManager.getConnection(url, user, password);
            File f=new File("futbol.bin");
            File f1=new File("clasificacion.txt");
            FileInputStream fis=new FileInputStream(f);
            DataInputStream dis=new DataInputStream(fis);
            FileWriter fw=new FileWriter(f1,true);
            BufferedWriter bw=new BufferedWriter(fw);
            
            String cadena;
            String operacion,codequipo;
            int ganados,perdidos,empatados;
            
            cadena="insert into estadisticas values(?,?,?,?,?,?,?)";
            PreparedStatement ps1=con.prepareStatement(cadena);
            cadena="delete from estadisticas where codequipo=?";
            PreparedStatement ps2=con.prepareStatement(cadena);
            cadena="update estadisticas set pganados=?,pperdidos=?,pempatados=? where codequipo=?";
            PreparedStatement ps3=con.prepareStatement(cadena);
            cadena="select * from estadisticas where codequipo=?";
            PreparedStatement ps4=con.prepareStatement(cadena);
            
            Statement st=con.createStatement();
            ResultSet rs,rs1;
            
            try{
                while(true){
                    operacion=dis.readUTF();
                    codequipo=dis.readUTF();
                    ganados=dis.readInt();
                    perdidos=dis.readInt();
                    empatados=dis.readInt();
                    if(operacion.equalsIgnoreCase("A")){
                        ps4.setInt(1, Integer.parseInt(codequipo));
                        rs1=ps4.executeQuery();
                        if(rs1.next()){
                            System.out.println("El equipo "+codequipo+" ya existe y no se puede dar de alta");
                        }
                        else{
                            System.out.println("Introduce los goles a favor");
                            int golfav = teclado.nextInt();
                            System.out.println("Introduce los goles en contra");
                            int golcon = teclado.nextInt();
                            int puntos=(3*ganados)+empatados;
                            ps1.setInt(1, Integer.parseInt(codequipo));
                            ps1.setInt(2, ganados);
                            ps1.setInt(3, perdidos);
                            ps1.setInt(4, empatados);
                            ps1.setInt(5, golfav);
                            ps1.setInt(6, golcon);
                            ps1.setInt(7, puntos);
                            
                            ps1.executeUpdate();
                            System.out.println("Se ha dado de alta al equipo "+codequipo);
                        }
                        
                    }
                    if(operacion.equalsIgnoreCase("B")){
                        ps2.setInt(1, Integer.parseInt(codequipo));
                        ps2.executeUpdate();
                        if(ps2.executeUpdate()==0){
                            System.out.println("No es posible dar de baja al equipo "+codequipo+" pues el equipo no existe");
                        }
                        else System.out.println("Se ha dado de baja al equipo "+codequipo);
                    }
                    if(operacion.equalsIgnoreCase("M")){
                        ps3.setInt(1, ganados);
                        ps3.setInt(2, perdidos);
                        ps3.setInt(3, empatados);
                        ps3.setInt(4, Integer.parseInt(codequipo));
                        ps3.executeUpdate();
                        if(ps3.executeUpdate()==0){
                            System.out.println("No es posible modificar al equipo "+codequipo+" pues el equipo no existe");
                        }
                        else System.out.println("Se ha modificado al equipo "+codequipo);
                    }
                    
                }
            }catch(IOException io){}
            
            rs=st.executeQuery("select codequipo,golfav,golcont,puntos from estadisticas");
            while(rs.next()){
                cadena="El equipo "+rs.getInt(1)+" tiene "+rs.getInt(2)+" Goles a Favor, "+rs.getInt(3)+" Goles en Contra y "+rs.getInt(4)+" puntos. \n";
                bw.write(cadena);
            }
            
            System.out.println("\n>> Se han guardado todas las estadisticas en el fichero clasificacion.txt");
            
            bw.close();
            fw.close();
            dis.close();
            fis.close();
            rs.close();
            con.close();
            
        }catch(ClassNotFoundException cnf){
            System.out.println(cnf);
        }catch(SQLException sql){
            System.out.println(sql);
        }catch(FileNotFoundException fnf){
            System.out.println(fnf);
        }catch(IOException io){
            System.out.println(io);
        }
    }
}
