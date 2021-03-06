import java.util.*;


public class validparenthesis {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
for (char c : s.toCharArray()) {

    /*The basic idea is to push the right parentheses ')', ']', or '}' into the stack each time when we encounter left ones. And if a right bracket appears in the string, we need check if the stack is empty and also whether the top element is the same with that right bracket. If not, the string is not a valid one. At last, we also need check if the stack is empty.*/
    if (c == '(')
        stack.push(')');
    else if (c == '{')
        stack.push('}');
    else if (c == '[')
        stack.push(']');
    else if (stack.isEmpty() || stack.pop() != c)
        return false;
}
return stack.isEmpty();
    }




    public static void main(String[] args){

        String s="(){{}}[{()}]";
    
        boolean b= isValid(s);
        System.out.println(b);

}
}
