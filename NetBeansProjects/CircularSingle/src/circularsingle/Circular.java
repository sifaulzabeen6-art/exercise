/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularsingle;

/**
 *
 * @author user
 */
public class Circular {
    Node head;
    void insert(int data)
            
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            head.next=head;
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=n;
            n.next=head;
        }
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        Node temp=head;
        do{
            System.out.println(temp.data+"--->");
            temp=temp.next;
        }while(temp!=head);
    }
    
}
