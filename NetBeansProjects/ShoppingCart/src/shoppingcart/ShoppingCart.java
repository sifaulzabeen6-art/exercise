/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart;

import java.util.Arrays;
import java.util.Scanner;
public class ShoppingCart {
    String cartownername;
    class item
    {
    
    String itemname;
    int quantity;
    double[]pricehistory;
    Scanner sc=new Scanner(System.in);
    void additem()
    {
        System.out.println("ENTER ITEM NAME:");
         itemname=sc.nextLine();
        System.out.println("QUANTITY");
        quantity=sc.nextInt();
        System.out.println("ENTER NUMBER OF PRICE UPDATES:");
        int num=sc.nextInt();
        pricehistory=new double[num];
        System.out.println("ENTER PRICES");
        for (int i = 0; i < num; i++) {
            pricehistory[i]=sc.nextDouble();
            
        }
    }
    double latestprice()
    {
        return pricehistory[pricehistory.length-1];
    }
    double total()
    {
        return latestprice()*quantity;
    }
    void display()
    {
        
        System.out.println("***********************");
        System.out.println("CARTOWNER NAME"+cartownername);
        System.out.println("ITEM NAME"+itemname);
        System.out.println("QUANTITY"+quantity);
        System.out.println("PRICEHISTORY"+Arrays.toString(pricehistory));
        System.out.println("LATESTPRICE"+latestprice());
        System.out.println("TOTAL BILL:"+total());
    
    }
    
    
    
    
    }

  
    
}
