/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlelinked;

/**
 *
 * @author user
 */
public class SimpleLinked {
    Node head;
    void insert(int data){
    Node newnode=new Node(data);
    if(head==null)
    {
    head=newnode;

}
    else
    {
       Node temp=head;
       while(temp.next!=null)
       {
           temp=temp.next;
       }
       temp.next=newnode;
    
}
    
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

  
    
}
