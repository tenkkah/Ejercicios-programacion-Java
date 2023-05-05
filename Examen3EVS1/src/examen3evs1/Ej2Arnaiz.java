
package examen3evs1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ej2Arnaiz {
     public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3308/futbol";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(url, user, pass);
            
            ResultSet rs;
            String cadena="select codEquipo from estadisticas where codEquipo=?";
            PreparedStatement ps=con.prepareStatement(cadena);
            cadena="insert into equipos values(?,?,?)";
            PreparedStatement ps1=con.prepareStatement(cadena);
            cadena="insert into estadisticas values(?,?,?,?,?,?,?)";
            PreparedStatement ps2=con.prepareStatement(cadena);
            cadena="update estadisticas set pganados=?,pperdidos=?,pempatados=?,puntos=? where codEquipo=?";
            PreparedStatement ps3=con.prepareStatement(cadena);
            cadena="delete from estadisticas where codEquipo=?";
            PreparedStatement ps4=con.prepareStatement(cadena);
            cadena="delete from equipos where codEquipo=?";
            PreparedStatement ps5=con.prepareStatement(cadena);
            cadena="select * from estadisticas";
            PreparedStatement ps6=con.prepareStatement(cadena);
            
            File f=new File("futbol.bin");
            File f1=new File("clasificacion.txt");
            
            FileInputStream fis=new FileInputStream(f);
            DataInputStream dis=new DataInputStream(fis);
            
            
            String op,codeq;
            int ganado,perdido,empatado,puntos;
            boolean existe=false;
            try{
                while(true){ //Para ficheros de texto
                    op=dis.readUTF();
                    codeq=dis.readUTF();
                    ganado=dis.readInt();
                    perdido=dis.readInt();
                    empatado=dis.readInt();
                    ps.setString(1, codeq);
                    rs=ps.executeQuery();
                    if(rs.next()){
                        existe=true;
                    }
                    if(op.equalsIgnoreCase("A")){
                        if(existe){
                            System.out.println("No es posible realizar la operacion ya que el equipo "+codeq+" ya existe");
                        }else{
                            //cadena="insert into equipos values(?,?,?)";
                            //cadena="insert into estadisticas values(?,?,?,?,?,?,?)";
                            /*ganado=dis.readInt();
                            perdido=dis.readInt();
                            empatado=dis.readInt();*/
                            ps1.setString(1, codeq);
                            ps1.setString(2,"");
                            ps1.setString(3, "");
                            ps1.executeUpdate();
                            ps2.setString(1, codeq);
                            ps2.setInt(2, ganado);
                            ps2.setInt(3, perdido);
                            ps2.setInt(4, empatado);
                            ps2.setInt(5, 0);
                            ps2.setInt(6, 0);
                            puntos=3*ganado+empatado;
                            ps2.setInt(7, puntos);
                            ps2.executeUpdate();
                            System.out.println("Añadiendo al equipo "+codeq);
                        }
                    }else if(op.equalsIgnoreCase("M")){
                        if(existe){
                            //cadena="update estadisticas set pganados=?,pperdidos=?,pempatados=?,puntos=puntos+? where codEquipo=?";
                            /*ganado=dis.readInt();
                            perdido=dis.readInt();
                            empatado=dis.readInt();*/
                            ps3.setInt(1, ganado);
                            ps3.setInt(2,perdido);
                            ps3.setInt(3,empatado);
                            puntos=3*ganado+empatado;
                            ps3.setInt(4, puntos);
                            ps3.setString(5, codeq);
                            ps3.executeUpdate();
                            System.out.println("Modificando al equipo "+codeq);
                        }else{
                            System.out.println("No es posible realizar la operacion ya que el equipo "+codeq+" no existe");
                        }
                    }else if(op.equalsIgnoreCase("B")){
                        if(existe){
                            //cadena="delete from estadisticas where codEquipo=?";
                            //cadena="delete from equipos where codEquipo=?";
                            ps4.setString(1, codeq);
                            ps4.executeUpdate();
                            ps5.setString(1, codeq);
                            ps5.executeUpdate();
                            System.out.println("Eliminando al equipo "+codeq);
                            
                        }else{
                            System.out.println("No es posible realizar la operacion ya que el equipo "+codeq+" no existe");
                        }
                    }
                    puntos=0;
                    existe=false;
                    
                    
                }
                 
            }catch(EOFException ex){} 
            
            dis.close();
            fis.close();
            
            //Fichero res
            
            rs=ps6.executeQuery();
            FileWriter fw=new FileWriter(f1);
            BufferedWriter bw=new BufferedWriter(fw);
            
            while(rs.next()){
                cadena="El equipo "+rs.getString(1)+" tiene "+rs.getInt(5)+" goles a favor, "+rs.getInt(6)+" goles en contra y "+rs.getInt(7)+" puntos";
                bw.write(cadena);
                bw.newLine();
            }
            
            bw.close();
            fw.close();
            
            FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            
            cadena=br.readLine();
            
            System.out.println("\n");
            System.out.println("---------CLASIFICACION---------");
            
            while(cadena!=null){
                System.out.println(cadena);
                cadena=br.readLine();
            }
            
            br.close();
            fr.close();
            
            ps5.close();
            ps4.close();
            ps3.close();
            ps2.close();
            ps1.close();
            ps.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
}