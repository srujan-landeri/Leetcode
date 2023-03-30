import java.util.Stack;

public class valid {
    public static void main(String[] args){
        String s = "()[]{}";
        
        String result = isValid(s)?"Valid":"Not Valid";
        System.out.println(result);

    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        // iterating throught the string
        for(int i = 0;i < s.length(); i++){

            // storing the present character
            char ch = s.charAt(i);

            // if it is an openning bracket, push into stack
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

            // if it is closing bracket, execute else
            else{

                // if it is closing bracket and stack is empty ie, there wasn't an opening bracket return false
                if(stack.isEmpty()){
                    return false;
                }

                // store the last element
                char lastElement = stack.lastElement();

                // if corresponding openning bracket is found pop it and that bracket is balanced
                if(ch == ')' && lastElement == '(' || ch == '}'&& lastElement == '{'  || ch == ']' && lastElement == '[' ){
                    stack.pop();
                }

                // if you found other type of openning bracket return false;
                else{
                    return false;
                }
            }
        }

        // after complete loop check if there are any other open parenthesis left, it not return true
        if(stack.isEmpty()){
            return true;
        }

        // else return false;
        return false;
    }
}
