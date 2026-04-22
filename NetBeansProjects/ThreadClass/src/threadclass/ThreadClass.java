/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadclass;



public class ThreadClass extends Thread{

   
    public static void main(String[] args) throws InterruptedException {
       String name="HELLO WORLD";
        for (int i = 0; i < name.length(); i++) {
            if(i==5){
                Thread.sleep(5000);
                    }
             System.out.println(name.charAt(i));
               Thread.sleep(1000);
            }
        }
}
                    
            
            
    


       

