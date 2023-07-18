package LinkedList;
public class Insertion_Begin
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
         newNode.next= head;
        head= newNode;
        
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
        
        //Insert at After Node
    
        public void insertAfterNode(Node previousNode, int data)
        {
            Node newNode= new Node(data);
            if(previousNode.next==null)
            {
                System.out.println("Insertion Not Possible");
                return;
            }
            
            newNode.next= previousNode.next;
            previousNode.next= newNode;
        }

    public static void main(String[] args) {
        
        Insertion_Begin be= new Insertion_Begin();

        be.insertAtEnd(10);
        be.insertAtEnd(20);
        be.insertAtEnd(30);

        be.insertAfterNode(be.head.next, 5);
        be.printList();
    }
}