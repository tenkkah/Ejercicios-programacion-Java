
package examen3evs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej1 {
  public static void main(String[] args) {
   try{
     Class.forName("com.mysql.jdbc.Driver");
     String url="jdbc:mysql://localhost:3308/Futbol";  
     String user="root";
     String password="";
     Connection con=DriverManager.getConnection(url, user, password);
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select CodEquipo from Equipos");
     String cadena="select count(*),sum(gol_local),sum(gol_visitante) "
                +"from partidos where gol_local<gol_visitante and codLocal=?";
     PreparedStatement ps1=con.prepareStatement(cadena);
     cadena="select count(*),sum(gol_local),sum(gol_visitante) "
               +"from partidos where gol_local>gol_visitante and codvisitante=?";
     PreparedStatement ps2=con.prepareStatement(cadena);
     
     cadena="select count(*),sum(gol_local),sum(gol_visitante) "
                +"from partidos where gol_local>gol_visitante and codLocal=?";
     PreparedStatement ps3=con.prepareStatement(cadena);
     cadena="select count(*),sum(gol_local),sum(gol_visitante) "
               +"from partidos where gol_local<gol_visitante and codvisitante=?";
     PreparedStatement ps4=con.prepareStatement(cadena);
     
     cadena="select count(*),sum(gol_local),sum(gol_visitante) "
                +"from partidos where gol_local=gol_visitante and codLocal=?";
     PreparedStatement ps5=con.prepareStatement(cadena);
     cadena="select count(*),sum(gol_local),sum(gol_visitante) "
               +"from partidos where gol_local=gol_visitante and codvisitante=?";
     PreparedStatement ps6=con.prepareStatement(cadena);
     
     cadena="insert into Estadisticas values(?,?,?,?,?,?,?)";
     PreparedStatement ps7=con.prepareStatement(cadena);
     ResultSet rs1,rs2,rs3,rs4,rs5,rs6;
     
     int gf=0,gc=0,g=0,p=0,e=0,pt=0;
     while(rs.next()){
       gf=0;gc=0;g=0;p=0;e=0;pt=0;  
       ps1.setString(1, rs.getString(1));
       rs1=ps1.executeQuery();
       rs1.next();
       p=p+rs1.getInt(1);
       gf=gf+rs1.getInt(2);
       gc=gc+rs1.getInt(3);
       ps2.setString(1, rs.getString(1));
       rs2=ps2.executeQuery();
       rs2.next();
       p=p+rs2.getInt(1);
       gf=gf+rs1.getInt(3);
       gc=gc+rs1.getInt(2);
       
       ps3.setString(1, rs.getString(1));
       rs3=ps3.executeQuery();
       rs3.next();
       g=g+rs3.getInt(1);
       gf=gf+rs3.getInt(2);
       gc=gc+rs3.getInt(3);
       ps4.setString(1, rs.getString(1));
       rs4=ps4.executeQuery();
       rs4.next();
       g=g+rs4.getInt(1);
       gf=gf+rs4.getInt(3);
       gc=gc+rs4.getInt(2);
       
       ps5.setString(1, rs.getString(1));
       rs5=ps5.executeQuery();
       rs5.next();
       e=e+rs5.getInt(1);
       gf=gf+rs5.getInt(2);
       gc=gc+rs5.getInt(3);
       ps6.setString(1, rs.getString(1));
       rs6=ps6.executeQuery();
       rs6.next();
       e=e+rs6.getInt(1);
       gf=gf+rs6.getInt(3);
       gc=gc+rs6.getInt(2);
       pt=3*g+e;
       ps7.setString(1, rs.getString(1));
       ps7.setInt(2, g);
       ps7.setInt(3, p);
       ps7.setInt(4, e);
       ps7.setInt(5, gf);
       ps7.setInt(6, gc);
       ps7.setInt(7, pt);
       ps7.executeUpdate();
     }  
     
     rs=st.executeQuery("select * from Estadisticas");
     while(rs.next()){
      System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "
               +rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7));   
     }
     
     st.close();
     ps1.close();
     ps2.close();
     ps3.close();
     ps4.close();
     ps5.close();
     ps6.close();
     ps7.close();
     con.close();
   }catch(ClassNotFoundException ex){
        System.out.println(ex);
    }catch(SQLException ex){
        System.out.println(ex);
    }
  }   
}