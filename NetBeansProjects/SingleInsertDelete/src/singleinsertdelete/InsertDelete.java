/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleinsertdelete;

/**
 *
 * @author user
 */
public class InsertDelete {
    Node head;
    void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print( temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    void delete(int data)
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        if(head.data==data)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp!=null&&temp.next.data!=data)
        {
            temp=temp.next;
            
        }
        if(temp.next==null)
        {
            System.out.println("value not found");
            return;
        }
        temp.next=temp.next.next;
        
    }
    
}
