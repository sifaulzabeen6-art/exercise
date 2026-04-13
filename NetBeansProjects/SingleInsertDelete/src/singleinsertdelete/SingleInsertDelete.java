/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleinsertdelete;

/**
 *
 * @author user
 */
public class SingleInsertDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InsertDelete id=new InsertDelete();
        id.insert(25);
        id.insert(32);
        id.insert(45);
        id.insert(6);
        id.insert(24);
        id.insert(52);
        id.display();
        System.out.println("***************");
        id.delete(6);
        id.display();
    }
    
}
