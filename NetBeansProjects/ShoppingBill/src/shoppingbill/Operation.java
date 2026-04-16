/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingbill;

/**
 *
 * @author user
 */

public class Operation 
{
   
 
   String item[]=new String[5];
    int top=-1;
    void push(String items)
    {
        if(top==item.length-1)
            
        {
            System.out.println("the items are full");
        }
        else
        {
            top++;
            item[top]=items;
            System.out.println("items added:"+item);
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("THE ITEMS ARE EMPTY NO TO REMOVE");
        }
        else
        {
            System.out.println("the item removed"+item[top]);
            top--;
        }
        
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("the items are empty");
        }
        else
        {
            System.out.println("THE LAST ITEM SCANNED"+item[top]);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("THE SHOP IS EMPTY");
        
        }
        else
        {
            for (int i = top; i>=0; i--) {
                System.out.println(" DISPALY THE ITEMS"+item[i]);
                
            }
        }
    }
    
    
}
