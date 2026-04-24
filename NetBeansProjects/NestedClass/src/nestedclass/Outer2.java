/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nestedclass;

/**
 *
 * @author user
 */
public class Outer2 {
    private int a=100;
    private int age=10;
    void show()
    {
        System.out.println("ASSALAMUALIKUM");
        System.out.println(age);
        class inner{
            void sum()
            {
                System.out.println(10+10);
                System.out.println(a);
            }
            
            
        }
        inner i =new inner();
        i.sum();
    }
    
    
}
