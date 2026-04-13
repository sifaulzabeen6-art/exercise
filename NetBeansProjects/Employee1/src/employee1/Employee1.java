/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee1;

/**
 *
 * @author user
 */
public class Employee1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manage m=new Manage();
        m.setName("sifa");
        m.setId(123);
        m.setPhno(2344565678l);
        m.setBloodgrup("o negative");
        System.out.println(m.getName());
        System.out.println(m.getPhno());
        System.out.println(m.getId()); 
        System.out.println(m.getBloodgrup());
                
    }
    
}
