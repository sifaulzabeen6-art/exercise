/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setoperation;

/**
 *
 * @author user
 */
  import java.util.HashSet;
import java.util.Set;
public class SetOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 


       
        Set<Integer> set = new HashSet<>();

      
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); 
        set.add(40);
        set.add(10); 

        
        System.out.println("Set elements (duplicates removed automatically): " + set);

      
        if (set.contains(20)) {
            System.out.println("20 is present in the set");
        } else {
            System.out.println("20 is not present in the set");
        }

     
        set.remove(30);
        System.out.println("After removing 30: " + set);

       
        System.out.println("Iterating elements:");
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
    
    

