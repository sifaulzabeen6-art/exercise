/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doubleinsertspecificposition;

/**
 *
 * @author user
 */
public class SpecificPos {
     Node head;
    void insert(int data)
    {
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
            newnode.prev=temp;
            
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
            System.out.print("Null");
        }
        void displayback(){
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        while(temp!=null)
        {
            System.out.print( temp.data+"--->");
            temp=temp.prev;
        }
                System.out.print("NULL");
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
        temp.next.prev=temp;
        
    }
        void specificinsert(int data,int pos)
        {
            Node newnode=new Node(data);
            if(pos==1)
            {
                newnode.next=head;
                if(head!=null)
                {
                    head.prev=newnode;
                }
                head=newnode;
                return;
            }
            Node temp=head;
            int count=1;
            while(temp!=null&&count<pos-1)
            {
                temp=temp.next;
                count++;
            }
            if(temp==null)
            {
                System.out.println("INVALID POSITION");
                return;
            }
            newnode.next=temp.next;
            newnode.prev=temp;
            if(temp.next!=null)
            {
                temp.next.prev=newnode;
            }
            temp.next=newnode;
        }
    
}
