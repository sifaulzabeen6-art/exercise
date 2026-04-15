/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doubleinsertspecificposition;

/**
 *
 * @author user
 */
public class DoubleInsertSpecificPosition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SpecificPos d=new SpecificPos();
       d.insert(21);
       d.insert(50);
       d.insert(89);
       d.display();
        System.out.println("*************************");
       // d.displayback();
        d.delete(50);
        d.display();
        System.out.println("**************************");
        d.specificinsert(23, 2);
        d.display();
        // TODO code application logic here
    }
    
}
