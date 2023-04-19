import java.util.Stack;
public class BalancedBrackets {

    public String checkBalance(String string) {
        Stack<Character> stack = new Stack<Character>();

        int left = 0;
        int right = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                left = left + 1;
            }
            if (c == ')' || c == '}' || c == ']') {
                right = right + 1;
                if (!stack.isEmpty())
                    stack.pop();
            }
        }

        if (left == right && left > 0) {
            return "Balanced";
        }
        else if (left == 0 && right == 0)
            return "Invalid input";
        else {
            return "Unbalanced";
        }
    }
}
