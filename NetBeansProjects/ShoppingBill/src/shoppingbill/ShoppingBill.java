/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingbill;
import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Operation obj=new Operation();
        boolean result=true;
        do{
        System.out.println("*******************");
        System.out.println("1.ADD ITEMS");
        System.out.println("2.UNDO LAST ITEMS");
        System.out.println("3.VIEW LAST ITEMS");
        System.out.println("4.DISPLAY ALLA ITEMS");
        System.out.println("5.EXIT");
        System.out.print("CHOOSE THE OPTION:");
        int option=sc.nextInt();
        sc.nextLine();
        if(option==1)
        {
            System.out.println("ENTER THE ITEMS TO ADDED");
            String items=sc.nextLine();
            
            obj.push(items);
        }
       else if(option==2)
        {
            obj.pop();
        }
       else if(option==3)
        {
            obj.peek();
        }
       else if(option==4)
        {
            obj.display();
        }
        else
       {
           System.out.println("THANKNYOU");
           result=false;
       }
    }while(result);
        
        
    }
    
}
