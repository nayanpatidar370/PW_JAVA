import java.util.*;

public class PermuteNum
{
    public static void backtrack(List<List<Integer>> result, List<Integer> temp, int num[])
    {
        if(temp.size()==num.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<num.length;i++)
        {
            if(temp.contains(num[i]))
            continue;

            temp.add(num[i]);
            backtrack(result, temp, num);
            temp.remove(temp.size()-1);
        }
    }

    public static List<List<Integer>> permute(int num[])
    {
        List<List<Integer>> result= new ArrayList<>();
        backtrack(result,new ArrayList<>(), num);
        return result;
    }
    public static void main(String[] args) {
        int num[]={1,2,3};
        System.out.println(permute(num));
    }
}