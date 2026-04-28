/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueoperation;

        import java.util.LinkedList;
import java.util.Queue;
public class QueueOperation {

    
    public static void main(String[] args) {
       

        
        Queue<Integer> queue = new LinkedList<>();

        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue after enqueue: " + queue);

   
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);

  
        int front = queue.peek();
        System.out.println("Front element: " + front);

        
        System.out.println("Queue now: " + queue);

      
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }
}
      
   
