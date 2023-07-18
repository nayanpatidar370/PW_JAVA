import java.util.*;
class ValidParenthesis
{
    public boolean isValid(String str)
    {
        char chars[]= str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char ele: chars)
        {
            if(ele == '(' || ele== '{' || ele== '[')
            {
                stack.push(ele);
                continue;
            }
            else if(stack.empty())
            {
                return false;
            }

            char top= stack.pop();
            if(top== '(' && ele!=')')
            {
                return false;
            }
            else if(top=='{' && ele!='}')
            {
                return false;
            }
            else if(top=='{' && ele!='}')
            {
                return false;
            }
        }
        return(stack.empty()==true);
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Parenthisis to check");
        String str= sc.nextLine();

        ValidParenthesis vp= new ValidParenthesis();
        // vp.isValid(str);
        System.out.println("Given Parenthesis is valid Parenthes: " + vp.isValid(str));
    }
}