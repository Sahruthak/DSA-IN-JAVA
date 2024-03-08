import java.util.*;
public class Main
{
    static Queue<Integer> queue = new LinkedList<>();

    public static void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }

    public static int pop() {
        return queue.remove();
    }

    public static int top() {
        return queue.peek();
    }

    public static boolean empty() {
        return queue.isEmpty();
    }
	
	public static void display() {
	    for (Integer element : queue) {
        System.out.print(element+" ");
	    }
    }
    
	public static void main(String[] args) {
		push(10);
        push(20);
		push(30);
	    push(40);
    	pop();
    	pop();
    	
		System.out.println(top());
		System.out.println(empty());
		display();

	}
}
