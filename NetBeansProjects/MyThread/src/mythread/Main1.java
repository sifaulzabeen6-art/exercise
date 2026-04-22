/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mythread;

/**
 *
 * @author user
 */
public class Main1 {
    public static void main(String[] args) {
        RunnableThread rn=new RunnableThread();
        Thread t=new Thread(rn);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("thread"+i);
            
        }
    }
    
}
