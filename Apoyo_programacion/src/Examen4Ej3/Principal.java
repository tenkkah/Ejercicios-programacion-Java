/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen4Ej3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     try{
    Class.forName("com.mysql.jdbc.Driver");  
    String url="jdbc:mysql://localhost:3308/Personal";
    String user="root";
    String password="";
    Connection con=DriverManager.getConnection(url, user, password);
    String cadena="update Empleados set salario=salario+? where emp_no=?";
    PreparedStatement ps1=con.prepareStatement(cadena);
    cadena="select * from empleados where emp_no=?";
    PreparedStatement ps2=con.prepareStatement(cadena);
    cadena="delete from empleados where emp_no=?";
    PreparedStatement ps3=con.prepareStatement(cadena);
    cadena="update Departamentos set presupuesto=presupuesto+? where dept_no=?";
    PreparedStatement ps4=con.prepareStatement(cadena);
    cadena="select * from empleados where dept_no=?";
    PreparedStatement ps5=con.prepareStatement(cadena); 
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from empleados");
//<editor-fold defaultstate="collapsed" desc="comment">
int[] dinero=new int[4];
       System.out.println("----APARTADO A----------");
//APARTADO a)
while(rs.next()){
    if(2021-rs.getInt(3)>=3){
        int gratificacion=(2021-rs.getInt(3))*100;
        dinero[rs.getInt(5)/10-1]=dinero[rs.getInt(5)/10-1]+gratificacion;
        ps1.setInt(1, gratificacion);
        ps1.setString(2, rs.getString(1));
        ps1.executeUpdate();
    }
}
//</editor-fold>
    
    //APARTADO b)
  System.out.println("----APARTADO B----------");
    rs=st.executeQuery("select * from empleados");
    
    while(rs.next()){
      if(2021-rs.getInt(3)<2){
        ps3.setString(1,rs.getString(1));
        ps3.executeUpdate();
      }else
       System.out.println("No se ha dado de baja al empleado "+rs.getString(1)+
                      " pues lleva 2 o mas años trabajando");
    }
    
    //APARTADO c)
    System.out.println("----APARTADO C----------");
    for(int i=0;i<dinero.length;i++){
       ps4.setInt(1, dinero[i]);
       ps4.setInt(2, (i+1)*10);
       ps4.executeUpdate();
    }
    
    //APARTADO d)
    System.out.println("----APARTADO D----------");
    System.out.println("Introducir numero empleado a mostrar");
    String emp=teclado.next();
    ps2.setString(1, emp);
    rs=ps2.executeQuery();
    if(rs.next())
     System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)
                        +" "+rs.getInt(4)+" "+rs.getInt(5));   
    else System.out.println("El empleado "+emp+" no existe");
    
    
    //APARTADO e)
    System.out.println("----APARTADO E----------");
    System.out.println("Introducir numero de departamento");
    int dpt=teclado.nextInt();
    ps5.setInt(1, dpt);
    rs=ps5.executeQuery();
    while(rs.next())
     System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)
               +" "+rs.getInt(4)+" "+rs.getInt(5));     
    
    ps1.close();
    ps2.close();
    ps3.close();
    ps4.close();
    ps5.close();
    st.close();
    con.close();
    
   } catch(ClassNotFoundException ex){
       System.out.println(ex);
   } catch(SQLException ex){
       System.out.println(ex); 
   }
   
    }
}
