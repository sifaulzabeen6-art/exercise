/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author user
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1=new Student();
        System.out.println( "name"+s1.name);
        System.out.println( "Rollno"+s1.rollno);
        System.out.println( "Age"+s1.age);
        System.out.println("Marks"+s1.marks);
        Manager m1=new Manager();
        System.out.println("salary"+m1.salary);
        System.out.println("departmaent"+m1.depatment);
        Clothing c1=new Clothing();
        System.out.println("name of the product:"+c1.name);
        System.out.println("price"+c1.price);
        System.out.println("waranty"+c1.Waranty);
        System.out.println("size"+c1.size);
        System.out.println("fabric"+c1.fabric);
    }
    
}
