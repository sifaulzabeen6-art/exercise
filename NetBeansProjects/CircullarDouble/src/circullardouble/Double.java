/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circullardouble;

/**
 *
 * @author user
 */
public class Double {
    Node head;
    void insert(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            head.prev=head;
            head.next=head;
        }
          
        else
        {
            Node last=head.prev;
            last.next=n;
            n.prev=last;
            n.next=head;
            head.prev=n;
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
    
    void displayback(){
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        Node temp=head.prev;
        do{
            System.out.println(temp.data+"--->");
            temp=temp.next;
        }while(temp!=head.prev);

        
    }
            
    
}
