/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinked;

/**
 *
 * @author user
 */
public class DoubleLinked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Double d=new Double();
       d.insert(21);
       d.insert(50);
       d.insert(89);
       d.display();
        System.out.println("*************************");
       // d.displayback();
        d.delete(50);
        d.display();
    }
    
}
