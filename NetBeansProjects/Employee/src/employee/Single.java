/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author user
 */
public class Single {
     Node head;
    void insert(String empname){
        Node n=new Node(empname);
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
            System.out.print( temp.empname+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    void delete(String empname)
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        if(head.empname==empname)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp!=null&&!temp.next.empname.equals(empname))
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
