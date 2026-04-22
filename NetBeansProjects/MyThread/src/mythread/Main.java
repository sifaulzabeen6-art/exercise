/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mythread;

/**
 *
 * @author user
 */
public class Main {
    
    
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();

 
   for(int i=0;i<=10;i++)
        {
    System.out.println(" THREAD"+i);
        }
    
       
        
        
      
        
    }
}
