import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println("Stack elements: " + stack);

 
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack elements after pop: " + stack);

    
        int topElement = stack.peek();
        System.out.println("Top element without removing: " + topElement);

     
        System.out.println("Is stack empty? " + stack.isEmpty());

  
        System.out.println("Size of the stack: " + stack.size());
    }
}
