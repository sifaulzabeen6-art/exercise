/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculate.area;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class CalculateArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean result=true;
        do{
        System.out.println("***********");
        System.out.println("1.AREA of circle");
        System.out.println("2.AREA of square");
        System.out.println("3.EXIT");
        System.out.println("CHOOSE YOUR OPTION");
        int option=sc.nextInt();
        if(option==1)
        {
            System.out.println("ENTER THE RADIUS"); 
            int r=sc.nextInt();
            Circle c=new Circle(r);
            c.calculatearea();
        }
        else if(option==2)
                {
             System.out.println("ENTER THE side"); 
            int s1=sc.nextInt();
            Square s=new Square(s1);
            s.calculatearea();
                }
         else{
                result=false;
                 
         } 
        }while(result);
         
    }
    
}
