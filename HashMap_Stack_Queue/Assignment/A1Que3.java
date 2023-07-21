package HashMap_Stack_Queue.Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class A1Que3 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int a[]= new int[n];

        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int answer=0;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                 answer=1;
                System.out.println("Yes");
               
                break;
            }
               map.put(a[i], 1);
                
                
        }
        
        

       

        if(answer==0)
        {
            System.out.println("No");
        }
    }
}
