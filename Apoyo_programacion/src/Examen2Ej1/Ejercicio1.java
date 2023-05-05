/*Sea la base de datos Futbol, compuesta de tres tablas Equipos, Partidos y Estadísticas
 la cual se generará ejecutando el script futbol.sql
 Hacer un programa usando sentencias preparadas que rellene la tabla
 Estadísticas, que ya se encuentra creada pero sin datos y cuya estructura es la siguiente:

 CodEquipo, PGanados, PPerdidos , PEmpatados, GolFav, GolCont, Puntos

 Los datos a insertar, se sacan de la tabla Partidos, excepto el atributo Puntos que se
 calculará de la siguiente manera:
 3* PGanados+ PEmpatados.
.
 Posteriormente, se actualizará la tabla Estadísticas con los datos que se recogen en
 fichero binario futbol.bin. La estructura que tiene dicho fichero es:
 Operación(String), CodEquipo(String), Ganados(int), Perdidos(int) , Empatados(int)
 El campo Operación tendrá una “A”(Alta), una “B”(Baja) o una “M”(Modificación).
 Si es una “A” y el CodEquipo ya existe, se informará de que no es posible
 realizar la operación pues ya existe, en caso contrario se dará de alta, tanto en
 Estadísticas como en Equipos. Los datos se pedirán por teclado.
 Si es una “M” y el CodEquipo no existe, se informará de que no es posible
 realizar la operación pues no existe el equipo, en caso contrario se actualizarán
 los 3 campos que vienen, así como el campo puntos.
 Si es una “B” y el CodEquipo no existe, se informará de que no es posible
 realizar la operación pues no existe el equipo, en caso contrario se borrará de
 la tabla Equipos y Estadisticas.
 Finalmente, sacar por pantalla un listado con la siguiente información:
 Nombre_Equipo, Goles a Favor, Goles en Contra y Puntos.
 */
package Examen2Ej1;

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



public class Ejercicio1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3308/futbol";
            String user="root";
            String pass="";
            Connection con =DriverManager.getConnection(url,user,pass);
            
            ResultSet rs;
            String cadena="select codEquipo from estadisticas where codEquipo=?";
            PreparedStatement ps=con.prepareStatement(cadena);
            cadena = "insert into equipos values(?,?,?)";
            PreparedStatement ps1=con.prepareStatement(cadena);
            cadena="insert into estadisticas values(?,?,?,?,?,?,?)";
            PreparedStatement ps2=con.prepareStatement(cadena);
            cadena = "update estadisticas set pganados=?,pperdidos=?,pempatados=?,puntos=?, where codEquipo=?";
            PreparedStatement ps3=con.prepareStatement(cadena);
            cadena="delete from estadisticas where codEquipo=?";
            PreparedStatement ps4=con.prepareStatement(cadena);
            cadena="delete from equipos where codEquipo=?";
            PreparedStatement ps5=con.prepareStatement(cadena);
            cadena="select * from estadisticas";
            PreparedStatement ps6=con.prepareStatement(cadena);
            
            
            File f =new File("futbol.bin");
            File f1=new File("clasificacion.txt");
            
            
            FileInputStream fis =new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            
            String op,codeq;
            int ganado, perdido, empatado, puntos;
            boolean existe = false;
            try{
                while(true){//Para ficheros de texto se usa el true
                    op = dis.readUTF();
                    codeq = dis.readUTF();
                    ganado = dis.readInt();
                    perdido = dis.readInt();
                    empatado = dis.readInt();
                    
                    ps.setString(1, codeq);
                    rs=ps.executeQuery();
                    
                    if(rs.next()){
                        existe = true;
                    }
                    
                    if(op.equalsIgnoreCase("A")){
                        if(existe){
                            System.out.println("No es posible realizar la operacion ya que el equipo "+codeq+" ya existe");
                        }else{
                            ps1.setString(1, codeq);
                            ps1.setString(2, "");
                            ps1.setString(3, "");
                            ps1.executeUpdate();
                            ps2.setString(1, codeq);
                            ps2.setInt(2, ganado);
                            ps2.setInt(3, perdido);
                            ps2.setInt(4, empatado);
                            ps2.setInt(5, 0);
                            ps2.setInt(6, 0);
                            puntos = 3*ganado+empatado;
                            ps2.setInt(7, puntos);
                            ps2.executeUpdate();
                            System.out.println("Añadiendo al equipo "+codeq);
                        }
                    }else if(op.equalsIgnoreCase(("M"))){
                        if(existe){
                            ps3.setInt(1, ganado);
                            ps3.setInt(2, perdido);
                            ps3.setInt(3, empatado);
                            puntos = 3*ganado+empatado;
                            ps3.setInt(4, puntos);
                            ps3.setString(5, codeq);
                            ps3.executeUpdate();
                            System.out.println("Modificando al equipo "+codeq);
                        }else{
                            System.out.println("No es posible realizar la operacion ya que el equipo "+codeq+" no existe");
                        }
                    }else if(op.equalsIgnoreCase(("B"))){
                        if(existe){
                            ps4.setString(1, codeq);
                            ps4.executeUpdate();
                            ps5.setString(1, codeq);
                            ps5.executeUpdate();
                            System.out.println("Eliminando al equipo "+codeq);
                        }else{
                            System.out.println("No es posible realizar la operacion ya que el equipo "+codeq+" no existe");
                        }
                    }
                    
                    puntos = 0;
                    existe = false;
                    
                    
                }   
            }catch(EOFException ex){
                System.out.println(ex);
            }
            
            dis.close();
            fis.close();
            
            
            
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
            
            
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
