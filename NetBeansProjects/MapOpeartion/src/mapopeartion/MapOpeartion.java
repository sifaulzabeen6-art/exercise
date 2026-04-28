/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapopeartion;
      import java.util.HashMap;
import java.util.Map;

public class MapOpeartion{

    public static void main(String[] args) {
    

      
        Map<Integer, String> map = new HashMap<>();

        
        map.put(101, "Aisha");
        map.put(102, "Rahul");
        map.put(103, "Kiran");
        map.put(104, "Sneha");

        System.out.println("After adding elements: " + map);

        
        String name = map.get(102);
        System.out.println("Student with ID 102: " + name);

      
        map.put(103, "Arun"); 
        System.out.println("After updating ID 103: " + map);

      
        map.remove(101);
        System.out.println("After removing ID 101: " + map);

      
        System.out.println("All key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
        
    

   
    
    

