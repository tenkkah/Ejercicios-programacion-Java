/*Sea la base de datos llamada Personal, compuesta de dos tablas Empleado y Departamento
 las cuales se generaran ejecutando el script personal.sql
 Hacer un programa en java que cree la tabla OficinaEmpleados, cuya estructura es la
 siguiente:
 Nombre Empleado, Nombre Departamento, Salario y Comisión.
 Los datos a insertar, se sacaran de las tablas anteriores, excepto el atributo Comisión que se
 calculara de acuerdo al departamento al que pertenezca:
 Si pertenece a 'Contabilidad', será el 10% del salario.
 Si pertenece a 'Investigación', será el 20% del salario.
 Si pertenece a 'Ventas', será el 5% del salario.
 Si pertenece a 'Producción', será el 15% del salario.
 Posteriormente, se actualizara la tabla según la comisión. Las condiciones son:
- Si la comisión es menor de 300, este se incrementara en un 10%
- Si esta entre 400 y 600, se incrementara en un 5%
- Si es mayor de 600 se quedara igual.
 Finalmente, se escribirá en pantalla la tabla actualizada9
 */
package Examen3Ej3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ejercicio {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3308/personal";
            String user="root";
            String pass="";
            Connection con = DriverManager.getConnection(url, user, pass);
            
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            
            String cadena = "create table if not exists OficinaEmpleados("
                    + "NombreEmpleado varchar(25),"
                    + "NombreDepartamento varchar(25),"
                    + "salario int,"
                    + "comision int,"
                    + "primary key(NombreEmpleado,NombreDepartamento))";
            
            st.execute(cadena);
            
            cadena = "select empleado.nombre,departamento.nombre,salario "
                    +"from empleado, departamento where empleado.Dept_no = departamento.Dept_no";
            ResultSet rs = st.executeQuery(cadena); //El valor se guarda en el rs y es como un cursor
            
            int comision = 0;
            while(rs.next()){
                if(rs.getString(2).equals("CONTABILIDAD")){ //Se refiere a la segunda columna
                    comision = rs.getInt(3)*10/100;
                }else if(rs.getString(2).equals("INVESTIGACION")){
                    comision = rs.getInt(3)*20/100;
                }else if(rs.getString(2).equals("VENTAS")){
                    comision = rs.getInt(3)*5/100;
                }else if(rs.getString(2).equals("PRODUCCION")){
                    comision = rs.getInt(3)*15/100;
                }else{
                    System.out.println("No se ha podido actualizar");
                }
                //Se inserta la nueva tabla con los valores ya actualizados
                cadena = "insert into OficinaEmpleados values ('"+rs.getString(1)+"','"+rs.getString(2)+"','"+rs.getInt(3)+"','"+comision+"')";
                st1.executeUpdate(cadena); //El st guarda los valores se las sentencias que son directas sin valores como select
            }
            
            
            System.out.println("----------ANTES DE LA ACTUALIZACION----------");
            rs = st.executeQuery("select * from OficinaEmpleados");
            while(rs.next()){
                System.out.println(rs.getString(1)+"---"+rs.getString(2)+"----"+rs.getInt(3)+"---"+rs.getInt(4));
            }
            
            cadena = "update OficinaEmpleados set comision = comision* 1.01 where comision < 300";
            st1.executeUpdate(cadena);
            
            cadena = "update OficinaEmpleados set comision = comision*1.005 where comision > 400 and comision <=600";
            st1.executeUpdate(cadena);
            
            System.out.println("----------DESPUES DE LA ACTUALIZACION");
            rs = st.executeQuery("select * from OficinaEmpleados");
            while(rs.next()){
                 System.out.println(rs.getString(1)+"---"+rs.getString(2)+"----"+rs.getInt(3)+"---"+rs.getInt(4));
            }
            
            //Cerrar las conexiones 
            st1.close();
            st.close();
            con.close();
            
            
            
            
            
            
            
            
            
            
            
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
