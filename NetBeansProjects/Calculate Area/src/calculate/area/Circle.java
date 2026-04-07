/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculate.area;

/**
 *
 * @author user
 */
public class Circle extends Shape{
  

    Circle(int value) {
        super(value);
    }

    void calculatearea() {
        
       int area=(int) (3.14*value*value);
        System.out.println("AREA OF THE CIRCLE1"+area);
    }

    
    
}
