class A4
{
    public static int sumOfArray(int arr[], int index)
    {
        if(index==arr.length)
        {
            return 0;
        }
        else
        {
            return arr[index]+ sumOfArray(arr, index+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Sum of array elements is: "+sumOfArray(arr, 0));
    }
}