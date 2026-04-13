/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author user
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Single s=new Single();
        s.insert("sifa");
        s.insert("sana");
        s.insert("sumaiya");
        s.display();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        s.delete("sumaiya");
        s.display();
    }
    
}
