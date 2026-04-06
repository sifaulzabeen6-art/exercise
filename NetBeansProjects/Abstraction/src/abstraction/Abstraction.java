/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraction;

/**
 *
 * @author user
 */
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sifa s=new Sifa();
        s.name();
        s.feedback();
        System.out.println(s.marks());
        Nisma n=new Nisma();
        n.name();
        n.feedback();
        System.out.println(n.marks());
        // TODO code application logic here
    }
    
}
