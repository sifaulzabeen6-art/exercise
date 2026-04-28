/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listoperation;

/**
 *
 * @author user
 */
      import java.util.ArrayList;
import java.util.List;
public class ListOperation {


    public static void main(String[] args) {




        
        List<Integer> list = new ArrayList<>();

       
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("After adding elements: " + list);

       
        list.add(2, 25); 
        System.out.println("After inserting 25 at index 2: " + list);

        
        list.remove(Integer.valueOf(30)); 
        System.out.println("After removing 30: " + list);

        list.set(3, 100);  
        System.out.println("After updating index 3: " + list);

       
        System.out.println("Traversing elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
    
    

