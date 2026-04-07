/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foodorder;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class FoodOrder extends Customer implements Order{
    String foodname;
    int price;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        boolean result=true;
 
       FoodOrder order=null;
        do{
        System.out.println("***********");
        System.out.println("1.place order");
        System.out.println("2.view bill");
        System.out.println("3.EXIT");
        System.out.print("CHOOSE YOUR OPTION");
        int option=sc.nextInt();
        sc.nextLine();
        
     
        if(option==1)
        {
            System.out.println("Enter the customer name:");
            String cn=sc.nextLine();
            System.out.println("ENTER THE FOOD NAME:");
            String fn=sc.nextLine();
            System.out.println("ENTER THE PRICE AMOUNT");
            int p=sc.nextInt();
            order=new FoodOrder(cn,fn,p);
            order.placeorder();
        }
        else if(option==2)
        {
          
          if(order!=null) 
          {
             order.showbill();
          }
          else
          {
              System.out.println("no order placed");
          }
        }
        else
        {
            result=false;
            
        }
     
        }while(result);
        // TODO code application logic here
    }

    public FoodOrder(String name,String foodname,int price) {
        super(name);
        this.foodname=foodname;
        this.price=price;
        
    }

    @Override
    public void placeorder() {
        System.out.println("ORDERD PLACED SUCCESSFULLY");
    }

    @Override
    public void showbill() {
        System.out.println("customer name:"+name);
        System.out.println("FOOD NAME:"+foodname);
        System.out.println("Price:"+price);
    
        
    }
    
    
}
