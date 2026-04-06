/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author user
 */
public class Interface implements Sifa,Sana  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface i1=new Interface();
        i1.feedback();
        System.out.println(i1.sum());
        System.out.println(i1.mark());
        // TODO code application logic here
    }

    @Override
    public void feedback() {
        System.out.println("happoy customer");
    }

    @Override
    public int mark() {
      return 10009;
    }

    @Override
    public int sum() {
        int a = 23;
        int b = 23;
      return a+b;
    }   
    
}
