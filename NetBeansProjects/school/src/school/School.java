/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class School {

       public static void main(String[] args) throws ClassNotFoundException, SQLException {
    


/**
 *
 * @author user
 */

   
         Scanner sc=new Scanner(System.in);
        Scanner se =new Scanner(System.in);
        boolean result=true;
        do{
        System.out.println("1.INSERT");
        System.out.println("2.Update");
        System.out.println("3.delete");
        System.out.println("4.dispaly");
            System.out.println("5.exit");
            System.out.println("enter the option");
            int option=sc.nextInt();
        
            service s=new service();
        if(option==1){
            
      
         System.out.println("enter the id");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the name");
            String name=se.nextLine();
            System.out.println("enter the salary");
            int salary=sc.nextInt();
            model m=new model(id,name,salary);
            s.insert(m);
            
        }
        else if(option==2)
        {
        
         System.out.println("enter the id");
            int id=sc.nextInt();
          
            System.out.println("enter the salary");
            int salary=sc.nextInt();
                 model m=new model();
                 m.setId(id);
                 m.setSalary(salary);
        
        s.update(m);
        
        }
        else if(option==3)
        {

         System.out.println("enter the id");
            int id=sc.nextInt();
           
                 model m=new model();
                 m.setId(id);
        s.delete(m);
        
        }
        else if(option==4)
        {
        s.viewall();
        }
        
        else if(option==5)
        {
          result=false;
        
        }
        else
        {
            System.out.println("wrong option");
        
        }
    }while(result);
      
    }
    
}

    
    

