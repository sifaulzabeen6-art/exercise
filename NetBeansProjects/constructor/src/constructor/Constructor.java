/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

/**
 *
 * @author user
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AllConstructor ab=new AllConstructor();
           AllConstructor ab1=new AllConstructor(20,90);
           AllConstructor ab2=new AllConstructor(ab1);
           ab2.a=10;
           System.out.println(ab2.a+ab2.b);           
        
    }
    
}
