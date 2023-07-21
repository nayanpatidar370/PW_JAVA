import java.util.*;

public class A1Que5
{
    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);
        String Magzine, Ransomnote;

        System.out.println("Enter the Magzine String");
        Magzine= sc.nextLine();
        System.out.println("Enter the ransomnote string");
        Ransomnote= sc.nextLine();


        HashMap<Character,Integer> map1= new HashMap<>();

        for(int i=0;i<Magzine.length();i++)
        {
            if(map1.containsKey(Magzine.charAt(i)))
            {
                map1.put(Magzine.charAt(i), map1.get(Magzine.charAt(i))+1);
            }
            else
            {
                map1.put(Magzine.charAt(i), 1);
            }
        }

        HashMap<Character,Integer> map2= new HashMap<>();

        for(int i=0;i<Ransomnote.length();i++)
        {
            if(map2.containsKey(Ransomnote.charAt(i)))
            {
                map2.put(Ransomnote.charAt(i), map2.get(Ransomnote.charAt(i))+1);
            }
            else
            {
                map2.put(Ransomnote.charAt(i), 1);
            }
        }


        int answer=-1;
        for (Map.Entry<Character, Integer> e : map1.entrySet()) {
            char key = e.getKey();
            int value1 = e.getValue();
            Integer value2 = map2.get(key);
        
            if (value2 == null || value1 > value2) {
                System.out.println("false");
                answer = 1;
                break; 
            }
        }

        if(answer==-1)
        {
            System.out.println("True");
        }

    }
}