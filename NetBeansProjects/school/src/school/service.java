/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class service {
    Dao d =new Dao();
     public void insert(model m) throws ClassNotFoundException, SQLException
         
            
    {
     d.insert(m);
    }
    
    public void update(model m) throws ClassNotFoundException, SQLException
    {
    d.update(m);
    
    }
    
    public void delete(model m) throws ClassNotFoundException, SQLException
    {
    d.delete(m);
    }
    public  void viewall() throws ClassNotFoundException, SQLException
    {
    ArrayList <model> al=d.viewall();
    for(model m:al)
    {
        System.out.println(m.getId()+","+m.getName()+","+m.getSalary());
    
    }
    
    }
}
