import java.util.*;
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void enqueue(int x) {
        stack1.push(x);
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty() ? -1 : stack2.pop(); // Return -1 if empty
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        Stack<Integer> tempStack = new Stack<>();

        // Transfer elements from stack2 to tempStack and display them
        for (Integer element : stack2) {
            tempStack.push(element);
            System.out.print(element + " ");
        }

        // Restore stack2
        while (!tempStack.isEmpty()) {
            stack2.push(tempStack.pop());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Display");
        System.out.println("4. Exit");

        while (true) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        queue.dequeue();
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
    }
}
