/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcartapp;

/**
 *
 * @author user
 */
public class Shopping {
    Product head;
    void  addproduct(int id, String name, int price)
        {
        Product newnode=new Product(id,name,price);
        if(head==null)
        {
            head=newnode;
        }
        else{
            Product temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
         }
        }
        void display()
        {
            if(head==null)
            {
                System.out.println("cart is empty");
                return;
            }
            Product temp=head;
            while(temp!=null)
            {
                System.out.println("ID"+temp.productid);
                System.out.println("PRODUCT NAME"+temp.productname);
                System.out.println("PRODUCT PRICE"+temp.price);
                temp=temp.next;
            }
            System.out.println("NUll");
        }
    }
    
    

