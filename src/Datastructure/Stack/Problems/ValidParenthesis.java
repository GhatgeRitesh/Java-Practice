package Datastructure.Stack.Problems;

import java.util.Stack;

public class ValidParenthesis {
    // code to check  given string has valid parenthesis or not

    static boolean checkParenthesis(String str)
    {

        //utilising stack
        Stack<Character> s=new Stack<>();

        for(char c:str.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
            {
                s.push(c);
            }
            else if(c==')'||c==']'||c=='}')
            {
                if(s.isEmpty())
                {
                    return false;
                }
                char top=s.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '['))
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str="abc{asd[(asda)[}";
        System.out.println("is valid string "+checkParenthesis(str));
    }
}
