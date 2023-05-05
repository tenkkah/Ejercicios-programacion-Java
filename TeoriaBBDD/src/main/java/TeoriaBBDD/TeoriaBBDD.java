package TeoriaBBDD;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeoriaBBDD {
    public static void main(String[] args) throws SQLException {
        
       try {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost";
        String user="root";
        String password="";
        Connection con=(Connection) DriverManager.getConnection(url, user, password);
        Statement st=con.createStatement();
        
       /*String instruccion="create database Prueba";
       st.execute(instruccion);
        String instruccion="create table Tabla1("
                +"campo1 int primary key,"
                +"campo2 varchar(10),"
                +"campo3 decimal(3,1))";
        st.execute(instruccion);
       
       String instruccion="insert into table1 values(1,'nombre1',4,5),"
               + "(2,'nombre2'8,2),(3,'nombre3',6,0)";
       st.executeUpdate(instruccion);*/
        
       ResultSet rs=st.executeQuery("select * from tabla1");
       if(rs.next())
               System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
       while(rs.next())
               System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
       
        st.close();
        con.close();
        
        
        } catch(SQLException ex){
            System.out.println(ex);
        } catch (ClassNotFoundException ex){
        System.out.println("La clase no existe");
        }
    }
 
}
