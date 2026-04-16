/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author user
 */
public class Operation {
    String queue[]=new String[5];
    int front=-1;
    int back=-1;
    void push( String value)
    {
        if(back==queue.length-1)
        {
            System.out.println("queue is full");
        }
        else
        {
            if(front==-1)
            {
                front=0;
            }
            back++;
            queue[back]=value;
        }
    }
    void pop()
    {
        if(front==-1||front>back)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            System.out.println(queue[front]);
            front++;
        }
    }
    void dispaly()
    {
        for (int i = front; i <=back; i++) {
            System.out.println(queue[i]);
        }
    }
    void peek()
    {
        if(front==-1||front>back)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            System.out.println(queue[front]);
            
        }
    }
}
