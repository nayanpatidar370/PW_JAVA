import java.util.Scanner;
public class A1 {

    public static int sumDigit(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return ((n%10) + sumDigit(n/10));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        System.out.println("The sum of given digits is: "+sumDigit(n));
    }
}
