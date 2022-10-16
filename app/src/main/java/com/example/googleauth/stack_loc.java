import java.util.Scanner;
import java.util.Stack;
//stack
public class validParanthesis {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s=sc.nextLine();

        boolean r=isValid(s);
        System.out.println(r);
        sc.close();
    }

// for chaecking valid paranthesis '()'
    static boolean valid(String s)
    {
        char [] c=s.toCharArray();
        Stack<Character> val= new Stack<Character>();
        if((c.length&1)==1)
        {
            return false;
        }
        for(int i=0;i<c.length;i++ )
        {
            if(val.empty() && (c[i]=='('))
            {
                val.push('(');
            }

            if(!val.empty() && c[i]==')')
            {
                val.pop();
            }
        }        

        if(val.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean isValid(String s)
    {
        char [] c=s.toCharArray();
        Stack<Character> val= new Stack<Character>();

        if((c.length&1)==1)
        {
            return false; // edge case
        }
        for(int i=0;i<c.length;i++ )
        {
            if((c[i]=='('||c[i]=='{'||c[i]=='['))
            {
                val.push(c[i]);
            }
            else if(!val.empty()&&
               ((val.peek()=='('&&c[i]==')')||(val.peek()=='{'&&c[i]=='}')||(val.peek()=='['&&c[i]==']')))
            {
                val.pop();
            }
            else{
                val.push(c[i]);
            }
        }
        
        if(val.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

