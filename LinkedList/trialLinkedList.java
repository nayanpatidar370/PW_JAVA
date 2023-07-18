package LinkedList;

import java.util.Scanner;

import javax.swing.text.Position;

public class trialLinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;

    }

    public void insertAtFirst(int newData) {
        Node newNode = new Node(newData);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void insertAtAny(Node previousNode, int newData) {

        if (previousNode == null) {
            System.out.println("Insertion Not Possible");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = previousNode.next;
        previousNode.next = newNode;

        return;

    }

    public void delete(int position) {
        Node temp = head;
        if (head == null) {
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        temp.next = temp.next.next;
    }

    // Revarsal using IterativeApproach

    public void ReversalIterative() {

        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

    }

    // Reversal in LinkedList Recursively
    public void ReverseRecursive(Node current, Node prev) {
        if (current.next == null) {
            head = current;
            current.next = prev;
            return;
        }

        Node NextPtr = current.next;
        current.next = prev;
        ReverseRecursive(NextPtr, current);
    }

    // Middle of linked list using two pointer approach

    public void MiddleOfLL() {
        Node slowPtr = head, fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        System.out.println("The data at middle of linked list is: " + slowPtr.data);
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Cycle detection in Loop

    public void cycleDetection() {
        
        Node fastPtr= head;
        Node slowPtr= head;

        int flag=0;
        while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null)
        {
            slowPtr= slowPtr.next;
            fastPtr= fastPtr.next.next;

            if(slowPtr==fastPtr)
            {
                flag=1;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println("Loop Detected");
        }
        else
        {
            System.out.println("Loop not Detected");
        }

        

       
    }

    public void isPresent(int element)
        {
            Node temp= head;

            int flag=0;
            while(temp!=null)
            {

                if(temp.data==element)
                {
                    flag=1;
                    break;
                }
                temp= temp.next;
            }

            if(flag==1)
            {
                System.out.println("Yes");
            }
            else
            System.out.println("No");
            

            
        }

    public static void main(String[] args) {

        trialLinkedList tt = new trialLinkedList();

        tt.insertAtEnd(10);
        tt.insertAtEnd(20);
        tt.insertAtEnd(30);
        //tt.insertAtAny(tt.head, 5);

        tt.print();

        System.out.println();

        // tt.delete(3);

        // tt.ReversalIterative();

        // tt.ReverseRecursive(tt.head, null);

        //tt.MiddleOfLL();
        // Node temp= tt.head;
        // while(temp.next!=null)
        // {
        //     temp= temp.next;
        // }
        // temp.next= tt.head;

        // tt.cycleDetection();

        tt.isPresent(10);

        // tt.print();
        // tt.insertAtFirst(30);
        // tt.insertAtFirst(5);

        // tt.print();
    }

}
