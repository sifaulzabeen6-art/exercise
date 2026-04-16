/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.util.Scanner;

public class Hotel {


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Operation obj=new Operation();
        boolean result=true;
        do{
        System.out.println("*******************");
        System.out.println("1.ADD ORDER");
        System.out.println("2.SERVE ORDER");
        System.out.println("3.VIEW NEXT ORDER");
        System.out.println("4.DISPLAY ALL ORDER");
        System.out.println("5.EXIT");
        System.out.print("CHOOSE THE OPTION:");
        int option=sc.nextInt();
        sc.nextLine();
        if(option==1)
        {
            System.out.println("ENTER THE ITEMS TO ADDED");
            String  order=sc.nextLine();
            obj.push(order);
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
            obj.dispaly();
        }
        else
       {
           System.out.println("THANKNYOU");
           result=false;
       }
    }while(result);
        
        
    }

    }
    

