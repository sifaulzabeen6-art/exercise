/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circullardouble;

/**
 *
 * @author user
 */
public class Node {
    Node prev;
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev=null;
        this.next=null;
    }
    
}
