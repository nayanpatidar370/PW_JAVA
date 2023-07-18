package LinkedList;
public class Insertion_End
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

    public void insertAtEnd(int newData)
    {
        Node newNode= new Node(newData);
        if(head==null)
        {
            head= new Node(newData);
            return;
        }
        newNode.next= null;

        Node temp= head;
        while(temp.next!=null)
        {
            temp= temp.next;
        }
        temp.next= newNode;
        return;
    }

        public void printList()
        {
            Node temp= head;
            while(temp!=null)
            {
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }
        }
        

    public static void main(String[] args) {
        
        Insertion_End ie= new Insertion_End();

        ie.insertAtEnd(10);
        ie.insertAtEnd(20);
        ie.insertAtEnd(30);
        ie.printList();
    }
}