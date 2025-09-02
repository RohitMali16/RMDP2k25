import java.util.*;

public class PostfixEvaluation 
{
    public static int evaluatePostfix(String expr) 
    {
        Stack<Integer> stack = new Stack<>();

        for (String token : expr.split(" ")) 
        {
            if (isOperator(token)) 
            {
                int b = stack.pop(); 
                int a = stack.pop(); 
                int result = applyOperator(a, b, token);
                stack.push(result);
            } else 
            {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) 
    {
        return token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/");
    }

    private static int applyOperator(int a, int b, String op) 
    {
        switch (op) 
        {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
        return 0;
    }

    public static void main(String[] args) 
    {
        String expression = "2 3 4 * +"; 
        System.out.println("Result = " + evaluatePostfix(expression));
    }
}
