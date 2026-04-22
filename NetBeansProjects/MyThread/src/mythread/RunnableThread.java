/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mythread;

/**
 *
 * @author user
 */
public class RunnableThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=10;i++)
        {
        System.out.println("MY THREAD"+i);
        }
          try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("ERROR");
        }
        
       
    }
}
    

