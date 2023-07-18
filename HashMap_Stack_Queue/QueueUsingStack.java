import java.util.Scanner;
import java.util.Stack;

class QueueUsingStack {
    
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2= new Stack<>();

    
    public void enQueue(int data)
    {
        stack1.push(data);
    }

    public int deQueue()
    {
        
        if(stack1.empty()  && stack2.empty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            while(!stack1.empty())
            {
                int ele= stack1.pop();
                stack2.push(ele);
            }
        }

        return (stack2.pop());
    }

    public static void main(String args[])
    {
        QueueUsingStack qs = new QueueUsingStack();
        qs.enQueue(5);
        qs.enQueue(6);
        qs.enQueue(7);
        qs.enQueue(8);

        System.out.println(qs.deQueue());
        System.out.println(qs.deQueue());


    }
}

