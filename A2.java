public class A2 {

    public static int reverseSign(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n%2==0)
        {
            return n + reverseSign(n-1);
        }
        return n + reverseSign(n+1);
    }
    public static void main(String[] args) {

        System.out.println(reverseSign(0));
    }
}
