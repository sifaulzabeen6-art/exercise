/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculate.area;

/**
 *
 * @author user
 */
public class Square extends Shape {
 Square (int value) {
        super(value);
    }
    @Override
    void calculatearea() {
        
        int area=value*value;
        System.out.println("AREA OF THE SQUARE"+area);
      
    }
    
}
