/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nestedclass;

/**
 *
 * @author user
 */
public class Outer1 {
    private int a=200;
    private void sum()
    {
        System.out.println(20+20);
    }
    class inner{
        void show()
        {
            System.out.println("assalamualikum");
            System.out.println(a);
            sum();        
        }
    }
}
