
package examen3evs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ej1Adri {
    public static void main(String[] args) {
         try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3308/futbol";
            String user="root";
            String pass="";
            
            Connection con=DriverManager.getConnection(url, user, pass);
            ResultSet rs,rs1;
            
            //String cadena="select gol_local,gol_visitante from partidos where (codLocal=? || codvisitante=?)";
            String cadena="select gol_local,gol_visitante from partidos where codLocal=?";
            PreparedStatement ps=con.prepareStatement(cadena);
            cadena="insert into estadisticas values(?,?,?,?,?,?,?)";
            PreparedStatement ps1=con.prepareStatement(cadena);
            cadena="select * from estadisticas";
            PreparedStatement ps2=con.prepareStatement(cadena);
            cadena="select codEquipo from equipos";
            PreparedStatement ps3=con.prepareStatement(cadena);
            cadena="select gol_local,gol_visitante from partidos where codvisitante=?";
            PreparedStatement ps4=con.prepareStatement(cadena);
            
            Statement st=con.createStatement();
            st.executeUpdate("delete from estadisticas");
            
            String codequipo;
            int ganados=0,perdidos=0,empatados=0,golef=0,golec=0,puntos=0,goll,golv;
            
            rs=ps3.executeQuery();
            
            while(rs.next()){
                codequipo=rs.getString(1);
                ps.setString(1, codequipo);
                rs1=ps.executeQuery();
                ps1.setString(1, codequipo);
                
                //Local
                while(rs1.next()){
                    goll=rs1.getInt(1);
                    golv=rs1.getInt(2);

                    if(goll>golv){
                        ganados=ganados+1;
                        golef=golef+goll;
                        golec=golec+golv;
                    }else if(goll==golv){
                        empatados=empatados+1;
                        golef=golef+goll;
                        golec=golec+golv;
                    }else{
                        perdidos=perdidos+1;
                        golef=golef+goll;
                        golec=golec+golv;
                    }
 
                }
                //Visitante
                ps4.setString(1, codequipo);
                rs1=ps4.executeQuery();
                while(rs1.next()){
                    goll=rs1.getInt(1);
                    golv=rs1.getInt(2);

                    if(goll<golv){
                        ganados=ganados+1;
                        golef=golef+golv;
                        golec=golec+goll;
                    }else if(goll==golv){
                        empatados=empatados+1;
                        golef=golef+golv;
                        golec=golec+goll;
                    }else{
                        perdidos=perdidos+1;
                        golef=golef+golv;
                        golec=golec+goll;
                    }
 
                }
                
                puntos=3*ganados+empatados;
                ps1.setInt(2, ganados);
                ps1.setInt(3, perdidos);
                ps1.setInt(4, empatados);
                ps1.setInt(5, golef);
                ps1.setInt(6, golec);
                ps1.setInt(7, puntos);
                ps1.executeUpdate();
                
                ganados=0;
                perdidos=0;
                empatados=0;
                golec=0;
                golef=0;
            }
            
            
            rs=ps2.executeQuery();
            
            System.out.println("CodEquipo  PGanados  PPerdidos  PEmpatados  GolFav  GolCont  Puntos");
            while(rs.next()){
                System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5)+"  "+rs.getInt(6)+"  "+rs.getInt(7));
            }
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
    
