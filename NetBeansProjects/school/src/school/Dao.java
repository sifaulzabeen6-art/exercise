/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Dao {
    
    
    
     public Connection dbconnection() throws ClassNotFoundException, SQLException
    {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "sifaulzabeen");
            return c;
    }
    public void insert(model m) throws ClassNotFoundException, SQLException
    {
    Connection c=dbconnection();
    PreparedStatement ps=c.prepareStatement("insert into employee values (?,?,?)");
    ps.setInt(1,m.getId());
    ps.setString(2,m.getName());
    ps.setInt(3,m.getSalary());
    ps.executeUpdate();
    }
public void update(model m) throws ClassNotFoundException, ClassNotFoundException, SQLException
    {
     Connection c=dbconnection();
     PreparedStatement ps=c.prepareStatement("update employee set salary = ? where eid =?");
     ps.setInt(1,m.getSalary());
     ps.setInt(2,m.getId());
     ps.executeUpdate();
    }
public void delete(model m) throws ClassNotFoundException, ClassNotFoundException, SQLException
    {
     Connection c=dbconnection();
     PreparedStatement ps=c.prepareStatement("delete from employee where eid=?");
     
     ps.setInt(1,m.getId());
     ps.executeUpdate();
    }
public ArrayList< model> viewall () throws ClassNotFoundException, SQLException
{
ArrayList<model> al=new ArrayList<>();
 Connection c=dbconnection();
 PreparedStatement ps=c.prepareStatement("select* from employee");
 ResultSet rs=ps.executeQuery();
 
 while(rs.next())
 {
     model m =new model();
     m.setId(rs.getInt(1));
     m.setName(rs.getString(2));
     m.setSalary(rs.getInt(3));
     al.add(m);
 
 
 
 }
return al;


}

    
}
