
package repasobbddyficheros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ej1BBDD {
    public static void main(String[] args) {
       try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/Tienda";
            String user="root";
            String password="";
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            st.execute("drop table ArtFab");
            String cadena="create table ArtFab("
                    + "NombreAr varchar(30),"
                    + "NombreFab varchar(30),"
                    + "precio int,"
                    + "iva int,"
                    + "primary key(nombreAr,nombrefab))";
            st.execute(cadena); //Sirve para ejecutar
            
            cadena="select articulos.nombre,fabricantes.nombre,precio "
                    +"from articulos,fabricantes "
                    +"where articulos.clfab=fabricantes.clfab";
            
           ResultSet rs=st.executeQuery(cadena);
           
            int iva,precio;
            while(rs.next()){
                precio=rs.getInt(3);
                        if(precio<200)
                            iva=precio*10/100;
                        else if(precio<500)
                            iva=precio*8/100;
                        else if(precio<700)
                            iva=precio*6/100;
                        else iva=0;
                        cadena="insert into ArtFab values('"+rs.getString(1)+"','"
                                + rs.getString(2)+"',"+precio+","+iva+")"; //Los string van con comilla simple de apertura y de cierre y los valores de int con comillas dobles y separa con comas todos los valores
                        st1.executeUpdate(cadena);
            }
            
            cadena="select * from ArtFab";
            
            rs=st.executeQuery(cadena); //Es un objeto que hace de puntero, solo se va a utilizar cuando se hace un select
            
            while(rs.next())
                System.out.println(rs.getString(1)+"--"+rs.getString(2)
                +"--"+rs.getInt(3)+"--"+rs.getInt(4));
            
            st.close();
            st1.close();
            rs.close();
            con.close();
            
        }catch(ClassNotFoundException e){
            System.out.println(e);   
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
