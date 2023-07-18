package Assign_Linked_List;

import java.net.PortUnreachableException;

import org.w3c.dom.Node;

public class Q1
{
    Node head;

    class Node
    {
        int data;
        Node next;
       
        Node(int d)
        {
            data= d;
            next= null;
        }
    }

   public void insertAtFirst(int newData)
   {
        Node newNode= new Node(newData);

        newNode.next= head;
        head= newNode;

   }

   public void isPresent(int data)
   {
        Node temp= head;
        
        int flag=0;

        while(temp!=null)
        {
            if(temp.data==data)
            {
                flag=1;
                break;
            }
            temp=temp.next;
        }

        if(flag==0)
        {
            System.out.println("No");
        }
        else
        System.out.println("Yes");
        
   }

   public void print()
   {
        Node temp= head;
        
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp= temp.next;
        }
        System.out.println();
   }
    public static void main(String[] args) {
        
        Q1 ll= new Q1();

        ll.insertAtFirst(10);
        ll.insertAtFirst(20);
        ll.insertAtFirst(50);

        ll.print();

        ll.isPresent(5);


    }
}