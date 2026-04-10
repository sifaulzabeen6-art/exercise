/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcartapp;

/**
 *
 * @author user
 */
public class Product {
    int productid;
    String productname;
    int price;
    Product next;

    public Product(int productid, String productname, int price) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
        this.next = next;
    }
    
}
