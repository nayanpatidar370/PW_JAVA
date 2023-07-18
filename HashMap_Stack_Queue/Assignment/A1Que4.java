package HashMap_Stack_Queue.Assignment;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class A1Que4 {
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

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(a[i], 1);
        }

        System.out.println("The Largest Element of the map is: "+ map.lastKey());


    }
}
