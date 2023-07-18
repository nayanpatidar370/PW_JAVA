import java.util.LinkedList;
import java.util.Queue;

class QueueImplementation
{
    public static void main(String args[])
    {
        Queue<Integer> q= new LinkedList<>();

        for(int i=0;i<10;i++)
        {
            q.add(i);
        }

        System.out.println("Data currently present in i is: "+ q);

        System.out.println("Top element before removal in queue is "+ q.peek());

        q.remove();

        System.out.println("Data after removal is: "+ q);

        System.out.println("The current size of the queue is: "+ q.size());
    }
}