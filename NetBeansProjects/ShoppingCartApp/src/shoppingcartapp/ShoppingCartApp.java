/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcartapp;

import java.util.Scanner;
public class ShoppingCartApp {
    

 
    public static void main(String[] args) {
        boolean result=true;
        Scanner sc=new Scanner(System.in);
        Shopping s=new Shopping();
        do{
        System.out.println("*****************");
        System.out.println("1.ADD PRODUCT");
        System.out.println("2.VIEW CART");
        System.out.println("3.EXIT");
        System.out.println("***************");
        System.out.println("ENTER YOUR CHOICE");
        int option=sc.nextInt();
        if(option==1)
        {
            System.out.println("ENTER PRODUCT ID");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("ENTER PRODUCT NAME");
            String pname=sc.nextLine();
            sc.nextLine();
            System.out.println("ENTER PRODUCT PRICE");
            int price=sc.nextInt();
            s.addproduct(id,pname,price);
        }
        else if(option==2)
        {
            s.display();
        }
        else{
            result=false;
        }
        }while(result);
                
    }
    
}
