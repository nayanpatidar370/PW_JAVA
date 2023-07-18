import java.util.*;
public class printAllSequences {
    
    public static void printAllSequence(int arr[], int index, ArrayList<Integer> tempArr)
    {
        if(index==arr.length)
        {
            if(tempArr.size()>0)
            {
                System.out.println(tempArr);
            }
            return;
        }

        printAllSequence(arr,index+1,tempArr);
        
            tempArr.add(arr[index]);
        
            printAllSequence(arr, index+1, tempArr);

            tempArr.remove(tempArr.size()-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println("For the array: "+ Arrays.toString(arr));
        printAllSequence(arr, 0, new ArrayList<>());
        System.out.println();
    }
}
