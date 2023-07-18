package Assign_Linked_List;
import java.util.*;

import org.w3c.dom.Node;

public class Q2
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

   public void insertAtAny(int loc,int newData)
   {
        Node NewNode= new Node(newData);

        Node pos= head;

        int i=1;

        while(i<loc)
        {
            pos=pos.next;
            i++;
        }

        NewNode.next= pos.next;
        pos.next=NewNode;
        
   }

   //DeleteDuplicates
   
   public Node deleteDuplicate()
   {
    Node current= head;
    while(current.next!=null)
    {
        if(current.data==current.next.data)
        {
            current.next= current.next.next;
        }
        else
        {
            current= current.next;
        }
    }

    return head;
   }

   // Check Palindrome Linked List

   public void isPalindrome()
   {
    Node temp= head;
    List<Integer> list1= new ArrayList<Integer>();

    while(temp!= null)
    {
        list1.add(temp.data);
        temp= temp.next;
    }

    int low=0;
    int high= list1.size()-1;
    boolean flag=false;
    while(low<high)
    {
        if(list1.get(low).equals(list1.get(high)))
        {
            flag= true;
        }
        low++;
        high--;
    }

    if(flag==true)
    {
        System.out.println("true");
    }
    else
        System.out.println("false");
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
        
        Q2 ll= new Q2();

        ll.insertAtFirst(1);
        ll.insertAtFirst(2);
        ll.insertAtFirst(2);
        ll.insertAtFirst(1);

        ll.print();

        //ll.deleteDuplicate();
        //ll.insertAtAny(2, 3);

        ll.isPalindrome();

        ll.print();


        //ll.isPresent(5);


    }
}
