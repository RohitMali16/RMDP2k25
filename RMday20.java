import java.util.Stack;

public class SortStackRecursively 
{
    
    public static void sortStack(Stack<Integer> stack) 
    {
        if (!stack.isEmpty()) 
        {
            int top = stack.pop();
            sortStack(stack);
            insertSorted(stack, top);
        }
    }

    
    private static void insertSorted(Stack<Integer> stack, int x)
    {
        if (stack.isEmpty() || x > stack.peek()) 
        {
            stack.push(x);
        } else 
        {
            int top = stack.pop();
            insertSorted(stack, x);
            stack.push(top);
        }
    }

    public static void main(String[] args)
     {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
