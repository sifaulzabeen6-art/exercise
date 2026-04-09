/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sifa;

/**
 *
 * @author user
 */
public class Sifa implements Sana{
    
public static void main(String[]args){
    Sifa s=new Sifa();
    s.divide();
}
    @Override
    public void divide() {
      for(int i=1;i<=10;i++)
        {
            if(i%7==0)
            {
                System.out.println("DIVISIBLE BY 7:"+i);
            }
            
        }
    }
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    

