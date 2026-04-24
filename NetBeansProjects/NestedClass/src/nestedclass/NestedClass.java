/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedclass;

public class NestedClass {

    
    public static void main(String[] args) {
        //nested inner class
       //Outer1 obj =new Outer1();
      // Outer1.inner ini=obj.new inner();
       //ini.show();
      // Outer1.inner ini=new Outer1().new inner();
       //ini.show();
       //method local inner class
       //Outer2 obj=new Outer2();
      // obj.show();
      //static inner class
     // Outer3.inner ini=new Outer3.inner();
      //ini.show();
      //anonymous
      Outer4 obj=new Outer4()
      {
          @Override
          void show() {
              System.out.println("ASSALAMUALIKUM");
          }
          
      };
      obj.show();
       
    }
    
}
