/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculate.area;

/**
 *
 * @author user
 */
public abstract class Shape {
    int value;
    Shape(int value)
    {
        this.value=value;
    }
    abstract void calculatearea();
}
