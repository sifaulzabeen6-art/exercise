/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcart;
import java.util.Scanner;                                                                                                                                                                                                                                                                                                              

public class Mainclass {
    public static void main(String[] args) {


    
    
        Scanner sc=new Scanner(System.in);
        boolean result=true;
     ShoppingCart cart =new ShoppingCart();
     ShoppingCart .item obj=cart.new item();
        do{
        System.out.println("******************************");
        System.out.println("1.ADD ITEM");
        System.out.println("2.UPDATE PRICE HISTORY");
        System.out.println("3.CALCULSTE TOTAL BILL");
        System.out.println("4.DISPALY CART DETAILS ");
        System.out.println("5.EXIT");
        System.out.println("******************************");
        System.out.print("ENTER YOUR OPTION:");
        int option=sc.nextInt();
        sc.nextLine();
        if(option==1)
        {
            System.out.println("ENTER CART OWNER NAME");
            cart. cartownername=sc.nextLine();
            obj.additem();
        }
        else if(option==2)
        {
            System.out.println("Latest price:"+obj.latestprice());
        }
        else if(option==3)
        {
            System.out.println("TotalBIll"+obj.total()); 
        }
        else if(option==4)
        {
            obj.display();
        }
        else
        {
            result=false;
            System.out.println("THANK UUUU");
        }
        }while(result);
      
    }
    
}

        
    

