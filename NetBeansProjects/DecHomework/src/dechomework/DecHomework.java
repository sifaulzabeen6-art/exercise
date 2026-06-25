/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dechomework;

/**
 *
 * @author user
 */
public class DecHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Pizza p1 = new PlainPizza();
        System.out.println("Description : " + p1.getDescription());
        System.out.println("Cost        : " + p1.getCost());
        System.out.println();

        Pizza p2 = new Cheese(new PlainPizza());
        System.out.println("Description : " + p2.getDescription());
        System.out.println("Cost        : " + p2.getCost());
        System.out.println();

        Pizza p3 = new Mushroom(new Cheese(new PlainPizza()));
        System.out.println("Description : " + p3.getDescription());
        System.out.println("Cost        : " + p3.getCost());
        System.out.println();

        Pizza p4 = new Olive(new Mushroom(new Cheese(new PlainPizza())));
        System.out.println("Description : " + p4.getDescription());
        System.out.println("Cost        : " + p4.getCost());
    }
    
}
